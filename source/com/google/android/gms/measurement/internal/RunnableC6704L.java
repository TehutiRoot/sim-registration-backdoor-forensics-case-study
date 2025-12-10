package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.L */
/* loaded from: classes3.dex */
public final class RunnableC6704L implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f48093a;

    /* renamed from: b */
    public final /* synthetic */ zzjs f48094b;

    public RunnableC6704L(zzjs zzjsVar, zzq zzqVar) {
        this.f48094b = zzjsVar;
        this.f48093a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzjs zzjsVar = this.f48094b;
        zzeeVar = zzjsVar.f48434c;
        if (zzeeVar == null) {
            zzjsVar.zzs.zzay().zzd().zza("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f48093a);
            zzeeVar.zzj(this.f48093a);
            this.f48094b.zzs.zzi().zzm();
            this.f48094b.m46235b(zzeeVar, null, this.f48093a);
            this.f48094b.m46230g();
        } catch (RemoteException e) {
            this.f48094b.zzs.zzay().zzd().zzb("Failed to send app launch to the service", e);
        }
    }
}
