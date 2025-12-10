package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
public final class zzve extends zzxr implements zzzh {
    private static final zzve zzd;
    private int zze;
    private zzva zzg;
    private zzvy zzi;
    private byte zzk = 2;
    private zzyd zzf = zzzq.zze();
    private zzyd zzh = zzzq.zze();
    private int zzj = 1;

    static {
        zzve zzveVar = new zzve();
        zzd = zzveVar;
        zzxv.zzan(zzve.class, zzveVar);
    }

    private zzve() {
    }

    public static zzve zze() {
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
                            this.zzk = b;
                            return null;
                        }
                        return zzd;
                    }
                    return new zzuw(null);
                }
                return new zzve();
            }
            return new zzzr(zzd, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0002\u0002\u0001ဉ\u0000\u0002\u001b\u0003᠌\u00022ᐉ\u0001ϧЛ", new Object[]{"zze", "zzg", "zzh", zzuy.class, "zzj", zzvc.zza, "zzi", "zzf", zzxb.class});
        }
        return Byte.valueOf(this.zzk);
    }
}
