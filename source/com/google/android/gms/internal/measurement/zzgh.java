package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzgh extends zzke implements zzlm {
    private static final zzgh zza;
    private zzkk zze = zzke.zzbB();
    private zzkk zzf = zzke.zzbB();
    private zzkl zzg = zzke.zzbD();
    private zzkl zzh = zzke.zzbD();

    static {
        zzgh zzghVar = new zzgh();
        zza = zzghVar;
        zzke.zzbJ(zzgh.class, zzghVar);
    }

    /* renamed from: f */
    public static /* synthetic */ void m47196f(zzgh zzghVar, Iterable iterable) {
        zzkk zzkkVar = zzghVar.zze;
        if (!zzkkVar.zzc()) {
            zzghVar.zze = zzke.zzbC(zzkkVar);
        }
        zzin.zzbt(iterable, zzghVar.zze);
    }

    /* renamed from: h */
    public static /* synthetic */ void m47194h(zzgh zzghVar, Iterable iterable) {
        zzkk zzkkVar = zzghVar.zzf;
        if (!zzkkVar.zzc()) {
            zzghVar.zzf = zzke.zzbC(zzkkVar);
        }
        zzin.zzbt(iterable, zzghVar.zzf);
    }

    /* renamed from: j */
    public static /* synthetic */ void m47192j(zzgh zzghVar, Iterable iterable) {
        zzghVar.m47186p();
        zzin.zzbt(iterable, zzghVar.zzg);
    }

    /* renamed from: l */
    public static /* synthetic */ void m47190l(zzgh zzghVar, int i) {
        zzghVar.m47186p();
        zzghVar.zzg.remove(i);
    }

    /* renamed from: m */
    public static /* synthetic */ void m47189m(zzgh zzghVar, Iterable iterable) {
        zzghVar.m47185q();
        zzin.zzbt(iterable, zzghVar.zzh);
    }

    /* renamed from: o */
    public static /* synthetic */ void m47187o(zzgh zzghVar, int i) {
        zzghVar.m47185q();
        zzghVar.zzh.remove(i);
    }

    /* renamed from: q */
    private final void m47185q() {
        zzkl zzklVar = this.zzh;
        if (!zzklVar.zzc()) {
            this.zzh = zzke.zzbE(zzklVar);
        }
    }

    public static zzgg zzf() {
        return (zzgg) zza.zzbx();
    }

    public static zzgh zzh() {
        return zza;
    }

    /* renamed from: p */
    public final void m47186p() {
        zzkl zzklVar = this.zzg;
        if (!zzklVar.zzc()) {
            this.zzg = zzke.zzbE(zzklVar);
        }
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zzf.size();
    }

    public final int zzc() {
        return this.zzh.size();
    }

    public final int zzd() {
        return this.zze.size();
    }

    public final zzfq zze(int i) {
        return (zzfq) this.zzg.get(i);
    }

    public final zzgj zzi(int i) {
        return (zzgj) this.zzh.get(i);
    }

    public final List zzj() {
        return this.zzg;
    }

    public final List zzk() {
        return this.zzf;
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
                    return new zzgg(null);
                }
                return new zzgh();
            }
            return zzke.zzbI(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", zzfq.class, "zzh", zzgj.class});
        }
        return (byte) 1;
    }

    public final List zzm() {
        return this.zzh;
    }

    public final List zzn() {
        return this.zze;
    }
}
