package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
public final class zzxb extends zzxv implements zzzh {
    private static final zzxb zza;
    private int zzd;
    private long zzg;
    private long zzh;
    private double zzi;
    private byte zzl = 2;
    private zzyd zze = zzzq.zze();
    private String zzf = "";
    private zzud zzj = zzud.zzb;
    private String zzk = "";

    static {
        zzxb zzxbVar = new zzxb();
        zza = zzxbVar;
        zzxv.zzan(zzxb.class, zzxbVar);
    }

    private zzxb() {
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
                            this.zzl = b;
                            return null;
                        }
                        return zza;
                    }
                    return new zzwy(null);
                }
                return new zzxb();
            }
            return new zzzr(zza, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"zzd", "zze", zzxa.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return Byte.valueOf(this.zzl);
    }
}
