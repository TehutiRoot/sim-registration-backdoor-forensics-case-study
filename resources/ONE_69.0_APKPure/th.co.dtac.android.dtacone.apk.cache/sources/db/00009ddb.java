package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.K */
/* loaded from: classes3.dex */
public final class RunnableC6692K implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f48102a;

    /* renamed from: b */
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf f48103b;

    /* renamed from: c */
    public final /* synthetic */ zzjs f48104c;

    public RunnableC6692K(zzjs zzjsVar, zzq zzqVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.f48104c = zzjsVar;
        this.f48102a = zzqVar;
        this.f48103b = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfy zzfyVar;
        zzee zzeeVar;
        String str = null;
        try {
            try {
                if (!this.f48104c.zzs.zzm().m69072d().zzi(zzah.ANALYTICS_STORAGE)) {
                    this.f48104c.zzs.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                    this.f48104c.zzs.zzq().m46240g(null);
                    this.f48104c.zzs.zzm().f521f.zzb(null);
                    zzfyVar = this.f48104c.zzs;
                } else {
                    zzjs zzjsVar = this.f48104c;
                    zzeeVar = zzjsVar.f48446c;
                    if (zzeeVar == null) {
                        zzjsVar.zzs.zzay().zzd().zza("Failed to get app instance id");
                        zzfyVar = this.f48104c.zzs;
                    } else {
                        Preconditions.checkNotNull(this.f48102a);
                        str = zzeeVar.zzd(this.f48102a);
                        if (str != null) {
                            this.f48104c.zzs.zzq().m46240g(str);
                            this.f48104c.zzs.zzm().f521f.zzb(str);
                        }
                        this.f48104c.m46215g();
                        zzfyVar = this.f48104c.zzs;
                    }
                }
            } catch (RemoteException e) {
                this.f48104c.zzs.zzay().zzd().zzb("Failed to get app instance id", e);
                zzfyVar = this.f48104c.zzs;
            }
            zzfyVar.zzv().zzV(this.f48103b, str);
        } catch (Throwable th2) {
            this.f48104c.zzs.zzv().zzV(this.f48103b, null);
            throw th2;
        }
    }
}