package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class zzz {

    /* renamed from: a */
    public final TreeMap f46391a = new TreeMap();

    /* renamed from: b */
    public final TreeMap f46392b = new TreeMap();

    /* renamed from: a */
    public static final int m47142a(zzg zzgVar, zzao zzaoVar, zzap zzapVar) {
        zzap zza = zzaoVar.zza(zzgVar, Collections.singletonList(zzapVar));
        if (zza instanceof zzah) {
            return zzh.zzb(zza.zzh().doubleValue());
        }
        return -1;
    }

    public final void zza(String str, int i, zzao zzaoVar, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f46392b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f46391a;
        } else {
            throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), zzaoVar);
    }

    public final void zzb(zzg zzgVar, zzab zzabVar) {
        zzl zzlVar = new zzl(zzabVar);
        for (Integer num : this.f46391a.keySet()) {
            zzaa clone = zzabVar.zzb().clone();
            int m47142a = m47142a(zzgVar, (zzao) this.f46391a.get(num), zzlVar);
            if (m47142a == 2 || m47142a == -1) {
                zzabVar.zzf(clone);
            }
        }
        for (Integer num2 : this.f46392b.keySet()) {
            m47142a(zzgVar, (zzao) this.f46392b.get(num2), zzlVar);
        }
    }
}
