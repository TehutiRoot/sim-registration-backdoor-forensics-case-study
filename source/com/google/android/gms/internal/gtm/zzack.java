package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
public final class zzack extends zzxr implements zzzh {
    private static final zzack zzd;
    private int zze;
    private zzacm zzf;
    private byte zzg = 2;

    static {
        zzack zzackVar = new zzack();
        zzd = zzackVar;
        zzxv.zzan(zzack.class, zzackVar);
    }

    private zzack() {
    }

    public static zzack zze() {
        return zzd;
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
                        return zzd;
                    }
                    return new zzacj(null);
                }
                return new zzack();
            }
            return zzxv.zzak(zzd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }
}
