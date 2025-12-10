package com.google.android.gms.internal.gtm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzca extends zzcy {
    final /* synthetic */ zzce zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzca(zzce zzceVar, zzbx zzbxVar) {
        super(zzbxVar);
        this.zza = zzceVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzcy
    public final void zza() {
        com.google.android.gms.analytics.zzr.zzh();
        zzce zzceVar = this.zza;
        if (!zzceVar.zzg()) {
            return;
        }
        zzceVar.zzN("Inactivity, disconnecting from device AnalyticsService");
        zzceVar.zzc();
    }
}