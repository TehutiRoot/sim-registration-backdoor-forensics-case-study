package com.google.android.gms.tagmanager;

/* loaded from: classes3.dex */
final class zzer {
    private final zzdr zza;
    private final com.google.android.gms.internal.gtm.zzam zzb;

    public zzer(zzdr zzdrVar, com.google.android.gms.internal.gtm.zzam zzamVar) {
        this.zza = zzdrVar;
        this.zzb = zzamVar;
    }

    public final int zza() {
        int zzX;
        int zzX2 = ((com.google.android.gms.internal.gtm.zzam) this.zza.zza()).zzX();
        com.google.android.gms.internal.gtm.zzam zzamVar = this.zzb;
        if (zzamVar == null) {
            zzX = 0;
        } else {
            zzX = zzamVar.zzX();
        }
        return zzX2 + zzX;
    }

    public final com.google.android.gms.internal.gtm.zzam zzb() {
        return this.zzb;
    }

    public final zzdr zzc() {
        return this.zza;
    }
}
