package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
public final class zzw extends zzxv implements zzzh {
    private static final zzw zza;
    private int zzd;
    private long zzf;
    private boolean zzh;
    private long zzi;
    private String zze = "";
    private long zzg = 2147483647L;

    static {
        zzw zzwVar = new zzw();
        zza = zzwVar;
        zzxv.zzan(zzw.class, zzwVar);
    }

    private zzw() {
    }

    public final long zza() {
        return this.zzi;
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
                    return new zzv(null);
                }
                return new zzw();
            }
            return zzxv.zzak(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဂ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final long zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zzh;
    }

    public final boolean zzh() {
        return (this.zzd & 1) != 0;
    }
}
