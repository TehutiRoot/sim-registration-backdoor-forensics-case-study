package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
public final class zzacp extends zzxv implements zzzh {
    private static final zzacp zza;
    private int zzd;
    private boolean zze;

    static {
        zzacp zzacpVar = new zzacp();
        zza = zzacpVar;
        zzxv.zzan(zzacp.class, zzacpVar);
    }

    private zzacp() {
    }

    public static zzacp zze() {
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
                    return new zzaco(null);
                }
                return new zzacp();
            }
            return zzxv.zzak(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
