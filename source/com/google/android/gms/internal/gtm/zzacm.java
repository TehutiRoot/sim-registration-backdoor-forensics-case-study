package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
public final class zzacm extends zzxv implements zzzh {
    private static final zzacm zza;
    private int zzd;
    private String zze = "";

    static {
        zzacm zzacmVar = new zzacm();
        zza = zzacmVar;
        zzxv.zzan(zzacm.class, zzacmVar);
    }

    private zzacm() {
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
                    return new zzacl(null);
                }
                return new zzacm();
            }
            return zzxv.zzak(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
