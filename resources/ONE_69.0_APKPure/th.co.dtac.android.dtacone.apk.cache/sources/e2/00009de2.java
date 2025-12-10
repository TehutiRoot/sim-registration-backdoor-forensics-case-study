package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.S */
/* loaded from: classes3.dex */
public final class RunnableC6699S implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f48118a;

    /* renamed from: b */
    public final /* synthetic */ zzjs f48119b;

    public RunnableC6699S(zzjs zzjsVar, zzq zzqVar) {
        this.f48119b = zzjsVar;
        this.f48118a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzjs zzjsVar = this.f48119b;
        zzeeVar = zzjsVar.f48446c;
        if (zzeeVar == null) {
            zzjsVar.zzs.zzay().zzd().zza("Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f48118a);
            zzeeVar.zzs(this.f48118a);
            this.f48119b.m46215g();
        } catch (RemoteException e) {
            this.f48119b.zzs.zzay().zzd().zzb("Failed to send measurementEnabled to the service", e);
        }
    }
}