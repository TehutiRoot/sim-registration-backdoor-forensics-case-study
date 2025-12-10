package com.google.android.gms.internal.firebase_ml;

/* loaded from: classes3.dex */
public final class zzyk<K, V> {

    /* renamed from: a */
    public final C21920rL2 f46123a;

    /* renamed from: b */
    public final Object f46124b;

    /* renamed from: c */
    public final Object f46125c;

    public zzyk(zzaav zzaavVar, Object obj, zzaav zzaavVar2, Object obj2) {
        this.f46123a = new C21920rL2(zzaavVar, obj, zzaavVar2, obj2);
        this.f46124b = obj;
        this.f46125c = obj2;
    }

    /* renamed from: a */
    public static int m47415a(C21920rL2 c21920rL2, Object obj, Object obj2) {
        return OK2.m67090e(c21920rL2.f77252a, 1, obj) + OK2.m67090e(c21920rL2.f77254c, 2, obj2);
    }

    /* renamed from: b */
    public static void m47414b(zzwq zzwqVar, C21920rL2 c21920rL2, Object obj, Object obj2) {
        OK2.m67087h(zzwqVar, c21920rL2.f77252a, 1, obj);
        OK2.m67087h(zzwqVar, c21920rL2.f77254c, 2, obj2);
    }

    public static <K, V> zzyk<K, V> zza(zzaav zzaavVar, K k, zzaav zzaavVar2, V v) {
        return new zzyk<>(zzaavVar, k, zzaavVar2, v);
    }

    /* renamed from: c */
    public final C21920rL2 m47413c() {
        return this.f46123a;
    }

    public final int zzc(int i, K k, V v) {
        return zzwq.zzdk(i) + zzwq.m47437g(m47415a(this.f46123a, k, v));
    }
}
