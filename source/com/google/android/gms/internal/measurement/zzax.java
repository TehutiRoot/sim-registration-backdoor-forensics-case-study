package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzax {

    /* renamed from: a */
    public final Map f46242a = new HashMap();

    /* renamed from: b */
    public final zzbj f46243b = new zzbj();

    public zzax() {
        m47340a(new zzav());
        m47340a(new zzay());
        m47340a(new zzaz());
        m47340a(new zzbc());
        m47340a(new zzbh());
        m47340a(new zzbi());
        m47340a(new zzbk());
    }

    /* renamed from: a */
    public final void m47340a(zzaw zzawVar) {
        for (zzbl zzblVar : zzawVar.f46241a) {
            this.f46242a.put(zzblVar.zzb().toString(), zzawVar);
        }
    }

    public final zzap zza(zzg zzgVar, zzap zzapVar) {
        zzaw zzawVar;
        zzh.zzc(zzgVar);
        if (zzapVar instanceof zzaq) {
            zzaq zzaqVar = (zzaq) zzapVar;
            ArrayList zzc = zzaqVar.zzc();
            String zzb = zzaqVar.zzb();
            if (this.f46242a.containsKey(zzb)) {
                zzawVar = (zzaw) this.f46242a.get(zzb);
            } else {
                zzawVar = this.f46243b;
            }
            return zzawVar.zza(zzb, zzgVar, zzc);
        }
        return zzapVar;
    }
}
