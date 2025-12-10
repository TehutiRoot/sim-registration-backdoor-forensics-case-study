package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.V */
/* loaded from: classes3.dex */
public final class RunnableC6713V implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f48115a;

    /* renamed from: b */
    public final /* synthetic */ boolean f48116b;

    /* renamed from: c */
    public final /* synthetic */ zzac f48117c;

    /* renamed from: d */
    public final /* synthetic */ zzac f48118d;

    /* renamed from: e */
    public final /* synthetic */ zzjs f48119e;

    public RunnableC6713V(zzjs zzjsVar, boolean z, zzq zzqVar, boolean z2, zzac zzacVar, zzac zzacVar2) {
        this.f48119e = zzjsVar;
        this.f48115a = zzqVar;
        this.f48116b = z2;
        this.f48117c = zzacVar;
        this.f48118d = zzacVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzac zzacVar;
        zzjs zzjsVar = this.f48119e;
        zzeeVar = zzjsVar.f48434c;
        if (zzeeVar == null) {
            zzjsVar.zzs.zzay().zzd().zza("Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.f48115a);
        zzjs zzjsVar2 = this.f48119e;
        if (this.f48116b) {
            zzacVar = null;
        } else {
            zzacVar = this.f48117c;
        }
        zzjsVar2.m46235b(zzeeVar, zzacVar, this.f48115a);
        this.f48119e.m46230g();
    }
}
