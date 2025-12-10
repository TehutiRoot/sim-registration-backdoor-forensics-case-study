package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzoz;

/* renamed from: com.google.android.gms.measurement.internal.w */
/* loaded from: classes3.dex */
public final class RunnableC6742w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzai f48239a;

    /* renamed from: b */
    public final /* synthetic */ long f48240b;

    /* renamed from: c */
    public final /* synthetic */ int f48241c;

    /* renamed from: d */
    public final /* synthetic */ long f48242d;

    /* renamed from: e */
    public final /* synthetic */ boolean f48243e;

    /* renamed from: f */
    public final /* synthetic */ zzai f48244f;

    /* renamed from: g */
    public final /* synthetic */ zzid f48245g;

    public RunnableC6742w(zzid zzidVar, zzai zzaiVar, long j, int i, long j2, boolean z, zzai zzaiVar2) {
        this.f48245g = zzidVar;
        this.f48239a = zzaiVar;
        this.f48240b = j;
        this.f48241c = i;
        this.f48242d = j2;
        this.f48243e = z;
        this.f48244f = zzaiVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48245g.m46239h(this.f48239a);
        this.f48245g.m46242e(this.f48240b, false);
        zzid.m46234m(this.f48245g, this.f48239a, this.f48241c, this.f48242d, true, this.f48243e);
        zzoz.zzc();
        if (this.f48245g.zzs.zzf().zzs(null, zzeb.zzas)) {
            zzid.m46235l(this.f48245g, this.f48239a, this.f48244f);
        }
    }
}