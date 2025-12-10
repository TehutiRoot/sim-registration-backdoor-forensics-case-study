package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.Camera2CameraCaptureResult;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.Logger;
import androidx.camera.core.SettableImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import androidx.camera.extensions.internal.ClientVersion;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.Version;
import androidx.camera.extensions.internal.sessionprocessor.C2584b;
import androidx.camera.extensions.internal.sessionprocessor.YuvToJpegConverter;
import java.util.HashMap;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public class StillCaptureProcessor {
    private static final int MAX_IMAGES = 2;
    private static final String TAG = "StillCaptureProcessor";
    @NonNull
    final CaptureProcessorImpl mCaptureProcessorImpl;
    @NonNull
    final C2584b mCaptureResultImageMatcher;
    @NonNull
    @GuardedBy("mLock")
    HashMap<Integer, Pair<ImageReference, TotalCaptureResult>> mCaptureResults;
    @GuardedBy("mLock")
    boolean mIsClosed;
    final Object mLock;
    @GuardedBy("mLock")
    OnCaptureResultCallback mOnCaptureResultCallback;
    @NonNull
    final ImageReaderProxy mProcessedYuvImageReader;
    @GuardedBy("mLock")
    TotalCaptureResult mSourceCaptureResult;
    @NonNull
    YuvToJpegConverter mYuvToJpegConverter;

    /* loaded from: classes.dex */
    public interface OnCaptureResultCallback {
        void onCaptureResult(long j, @NonNull List<Pair<CaptureResult.Key, Object>> list);

        void onCompleted();

        void onError(@NonNull Exception exc);
    }

    public StillCaptureProcessor(@NonNull CaptureProcessorImpl captureProcessorImpl, @NonNull Surface surface, @NonNull Size size) {
        this.mCaptureResultImageMatcher = new C2584b();
        this.mLock = new Object();
        this.mCaptureResults = new HashMap<>();
        this.mOnCaptureResultCallback = null;
        this.mSourceCaptureResult = null;
        this.mIsClosed = false;
        this.mCaptureProcessorImpl = captureProcessorImpl;
        ImageReaderProxy createIsolatedReader = ImageReaderProxys.createIsolatedReader(size.getWidth(), size.getHeight(), 35, 2);
        this.mProcessedYuvImageReader = createIsolatedReader;
        this.mYuvToJpegConverter = new YuvToJpegConverter(100, surface);
        createIsolatedReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.extensions.internal.sessionprocessor.f
            {
                StillCaptureProcessor.this = this;
            }

            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                StillCaptureProcessor.m62573a(StillCaptureProcessor.this, imageReaderProxy);
            }
        }, CameraXExecutors.ioExecutor());
        captureProcessorImpl.onOutputSurface(createIsolatedReader.getSurface(), 35);
        captureProcessorImpl.onImageFormatUpdate(35);
        captureProcessorImpl.onResolutionUpdate(size);
    }

    /* renamed from: a */
    public static /* synthetic */ void m62573a(StillCaptureProcessor stillCaptureProcessor, ImageReaderProxy imageReaderProxy) {
        stillCaptureProcessor.lambda$new$0(imageReaderProxy);
    }

    /* renamed from: b */
    public static /* synthetic */ void m62572b(StillCaptureProcessor stillCaptureProcessor, List list, OnCaptureResultCallback onCaptureResultCallback, ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i) {
        stillCaptureProcessor.lambda$startCapture$1(list, onCaptureResultCallback, imageReference, totalCaptureResult, i);
    }

    public /* synthetic */ void lambda$new$0(ImageReaderProxy imageReaderProxy) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed) {
                    Logger.m63230d(TAG, "Ignore JPEG processing in closed state");
                    return;
                }
                ImageProxy acquireNextImage = imageReaderProxy.acquireNextImage();
                TotalCaptureResult totalCaptureResult = this.mSourceCaptureResult;
                OnCaptureResultCallback onCaptureResultCallback = null;
                if (totalCaptureResult != null) {
                    SettableImageProxy settableImageProxy = new SettableImageProxy(acquireNextImage, null, new CameraCaptureResultImageInfo(new Camera2CameraCaptureResult(totalCaptureResult)));
                    this.mSourceCaptureResult = null;
                    acquireNextImage = settableImageProxy;
                }
                if (acquireNextImage != null) {
                    try {
                        this.mYuvToJpegConverter.m62567c(acquireNextImage);
                        e = null;
                    } catch (YuvToJpegConverter.ConversionFailedException e) {
                        e = e;
                    }
                    OnCaptureResultCallback onCaptureResultCallback2 = this.mOnCaptureResultCallback;
                    if (onCaptureResultCallback2 != null) {
                        this.mOnCaptureResultCallback = null;
                        onCaptureResultCallback = onCaptureResultCallback2;
                    }
                } else {
                    e = null;
                }
                if (onCaptureResultCallback != null) {
                    if (e != null) {
                        onCaptureResultCallback.onError(e);
                    } else {
                        onCaptureResultCallback.onCompleted();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public /* synthetic */ void lambda$startCapture$1(List list, final OnCaptureResultCallback onCaptureResultCallback, ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed) {
                    imageReference.decrement();
                    Logger.m63230d(TAG, "Ignore image in closed state");
                    return;
                }
                Logger.m63230d(TAG, "onImageReferenceIncoming  captureStageId=" + i);
                this.mCaptureResults.put(Integer.valueOf(i), new Pair<>(imageReference, totalCaptureResult));
                Logger.m63230d(TAG, "mCaptureResult has capture stage Id: " + this.mCaptureResults.keySet());
                Exception exc = null;
                if (this.mCaptureResults.keySet().containsAll(list)) {
                    HashMap hashMap = new HashMap();
                    for (Integer num : this.mCaptureResults.keySet()) {
                        Pair<ImageReference, TotalCaptureResult> pair = this.mCaptureResults.get(num);
                        hashMap.put(num, new Pair(((ImageReference) pair.first).get(), (TotalCaptureResult) pair.second));
                    }
                    Logger.m63230d(TAG, "CaptureProcessorImpl.process()");
                    try {
                        Version version = Version.VERSION_1_3;
                        if (ExtensionVersion.isMinimumCompatibleVersion(version) && ClientVersion.isMinimumCompatibleVersion(version)) {
                            this.mCaptureProcessorImpl.process(hashMap, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.1
                                {
                                    StillCaptureProcessor.this = this;
                                }

                                public void onCaptureCompleted(long j, @NonNull List<Pair<CaptureResult.Key, Object>> list2) {
                                    onCaptureResultCallback.onCaptureResult(j, list2);
                                }

                                public void onCaptureProcessProgressed(int i2) {
                                }
                            }, CameraXExecutors.ioExecutor());
                        } else {
                            this.mCaptureProcessorImpl.process(hashMap);
                        }
                    } catch (Exception e) {
                        this.mOnCaptureResultCallback = null;
                        exc = e;
                    }
                    clearCaptureResults();
                }
                if (exc != null && onCaptureResultCallback != null) {
                    onCaptureResultCallback.onError(exc);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void clearCaptureResults() {
        synchronized (this.mLock) {
            try {
                for (Pair<ImageReference, TotalCaptureResult> pair : this.mCaptureResults.values()) {
                    ((ImageReference) pair.first).decrement();
                }
                this.mCaptureResults.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void close() {
        Logger.m63230d(TAG, "Close the processor");
        synchronized (this.mLock) {
            this.mIsClosed = true;
            clearCaptureResults();
            this.mProcessedYuvImageReader.clearOnImageAvailableListener();
            this.mCaptureResultImageMatcher.m62563d();
            this.mCaptureResultImageMatcher.m62564c();
            this.mProcessedYuvImageReader.close();
        }
    }

    public void notifyCaptureResult(@NonNull TotalCaptureResult totalCaptureResult, int i) {
        this.mCaptureResultImageMatcher.m62565b(totalCaptureResult, i);
        synchronized (this.mLock) {
            try {
                if (this.mSourceCaptureResult == null) {
                    this.mSourceCaptureResult = totalCaptureResult;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void notifyImage(@NonNull ImageReference imageReference) {
        this.mCaptureResultImageMatcher.m62561f(imageReference);
    }

    public void setJpegQuality(@IntRange(from = 0, m64742to = 100) int i) {
        this.mYuvToJpegConverter.m62569a(i);
    }

    public void setRotationDegrees(int i) {
        this.mYuvToJpegConverter.m62568b(i);
    }

    public void startCapture(@NonNull final List<Integer> list, @NonNull final OnCaptureResultCallback onCaptureResultCallback) {
        Logger.m63230d(TAG, "Start the processor");
        synchronized (this.mLock) {
            this.mOnCaptureResultCallback = onCaptureResultCallback;
            clearCaptureResults();
        }
        this.mCaptureResultImageMatcher.m62564c();
        this.mCaptureResultImageMatcher.m62557j(new C2584b.InterfaceC2585a() { // from class: androidx.camera.extensions.internal.sessionprocessor.e
            {
                StillCaptureProcessor.this = this;
            }

            @Override // androidx.camera.extensions.internal.sessionprocessor.C2584b.InterfaceC2585a
            /* renamed from: a */
            public final void mo62550a(ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i) {
                StillCaptureProcessor.m62572b(StillCaptureProcessor.this, list, onCaptureResultCallback, imageReference, totalCaptureResult, i);
            }
        });
    }

    public StillCaptureProcessor(@NonNull CaptureProcessorImpl captureProcessorImpl, @NonNull Surface surface, @NonNull Size size, @NonNull YuvToJpegConverter yuvToJpegConverter) {
        this(captureProcessorImpl, surface, size);
        this.mYuvToJpegConverter = yuvToJpegConverter;
    }
}
