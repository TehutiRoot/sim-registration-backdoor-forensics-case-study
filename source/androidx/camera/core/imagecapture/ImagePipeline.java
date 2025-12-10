package androidx.camera.core.imagecapture;

import android.util.Size;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CaptureBundles;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.imagecapture.C2487i;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.CaptureStage;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.compat.workaround.ExifRotationAvailability;
import androidx.camera.core.processing.InternalImageProcessor;
import androidx.core.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public class ImagePipeline {

    /* renamed from: g */
    public static final ExifRotationAvailability f11001g = new ExifRotationAvailability();

    /* renamed from: a */
    public final ImageCaptureConfig f11002a;

    /* renamed from: b */
    public final CaptureConfig f11003b;

    /* renamed from: c */
    public final C2487i f11004c;

    /* renamed from: d */
    public final C2498n f11005d;

    /* renamed from: e */
    public final ProcessingNode f11006e;

    /* renamed from: f */
    public final C2487i.AbstractC2489b f11007f;

    @MainThread
    @VisibleForTesting
    public ImagePipeline(@NonNull ImageCaptureConfig imageCaptureConfig, @NonNull Size size) {
        this(imageCaptureConfig, size, null, false);
    }

    /* renamed from: a */
    public final CameraRequest m63120a(CaptureBundle captureBundle, TakePictureRequest takePictureRequest, QQ1 qq1) {
        ArrayList arrayList = new ArrayList();
        String valueOf = String.valueOf(captureBundle.hashCode());
        List<CaptureStage> captureStages = captureBundle.getCaptureStages();
        Objects.requireNonNull(captureStages);
        for (CaptureStage captureStage : captureStages) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.f11003b.getTemplateType());
            builder.addImplementationOptions(this.f11003b.getImplementationOptions());
            builder.addAllCameraCaptureCallbacks(takePictureRequest.mo30914n());
            builder.addSurface(this.f11007f.m63037h());
            if (this.f11007f.mo63041d() == 256) {
                if (f11001g.isRotationOptionSupported()) {
                    builder.addImplementationOption(CaptureConfig.OPTION_ROTATION, Integer.valueOf(takePictureRequest.mo30916l()));
                }
                builder.addImplementationOption(CaptureConfig.OPTION_JPEG_QUALITY, Integer.valueOf(m63116e(takePictureRequest)));
            }
            builder.addImplementationOptions(captureStage.getCaptureConfig().getImplementationOptions());
            builder.addTag(valueOf, Integer.valueOf(captureStage.getId()));
            builder.addCameraCaptureCallback(this.f11007f.m63044a());
            arrayList.add(builder.build());
        }
        return new CameraRequest(arrayList, qq1);
    }

    /* renamed from: b */
    public final CaptureBundle m63119b() {
        CaptureBundle captureBundle = this.f11002a.getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle());
        Objects.requireNonNull(captureBundle);
        return captureBundle;
    }

    /* renamed from: c */
    public final C21132mo1 m63118c(CaptureBundle captureBundle, TakePictureRequest takePictureRequest, QQ1 qq1, ListenableFuture listenableFuture) {
        return new C21132mo1(captureBundle, takePictureRequest.mo30917k(), takePictureRequest.mo30921g(), takePictureRequest.mo30916l(), takePictureRequest.mo30919i(), takePictureRequest.mo30915m(), qq1, listenableFuture);
    }

    @MainThread
    public void close() {
        Threads.checkMainThread();
        this.f11004c.release();
        this.f11005d.release();
        this.f11006e.release();
    }

    @NonNull
    public SessionConfig.Builder createSessionConfigBuilder(@NonNull Size size) {
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(this.f11002a, size);
        createFrom.addNonRepeatingSurface(this.f11007f.m63037h());
        return createFrom;
    }

    /* renamed from: d */
    public Pair m63117d(TakePictureRequest takePictureRequest, QQ1 qq1, ListenableFuture listenableFuture) {
        Threads.checkMainThread();
        CaptureBundle m63119b = m63119b();
        return new Pair(m63120a(m63119b, takePictureRequest, qq1), m63118c(m63119b, takePictureRequest, qq1, listenableFuture));
    }

    /* renamed from: e */
    public int m63116e(TakePictureRequest takePictureRequest) {
        boolean z;
        if (takePictureRequest.mo30918j() != null) {
            z = true;
        } else {
            z = false;
        }
        boolean hasCropping = TransformUtils.hasCropping(takePictureRequest.mo30921g(), this.f11007f.mo63038g());
        if (z && hasCropping) {
            if (takePictureRequest.mo30922f() == 0) {
                return 100;
            }
            return 95;
        }
        return takePictureRequest.mo30919i();
    }

    @VisibleForTesting
    public boolean expectsMetadata() {
        return this.f11004c.m63055e().getImageReaderProxy() instanceof MetadataImageReader;
    }

    /* renamed from: f */
    public final int m63115f() {
        Integer num = (Integer) this.f11002a.retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
        if (num != null) {
            return num.intValue();
        }
        return 256;
    }

    /* renamed from: g */
    public void m63114g(ImageCaptureException imageCaptureException) {
        Threads.checkMainThread();
        this.f11007f.mo63043b().accept(imageCaptureException);
    }

    @MainThread
    public int getCapacity() {
        Threads.checkMainThread();
        return this.f11004c.m63056d();
    }

    /* renamed from: h */
    public void m63113h(C21132mo1 c21132mo1) {
        Threads.checkMainThread();
        this.f11007f.mo63039f().accept(c21132mo1);
    }

    @MainThread
    public void setOnImageCloseListener(@NonNull ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        Threads.checkMainThread();
        this.f11004c.m63047m(onImageCloseListener);
    }

    @MainThread
    public ImagePipeline(@NonNull ImageCaptureConfig imageCaptureConfig, @NonNull Size size, @Nullable CameraEffect cameraEffect, boolean z) {
        Threads.checkMainThread();
        this.f11002a = imageCaptureConfig;
        this.f11003b = CaptureConfig.Builder.createFrom(imageCaptureConfig).build();
        C2487i c2487i = new C2487i();
        this.f11004c = c2487i;
        C2498n c2498n = new C2498n();
        this.f11005d = c2498n;
        Executor ioExecutor = imageCaptureConfig.getIoExecutor(CameraXExecutors.ioExecutor());
        Objects.requireNonNull(ioExecutor);
        ProcessingNode processingNode = new ProcessingNode(ioExecutor, cameraEffect != null ? new InternalImageProcessor(cameraEffect) : null);
        this.f11006e = processingNode;
        C2487i.AbstractC2489b m63035j = C2487i.AbstractC2489b.m63035j(size, imageCaptureConfig.getInputFormat(), m63115f(), z, imageCaptureConfig.getImageReaderProxyProvider());
        this.f11007f = m63035j;
        processingNode.transform(c2498n.transform(c2487i.transform(m63035j)));
    }
}
