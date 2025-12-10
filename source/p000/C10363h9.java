package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.TakePictureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: h9 */
/* loaded from: classes.dex */
public final class C10363h9 extends TakePictureRequest {

    /* renamed from: b */
    public final Executor f62413b;

    /* renamed from: c */
    public final ImageCapture.OnImageCapturedCallback f62414c;

    /* renamed from: d */
    public final ImageCapture.OnImageSavedCallback f62415d;

    /* renamed from: e */
    public final ImageCapture.OutputFileOptions f62416e;

    /* renamed from: f */
    public final Rect f62417f;

    /* renamed from: g */
    public final Matrix f62418g;

    /* renamed from: h */
    public final int f62419h;

    /* renamed from: i */
    public final int f62420i;

    /* renamed from: j */
    public final int f62421j;

    /* renamed from: k */
    public final List f62422k;

    public C10363h9(Executor executor, ImageCapture.OnImageCapturedCallback onImageCapturedCallback, ImageCapture.OnImageSavedCallback onImageSavedCallback, ImageCapture.OutputFileOptions outputFileOptions, Rect rect, Matrix matrix, int i, int i2, int i3, List list) {
        if (executor != null) {
            this.f62413b = executor;
            this.f62414c = onImageCapturedCallback;
            this.f62415d = onImageSavedCallback;
            this.f62416e = outputFileOptions;
            if (rect != null) {
                this.f62417f = rect;
                if (matrix != null) {
                    this.f62418g = matrix;
                    this.f62419h = i;
                    this.f62420i = i2;
                    this.f62421j = i3;
                    if (list != null) {
                        this.f62422k = list;
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
    public Executor mo30923e() {
        return this.f62413b;
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
        if (this.f62413b.equals(takePictureRequest.mo30923e()) && ((onImageCapturedCallback = this.f62414c) != null ? onImageCapturedCallback.equals(takePictureRequest.mo30920h()) : takePictureRequest.mo30920h() == null) && ((onImageSavedCallback = this.f62415d) != null ? onImageSavedCallback.equals(takePictureRequest.mo30918j()) : takePictureRequest.mo30918j() == null) && ((outputFileOptions = this.f62416e) != null ? outputFileOptions.equals(takePictureRequest.mo30917k()) : takePictureRequest.mo30917k() == null) && this.f62417f.equals(takePictureRequest.mo30921g()) && this.f62418g.equals(takePictureRequest.mo30915m()) && this.f62419h == takePictureRequest.mo30916l() && this.f62420i == takePictureRequest.mo30919i() && this.f62421j == takePictureRequest.mo30922f() && this.f62422k.equals(takePictureRequest.mo30914n())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    /* renamed from: f */
    public int mo30922f() {
        return this.f62421j;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    /* renamed from: g */
    public Rect mo30921g() {
        return this.f62417f;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    /* renamed from: h */
    public ImageCapture.OnImageCapturedCallback mo30920h() {
        return this.f62414c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f62413b.hashCode() ^ 1000003) * 1000003;
        ImageCapture.OnImageCapturedCallback onImageCapturedCallback = this.f62414c;
        int i = 0;
        if (onImageCapturedCallback == null) {
            hashCode = 0;
        } else {
            hashCode = onImageCapturedCallback.hashCode();
        }
        int i2 = (hashCode3 ^ hashCode) * 1000003;
        ImageCapture.OnImageSavedCallback onImageSavedCallback = this.f62415d;
        if (onImageSavedCallback == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = onImageSavedCallback.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        ImageCapture.OutputFileOptions outputFileOptions = this.f62416e;
        if (outputFileOptions != null) {
            i = outputFileOptions.hashCode();
        }
        return ((((((((((((i3 ^ i) * 1000003) ^ this.f62417f.hashCode()) * 1000003) ^ this.f62418g.hashCode()) * 1000003) ^ this.f62419h) * 1000003) ^ this.f62420i) * 1000003) ^ this.f62421j) * 1000003) ^ this.f62422k.hashCode();
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    /* renamed from: i */
    public int mo30919i() {
        return this.f62420i;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    /* renamed from: j */
    public ImageCapture.OnImageSavedCallback mo30918j() {
        return this.f62415d;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    /* renamed from: k */
    public ImageCapture.OutputFileOptions mo30917k() {
        return this.f62416e;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    /* renamed from: l */
    public int mo30916l() {
        return this.f62419h;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    /* renamed from: m */
    public Matrix mo30915m() {
        return this.f62418g;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    /* renamed from: n */
    public List mo30914n() {
        return this.f62422k;
    }

    public String toString() {
        return "TakePictureRequest{appExecutor=" + this.f62413b + ", inMemoryCallback=" + this.f62414c + ", onDiskCallback=" + this.f62415d + ", outputFileOptions=" + this.f62416e + ", cropRect=" + this.f62417f + ", sensorToBufferTransform=" + this.f62418g + ", rotationDegrees=" + this.f62419h + ", jpegQuality=" + this.f62420i + ", captureMode=" + this.f62421j + ", sessionConfigCameraCaptureCallbacks=" + this.f62422k + "}";
    }
}
