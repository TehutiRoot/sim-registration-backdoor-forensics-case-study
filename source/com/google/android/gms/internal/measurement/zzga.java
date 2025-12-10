package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzga extends zzke implements zzlm {
    private static final zzga zza;
    private zzkl zze = zzke.zzbD();

    static {
        zzga zzgaVar = new zzga();
        zza = zzgaVar;
        zzke.zzbJ(zzga.class, zzgaVar);
    }

    /* renamed from: f */
    public static /* synthetic */ void m47262f(zzga zzgaVar, zzgc zzgcVar) {
        zzgcVar.getClass();
        zzkl zzklVar = zzgaVar.zze;
        if (!zzklVar.zzc()) {
            zzgaVar.zze = zzke.zzbE(zzklVar);
        }
        zzgaVar.zze.add(zzgcVar);
    }

    public static zzfz zza() {
        return (zzfz) zza.zzbx();
    }

    public final zzgc zzc(int i) {
        return (zzgc) this.zze.get(0);
    }

    public final List zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object zzl(int i, Object obj, Object obj2) {
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
                    return new zzfz(null);
                }
                return new zzga();
            }
            return zzke.zzbI(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzgc.class});
        }
        return (byte) 1;
    }
}
