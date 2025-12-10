package com.google.android.gms.internal.gtm;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzu extends zzxv implements zzzh {
    private static final zzu zza;
    private int zzd;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private byte zzj = 2;
    private zzya zze = zzxv.zzag();

    static {
        zzu zzuVar = new zzu();
        zza = zzuVar;
        zzxv.zzan(zzu.class, zzuVar);
    }

    private zzu() {
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
                            this.zzj = b;
                            return null;
                        }
                        return zza;
                    }
                    return new zzt(null);
                }
                return new zzu();
            }
            return zzxv.zzak(zza, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0001\u0001ဇ\u0003\u0002ᔄ\u0000\u0003\u0016\u0004င\u0001\u0006ဇ\u0002", new Object[]{"zzd", "zzi", "zzf", "zze", "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzj);
    }

    public final List zzc() {
        return this.zze;
    }
}
