package com.google.android.gms.internal.gtm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbp implements Runnable {
    final /* synthetic */ zzbs zza;

    public zzbp(zzbs zzbsVar) {
        this.zza = zzbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcm zzcmVar;
        zzcmVar = this.zza.zza;
        zzcmVar.zzh();
    }
}
