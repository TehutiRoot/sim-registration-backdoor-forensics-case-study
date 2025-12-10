package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.S */
/* loaded from: classes3.dex */
public final class RunnableC6710S implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f48106a;

    /* renamed from: b */
    public final /* synthetic */ zzjs f48107b;

    public RunnableC6710S(zzjs zzjsVar, zzq zzqVar) {
        this.f48107b = zzjsVar;
        this.f48106a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzjs zzjsVar = this.f48107b;
        zzeeVar = zzjsVar.f48434c;
        if (zzeeVar == null) {
            zzjsVar.zzs.zzay().zzd().zza("Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f48106a);
            zzeeVar.zzs(this.f48106a);
            this.f48107b.m46230g();
        } catch (RemoteException e) {
            this.f48107b.zzs.zzay().zzd().zzb("Failed to send measurementEnabled to the service", e);
        }
    }
}
