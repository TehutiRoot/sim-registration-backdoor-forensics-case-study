package com.google.android.gms.internal.gtm;

import org.slf4j.Marker;

/* loaded from: classes3.dex */
public final class zzabh extends zzxv implements zzzh {
    private static final zzabh zza;
    private int zzd;
    private int zze;
    private String zzf = Marker.ANY_MARKER;

    static {
        zzabh zzabhVar = new zzabh();
        zza = zzabhVar;
        zzxv.zzan(zzabh.class, zzabhVar);
    }

    private zzabh() {
    }

    public static zzabh zze() {
        return zza;
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
                    return new zzabg(null);
                }
                return new zzabh();
            }
            return zzxv.zzak(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", zzabj.zza, "zzf"});
        }
        return (byte) 1;
    }
}
