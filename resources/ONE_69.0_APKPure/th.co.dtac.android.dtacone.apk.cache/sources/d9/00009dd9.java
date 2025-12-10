package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.I */
/* loaded from: classes3.dex */
public final class RunnableC6690I implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f48097a;

    /* renamed from: b */
    public final /* synthetic */ zzjs f48098b;

    public RunnableC6690I(zzjs zzjsVar, zzq zzqVar) {
        this.f48098b = zzjsVar;
        this.f48097a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzjs zzjsVar = this.f48098b;
        zzeeVar = zzjsVar.f48446c;
        if (zzeeVar == null) {
            zzjsVar.zzs.zzay().zzd().zza("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f48097a);
            zzeeVar.zzm(this.f48097a);
        } catch (RemoteException e) {
            this.f48098b.zzs.zzay().zzd().zzb("Failed to reset data on the service: remote exception", e);
        }
        this.f48098b.m46215g();
    }
}