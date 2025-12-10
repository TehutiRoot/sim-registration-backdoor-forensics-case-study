package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzfo extends zzke implements zzlm {
    private static final zzfo zza;
    private int zze;
    private int zzf;
    private zzgh zzg;
    private zzgh zzh;
    private boolean zzi;

    static {
        zzfo zzfoVar = new zzfo();
        zza = zzfoVar;
        zzke.zzbJ(zzfo.class, zzfoVar);
    }

    /* renamed from: f */
    public static /* synthetic */ void m47296f(zzfo zzfoVar, int i) {
        zzfoVar.zze |= 1;
        zzfoVar.zzf = i;
    }

    /* renamed from: g */
    public static /* synthetic */ void m47295g(zzfo zzfoVar, zzgh zzghVar) {
        zzghVar.getClass();
        zzfoVar.zzg = zzghVar;
        zzfoVar.zze |= 2;
    }

    /* renamed from: h */
    public static /* synthetic */ void m47294h(zzfo zzfoVar, zzgh zzghVar) {
        zzfoVar.zzh = zzghVar;
        zzfoVar.zze |= 4;
    }

    /* renamed from: i */
    public static /* synthetic */ void m47293i(zzfo zzfoVar, boolean z) {
        zzfoVar.zze |= 8;
        zzfoVar.zzi = z;
    }

    public static zzfn zzb() {
        return (zzfn) zza.zzbx();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgh zzd() {
        zzgh zzghVar = this.zzg;
        if (zzghVar == null) {
            return zzgh.zzh();
        }
        return zzghVar;
    }

    public final zzgh zze() {
        zzgh zzghVar = this.zzh;
        if (zzghVar == null) {
            return zzgh.zzh();
        }
        return zzghVar;
    }

    public final boolean zzj() {
        return this.zzi;
    }

    public final boolean zzk() {
        return (this.zze & 1) != 0;
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
                    return new zzfn(null);
                }
                return new zzfo();
            }
            return zzke.zzbI(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final boolean zzm() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzn() {
        return (this.zze & 4) != 0;
    }
}
