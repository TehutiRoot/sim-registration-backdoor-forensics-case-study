package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzw extends zzai {

    /* renamed from: a */
    public final zzj f46389a;

    /* renamed from: b */
    public final Map f46390b;

    public zzw(zzj zzjVar) {
        super("require");
        this.f46390b = new HashMap();
        this.f46389a = zzjVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzap zzapVar;
        zzh.zzh("require", 1, list);
        String zzi = zzgVar.zzb((zzap) list.get(0)).zzi();
        if (this.f46390b.containsKey(zzi)) {
            return (zzap) this.f46390b.get(zzi);
        }
        zzj zzjVar = this.f46389a;
        if (zzjVar.f46321a.containsKey(zzi)) {
            try {
                zzapVar = (zzap) ((Callable) zzjVar.f46321a.get(zzi)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(zzi)));
            }
        } else {
            zzapVar = zzap.zzf;
        }
        if (zzapVar instanceof zzai) {
            this.f46390b.put(zzi, (zzai) zzapVar);
        }
        return zzapVar;
    }
}
