package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
public final class zzi extends zzxv implements zzzh {
    private static final zzi zza;
    private int zzd;
    private zzam zzf;
    private byte zzg = 2;
    private String zze = "";

    static {
        zzi zziVar = new zzi();
        zza = zziVar;
        zzxv.zzan(zzi.class, zziVar);
    }

    private zzi() {
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
                            this.zzg = b;
                            return null;
                        }
                        return zza;
                    }
                    return new zzh(null);
                }
                return new zzi();
            }
            return zzxv.zzak(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }
}
