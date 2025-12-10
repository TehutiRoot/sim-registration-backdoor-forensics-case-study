package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.I */
/* loaded from: classes3.dex */
public final class RunnableC6701I implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f48085a;

    /* renamed from: b */
    public final /* synthetic */ zzjs f48086b;

    public RunnableC6701I(zzjs zzjsVar, zzq zzqVar) {
        this.f48086b = zzjsVar;
        this.f48085a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzjs zzjsVar = this.f48086b;
        zzeeVar = zzjsVar.f48434c;
        if (zzeeVar == null) {
            zzjsVar.zzs.zzay().zzd().zza("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f48085a);
            zzeeVar.zzm(this.f48085a);
        } catch (RemoteException e) {
            this.f48086b.zzs.zzay().zzd().zzb("Failed to reset data on the service: remote exception", e);
        }
        this.f48086b.m46230g();
    }
}
