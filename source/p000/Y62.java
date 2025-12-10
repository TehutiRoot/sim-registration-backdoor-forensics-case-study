package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.compat.ImageWriterCompat;
import androidx.camera.core.internal.utils.RingBuffer;
import androidx.camera.core.internal.utils.ZslRingBuffer;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: Y62 */
/* loaded from: classes.dex */
public final class Y62 implements O62 {

    /* renamed from: a */
    public final CameraCharacteristicsCompat f7674a;

    /* renamed from: b */
    public final ZslRingBuffer f7675b;

    /* renamed from: c */
    public boolean f7676c = false;

    /* renamed from: d */
    public boolean f7677d = false;

    /* renamed from: e */
    public boolean f7678e;

    /* renamed from: f */
    public boolean f7679f;

    /* renamed from: g */
    public SafeCloseImageReaderProxy f7680g;

    /* renamed from: h */
    public CameraCaptureCallback f7681h;

    /* renamed from: i */
    public DeferrableSurface f7682i;

    /* renamed from: j */
    public ImageWriter f7683j;

    public Y62(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.f7678e = false;
        this.f7679f = false;
        this.f7674a = cameraCharacteristicsCompat;
        this.f7678e = Z62.m65264a(cameraCharacteristicsCompat, 4);
        this.f7679f = DeviceQuirks.get(ZslDisablerQuirk.class) != null;
        this.f7675b = new ZslRingBuffer(3, new RingBuffer.OnRemoveCallback() { // from class: V62
            @Override // androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback
            public final void onRemove(Object obj) {
                Y62.m65395b((ImageProxy) obj);
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ void m65396a(Y62 y62, ImageReaderProxy imageReaderProxy) {
        y62.m65391f(imageReaderProxy);
    }

    /* renamed from: b */
    public static /* synthetic */ void m65395b(ImageProxy imageProxy) {
        imageProxy.close();
    }

    @Override // p000.O62
    public void addZslConfig(SessionConfig.Builder builder) {
        m65394c();
        if (this.f7676c || this.f7679f) {
            return;
        }
        Map m65393d = m65393d(this.f7674a);
        if (this.f7678e && !m65393d.isEmpty() && m65393d.containsKey(34) && m65392e(this.f7674a, 34)) {
            Size size = (Size) m65393d.get(34);
            MetadataImageReader metadataImageReader = new MetadataImageReader(size.getWidth(), size.getHeight(), 34, 9);
            this.f7681h = metadataImageReader.getCameraCaptureCallback();
            this.f7680g = new SafeCloseImageReaderProxy(metadataImageReader);
            metadataImageReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: W62
                {
                    Y62.this = this;
                }

                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                    Y62.m65396a(Y62.this, imageReaderProxy);
                }
            }, CameraXExecutors.ioExecutor());
            ImmediateSurface immediateSurface = new ImmediateSurface(this.f7680g.getSurface(), new Size(this.f7680g.getWidth(), this.f7680g.getHeight()), 34);
            this.f7682i = immediateSurface;
            SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.f7680g;
            ListenableFuture<Void> terminationFuture = immediateSurface.getTerminationFuture();
            Objects.requireNonNull(safeCloseImageReaderProxy);
            terminationFuture.addListener(new X62(safeCloseImageReaderProxy), CameraXExecutors.mainThreadExecutor());
            builder.addSurface(this.f7682i);
            builder.addCameraCaptureCallback(this.f7681h);
            builder.addSessionStateCallback(new C1732a());
            U62.m66090a();
            builder.setInputConfiguration(T62.m66224a(this.f7680g.getWidth(), this.f7680g.getHeight(), this.f7680g.getImageFormat()));
        }
    }

    /* renamed from: c */
    public final void m65394c() {
        ZslRingBuffer zslRingBuffer = this.f7675b;
        while (!zslRingBuffer.isEmpty()) {
            zslRingBuffer.dequeue().close();
        }
        DeferrableSurface deferrableSurface = this.f7682i;
        if (deferrableSurface != null) {
            SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.f7680g;
            if (safeCloseImageReaderProxy != null) {
                deferrableSurface.getTerminationFuture().addListener(new X62(safeCloseImageReaderProxy), CameraXExecutors.mainThreadExecutor());
                this.f7680g = null;
            }
            deferrableSurface.close();
            this.f7682i = null;
        }
        ImageWriter imageWriter = this.f7683j;
        if (imageWriter != null) {
            imageWriter.close();
            this.f7683j = null;
        }
    }

    /* renamed from: d */
    public final Map m65393d(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        StreamConfigurationMap streamConfigurationMap;
        int[] inputFormats;
        int[] inputFormats2;
        Size[] inputSizes;
        try {
            streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristicsCompat.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e) {
            Logger.m63228e("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap != null) {
            inputFormats = streamConfigurationMap.getInputFormats();
            if (inputFormats != null) {
                HashMap hashMap = new HashMap();
                inputFormats2 = streamConfigurationMap.getInputFormats();
                for (int i : inputFormats2) {
                    inputSizes = streamConfigurationMap.getInputSizes(i);
                    if (inputSizes != null) {
                        Arrays.sort(inputSizes, new CompareSizesByArea(true));
                        hashMap.put(Integer.valueOf(i), inputSizes[0]);
                    }
                }
                return hashMap;
            }
        }
        return new HashMap();
    }

    @Override // p000.O62
    public ImageProxy dequeueImageFromBuffer() {
        try {
            return this.f7675b.dequeue();
        } catch (NoSuchElementException unused) {
            Logger.m63228e("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x000c, code lost:
        r5 = r5.getValidOutputFormatsForInput(r6);
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m65392e(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r5, int r6) {
        /*
            r4 = this;
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
            java.lang.Object r5 = r5.get(r0)
            android.hardware.camera2.params.StreamConfigurationMap r5 = (android.hardware.camera2.params.StreamConfigurationMap) r5
            r0 = 0
            if (r5 != 0) goto Lc
            return r0
        Lc:
            int[] r5 = p000.Q62.m66678a(r5, r6)
            if (r5 != 0) goto L13
            return r0
        L13:
            int r6 = r5.length
            r1 = 0
        L15:
            if (r1 >= r6) goto L22
            r2 = r5[r1]
            r3 = 256(0x100, float:3.59E-43)
            if (r2 != r3) goto L1f
            r5 = 1
            return r5
        L1f:
            int r1 = r1 + 1
            goto L15
        L22:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.Y62.m65392e(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat, int):boolean");
    }

    @Override // p000.O62
    public boolean enqueueImageToImageWriter(ImageProxy imageProxy) {
        ImageWriter imageWriter;
        Image image = imageProxy.getImage();
        if (Build.VERSION.SDK_INT >= 23 && (imageWriter = this.f7683j) != null && image != null) {
            try {
                ImageWriterCompat.queueInputImage(imageWriter, image);
                return true;
            } catch (IllegalStateException e) {
                Logger.m63228e("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e.getMessage());
            }
        }
        return false;
    }

    /* renamed from: f */
    public final /* synthetic */ void m65391f(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (acquireLatestImage != null) {
                this.f7675b.enqueue(acquireLatestImage);
            }
        } catch (IllegalStateException e) {
            Logger.m63228e("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e.getMessage());
        }
    }

    @Override // p000.O62
    public boolean isZslDisabledByFlashMode() {
        return this.f7677d;
    }

    @Override // p000.O62
    public boolean isZslDisabledByUserCaseConfig() {
        return this.f7676c;
    }

    @Override // p000.O62
    public void setZslDisabledByFlashMode(boolean z) {
        this.f7677d = z;
    }

    @Override // p000.O62
    public void setZslDisabledByUserCaseConfig(boolean z) {
        this.f7676c = z;
    }

    /* renamed from: Y62$a */
    /* loaded from: classes.dex */
    public class C1732a extends CameraCaptureSession.StateCallback {
        public C1732a() {
            Y62.this = r1;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface;
            inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                Y62.this.f7683j = ImageWriterCompat.newInstance(inputSurface, 1);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }
    }
}
