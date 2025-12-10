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

/* renamed from: V72 */
/* loaded from: classes.dex */
public final class V72 implements L72 {

    /* renamed from: a */
    public final CameraCharacteristicsCompat f6820a;

    /* renamed from: b */
    public final ZslRingBuffer f6821b;

    /* renamed from: c */
    public boolean f6822c = false;

    /* renamed from: d */
    public boolean f6823d = false;

    /* renamed from: e */
    public boolean f6824e;

    /* renamed from: f */
    public boolean f6825f;

    /* renamed from: g */
    public SafeCloseImageReaderProxy f6826g;

    /* renamed from: h */
    public CameraCaptureCallback f6827h;

    /* renamed from: i */
    public DeferrableSurface f6828i;

    /* renamed from: j */
    public ImageWriter f6829j;

    public V72(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.f6824e = false;
        this.f6825f = false;
        this.f6820a = cameraCharacteristicsCompat;
        this.f6824e = W72.m65812a(cameraCharacteristicsCompat, 4);
        this.f6825f = DeviceQuirks.get(ZslDisablerQuirk.class) != null;
        this.f6821b = new ZslRingBuffer(3, new RingBuffer.OnRemoveCallback() { // from class: S72
            @Override // androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback
            public final void onRemove(Object obj) {
                V72.m66030b((ImageProxy) obj);
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ void m66031a(V72 v72, ImageReaderProxy imageReaderProxy) {
        v72.m66026f(imageReaderProxy);
    }

    /* renamed from: b */
    public static /* synthetic */ void m66030b(ImageProxy imageProxy) {
        imageProxy.close();
    }

    @Override // p000.L72
    public void addZslConfig(SessionConfig.Builder builder) {
        m66029c();
        if (this.f6822c || this.f6825f) {
            return;
        }
        Map m66028d = m66028d(this.f6820a);
        if (this.f6824e && !m66028d.isEmpty() && m66028d.containsKey(34) && m66027e(this.f6820a, 34)) {
            Size size = (Size) m66028d.get(34);
            MetadataImageReader metadataImageReader = new MetadataImageReader(size.getWidth(), size.getHeight(), 34, 9);
            this.f6827h = metadataImageReader.getCameraCaptureCallback();
            this.f6826g = new SafeCloseImageReaderProxy(metadataImageReader);
            metadataImageReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: T72
                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                    V72.m66031a(V72.this, imageReaderProxy);
                }
            }, CameraXExecutors.ioExecutor());
            ImmediateSurface immediateSurface = new ImmediateSurface(this.f6826g.getSurface(), new Size(this.f6826g.getWidth(), this.f6826g.getHeight()), 34);
            this.f6828i = immediateSurface;
            SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.f6826g;
            ListenableFuture<Void> terminationFuture = immediateSurface.getTerminationFuture();
            Objects.requireNonNull(safeCloseImageReaderProxy);
            terminationFuture.addListener(new U72(safeCloseImageReaderProxy), CameraXExecutors.mainThreadExecutor());
            builder.addSurface(this.f6828i);
            builder.addCameraCaptureCallback(this.f6827h);
            builder.addSessionStateCallback(new C1494a());
            R72.m66696a();
            builder.setInputConfiguration(Q72.m66836a(this.f6826g.getWidth(), this.f6826g.getHeight(), this.f6826g.getImageFormat()));
        }
    }

    /* renamed from: c */
    public final void m66029c() {
        ZslRingBuffer zslRingBuffer = this.f6821b;
        while (!zslRingBuffer.isEmpty()) {
            zslRingBuffer.dequeue().close();
        }
        DeferrableSurface deferrableSurface = this.f6828i;
        if (deferrableSurface != null) {
            SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.f6826g;
            if (safeCloseImageReaderProxy != null) {
                deferrableSurface.getTerminationFuture().addListener(new U72(safeCloseImageReaderProxy), CameraXExecutors.mainThreadExecutor());
                this.f6826g = null;
            }
            deferrableSurface.close();
            this.f6828i = null;
        }
        ImageWriter imageWriter = this.f6829j;
        if (imageWriter != null) {
            imageWriter.close();
            this.f6829j = null;
        }
    }

    /* renamed from: d */
    public final Map m66028d(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        StreamConfigurationMap streamConfigurationMap;
        int[] inputFormats;
        int[] inputFormats2;
        Size[] inputSizes;
        try {
            streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristicsCompat.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e) {
            Logger.m63176e("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e.getMessage());
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

    @Override // p000.L72
    public ImageProxy dequeueImageFromBuffer() {
        try {
            return this.f6821b.dequeue();
        } catch (NoSuchElementException unused) {
            Logger.m63176e("ZslControlImpl", "dequeueImageFromBuffer no such element");
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
    public final boolean m66027e(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r5, int r6) {
        /*
            r4 = this;
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
            java.lang.Object r5 = r5.get(r0)
            android.hardware.camera2.params.StreamConfigurationMap r5 = (android.hardware.camera2.params.StreamConfigurationMap) r5
            r0 = 0
            if (r5 != 0) goto Lc
            return r0
        Lc:
            int[] r5 = p000.N72.m67271a(r5, r6)
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
        throw new UnsupportedOperationException("Method not decompiled: p000.V72.m66027e(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat, int):boolean");
    }

    @Override // p000.L72
    public boolean enqueueImageToImageWriter(ImageProxy imageProxy) {
        ImageWriter imageWriter;
        Image image = imageProxy.getImage();
        if (Build.VERSION.SDK_INT >= 23 && (imageWriter = this.f6829j) != null && image != null) {
            try {
                ImageWriterCompat.queueInputImage(imageWriter, image);
                return true;
            } catch (IllegalStateException e) {
                Logger.m63176e("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e.getMessage());
            }
        }
        return false;
    }

    /* renamed from: f */
    public final /* synthetic */ void m66026f(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (acquireLatestImage != null) {
                this.f6821b.enqueue(acquireLatestImage);
            }
        } catch (IllegalStateException e) {
            Logger.m63176e("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e.getMessage());
        }
    }

    @Override // p000.L72
    public boolean isZslDisabledByFlashMode() {
        return this.f6823d;
    }

    @Override // p000.L72
    public boolean isZslDisabledByUserCaseConfig() {
        return this.f6822c;
    }

    @Override // p000.L72
    public void setZslDisabledByFlashMode(boolean z) {
        this.f6823d = z;
    }

    @Override // p000.L72
    public void setZslDisabledByUserCaseConfig(boolean z) {
        this.f6822c = z;
    }

    /* renamed from: V72$a */
    /* loaded from: classes.dex */
    public class C1494a extends CameraCaptureSession.StateCallback {
        public C1494a() {
            V72.this = r1;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface;
            inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                V72.this.f6829j = ImageWriterCompat.newInstance(inputSurface, 1);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }
    }
}