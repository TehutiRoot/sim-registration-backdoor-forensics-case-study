package com.google.android.gms.internal.gtm;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzae extends zzxv implements zzzh {
    private static final zzae zza;
    private zzya zzd = zzxv.zzag();
    private zzya zze = zzxv.zzag();
    private zzya zzf = zzxv.zzag();
    private zzya zzg = zzxv.zzag();
    private zzya zzh = zzxv.zzag();
    private zzya zzi = zzxv.zzag();
    private zzya zzj = zzxv.zzag();
    private zzya zzk = zzxv.zzag();
    private zzya zzl = zzxv.zzag();
    private zzya zzm = zzxv.zzag();

    static {
        zzae zzaeVar = new zzae();
        zza = zzaeVar;
        zzxv.zzan(zzae.class, zzaeVar);
    }

    private zzae() {
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
                    return new zzad(null);
                }
                return new zzae();
            }
            return zzxv.zzak(zza, "\u0001\n\u0000\u0000\u0001\n\n\u0000\n\u0000\u0001\u0016\u0002\u0016\u0003\u0016\u0004\u0016\u0005\u0016\u0006\u0016\u0007\u0016\b\u0016\t\u0016\n\u0016", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }

    public final List zzc() {
        return this.zzj;
    }

    public final List zzd() {
        return this.zzl;
    }

    public final List zze() {
        return this.zzf;
    }

    public final List zzf() {
        return this.zzh;
    }

    public final List zzg() {
        return this.zze;
    }

    public final List zzh() {
        return this.zzd;
    }

    public final List zzi() {
        return this.zzk;
    }

    public final List zzj() {
        return this.zzm;
    }

    public final List zzk() {
        return this.zzg;
    }

    public final List zzl() {
        return this.zzi;
    }
}
