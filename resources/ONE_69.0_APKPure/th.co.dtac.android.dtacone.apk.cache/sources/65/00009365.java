package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzax {

    /* renamed from: a */
    public final Map f46254a = new HashMap();

    /* renamed from: b */
    public final zzbj f46255b = new zzbj();

    public zzax() {
        m47349a(new zzav());
        m47349a(new zzay());
        m47349a(new zzaz());
        m47349a(new zzbc());
        m47349a(new zzbh());
        m47349a(new zzbi());
        m47349a(new zzbk());
    }

    /* renamed from: a */
    public final void m47349a(zzaw zzawVar) {
        for (zzbl zzblVar : zzawVar.f46253a) {
            this.f46254a.put(zzblVar.zzb().toString(), zzawVar);
        }
    }

    public final zzap zza(zzg zzgVar, zzap zzapVar) {
        zzaw zzawVar;
        zzh.zzc(zzgVar);
        if (zzapVar instanceof zzaq) {
            zzaq zzaqVar = (zzaq) zzapVar;
            ArrayList zzc = zzaqVar.zzc();
            String zzb = zzaqVar.zzb();
            if (this.f46254a.containsKey(zzb)) {
                zzawVar = (zzaw) this.f46254a.get(zzb);
            } else {
                zzawVar = this.f46255b;
            }
            return zzawVar.zza(zzb, zzgVar, zzc);
        }
        return zzapVar;
    }
}