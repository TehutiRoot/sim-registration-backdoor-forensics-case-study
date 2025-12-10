package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes3.dex */
public abstract class zzuv {
    public static zzuv zzg(float f, float f2, float f3, float f4, float f5) {
        return new C19388cL2(f, f2, f3, f4, 0.0f);
    }

    /* renamed from: a */
    public abstract float mo46966a();

    /* renamed from: b */
    public abstract float mo46965b();

    /* renamed from: c */
    public abstract float mo46964c();

    /* renamed from: d */
    public abstract float mo46963d();

    /* renamed from: e */
    public abstract float mo46962e();

    /* renamed from: f */
    public final float m46961f() {
        if (m46960g()) {
            return (mo46965b() - mo46964c()) * (mo46963d() - mo46962e());
        }
        return 0.0f;
    }

    /* renamed from: g */
    public final boolean m46960g() {
        return mo46964c() >= 0.0f && mo46964c() < mo46965b() && mo46965b() <= 1.0f && mo46962e() >= 0.0f && mo46962e() < mo46963d() && mo46963d() <= 1.0f;
    }
}