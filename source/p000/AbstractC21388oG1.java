package p000;

import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.OutputSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.SessionProcessorSurface;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.extensions.internal.sessionprocessor.ImageProcessor;
import androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig;
import androidx.camera.extensions.internal.sessionprocessor.ImageReference;
import androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig;
import androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: oG1 */
/* loaded from: classes.dex */
public abstract class AbstractC21388oG1 implements SessionProcessor {

    /* renamed from: c */
    public HandlerThread f72638c;

    /* renamed from: f */
    public String f72641f;

    /* renamed from: g */
    public final Set f72642g;

    /* renamed from: a */
    public Map f72636a = new HashMap();

    /* renamed from: b */
    public Map f72637b = new HashMap();

    /* renamed from: d */
    public List f72639d = new ArrayList();

    /* renamed from: e */
    public final Object f72640e = new Object();

    /* renamed from: oG1$a */
    /* loaded from: classes.dex */
    public static class C12430a implements ImageReference {

        /* renamed from: b */
        public Image f72644b;

        /* renamed from: c */
        public final Object f72645c = new Object();

        /* renamed from: a */
        public int f72643a = 1;

        public C12430a(Image image) {
            this.f72644b = image;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReference
        public boolean decrement() {
            synchronized (this.f72645c) {
                try {
                    int i = this.f72643a;
                    if (i <= 0) {
                        return false;
                    }
                    int i2 = i - 1;
                    this.f72643a = i2;
                    if (i2 <= 0) {
                        this.f72644b.close();
                    }
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReference
        public Image get() {
            return this.f72644b;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReference
        public boolean increment() {
            synchronized (this.f72645c) {
                try {
                    int i = this.f72643a;
                    if (i <= 0) {
                        return false;
                    }
                    this.f72643a = i + 1;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public AbstractC21388oG1(List list) {
        this.f72642g = m25941d(list);
    }

    /* renamed from: a */
    public static /* synthetic */ void m25944a(ImageProcessor imageProcessor, int i, String str, ImageReader imageReader) {
        m25939f(imageProcessor, i, str, imageReader);
    }

    /* renamed from: b */
    public static /* synthetic */ void m25943b(ImageReader imageReader) {
        imageReader.close();
    }

    /* renamed from: c */
    public static SessionProcessorSurface m25942c(InterfaceC0757Ki interfaceC0757Ki, Map map) {
        if (interfaceC0757Ki instanceof SurfaceOutputConfig) {
            return new SessionProcessorSurface(((SurfaceOutputConfig) interfaceC0757Ki).mo51705c(), interfaceC0757Ki.getId());
        }
        if (interfaceC0757Ki instanceof ImageReaderOutputConfig) {
            ImageReaderOutputConfig imageReaderOutputConfig = (ImageReaderOutputConfig) interfaceC0757Ki;
            final ImageReader newInstance = ImageReader.newInstance(imageReaderOutputConfig.mo898e().getWidth(), imageReaderOutputConfig.mo898e().getHeight(), imageReaderOutputConfig.mo900c(), imageReaderOutputConfig.mo899d());
            map.put(Integer.valueOf(interfaceC0757Ki.getId()), newInstance);
            SessionProcessorSurface sessionProcessorSurface = new SessionProcessorSurface(newInstance.getSurface(), interfaceC0757Ki.getId());
            sessionProcessorSurface.getTerminationFuture().addListener(new Runnable() { // from class: nG1
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC21388oG1.m25943b(newInstance);
                }
            }, CameraXExecutors.directExecutor());
            return sessionProcessorSurface;
        } else if (interfaceC0757Ki instanceof MultiResolutionImageReaderOutputConfig) {
            throw new UnsupportedOperationException("MultiResolutionImageReader not supported yet");
        } else {
            throw new UnsupportedOperationException("Unsupported Camera2OutputConfig:" + interfaceC0757Ki);
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m25939f(ImageProcessor imageProcessor, int i, String str, ImageReader imageReader) {
        try {
            Image acquireNextImage = imageReader.acquireNextImage();
            imageProcessor.onNextImageAvailable(i, acquireNextImage.getTimestamp(), new C12430a(acquireNextImage), str);
        } catch (IllegalStateException e) {
            Logger.m63227e("SessionProcessorBase", "Failed to acquire next image.", e);
        }
    }

    /* renamed from: d */
    public final Set m25941d(List list) {
        CaptureRequest.Key key;
        HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT >= 30) {
            key = CaptureRequest.CONTROL_ZOOM_RATIO;
            if (list.contains(key) || list.contains(CaptureRequest.SCALER_CROP_REGION)) {
                hashSet.add(0);
            }
        } else if (list.contains(CaptureRequest.SCALER_CROP_REGION)) {
            hashSet.add(0);
        }
        if (list.containsAll(Arrays.asList(CaptureRequest.CONTROL_AF_TRIGGER, CaptureRequest.CONTROL_AF_MODE))) {
            hashSet.add(1);
        }
        if (list.contains(CaptureRequest.CONTROL_AF_REGIONS)) {
            hashSet.add(2);
        }
        if (list.contains(CaptureRequest.CONTROL_AE_REGIONS)) {
            hashSet.add(3);
        }
        if (list.contains(CaptureRequest.CONTROL_AWB_REGIONS)) {
            hashSet.add(4);
        }
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_MODE;
        if (list.containsAll(Arrays.asList(key2, CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER))) {
            hashSet.add(5);
        }
        if (list.containsAll(Arrays.asList(key2, CaptureRequest.FLASH_MODE))) {
            hashSet.add(6);
        }
        if (list.contains(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION)) {
            hashSet.add(7);
        }
        return hashSet;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public final void deInitSession() {
        Logger.m63228e("SessionProcessorBase", "deInitSession: cameraId=" + this.f72641f);
        deInitSessionInternal();
        synchronized (this.f72640e) {
            try {
                for (DeferrableSurface deferrableSurface : this.f72639d) {
                    deferrableSurface.close();
                }
                this.f72639d.clear();
                this.f72636a.clear();
                this.f72637b.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        HandlerThread handlerThread = this.f72638c;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f72638c = null;
        }
    }

    public abstract void deInitSessionInternal();

    @Override // androidx.camera.core.impl.SessionProcessor
    public Set getSupportedCameraOperations() {
        return this.f72642g;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    @NonNull
    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public final SessionConfig initSession(@NonNull CameraInfo cameraInfo, @NonNull OutputSurface outputSurface, @NonNull OutputSurface outputSurface2, @Nullable OutputSurface outputSurface3) {
        Camera2CameraInfo from = Camera2CameraInfo.from(cameraInfo);
        InterfaceC0887Mi initSessionInternal = initSessionInternal(from.getCameraId(), from.getCameraCharacteristicsMap(), outputSurface, outputSurface2, outputSurface3);
        SessionConfig.Builder builder = new SessionConfig.Builder();
        synchronized (this.f72640e) {
            try {
                for (InterfaceC0757Ki interfaceC0757Ki : initSessionInternal.mo67193c()) {
                    SessionProcessorSurface m25942c = m25942c(interfaceC0757Ki, this.f72636a);
                    this.f72639d.add(m25942c);
                    this.f72637b.put(Integer.valueOf(interfaceC0757Ki.getId()), interfaceC0757Ki);
                    SessionConfig.OutputConfig.Builder surfaceGroupId = SessionConfig.OutputConfig.builder(m25942c).setPhysicalCameraId(interfaceC0757Ki.getPhysicalCameraId()).setSurfaceGroupId(interfaceC0757Ki.getSurfaceGroupId());
                    List<InterfaceC0757Ki> surfaceSharingOutputConfigs = interfaceC0757Ki.getSurfaceSharingOutputConfigs();
                    if (surfaceSharingOutputConfigs != null && !surfaceSharingOutputConfigs.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (InterfaceC0757Ki interfaceC0757Ki2 : surfaceSharingOutputConfigs) {
                            this.f72637b.put(Integer.valueOf(interfaceC0757Ki2.getId()), interfaceC0757Ki2);
                            arrayList.add(m25942c(interfaceC0757Ki2, this.f72636a));
                        }
                        surfaceGroupId.setSharedSurfaces(arrayList);
                    }
                    builder.addOutputConfig(surfaceGroupId.build());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
        for (CaptureRequest.Key key : initSessionInternal.mo67195a().keySet()) {
            builder2.setCaptureRequestOption(key, initSessionInternal.mo67195a().get(key));
        }
        builder.setImplementationOptions(builder2.build());
        builder.setTemplateType(initSessionInternal.mo67194b());
        HandlerThread handlerThread = new HandlerThread("CameraX-extensions_image_reader");
        this.f72638c = handlerThread;
        handlerThread.start();
        this.f72641f = from.getCameraId();
        Logger.m63230d("SessionProcessorBase", "initSession: cameraId=" + this.f72641f);
        return builder.build();
    }

    public abstract InterfaceC0887Mi initSessionInternal(String str, Map map, OutputSurface outputSurface, OutputSurface outputSurface2, OutputSurface outputSurface3);

    public void setImageProcessor(final int i, @NonNull final ImageProcessor imageProcessor) {
        ImageReader imageReader;
        final String physicalCameraId;
        synchronized (this.f72640e) {
            imageReader = (ImageReader) this.f72636a.get(Integer.valueOf(i));
            InterfaceC0757Ki interfaceC0757Ki = (InterfaceC0757Ki) this.f72637b.get(Integer.valueOf(i));
            if (interfaceC0757Ki == null) {
                physicalCameraId = null;
            } else {
                physicalCameraId = interfaceC0757Ki.getPhysicalCameraId();
            }
        }
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: mG1
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader2) {
                    AbstractC21388oG1.m25944a(imageProcessor, i, physicalCameraId, imageReader2);
                }
            }, new Handler(this.f72638c.getLooper()));
        }
    }
}
