package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.SurfaceRequest;

/* renamed from: androidx.camera.core.f */
/* loaded from: classes.dex */
public final class C2466f extends SurfaceRequest.Result {

    /* renamed from: a */
    public final int f10964a;

    /* renamed from: b */
    public final Surface f10965b;

    public C2466f(int i, Surface surface) {
        this.f10964a = i;
        if (surface != null) {
            this.f10965b = surface;
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
        if (this.f10964a == result.getResultCode() && this.f10965b.equals(result.getSurface())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    public int getResultCode() {
        return this.f10964a;
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    public Surface getSurface() {
        return this.f10965b;
    }

    public int hashCode() {
        return ((this.f10964a ^ 1000003) * 1000003) ^ this.f10965b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f10964a + ", surface=" + this.f10965b + "}";
    }
}
