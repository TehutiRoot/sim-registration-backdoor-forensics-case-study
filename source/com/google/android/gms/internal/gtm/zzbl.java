package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
final class zzbl implements Runnable {
    final /* synthetic */ zzbs zza;

    public zzbl(zzbs zzbsVar, boolean z) {
        this.zza = zzbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcm zzcmVar;
        zzcmVar = this.zza.zza;
        zzcmVar.zzad();
    }
}
