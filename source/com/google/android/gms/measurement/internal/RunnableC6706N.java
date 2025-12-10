package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.N */
/* loaded from: classes3.dex */
public final class RunnableC6706N implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f48097a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f48098b;

    /* renamed from: c */
    public final /* synthetic */ zzjs f48099c;

    public RunnableC6706N(zzjs zzjsVar, zzq zzqVar, Bundle bundle) {
        this.f48099c = zzjsVar;
        this.f48097a = zzqVar;
        this.f48098b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzjs zzjsVar = this.f48099c;
        zzeeVar = zzjsVar.f48434c;
        if (zzeeVar == null) {
            zzjsVar.zzs.zzay().zzd().zza("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f48097a);
            zzeeVar.zzr(this.f48098b, this.f48097a);
        } catch (RemoteException e) {
            this.f48099c.zzs.zzay().zzd().zzb("Failed to send default event parameters to service", e);
        }
    }
}
