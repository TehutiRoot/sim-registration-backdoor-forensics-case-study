package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public class zzxf {
    static final zzxf zza = new zzxf(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile zzxf zzd;
    private final Map zze = Collections.emptyMap();

    public zzxf(boolean z) {
    }

    public static zzxf zza() {
        zzxf zzxfVar = zzd;
        if (zzxfVar != null) {
            return zzxfVar;
        }
        synchronized (zzxf.class) {
            try {
                zzxf zzxfVar2 = zzd;
                if (zzxfVar2 != null) {
                    return zzxfVar2;
                }
                zzxf zzb2 = zzxn.zzb(zzxf.class);
                zzd = zzb2;
                return zzb2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public zzxt zzb(zzzg zzzgVar, int i) {
        return (zzxt) this.zze.get(new zzxe(zzzgVar, i));
    }
}
