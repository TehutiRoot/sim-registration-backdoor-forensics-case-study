package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
public final class zzwq extends zzxv implements zzzh {
    private static final zzwq zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzwq zzwqVar = new zzwq();
        zza = zzwqVar;
        zzxv.zzan(zzwq.class, zzwqVar);
    }

    private zzwq() {
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
                    return new zzwp(null);
                }
                return new zzwq();
            }
            return new zzzr(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
