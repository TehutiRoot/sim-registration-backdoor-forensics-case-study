package com.google.android.gms.tagmanager;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzdt implements zzfh {
    final /* synthetic */ zzdv zza;

    public zzdt(zzdv zzdvVar) {
        this.zza = zzdvVar;
    }

    @Override // com.google.android.gms.tagmanager.zzfh
    public final void zza(zzbz zzbzVar) {
        Clock clock;
        Clock clock2;
        long zza = zzbzVar.zza();
        if (zza == 0) {
            zzdv zzdvVar = this.zza;
            long zzb = zzbzVar.zzb();
            clock2 = this.zza.zzg;
            zzdv.zzi(zzdvVar, zzb, clock2.currentTimeMillis());
            return;
        }
        clock = this.zza.zzg;
        if (zza + 14400000 < clock.currentTimeMillis()) {
            this.zza.zzl(zzbzVar.zzb());
            long zzb2 = zzbzVar.zzb();
            zzdg.zzb.zzd("Giving up on failed hitId: " + zzb2);
        }
    }
}