package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.P */
/* loaded from: classes3.dex */
public final class RunnableC6697P implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzaw f48113a;

    /* renamed from: b */
    public final /* synthetic */ String f48114b;

    /* renamed from: c */
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf f48115c;

    /* renamed from: d */
    public final /* synthetic */ zzjs f48116d;

    public RunnableC6697P(zzjs zzjsVar, zzaw zzawVar, String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.f48116d = zzjsVar;
        this.f48113a = zzawVar;
        this.f48114b = str;
        this.f48115c = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfy zzfyVar;
        zzee zzeeVar;
        byte[] bArr = null;
        try {
            try {
                zzjs zzjsVar = this.f48116d;
                zzeeVar = zzjsVar.f48446c;
                if (zzeeVar == null) {
                    zzjsVar.zzs.zzay().zzd().zza("Discarding data. Failed to send event to service to bundle");
                    zzfyVar = this.f48116d.zzs;
                } else {
                    bArr = zzeeVar.zzu(this.f48113a, this.f48114b);
                    this.f48116d.m46215g();
                    zzfyVar = this.f48116d.zzs;
                }
            } catch (RemoteException e) {
                this.f48116d.zzs.zzay().zzd().zzb("Failed to send event to the service to bundle", e);
                zzfyVar = this.f48116d.zzs;
            }
            zzfyVar.zzv().zzS(this.f48115c, bArr);
        } catch (Throwable th2) {
            this.f48116d.zzs.zzv().zzS(this.f48115c, bArr);
            throw th2;
        }
    }
}