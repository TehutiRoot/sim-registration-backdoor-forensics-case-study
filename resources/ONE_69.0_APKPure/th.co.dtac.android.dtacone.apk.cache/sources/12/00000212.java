package p000;

import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.LifecycleOwner;
import p000.C18478Si0;

/* renamed from: C8 */
/* loaded from: classes.dex */
public final class C0160C8 extends C18478Si0.AbstractC1309a {

    /* renamed from: a */
    public final LifecycleOwner f657a;

    /* renamed from: b */
    public final CameraUseCaseAdapter.CameraId f658b;

    public C0160C8(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter.CameraId cameraId) {
        if (lifecycleOwner != null) {
            this.f657a = lifecycleOwner;
            if (cameraId != null) {
                this.f658b = cameraId;
                return;
            }
            throw new NullPointerException("Null cameraId");
        }
        throw new NullPointerException("Null lifecycleOwner");
    }

    @Override // p000.C18478Si0.AbstractC1309a
    /* renamed from: b */
    public CameraUseCaseAdapter.CameraId mo66458b() {
        return this.f658b;
    }

    @Override // p000.C18478Si0.AbstractC1309a
    /* renamed from: c */
    public LifecycleOwner mo66457c() {
        return this.f657a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18478Si0.AbstractC1309a)) {
            return false;
        }
        C18478Si0.AbstractC1309a abstractC1309a = (C18478Si0.AbstractC1309a) obj;
        if (this.f657a.equals(abstractC1309a.mo66457c()) && this.f658b.equals(abstractC1309a.mo66458b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f657a.hashCode() ^ 1000003) * 1000003) ^ this.f658b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f657a + ", cameraId=" + this.f658b + "}";
    }
}