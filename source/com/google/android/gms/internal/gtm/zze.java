package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
public final class zze extends zzxv implements zzzh {
    public static final zzxt zza;
    private static final zze zzd;
    private int zze;
    private zzm zzf;
    private zzg zzg;
    private byte zzh = 2;

    static {
        zze zzeVar = new zze();
        zzd = zzeVar;
        zzxv.zzan(zze.class, zzeVar);
        zza = zzxv.zzab(zzam.zzj(), zzeVar, zzeVar, null, 47497405, zzaba.zzk, zze.class);
    }

    private zze() {
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    public final Object zzb(int i, Object obj, Object obj2) {
        byte b = 1;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            }
                            this.zzh = b;
                            return null;
                        }
                        return zzd;
                    }
                    return new zzd(null);
                }
                return new zze();
            }
            return zzxv.zzak(zzd, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
