package io.fotoapparat.hardware;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.fotoapparat.capability.Capabilities;
import io.fotoapparat.hardware.CameraDeviceKt;
import io.fotoapparat.hardware.orientation.Orientation;
import io.fotoapparat.parameter.Resolution;
import io.fotoapparat.result.Photo;
import io.fotoapparat.view.Preview;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013*\n\u0010\u0014\"\u00020\r2\u00020\r¨\u0006\u0015"}, m28850d2 = {"Landroid/hardware/Camera;", "", "imageRotation", "Lio/fotoapparat/result/Photo;", "e", "(Landroid/hardware/Camera;I)Lio/fotoapparat/result/Photo;", "Lio/fotoapparat/view/Preview;", "preview", "Landroid/view/Surface;", "d", "(Landroid/hardware/Camera;Lio/fotoapparat/view/Preview;)Landroid/view/Surface;", "Lio/fotoapparat/hardware/orientation/Orientation;", "previewOrientation", "Lio/fotoapparat/parameter/Resolution;", OperatorName.CURVE_TO, "(Landroid/hardware/Camera;Lio/fotoapparat/hardware/orientation/Orientation;)Lio/fotoapparat/parameter/Resolution;", "Lio/fotoapparat/capability/Capabilities;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lio/fotoapparat/capability/Capabilities;)Z", "PreviewSize", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCameraDevice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraDevice.kt\nio/fotoapparat/hardware/CameraDeviceKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,428:1\n1#2:429\n*E\n"})
/* loaded from: classes5.dex */
public final class CameraDeviceKt {
    /* renamed from: a */
    public static /* synthetic */ void m30543a(AtomicReference atomicReference, int i, CountDownLatch countDownLatch, byte[] bArr, Camera camera) {
        m30538f(atomicReference, i, countDownLatch, bArr, camera);
    }

    /* renamed from: b */
    public static final boolean m30542b(Capabilities capabilities) {
        if (capabilities.getMaxMeteringAreas() <= 0 && capabilities.getMaxFocusAreas() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final Resolution m30541c(Camera camera, Orientation orientation) {
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        Resolution resolution = new Resolution(previewSize.width, previewSize.height);
        if (!(orientation instanceof Orientation.Vertical)) {
            if (orientation instanceof Orientation.Horizontal) {
                return resolution.flipDimensions();
            }
            throw new NoWhenBranchMatchedException();
        }
        return resolution;
    }

    /* renamed from: d */
    public static final Surface m30540d(Camera camera, Preview preview) {
        if (preview instanceof Preview.Texture) {
            SurfaceTexture surfaceTexture = ((Preview.Texture) preview).getSurfaceTexture();
            camera.setPreviewTexture(surfaceTexture);
            return new Surface(surfaceTexture);
        } else if (preview instanceof Preview.Surface) {
            SurfaceHolder surfaceHolder = ((Preview.Surface) preview).getSurfaceHolder();
            camera.setPreviewDisplay(surfaceHolder);
            Surface surface = surfaceHolder.getSurface();
            Intrinsics.checkNotNullExpressionValue(surface, "preview.surfaceHolder\n  …Display)\n        .surface");
            return surface;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: e */
    public static final Photo m30539e(Camera camera, final int i) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference();
        camera.takePicture(null, null, null, new Camera.PictureCallback() { // from class: Dj
            @Override // android.hardware.Camera.PictureCallback
            public final void onPictureTaken(byte[] bArr, Camera camera2) {
                CameraDeviceKt.m30543a(atomicReference, i, countDownLatch, bArr, camera2);
            }
        });
        countDownLatch.await();
        Object obj = atomicReference.get();
        Intrinsics.checkNotNullExpressionValue(obj, "photoReference.get()");
        return (Photo) obj;
    }

    /* renamed from: f */
    public static final void m30538f(AtomicReference photoReference, int i, CountDownLatch latch, byte[] data, Camera camera) {
        Intrinsics.checkNotNullParameter(photoReference, "$photoReference");
        Intrinsics.checkNotNullParameter(latch, "$latch");
        Intrinsics.checkNotNullExpressionValue(data, "data");
        photoReference.set(new Photo(data, i));
        latch.countDown();
    }
}
