package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.V */
/* loaded from: classes3.dex */
public final class RunnableC6702V implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f48127a;

    /* renamed from: b */
    public final /* synthetic */ boolean f48128b;

    /* renamed from: c */
    public final /* synthetic */ zzac f48129c;

    /* renamed from: d */
    public final /* synthetic */ zzac f48130d;

    /* renamed from: e */
    public final /* synthetic */ zzjs f48131e;

    public RunnableC6702V(zzjs zzjsVar, boolean z, zzq zzqVar, boolean z2, zzac zzacVar, zzac zzacVar2) {
        this.f48131e = zzjsVar;
        this.f48127a = zzqVar;
        this.f48128b = z2;
        this.f48129c = zzacVar;
        this.f48130d = zzacVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzac zzacVar;
        zzjs zzjsVar = this.f48131e;
        zzeeVar = zzjsVar.f48446c;
        if (zzeeVar == null) {
            zzjsVar.zzs.zzay().zzd().zza("Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.f48127a);
        zzjs zzjsVar2 = this.f48131e;
        if (this.f48128b) {
            zzacVar = null;
        } else {
            zzacVar = this.f48129c;
        }
        zzjsVar2.m46220b(zzeeVar, zzacVar, this.f48127a);
        this.f48131e.m46215g();
    }
}