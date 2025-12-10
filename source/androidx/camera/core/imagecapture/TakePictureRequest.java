package androidx.camera.core.imagecapture;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.internal.compat.workaround.CaptureFailedRetryEnabler;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

@AutoValue
@RequiresApi(api = 21)
/* loaded from: classes.dex */
public abstract class TakePictureRequest {

    /* renamed from: a */
    public int f11043a = new CaptureFailedRetryEnabler().getRetryCount();

    /* renamed from: androidx.camera.core.imagecapture.TakePictureRequest$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2477a {
        void retryRequest(TakePictureRequest takePictureRequest);
    }

    /* renamed from: a */
    public static /* synthetic */ void m63079a(TakePictureRequest takePictureRequest, ImageCaptureException imageCaptureException) {
        takePictureRequest.m63075o(imageCaptureException);
    }

    /* renamed from: c */
    public static /* synthetic */ void m63077c(TakePictureRequest takePictureRequest, ImageProxy imageProxy) {
        takePictureRequest.m63072q(imageProxy);
    }

    @NonNull
    /* renamed from: of */
    public static TakePictureRequest m63074of(@NonNull Executor executor, @Nullable ImageCapture.OnImageCapturedCallback onImageCapturedCallback, @Nullable ImageCapture.OnImageSavedCallback onImageSavedCallback, @Nullable ImageCapture.OutputFileOptions outputFileOptions, @NonNull Rect rect, @NonNull Matrix matrix, int i, int i2, int i3, @NonNull List<CameraCaptureCallback> list) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (onImageSavedCallback == null) {
            z = true;
        } else {
            z = false;
        }
        if (outputFileOptions == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        Preconditions.checkArgument(z3, "onDiskCallback and outputFileOptions should be both null or both non-null.");
        if (onImageSavedCallback == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (onImageCapturedCallback == null) {
            z5 = true;
        }
        Preconditions.checkArgument(z5 ^ z4, "One and only one on-disk or in-memory callback should be present.");
        return new C10363h9(executor, onImageCapturedCallback, onImageSavedCallback, outputFileOptions, rect, matrix, i, i2, i3, list);
    }

    /* renamed from: d */
    public boolean m63076d() {
        Threads.checkMainThread();
        int i = this.f11043a;
        if (i > 0) {
            this.f11043a = i - 1;
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public abstract Executor mo30923e();

    /* renamed from: f */
    public abstract int mo30922f();

    /* renamed from: g */
    public abstract Rect mo30921g();

    /* renamed from: h */
    public abstract ImageCapture.OnImageCapturedCallback mo30920h();

    /* renamed from: i */
    public abstract int mo30919i();

    /* renamed from: j */
    public abstract ImageCapture.OnImageSavedCallback mo30918j();

    /* renamed from: k */
    public abstract ImageCapture.OutputFileOptions mo30917k();

    /* renamed from: l */
    public abstract int mo30916l();

    /* renamed from: m */
    public abstract Matrix mo30915m();

    /* renamed from: n */
    public abstract List mo30914n();

    /* renamed from: o */
    public final /* synthetic */ void m63075o(ImageCaptureException imageCaptureException) {
        boolean z;
        boolean z2 = false;
        if (mo30920h() != null) {
            z = true;
        } else {
            z = false;
        }
        if (mo30918j() != null) {
            z2 = true;
        }
        if (z && !z2) {
            ImageCapture.OnImageCapturedCallback mo30920h = mo30920h();
            Objects.requireNonNull(mo30920h);
            mo30920h.onError(imageCaptureException);
        } else if (z2 && !z) {
            ImageCapture.OnImageSavedCallback mo30918j = mo30918j();
            Objects.requireNonNull(mo30918j);
            mo30918j.onError(imageCaptureException);
        } else {
            throw new IllegalStateException("One and only one callback is allowed.");
        }
    }

    /* renamed from: p */
    public final /* synthetic */ void m63073p(ImageCapture.OutputFileResults outputFileResults) {
        ImageCapture.OnImageSavedCallback mo30918j = mo30918j();
        Objects.requireNonNull(mo30918j);
        Objects.requireNonNull(outputFileResults);
        mo30918j.onImageSaved(outputFileResults);
    }

    /* renamed from: q */
    public final /* synthetic */ void m63072q(ImageProxy imageProxy) {
        ImageCapture.OnImageCapturedCallback mo30920h = mo30920h();
        Objects.requireNonNull(mo30920h);
        Objects.requireNonNull(imageProxy);
        mo30920h.onCaptureSuccess(imageProxy);
    }

    /* renamed from: r */
    public void m63071r(final ImageCaptureException imageCaptureException) {
        mo30923e().execute(new Runnable() { // from class: UQ1
            {
                TakePictureRequest.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.m63079a(TakePictureRequest.this, imageCaptureException);
            }
        });
    }

    /* renamed from: s */
    public void m63070s(final ImageCapture.OutputFileResults outputFileResults) {
        mo30923e().execute(new Runnable() { // from class: WQ1
            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.this.m63073p(outputFileResults);
            }
        });
    }

    /* renamed from: t */
    public void m63069t(final ImageProxy imageProxy) {
        mo30923e().execute(new Runnable() { // from class: VQ1
            {
                TakePictureRequest.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TakePictureRequest.m63077c(TakePictureRequest.this, imageProxy);
            }
        });
    }
}
