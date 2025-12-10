package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes3.dex */
public abstract class zzuv {
    public static zzuv zzg(float f, float f2, float f3, float f4, float f5) {
        return new C19853fK2(f, f2, f3, f4, 0.0f);
    }

    /* renamed from: a */
    public abstract float mo31318a();

    /* renamed from: b */
    public abstract float mo31317b();

    /* renamed from: c */
    public abstract float mo31316c();

    /* renamed from: d */
    public abstract float mo31315d();

    /* renamed from: e */
    public abstract float mo31314e();

    /* renamed from: f */
    public final float m46969f() {
        if (m46968g()) {
            return (mo31317b() - mo31316c()) * (mo31315d() - mo31314e());
        }
        return 0.0f;
    }

    /* renamed from: g */
    public final boolean m46968g() {
        return mo31316c() >= 0.0f && mo31316c() < mo31317b() && mo31317b() <= 1.0f && mo31314e() >= 0.0f && mo31314e() < mo31315d() && mo31315d() <= 1.0f;
    }
}
