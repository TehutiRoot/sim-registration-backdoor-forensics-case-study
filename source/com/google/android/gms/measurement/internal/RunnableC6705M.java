package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.M */
/* loaded from: classes3.dex */
public final class RunnableC6705M implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzik f48095a;

    /* renamed from: b */
    public final /* synthetic */ zzjs f48096b;

    public RunnableC6705M(zzjs zzjsVar, zzik zzikVar) {
        this.f48096b = zzjsVar;
        this.f48095a = zzikVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzjs zzjsVar = this.f48096b;
        zzeeVar = zzjsVar.f48434c;
        if (zzeeVar == null) {
            zzjsVar.zzs.zzay().zzd().zza("Failed to send current screen to service");
            return;
        }
        try {
            zzik zzikVar = this.f48095a;
            if (zzikVar == null) {
                zzeeVar.zzq(0L, null, null, zzjsVar.zzs.zzau().getPackageName());
            } else {
                zzeeVar.zzq(zzikVar.zzc, zzikVar.zza, zzikVar.zzb, zzjsVar.zzs.zzau().getPackageName());
            }
            this.f48096b.m46230g();
        } catch (RemoteException e) {
            this.f48096b.zzs.zzay().zzd().zzb("Failed to send current screen to the service", e);
        }
    }
}
