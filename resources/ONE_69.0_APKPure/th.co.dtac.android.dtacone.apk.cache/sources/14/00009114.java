package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
public final class zzabo extends zzxv implements zzzh {
    private static final zzyb zza = new zzyb<Integer, zzaby>() { // from class: com.google.android.gms.internal.gtm.zzabo.1
        @Override // com.google.android.gms.internal.gtm.zzyb
        public /* bridge */ /* synthetic */ zzaby zzb(Integer num) {
            throw null;
        }
    };
    private static final zzabo zzd;
    private zzya zze = zzxv.zzag();

    static {
        zzabo zzaboVar = new zzabo();
        zzd = zzaboVar;
        zzxv.zzan(zzabo.class, zzaboVar);
    }

    private zzabo() {
    }

    public static zzabo zze() {
        return zzd;
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
                        return zzd;
                    }
                    return new zzabp(null);
                }
                return new zzabo();
            }
            return zzxv.zzak(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"zze", zzabx.zza});
        }
        return (byte) 1;
    }
}