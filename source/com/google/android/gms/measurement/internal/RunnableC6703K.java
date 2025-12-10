package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.K */
/* loaded from: classes3.dex */
public final class RunnableC6703K implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f48090a;

    /* renamed from: b */
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf f48091b;

    /* renamed from: c */
    public final /* synthetic */ zzjs f48092c;

    public RunnableC6703K(zzjs zzjsVar, zzq zzqVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.f48092c = zzjsVar;
        this.f48090a = zzqVar;
        this.f48091b = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfy zzfyVar;
        zzee zzeeVar;
        String str = null;
        try {
            try {
                if (!this.f48092c.zzs.zzm().m68455d().zzi(zzah.ANALYTICS_STORAGE)) {
                    this.f48092c.zzs.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                    this.f48092c.zzs.zzq().m46255g(null);
                    this.f48092c.zzs.zzm().f1403f.zzb(null);
                    zzfyVar = this.f48092c.zzs;
                } else {
                    zzjs zzjsVar = this.f48092c;
                    zzeeVar = zzjsVar.f48434c;
                    if (zzeeVar == null) {
                        zzjsVar.zzs.zzay().zzd().zza("Failed to get app instance id");
                        zzfyVar = this.f48092c.zzs;
                    } else {
                        Preconditions.checkNotNull(this.f48090a);
                        str = zzeeVar.zzd(this.f48090a);
                        if (str != null) {
                            this.f48092c.zzs.zzq().m46255g(str);
                            this.f48092c.zzs.zzm().f1403f.zzb(str);
                        }
                        this.f48092c.m46230g();
                        zzfyVar = this.f48092c.zzs;
                    }
                }
            } catch (RemoteException e) {
                this.f48092c.zzs.zzay().zzd().zzb("Failed to get app instance id", e);
                zzfyVar = this.f48092c.zzs;
            }
            zzfyVar.zzv().zzV(this.f48091b, str);
        } catch (Throwable th2) {
            this.f48092c.zzs.zzv().zzV(this.f48091b, null);
            throw th2;
        }
    }
}
