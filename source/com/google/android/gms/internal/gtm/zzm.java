package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
public final class zzm extends zzxv implements zzzh {
    private static final zzm zza;
    private byte zzf = 2;
    private zzyd zzd = zzxv.zzah();
    private zzyd zze = zzxv.zzah();

    static {
        zzm zzmVar = new zzm();
        zza = zzmVar;
        zzxv.zzan(zzm.class, zzmVar);
    }

    private zzm() {
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
                            this.zzf = b;
                            return null;
                        }
                        return zza;
                    }
                    return new zzl(null);
                }
                return new zzm();
            }
            return zzxv.zzak(zza, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"zzd", zzk.class, "zze", zzg.class});
        }
        return Byte.valueOf(this.zzf);
    }
}
