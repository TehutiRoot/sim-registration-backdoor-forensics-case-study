package com.google.android.gms.internal.gtm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzyy implements zzzu {
    private static final zzze zza = new zzyw();
    private final zzze zzb;

    public zzyy() {
        zzze zzzeVar;
        zzxo zza2 = zzxo.zza();
        try {
            zzzeVar = (zzze) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzzeVar = zza;
        }
        zzyx zzyxVar = new zzyx(zza2, zzzeVar);
        byte[] bArr = zzye.zzd;
        this.zzb = zzyxVar;
    }

    private static boolean zzb(zzzd zzzdVar) {
        if (zzzdVar.zzc() - 1 != 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzzu
    public final zzzt zza(Class cls) {
        zzzv.zzs(cls);
        zzzd zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzxv.class.isAssignableFrom(cls)) {
                return zzzk.zzc(zzzv.zzn(), zzxi.zzb(), zzb.zza());
            }
            return zzzk.zzc(zzzv.zzm(), zzxi.zza(), zzb.zza());
        } else if (zzxv.class.isAssignableFrom(cls)) {
            if (zzb(zzb)) {
                return zzzj.zzl(cls, zzb, zzzn.zzb(), zzyu.zze(), zzzv.zzn(), zzxi.zzb(), zzzc.zzb());
            }
            return zzzj.zzl(cls, zzb, zzzn.zzb(), zzyu.zze(), zzzv.zzn(), null, zzzc.zzb());
        } else if (zzb(zzb)) {
            return zzzj.zzl(cls, zzb, zzzn.zza(), zzyu.zzd(), zzzv.zzm(), zzxi.zza(), zzzc.zza());
        } else {
            return zzzj.zzl(cls, zzb, zzzn.zza(), zzyu.zzd(), zzzv.zzm(), null, zzzc.zza());
        }
    }
}