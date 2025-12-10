package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.TakePictureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: h9 */
/* loaded from: classes.dex */
public final class C10344h9 extends TakePictureRequest {

    /* renamed from: b */
    public final Executor f62386b;

    /* renamed from: c */
    public final ImageCapture.OnImageCapturedCallback f62387c;

    /* renamed from: d */
    public final ImageCapture.OnImageSavedCallback f62388d;

    /* renamed from: e */
    public final ImageCapture.OutputFileOptions f62389e;

    /* renamed from: f */
    public final Rect f62390f;

    /* renamed from: g */
    public final Matrix f62391g;

    /* renamed from: h */
    public final int f62392h;

    /* renamed from: i */
    public final int f62393i;

    /* renamed from: j */
    public final int f62394j;

    /* renamed from: k */
    public final List f62395k;

    public C10344h9(Executor executor, ImageCapture.OnImageCapturedCallback onImageCapturedCallback, ImageCapture.OnImageSavedCallback onImageSavedCallback, ImageCapture.OutputFileOptions outputFileOptions, Rect rect, Matrix matrix, int i, int i2, int i3, List list) {
        if (executor != null) {
            this.f62386b = executor;
            this.f62387c = onImageCapturedCallback;
            this.f62388d = onImageSavedCallback;
            this.f62389e = outputFileOptions;
            if (rect != null) {
                this.f62390f = rect;
                if (matrix != null) {
                    this.f62391g = matrix;
                    this.f62392h = i;
                    this.f62393i = i2;
                    this.f62394j = i3;
                    if (list != null) {
                        this.f62395k = list;
                        return;
                    }
                    throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
                }
                throw new NullPointerException("Null sensorToBufferTransform");
            }
            throw new NullPointerException("Null cropRect");
        }
        throw new NullPointerException("Null appExecutor");
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    /* renamed from: e */
    public Executor mo31283e() {
        return this.f62386b;
    }

    public boolean equals(Object obj) {
        ImageCapture.OnImageCapturedCallback onImageCapturedCallback;
        ImageCapture.OnImageSavedCallback onImageSavedCallback;
        ImageCapture.OutputFileOptions outputFileOptions;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TakePictureRequest)) {
            return false;
        }
        TakePictureRequest takePictureRequest = (TakePictureRequest) obj;
        if (this.f62386b.equals(takePictureRequest.mo31283e()) && ((onImageCapturedCallback = this.f62387c) != null ? onImageCapturedCallback.equals(takePictureRequest.mo31280h()) : takePictureRequest.mo31280h() == null) && ((onImageSavedCallback = this.f62388d) != null ? onImageSavedCallback.equals(takePictureRequest.mo31278j()) : takePictureRequest.mo31278j() == null) && ((outputFileOptions = this.f62389e) != null ? outputFileOptions.equals(takePictureRequest.mo31277k()) : takePictureRequest.mo31277k() == null) && this.f62390f.equals(takePictureRequest.mo31281g()) && this.f62391g.equals(takePictureRequest.mo31275m()) && this.f62392h == takePictureRequest.mo31276l() && this.f62393i == takePictureRequest.mo31279i() && this.f62394j == takePictureRequest.mo31282f() && this.f62395k.equals(takePictureRequest.mo31274n())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    /* renamed from: f */
    public int mo31282f() {
        return this.f62394j;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    /* renamed from: g */
    public Rect mo31281g() {
        return this.f62390f;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    /* renamed from: h */
    public ImageCapture.OnImageCapturedCallback mo31280h() {
        return this.f62387c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f62386b.hashCode() ^ 1000003) * 1000003;
        ImageCapture.OnImageCapturedCallback onImageCapturedCallback = this.f62387c;
        int i = 0;
        if (onImageCapturedCallback == null) {
            hashCode = 0;
        } else {
            hashCode = onImageCapturedCallback.hashCode();
        }
        int i2 = (hashCode3 ^ hashCode) * 1000003;
        ImageCapture.OnImageSavedCallback onImageSavedCallback = this.f62388d;
        if (onImageSavedCallback == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = onImageSavedCallback.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        ImageCapture.OutputFileOptions outputFileOptions = this.f62389e;
        if (outputFileOptions != null) {
            i = outputFileOptions.hashCode();
        }
        return ((((((((((((i3 ^ i) * 1000003) ^ this.f62390f.hashCode()) * 1000003) ^ this.f62391g.hashCode()) * 1000003) ^ this.f62392h) * 1000003) ^ this.f62393i) * 1000003) ^ this.f62394j) * 1000003) ^ this.f62395k.hashCode();
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    /* renamed from: i */
    public int mo31279i() {
        return this.f62393i;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    /* renamed from: j */
    public ImageCapture.OnImageSavedCallback mo31278j() {
        return this.f62388d;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    /* renamed from: k */
    public ImageCapture.OutputFileOptions mo31277k() {
        return this.f62389e;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    /* renamed from: l */
    public int mo31276l() {
        return this.f62392h;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    /* renamed from: m */
    public Matrix mo31275m() {
        return this.f62391g;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    /* renamed from: n */
    public List mo31274n() {
        return this.f62395k;
    }

    public String toString() {
        return "TakePictureRequest{appExecutor=" + this.f62386b + ", inMemoryCallback=" + this.f62387c + ", onDiskCallback=" + this.f62388d + ", outputFileOptions=" + this.f62389e + ", cropRect=" + this.f62390f + ", sensorToBufferTransform=" + this.f62391g + ", rotationDegrees=" + this.f62392h + ", jpegQuality=" + this.f62393i + ", captureMode=" + this.f62394j + ", sessionConfigCameraCaptureCallbacks=" + this.f62395k + "}";
    }
}