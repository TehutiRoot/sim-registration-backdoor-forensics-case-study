package com.google.android.gms.internal.gtm;

import androidx.annotation.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzch extends zzbu {
    private final zzax zza;

    public zzch(zzbx zzbxVar) {
        super(zzbxVar);
        this.zza = new zzax();
    }

    public final zzax zza() {
        zzV();
        return this.zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    public final void zzd() {
        zzq().zzc().zzc(this.zza);
        zzfv zzB = zzB();
        zzB.zzV();
        String str = zzB.zzb;
        if (str != null) {
            this.zza.zzk(str);
        }
        zzB.zzV();
        String str2 = zzB.zza;
        if (str2 != null) {
            this.zza.zzl(str2);
        }
    }
}
