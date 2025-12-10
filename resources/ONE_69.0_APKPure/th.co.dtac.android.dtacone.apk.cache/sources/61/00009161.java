package com.google.android.gms.internal.gtm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbq implements Runnable {
    final /* synthetic */ zzdb zza;
    final /* synthetic */ zzbs zzb;

    public zzbq(zzbs zzbsVar, zzdb zzdbVar) {
        this.zzb = zzbsVar;
        this.zza = zzdbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcm zzcmVar;
        zzcmVar = this.zzb.zza;
        zzcmVar.zzf(this.zza);
    }
}