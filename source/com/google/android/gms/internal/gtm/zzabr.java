package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
public final class zzabr extends zzxv implements zzzh {
    private static final zzabr zza;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzabr zzabrVar = new zzabr();
        zza = zzabrVar;
        zzxv.zzan(zzabr.class, zzabrVar);
    }

    private zzabr() {
    }

    public static zzabr zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzabq(null);
                }
                return new zzabr();
            }
            return zzxv.zzak(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
