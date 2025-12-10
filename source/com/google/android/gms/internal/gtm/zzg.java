package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
public final class zzg extends zzxv implements zzzh {
    private static final zzg zza;
    private int zzd;
    private zzam zzf;
    private byte zzh = 2;
    private zzyd zze = zzxv.zzah();
    private String zzg = "";

    static {
        zzg zzgVar = new zzg();
        zza = zzgVar;
        zzxv.zzan(zzg.class, zzgVar);
    }

    private zzg() {
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
                        return zza;
                    }
                    return new zzf(null);
                }
                return new zzg();
            }
            return zzxv.zzak(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", zzi.class, "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
