package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzoz;

/* renamed from: com.google.android.gms.measurement.internal.x */
/* loaded from: classes3.dex */
public final class RunnableC6754x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzai f48234a;

    /* renamed from: b */
    public final /* synthetic */ int f48235b;

    /* renamed from: c */
    public final /* synthetic */ long f48236c;

    /* renamed from: d */
    public final /* synthetic */ boolean f48237d;

    /* renamed from: e */
    public final /* synthetic */ zzai f48238e;

    /* renamed from: f */
    public final /* synthetic */ zzid f48239f;

    public RunnableC6754x(zzid zzidVar, zzai zzaiVar, int i, long j, boolean z, zzai zzaiVar2) {
        this.f48239f = zzidVar;
        this.f48234a = zzaiVar;
        this.f48235b = i;
        this.f48236c = j;
        this.f48237d = z;
        this.f48238e = zzaiVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48239f.m46254h(this.f48234a);
        zzid.m46249m(this.f48239f, this.f48234a, this.f48235b, this.f48236c, false, this.f48237d);
        zzoz.zzc();
        if (this.f48239f.zzs.zzf().zzs(null, zzeb.zzas)) {
            zzid.m46250l(this.f48239f, this.f48234a, this.f48238e);
        }
    }
}
