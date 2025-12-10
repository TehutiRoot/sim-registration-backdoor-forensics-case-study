package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.T */
/* loaded from: classes3.dex */
public final class RunnableC6700T implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f48120a;

    /* renamed from: b */
    public final /* synthetic */ zzjs f48121b;

    public RunnableC6700T(zzjs zzjsVar, zzq zzqVar) {
        this.f48121b = zzjsVar;
        this.f48120a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzjs zzjsVar = this.f48121b;
        zzeeVar = zzjsVar.f48446c;
        if (zzeeVar == null) {
            zzjsVar.zzs.zzay().zzd().zza("Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f48120a);
            zzeeVar.zzp(this.f48120a);
            this.f48121b.m46215g();
        } catch (RemoteException e) {
            this.f48121b.zzs.zzay().zzd().zzb("Failed to send consent settings to the service", e);
        }
    }
}