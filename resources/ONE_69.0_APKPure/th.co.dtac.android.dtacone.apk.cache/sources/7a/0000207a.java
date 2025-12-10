package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.extensions.impl.PreviewImageProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import androidx.camera.extensions.internal.ClientVersion;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.Version;
import androidx.camera.extensions.internal.sessionprocessor.C2566b;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public class PreviewProcessor {
    private static final String TAG = "PreviewProcessor";
    @NonNull
    final PreviewImageProcessorImpl mPreviewImageProcessor;
    @NonNull
    final C2566b mCaptureResultImageMatcher = new C2566b();
    final Object mLock = new Object();
    @GuardedBy("mLock")
    boolean mIsClosed = false;

    /* loaded from: classes.dex */
    public interface OnCaptureResultCallback {
        void onCaptureResult(long j, @NonNull List<Pair<CaptureResult.Key, Object>> list);
    }

    public PreviewProcessor(@NonNull PreviewImageProcessorImpl previewImageProcessorImpl, @NonNull Surface surface, @NonNull Size size) {
        this.mPreviewImageProcessor = previewImageProcessorImpl;
        previewImageProcessorImpl.onResolutionUpdate(size);
        previewImageProcessorImpl.onOutputSurface(surface, 1);
        previewImageProcessorImpl.onImageFormatUpdate(35);
    }

    /* renamed from: a */
    public static /* synthetic */ void m62522a(PreviewProcessor previewProcessor, OnCaptureResultCallback onCaptureResultCallback, ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i) {
        previewProcessor.lambda$start$0(onCaptureResultCallback, imageReference, totalCaptureResult, i);
    }

    public /* synthetic */ void lambda$start$0(final OnCaptureResultCallback onCaptureResultCallback, ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed) {
                    imageReference.decrement();
                    Logger.m63178d(TAG, "Ignore image in closed state");
                    return;
                }
                Version version = Version.VERSION_1_3;
                if (ClientVersion.isMinimumCompatibleVersion(version) && ExtensionVersion.isMinimumCompatibleVersion(version)) {
                    this.mPreviewImageProcessor.process(imageReference.get(), totalCaptureResult, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.1
                        {
                            PreviewProcessor.this = this;
                        }

                        public void onCaptureCompleted(long j, @NonNull List<Pair<CaptureResult.Key, Object>> list) {
                            onCaptureResultCallback.onCaptureResult(j, list);
                        }

                        public void onCaptureProcessProgressed(int i2) {
                        }
                    }, CameraXExecutors.ioExecutor());
                } else {
                    this.mPreviewImageProcessor.process(imageReference.get(), totalCaptureResult);
                }
                imageReference.decrement();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            this.mIsClosed = true;
            this.mCaptureResultImageMatcher.m62512c();
            this.mCaptureResultImageMatcher.m62511d();
        }
    }

    public void notifyCaptureResult(@NonNull TotalCaptureResult totalCaptureResult) {
        this.mCaptureResultImageMatcher.m62514a(totalCaptureResult);
    }

    public void notifyImage(@NonNull ImageReference imageReference) {
        this.mCaptureResultImageMatcher.m62509f(imageReference);
    }

    public void start(@NonNull final OnCaptureResultCallback onCaptureResultCallback) {
        this.mCaptureResultImageMatcher.m62505j(new C2566b.InterfaceC2567a() { // from class: androidx.camera.extensions.internal.sessionprocessor.c
            @Override // androidx.camera.extensions.internal.sessionprocessor.C2566b.InterfaceC2567a
            /* renamed from: a */
            public final void mo62498a(ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i) {
                PreviewProcessor.m62522a(PreviewProcessor.this, onCaptureResultCallback, imageReference, totalCaptureResult, i);
            }
        });
    }
}