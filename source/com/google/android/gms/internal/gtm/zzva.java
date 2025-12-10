package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
public final class zzva extends zzxv implements zzzh {
    private static final zzva zza;
    private int zzd;
    private boolean zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        zzva zzvaVar = new zzva();
        zza = zzvaVar;
        zzxv.zzan(zzva.class, zzvaVar);
    }

    private zzva() {
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
                    return new zzuz(null);
                }
                return new zzva();
            }
            return new zzzr(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
