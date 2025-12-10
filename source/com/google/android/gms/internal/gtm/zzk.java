package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
public final class zzk extends zzxv implements zzzh {
    private static final zzk zza;
    private int zzd;
    private zzam zzk;
    private byte zzl = 2;
    private zzyd zze = zzxv.zzah();
    private zzyd zzf = zzxv.zzah();
    private zzyd zzg = zzxv.zzah();
    private zzyd zzh = zzxv.zzah();
    private zzyd zzi = zzxv.zzah();
    private zzyd zzj = zzxv.zzah();

    static {
        zzk zzkVar = new zzk();
        zza = zzkVar;
        zzxv.zzan(zzk.class, zzkVar);
    }

    private zzk() {
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
                    return new zzj(null);
                }
                return new zzk();
            }
            return zzxv.zzak(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0006\u0007\u0001Л\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0000", new Object[]{"zzd", "zze", zzg.class, "zzf", zzg.class, "zzg", zzg.class, "zzh", zzg.class, "zzi", zzg.class, "zzj", zzg.class, "zzk"});
        }
        return Byte.valueOf(this.zzl);
    }
}
