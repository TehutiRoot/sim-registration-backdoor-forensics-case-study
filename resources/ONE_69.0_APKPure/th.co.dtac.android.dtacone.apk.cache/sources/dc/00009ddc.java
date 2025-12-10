package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.L */
/* loaded from: classes3.dex */
public final class RunnableC6693L implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f48105a;

    /* renamed from: b */
    public final /* synthetic */ zzjs f48106b;

    public RunnableC6693L(zzjs zzjsVar, zzq zzqVar) {
        this.f48106b = zzjsVar;
        this.f48105a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzjs zzjsVar = this.f48106b;
        zzeeVar = zzjsVar.f48446c;
        if (zzeeVar == null) {
            zzjsVar.zzs.zzay().zzd().zza("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f48105a);
            zzeeVar.zzj(this.f48105a);
            this.f48106b.zzs.zzi().zzm();
            this.f48106b.m46220b(zzeeVar, null, this.f48105a);
            this.f48106b.m46215g();
        } catch (RemoteException e) {
            this.f48106b.zzs.zzay().zzd().zzb("Failed to send app launch to the service", e);
        }
    }
}