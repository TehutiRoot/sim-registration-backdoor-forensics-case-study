package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
public final class zzai extends zzxv implements zzzh {
    private static final zzai zza;
    private int zzd;
    private zzam zzf;
    private zzy zzg;
    private byte zzh = 2;
    private String zze = "";

    static {
        zzai zzaiVar = new zzai();
        zza = zzaiVar;
        zzxv.zzan(zzai.class, zzaiVar);
    }

    private zzai() {
    }

    public final zzy zza() {
        zzy zzyVar = this.zzg;
        if (zzyVar == null) {
            return zzy.zzc();
        }
        return zzyVar;
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
                            this.zzh = b;
                            return null;
                        }
                        return zza;
                    }
                    return new zzah(null);
                }
                return new zzai();
            }
            return zzxv.zzak(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }

    public final String zzd() {
        return this.zze;
    }

    public final boolean zze() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzf() {
        return (this.zzd & 1) != 0;
    }
}
