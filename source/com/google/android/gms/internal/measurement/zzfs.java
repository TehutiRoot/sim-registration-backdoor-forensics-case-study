package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzfs extends zzke implements zzlm {
    private static final zzfs zza;
    private int zze;
    private zzkl zzf = zzke.zzbD();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        zzfs zzfsVar = new zzfs();
        zza = zzfsVar;
        zzke.zzbJ(zzfs.class, zzfsVar);
    }

    /* renamed from: f */
    public static /* synthetic */ void m47288f(zzfs zzfsVar, int i, zzfw zzfwVar) {
        zzfwVar.getClass();
        zzfsVar.m47280n();
        zzfsVar.zzf.set(i, zzfwVar);
    }

    /* renamed from: g */
    public static /* synthetic */ void m47287g(zzfs zzfsVar, zzfw zzfwVar) {
        zzfwVar.getClass();
        zzfsVar.m47280n();
        zzfsVar.zzf.add(zzfwVar);
    }

    /* renamed from: h */
    public static /* synthetic */ void m47286h(zzfs zzfsVar, Iterable iterable) {
        zzfsVar.m47280n();
        zzin.zzbt(iterable, zzfsVar.zzf);
    }

    /* renamed from: j */
    public static /* synthetic */ void m47284j(zzfs zzfsVar, int i) {
        zzfsVar.m47280n();
        zzfsVar.zzf.remove(i);
    }

    /* renamed from: k */
    public static /* synthetic */ void m47283k(zzfs zzfsVar, String str) {
        str.getClass();
        zzfsVar.zze |= 1;
        zzfsVar.zzg = str;
    }

    /* renamed from: l */
    public static /* synthetic */ void m47282l(zzfs zzfsVar, long j) {
        zzfsVar.zze |= 2;
        zzfsVar.zzh = j;
    }

    /* renamed from: m */
    public static /* synthetic */ void m47281m(zzfs zzfsVar, long j) {
        zzfsVar.zze |= 4;
        zzfsVar.zzi = j;
    }

    public static zzfr zze() {
        return (zzfr) zza.zzbx();
    }

    /* renamed from: n */
    public final void m47280n() {
        zzkl zzklVar = this.zzf;
        if (!zzklVar.zzc()) {
            this.zzf = zzke.zzbE(zzklVar);
        }
    }

    public final int zza() {
        return this.zzj;
    }

    public final int zzb() {
        return this.zzf.size();
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final zzfw zzg(int i) {
        return (zzfw) this.zzf.get(i);
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
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
                    return new zzfr(null);
                }
                return new zzfs();
            }
            return zzke.zzbI(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", zzfw.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final boolean zzs() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzt() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzu() {
        return (this.zze & 2) != 0;
    }
}
