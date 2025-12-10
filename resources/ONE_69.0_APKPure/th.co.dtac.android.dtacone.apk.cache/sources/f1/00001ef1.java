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
import androidx.camera.core.imagecapture.C2469i;
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
    public static final ExifRotationAvailability f11089g = new ExifRotationAvailability();

    /* renamed from: a */
    public final ImageCaptureConfig f11090a;

    /* renamed from: b */
    public final CaptureConfig f11091b;

    /* renamed from: c */
    public final C2469i f11092c;

    /* renamed from: d */
    public final C2480n f11093d;

    /* renamed from: e */
    public final ProcessingNode f11094e;

    /* renamed from: f */
    public final C2469i.AbstractC2471b f11095f;

    @MainThread
    @VisibleForTesting
    public ImagePipeline(@NonNull ImageCaptureConfig imageCaptureConfig, @NonNull Size size) {
        this(imageCaptureConfig, size, null, false);
    }

    /* renamed from: a */
    public final CameraRequest m63068a(CaptureBundle captureBundle, TakePictureRequest takePictureRequest, NR1 nr1) {
        ArrayList arrayList = new ArrayList();
        String valueOf = String.valueOf(captureBundle.hashCode());
        List<CaptureStage> captureStages = captureBundle.getCaptureStages();
        Objects.requireNonNull(captureStages);
        for (CaptureStage captureStage : captureStages) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.f11091b.getTemplateType());
            builder.addImplementationOptions(this.f11091b.getImplementationOptions());
            builder.addAllCameraCaptureCallbacks(takePictureRequest.mo31274n());
            builder.addSurface(this.f11095f.m62985h());
            if (this.f11095f.mo62989d() == 256) {
                if (f11089g.isRotationOptionSupported()) {
                    builder.addImplementationOption(CaptureConfig.OPTION_ROTATION, Integer.valueOf(takePictureRequest.mo31276l()));
                }
                builder.addImplementationOption(CaptureConfig.OPTION_JPEG_QUALITY, Integer.valueOf(m63064e(takePictureRequest)));
            }
            builder.addImplementationOptions(captureStage.getCaptureConfig().getImplementationOptions());
            builder.addTag(valueOf, Integer.valueOf(captureStage.getId()));
            builder.addCameraCaptureCallback(this.f11095f.m62992a());
            arrayList.add(builder.build());
        }
        return new CameraRequest(arrayList, nr1);
    }

    /* renamed from: b */
    public final CaptureBundle m63067b() {
        CaptureBundle captureBundle = this.f11090a.getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle());
        Objects.requireNonNull(captureBundle);
        return captureBundle;
    }

    /* renamed from: c */
    public final C20675jp1 m63066c(CaptureBundle captureBundle, TakePictureRequest takePictureRequest, NR1 nr1, ListenableFuture listenableFuture) {
        return new C20675jp1(captureBundle, takePictureRequest.mo31277k(), takePictureRequest.mo31281g(), takePictureRequest.mo31276l(), takePictureRequest.mo31279i(), takePictureRequest.mo31275m(), nr1, listenableFuture);
    }

    @MainThread
    public void close() {
        Threads.checkMainThread();
        this.f11092c.release();
        this.f11093d.release();
        this.f11094e.release();
    }

    @NonNull
    public SessionConfig.Builder createSessionConfigBuilder(@NonNull Size size) {
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(this.f11090a, size);
        createFrom.addNonRepeatingSurface(this.f11095f.m62985h());
        return createFrom;
    }

    /* renamed from: d */
    public Pair m63065d(TakePictureRequest takePictureRequest, NR1 nr1, ListenableFuture listenableFuture) {
        Threads.checkMainThread();
        CaptureBundle m63067b = m63067b();
        return new Pair(m63068a(m63067b, takePictureRequest, nr1), m63066c(m63067b, takePictureRequest, nr1, listenableFuture));
    }

    /* renamed from: e */
    public int m63064e(TakePictureRequest takePictureRequest) {
        boolean z;
        if (takePictureRequest.mo31278j() != null) {
            z = true;
        } else {
            z = false;
        }
        boolean hasCropping = TransformUtils.hasCropping(takePictureRequest.mo31281g(), this.f11095f.mo62986g());
        if (z && hasCropping) {
            if (takePictureRequest.mo31282f() == 0) {
                return 100;
            }
            return 95;
        }
        return takePictureRequest.mo31279i();
    }

    @VisibleForTesting
    public boolean expectsMetadata() {
        return this.f11092c.m63003e().getImageReaderProxy() instanceof MetadataImageReader;
    }

    /* renamed from: f */
    public final int m63063f() {
        Integer num = (Integer) this.f11090a.retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
        if (num != null) {
            return num.intValue();
        }
        return 256;
    }

    /* renamed from: g */
    public void m63062g(ImageCaptureException imageCaptureException) {
        Threads.checkMainThread();
        this.f11095f.mo62991b().accept(imageCaptureException);
    }

    @MainThread
    public int getCapacity() {
        Threads.checkMainThread();
        return this.f11092c.m63004d();
    }

    /* renamed from: h */
    public void m63061h(C20675jp1 c20675jp1) {
        Threads.checkMainThread();
        this.f11095f.mo62987f().accept(c20675jp1);
    }

    @MainThread
    public void setOnImageCloseListener(@NonNull ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        Threads.checkMainThread();
        this.f11092c.m62995m(onImageCloseListener);
    }

    @MainThread
    public ImagePipeline(@NonNull ImageCaptureConfig imageCaptureConfig, @NonNull Size size, @Nullable CameraEffect cameraEffect, boolean z) {
        Threads.checkMainThread();
        this.f11090a = imageCaptureConfig;
        this.f11091b = CaptureConfig.Builder.createFrom(imageCaptureConfig).build();
        C2469i c2469i = new C2469i();
        this.f11092c = c2469i;
        C2480n c2480n = new C2480n();
        this.f11093d = c2480n;
        Executor ioExecutor = imageCaptureConfig.getIoExecutor(CameraXExecutors.ioExecutor());
        Objects.requireNonNull(ioExecutor);
        ProcessingNode processingNode = new ProcessingNode(ioExecutor, cameraEffect != null ? new InternalImageProcessor(cameraEffect) : null);
        this.f11094e = processingNode;
        C2469i.AbstractC2471b m62983j = C2469i.AbstractC2471b.m62983j(size, imageCaptureConfig.getInputFormat(), m63063f(), z, imageCaptureConfig.getImageReaderProxyProvider());
        this.f11095f = m62983j;
        processingNode.transform(c2480n.transform(c2469i.transform(m62983j)));
    }
}