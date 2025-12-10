package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzoz;

/* renamed from: com.google.android.gms.measurement.internal.w */
/* loaded from: classes3.dex */
public final class RunnableC6753w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzai f48227a;

    /* renamed from: b */
    public final /* synthetic */ long f48228b;

    /* renamed from: c */
    public final /* synthetic */ int f48229c;

    /* renamed from: d */
    public final /* synthetic */ long f48230d;

    /* renamed from: e */
    public final /* synthetic */ boolean f48231e;

    /* renamed from: f */
    public final /* synthetic */ zzai f48232f;

    /* renamed from: g */
    public final /* synthetic */ zzid f48233g;

    public RunnableC6753w(zzid zzidVar, zzai zzaiVar, long j, int i, long j2, boolean z, zzai zzaiVar2) {
        this.f48233g = zzidVar;
        this.f48227a = zzaiVar;
        this.f48228b = j;
        this.f48229c = i;
        this.f48230d = j2;
        this.f48231e = z;
        this.f48232f = zzaiVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48233g.m46254h(this.f48227a);
        this.f48233g.m46257e(this.f48228b, false);
        zzid.m46249m(this.f48233g, this.f48227a, this.f48229c, this.f48230d, true, this.f48231e);
        zzoz.zzc();
        if (this.f48233g.zzs.zzf().zzs(null, zzeb.zzas)) {
            zzid.m46250l(this.f48233g, this.f48227a, this.f48232f);
        }
    }
}
