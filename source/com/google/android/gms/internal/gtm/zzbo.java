package com.google.android.gms.internal.gtm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbo implements Runnable {
    final /* synthetic */ zzez zza;
    final /* synthetic */ zzbs zzb;

    public zzbo(zzbs zzbsVar, zzez zzezVar) {
        this.zzb = zzbsVar;
        this.zza = zzezVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcm zzcmVar;
        zzcmVar = this.zzb.zza;
        zzcmVar.zzj(this.zza);
    }
}
