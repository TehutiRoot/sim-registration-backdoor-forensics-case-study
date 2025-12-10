package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
final class zzcb implements Runnable {
    final /* synthetic */ zzcd zza;
    final /* synthetic */ zzfa zzb;

    public zzcb(zzcd zzcdVar, zzfa zzfaVar) {
        this.zza = zzcdVar;
        this.zzb = zzfaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.zza.zza.zzg()) {
            this.zza.zza.zzE("Connected to service after a timeout");
            zzcd zzcdVar = this.zza;
            zzce.zzi(zzcdVar.zza, this.zzb);
        }
    }
}
