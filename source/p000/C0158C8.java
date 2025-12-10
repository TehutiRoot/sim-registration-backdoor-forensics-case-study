package p000;

import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.LifecycleOwner;
import p000.C18053Mi0;

/* renamed from: C8 */
/* loaded from: classes.dex */
public final class C0158C8 extends C18053Mi0.AbstractC0888a {

    /* renamed from: a */
    public final LifecycleOwner f616a;

    /* renamed from: b */
    public final CameraUseCaseAdapter.CameraId f617b;

    public C0158C8(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter.CameraId cameraId) {
        if (lifecycleOwner != null) {
            this.f616a = lifecycleOwner;
            if (cameraId != null) {
                this.f617b = cameraId;
                return;
            }
            throw new NullPointerException("Null cameraId");
        }
        throw new NullPointerException("Null lifecycleOwner");
    }

    @Override // p000.C18053Mi0.AbstractC0888a
    /* renamed from: b */
    public CameraUseCaseAdapter.CameraId mo67303b() {
        return this.f617b;
    }

    @Override // p000.C18053Mi0.AbstractC0888a
    /* renamed from: c */
    public LifecycleOwner mo67302c() {
        return this.f616a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18053Mi0.AbstractC0888a)) {
            return false;
        }
        C18053Mi0.AbstractC0888a abstractC0888a = (C18053Mi0.AbstractC0888a) obj;
        if (this.f616a.equals(abstractC0888a.mo67302c()) && this.f617b.equals(abstractC0888a.mo67303b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f616a.hashCode() ^ 1000003) * 1000003) ^ this.f617b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f616a + ", cameraId=" + this.f617b + "}";
    }
}
