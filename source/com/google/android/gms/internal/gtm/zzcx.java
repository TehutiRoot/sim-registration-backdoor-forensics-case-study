package com.google.android.gms.internal.gtm;

import android.os.Looper;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcx implements Runnable {
    final /* synthetic */ zzcy zza;

    public zzcx(zzcy zzcyVar) {
        this.zza = zzcyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbx zzbxVar;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzbxVar = this.zza.zzb;
            zzbxVar.zzd().zzi(this);
            return;
        }
        zzcy zzcyVar = this.zza;
        boolean zzh = zzcyVar.zzh();
        zzcyVar.zzd = 0L;
        if (zzh) {
            this.zza.zza();
        }
    }
}
