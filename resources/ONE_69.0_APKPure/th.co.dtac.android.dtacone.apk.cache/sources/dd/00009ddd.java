package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.M */
/* loaded from: classes3.dex */
public final class RunnableC6694M implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzik f48107a;

    /* renamed from: b */
    public final /* synthetic */ zzjs f48108b;

    public RunnableC6694M(zzjs zzjsVar, zzik zzikVar) {
        this.f48108b = zzjsVar;
        this.f48107a = zzikVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzjs zzjsVar = this.f48108b;
        zzeeVar = zzjsVar.f48446c;
        if (zzeeVar == null) {
            zzjsVar.zzs.zzay().zzd().zza("Failed to send current screen to service");
            return;
        }
        try {
            zzik zzikVar = this.f48107a;
            if (zzikVar == null) {
                zzeeVar.zzq(0L, null, null, zzjsVar.zzs.zzau().getPackageName());
            } else {
                zzeeVar.zzq(zzikVar.zzc, zzikVar.zza, zzikVar.zzb, zzjsVar.zzs.zzau().getPackageName());
            }
            this.f48108b.m46215g();
        } catch (RemoteException e) {
            this.f48108b.zzs.zzay().zzd().zzb("Failed to send current screen to the service", e);
        }
    }
}