package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzrz;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzep implements zzeq {
    public zzep(zzet zzetVar) {
    }

    @Override // com.google.android.gms.tagmanager.zzeq
    public final void zza(zzrz zzrzVar, Set set, Set set2, zzdn zzdnVar) {
        set.addAll(zzrzVar.zzc());
        set2.addAll(zzrzVar.zzh());
        zzrzVar.zzc();
        zzrzVar.zzb();
        zzrzVar.zzh();
        zzrzVar.zzg();
    }
}