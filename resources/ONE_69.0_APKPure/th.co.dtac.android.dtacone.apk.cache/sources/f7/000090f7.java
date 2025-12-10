package com.google.android.gms.internal.gtm;

import java.io.IOException;

/* loaded from: classes3.dex */
final class zzaam extends zzaak {
    @Override // com.google.android.gms.internal.gtm.zzaak
    public final /* synthetic */ int zza(Object obj) {
        return ((zzaal) obj).zza();
    }

    @Override // com.google.android.gms.internal.gtm.zzaak
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzaal) obj).zzb();
    }

    @Override // com.google.android.gms.internal.gtm.zzaak
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzxv zzxvVar = (zzxv) obj;
        zzaal zzaalVar = zzxvVar.zzc;
        if (zzaalVar == zzaal.zzc()) {
            zzaal zzf = zzaal.zzf();
            zzxvVar.zzc = zzf;
            return zzf;
        }
        return zzaalVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzaak
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzxv) obj).zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzaak
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (!zzaal.zzc().equals(obj2)) {
            if (zzaal.zzc().equals(obj)) {
                return zzaal.zze((zzaal) obj, (zzaal) obj2);
            }
            ((zzaal) obj).zzd((zzaal) obj2);
            return obj;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.gtm.zzaak
    public final /* synthetic */ Object zzf() {
        return zzaal.zzf();
    }

    @Override // com.google.android.gms.internal.gtm.zzaak
    public final /* synthetic */ Object zzg(Object obj) {
        ((zzaal) obj).zzh();
        return obj;
    }

    @Override // com.google.android.gms.internal.gtm.zzaak
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i, int i2) {
        ((zzaal) obj).zzj((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.gtm.zzaak
    public final /* bridge */ /* synthetic */ void zzi(Object obj, int i, long j) {
        ((zzaal) obj).zzj((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.gtm.zzaak
    public final /* bridge */ /* synthetic */ void zzj(Object obj, int i, Object obj2) {
        ((zzaal) obj).zzj((i << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.gtm.zzaak
    public final /* bridge */ /* synthetic */ void zzk(Object obj, int i, zzud zzudVar) {
        ((zzaal) obj).zzj((i << 3) | 2, zzudVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzaak
    public final /* bridge */ /* synthetic */ void zzl(Object obj, int i, long j) {
        ((zzaal) obj).zzj(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.gtm.zzaak
    public final void zzm(Object obj) {
        ((zzxv) obj).zzc.zzh();
    }

    @Override // com.google.android.gms.internal.gtm.zzaak
    public final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzxv) obj).zzc = (zzaal) obj2;
    }

    @Override // com.google.android.gms.internal.gtm.zzaak
    public final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzxv) obj).zzc = (zzaal) obj2;
    }

    @Override // com.google.android.gms.internal.gtm.zzaak
    public final boolean zzq(zzzs zzzsVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzaak
    public final /* synthetic */ void zzr(Object obj, zzur zzurVar) throws IOException {
        ((zzaal) obj).zzk(zzurVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzaak
    public final /* synthetic */ void zzs(Object obj, zzur zzurVar) throws IOException {
        ((zzaal) obj).zzl(zzurVar);
    }
}