package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.C2429j;

/* renamed from: androidx.camera.camera2.internal.c */
/* loaded from: classes.dex */
public final class C2373c extends C2429j.AbstractC2431b {

    /* renamed from: a */
    public final int f10455a;

    /* renamed from: b */
    public final int f10456b;

    public C2373c(int i, int i2) {
        this.f10455a = i;
        this.f10456b = i2;
    }

    @Override // androidx.camera.camera2.internal.C2429j.AbstractC2431b
    /* renamed from: a */
    public int mo63394a() {
        return this.f10455a;
    }

    @Override // androidx.camera.camera2.internal.C2429j.AbstractC2431b
    /* renamed from: b */
    public int mo63393b() {
        return this.f10456b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2429j.AbstractC2431b)) {
            return false;
        }
        C2429j.AbstractC2431b abstractC2431b = (C2429j.AbstractC2431b) obj;
        if (this.f10455a == abstractC2431b.mo63394a() && this.f10456b == abstractC2431b.mo63393b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f10455a ^ 1000003) * 1000003) ^ this.f10456b;
    }

    public String toString() {
        return "FeatureSettings{cameraMode=" + this.f10455a + ", requiredMaxBitDepth=" + this.f10456b + "}";
    }
}
