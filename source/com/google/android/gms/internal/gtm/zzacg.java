package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
public final class zzacg extends zzxv implements zzzh {
    private static final zzacg zza;
    private byte zze = 2;
    private zzyd zzd = zzxv.zzah();

    static {
        zzacg zzacgVar = new zzacg();
        zza = zzacgVar;
        zzxv.zzan(zzacg.class, zzacgVar);
    }

    private zzacg() {
    }

    public static zzacg zze() {
        return zza;
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
                            this.zze = b;
                            return null;
                        }
                        return zza;
                    }
                    return new zzacd(null);
                }
                return new zzacg();
            }
            return zzxv.zzak(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzd", zzacf.class});
        }
        return Byte.valueOf(this.zze);
    }
}
