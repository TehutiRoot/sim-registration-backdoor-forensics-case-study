package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.P */
/* loaded from: classes3.dex */
public final class RunnableC6708P implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzaw f48101a;

    /* renamed from: b */
    public final /* synthetic */ String f48102b;

    /* renamed from: c */
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf f48103c;

    /* renamed from: d */
    public final /* synthetic */ zzjs f48104d;

    public RunnableC6708P(zzjs zzjsVar, zzaw zzawVar, String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.f48104d = zzjsVar;
        this.f48101a = zzawVar;
        this.f48102b = str;
        this.f48103c = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfy zzfyVar;
        zzee zzeeVar;
        byte[] bArr = null;
        try {
            try {
                zzjs zzjsVar = this.f48104d;
                zzeeVar = zzjsVar.f48434c;
                if (zzeeVar == null) {
                    zzjsVar.zzs.zzay().zzd().zza("Discarding data. Failed to send event to service to bundle");
                    zzfyVar = this.f48104d.zzs;
                } else {
                    bArr = zzeeVar.zzu(this.f48101a, this.f48102b);
                    this.f48104d.m46230g();
                    zzfyVar = this.f48104d.zzs;
                }
            } catch (RemoteException e) {
                this.f48104d.zzs.zzay().zzd().zzb("Failed to send event to the service to bundle", e);
                zzfyVar = this.f48104d.zzs;
            }
            zzfyVar.zzv().zzS(this.f48103c, bArr);
        } catch (Throwable th2) {
            this.f48104d.zzs.zzv().zzS(this.f48103c, bArr);
            throw th2;
        }
    }
}
