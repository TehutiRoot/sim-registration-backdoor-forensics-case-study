package com.google.android.gms.internal.gtm;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzy extends zzxv implements zzzh {
    private static final zzy zza;
    private byte zzg = 2;
    private zzyd zzd = zzxv.zzah();
    private zzyd zze = zzxv.zzah();
    private zzyd zzf = zzxv.zzah();

    static {
        zzy zzyVar = new zzy();
        zza = zzyVar;
        zzxv.zzan(zzy.class, zzyVar);
    }

    private zzy() {
    }

    public static zzy zzc() {
        return zza;
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
                        return zza;
                    }
                    return new zzx(null);
                }
                return new zzy();
            }
            return zzxv.zzak(zza, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0002\u0001Л\u0002Л\u0003\u001b", new Object[]{"zzd", zzam.class, "zze", zzam.class, "zzf", zzw.class});
        }
        return Byte.valueOf(this.zzg);
    }

    public final List zzd() {
        return this.zzf;
    }

    public final List zze() {
        return this.zze;
    }

    public final List zzf() {
        return this.zzd;
    }
}
