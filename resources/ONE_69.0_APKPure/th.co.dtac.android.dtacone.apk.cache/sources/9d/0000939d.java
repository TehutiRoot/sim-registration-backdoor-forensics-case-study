package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzf {

    /* renamed from: a */
    public final zzax f46279a;

    /* renamed from: b */
    public final zzg f46280b;

    /* renamed from: c */
    public final zzg f46281c;

    /* renamed from: d */
    public final zzj f46282d;

    public zzf() {
        zzax zzaxVar = new zzax();
        this.f46279a = zzaxVar;
        zzg zzgVar = new zzg(null, zzaxVar);
        this.f46281c = zzgVar;
        this.f46280b = zzgVar.zza();
        zzj zzjVar = new zzj();
        this.f46282d = zzjVar;
        zzgVar.zzg("require", new zzw(zzjVar));
        zzjVar.zza("internal.platform", zze.zza);
        zzgVar.zzg("runtime.counter", new zzah(Double.valueOf(0.0d)));
    }

    public final zzap zza(zzg zzgVar, zzgx... zzgxVarArr) {
        zzap zzapVar = zzap.zzf;
        for (zzgx zzgxVar : zzgxVarArr) {
            zzapVar = zzi.zza(zzgxVar);
            zzh.zzc(this.f46281c);
            if ((zzapVar instanceof zzaq) || (zzapVar instanceof zzao)) {
                zzapVar = this.f46279a.zza(zzgVar, zzapVar);
            }
        }
        return zzapVar;
    }
}