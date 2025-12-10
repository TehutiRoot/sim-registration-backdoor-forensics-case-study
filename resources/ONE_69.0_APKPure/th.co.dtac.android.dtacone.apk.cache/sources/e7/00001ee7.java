package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.SurfaceRequest;

/* renamed from: androidx.camera.core.f */
/* loaded from: classes.dex */
public final class C2448f extends SurfaceRequest.Result {

    /* renamed from: a */
    public final int f11052a;

    /* renamed from: b */
    public final Surface f11053b;

    public C2448f(int i, Surface surface) {
        this.f11052a = i;
        if (surface != null) {
            this.f11053b = surface;
            return;
        }
        throw new NullPointerException("Null surface");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceRequest.Result)) {
            return false;
        }
        SurfaceRequest.Result result = (SurfaceRequest.Result) obj;
        if (this.f11052a == result.getResultCode() && this.f11053b.equals(result.getSurface())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    public int getResultCode() {
        return this.f11052a;
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    public Surface getSurface() {
        return this.f11053b;
    }

    public int hashCode() {
        return ((this.f11052a ^ 1000003) * 1000003) ^ this.f11053b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f11052a + ", surface=" + this.f11053b + "}";
    }
}