package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.N */
/* loaded from: classes3.dex */
public final class RunnableC6695N implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f48109a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f48110b;

    /* renamed from: c */
    public final /* synthetic */ zzjs f48111c;

    public RunnableC6695N(zzjs zzjsVar, zzq zzqVar, Bundle bundle) {
        this.f48111c = zzjsVar;
        this.f48109a = zzqVar;
        this.f48110b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzjs zzjsVar = this.f48111c;
        zzeeVar = zzjsVar.f48446c;
        if (zzeeVar == null) {
            zzjsVar.zzs.zzay().zzd().zza("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f48109a);
            zzeeVar.zzr(this.f48110b, this.f48109a);
        } catch (RemoteException e) {
            this.f48111c.zzs.zzay().zzd().zzb("Failed to send default event parameters to service", e);
        }
    }
}