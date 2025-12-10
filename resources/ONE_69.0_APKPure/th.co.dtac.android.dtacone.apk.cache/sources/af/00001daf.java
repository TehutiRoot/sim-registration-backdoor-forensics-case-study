package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.C2411j;

/* renamed from: androidx.camera.camera2.internal.c */
/* loaded from: classes.dex */
public final class C2355c extends C2411j.AbstractC2413b {

    /* renamed from: a */
    public final int f10543a;

    /* renamed from: b */
    public final int f10544b;

    public C2355c(int i, int i2) {
        this.f10543a = i;
        this.f10544b = i2;
    }

    @Override // androidx.camera.camera2.internal.C2411j.AbstractC2413b
    /* renamed from: a */
    public int mo63345a() {
        return this.f10543a;
    }

    @Override // androidx.camera.camera2.internal.C2411j.AbstractC2413b
    /* renamed from: b */
    public int mo63344b() {
        return this.f10544b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2411j.AbstractC2413b)) {
            return false;
        }
        C2411j.AbstractC2413b abstractC2413b = (C2411j.AbstractC2413b) obj;
        if (this.f10543a == abstractC2413b.mo63345a() && this.f10544b == abstractC2413b.mo63344b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f10543a ^ 1000003) * 1000003) ^ this.f10544b;
    }

    public String toString() {
        return "FeatureSettings{cameraMode=" + this.f10543a + ", requiredMaxBitDepth=" + this.f10544b + "}";
    }
}