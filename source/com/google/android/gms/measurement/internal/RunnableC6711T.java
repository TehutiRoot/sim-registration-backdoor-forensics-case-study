package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.T */
/* loaded from: classes3.dex */
public final class RunnableC6711T implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f48108a;

    /* renamed from: b */
    public final /* synthetic */ zzjs f48109b;

    public RunnableC6711T(zzjs zzjsVar, zzq zzqVar) {
        this.f48109b = zzjsVar;
        this.f48108a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzjs zzjsVar = this.f48109b;
        zzeeVar = zzjsVar.f48434c;
        if (zzeeVar == null) {
            zzjsVar.zzs.zzay().zzd().zza("Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f48108a);
            zzeeVar.zzp(this.f48108a);
            this.f48109b.m46230g();
        } catch (RemoteException e) {
            this.f48109b.zzs.zzay().zzd().zzb("Failed to send consent settings to the service", e);
        }
    }
}
