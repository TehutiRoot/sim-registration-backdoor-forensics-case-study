package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzfw extends zzke implements zzlm {
    private static final zzfw zza;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private zzkl zzk = zzke.zzbD();

    static {
        zzfw zzfwVar = new zzfw();
        zza = zzfwVar;
        zzke.zzbJ(zzfw.class, zzfwVar);
    }

    /* renamed from: f */
    public static /* synthetic */ void m47275f(zzfw zzfwVar, String str) {
        str.getClass();
        zzfwVar.zze |= 1;
        zzfwVar.zzf = str;
    }

    /* renamed from: g */
    public static /* synthetic */ void m47274g(zzfw zzfwVar, String str) {
        str.getClass();
        zzfwVar.zze |= 2;
        zzfwVar.zzg = str;
    }

    /* renamed from: h */
    public static /* synthetic */ void m47273h(zzfw zzfwVar) {
        zzfwVar.zze &= -3;
        zzfwVar.zzg = zza.zzg;
    }

    /* renamed from: i */
    public static /* synthetic */ void m47272i(zzfw zzfwVar, long j) {
        zzfwVar.zze |= 4;
        zzfwVar.zzh = j;
    }

    /* renamed from: j */
    public static /* synthetic */ void m47271j(zzfw zzfwVar) {
        zzfwVar.zze &= -5;
        zzfwVar.zzh = 0L;
    }

    /* renamed from: k */
    public static /* synthetic */ void m47270k(zzfw zzfwVar, double d) {
        zzfwVar.zze |= 16;
        zzfwVar.zzj = d;
    }

    /* renamed from: l */
    public static /* synthetic */ void m47269l(zzfw zzfwVar) {
        zzfwVar.zze &= -17;
        zzfwVar.zzj = 0.0d;
    }

    /* renamed from: m */
    public static /* synthetic */ void m47268m(zzfw zzfwVar, zzfw zzfwVar2) {
        zzfwVar2.getClass();
        zzfwVar.m47265p();
        zzfwVar.zzk.add(zzfwVar2);
    }

    /* renamed from: n */
    public static /* synthetic */ void m47267n(zzfw zzfwVar, Iterable iterable) {
        zzfwVar.m47265p();
        zzin.zzbt(iterable, zzfwVar.zzk);
    }

    public static zzfv zze() {
        return (zzfv) zza.zzbx();
    }

    /* renamed from: p */
    public final void m47265p() {
        zzkl zzklVar = this.zzk;
        if (!zzklVar.zzc()) {
            this.zzk = zzke.zzbE(zzklVar);
        }
    }

    public final double zza() {
        return this.zzj;
    }

    public final float zzb() {
        return this.zzi;
    }

    public final int zzc() {
        return this.zzk.size();
    }

    public final long zzd() {
        return this.zzh;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zzk;
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
                    return new zzfv(null);
                }
                return new zzfw();
            }
            return zzke.zzbI(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzfw.class});
        }
        return (byte) 1;
    }

    public final boolean zzu() {
        return (this.zze & 16) != 0;
    }

    public final boolean zzv() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzw() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzx() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzy() {
        return (this.zze & 2) != 0;
    }
}
