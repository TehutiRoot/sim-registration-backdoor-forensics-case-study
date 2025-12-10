package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzaz extends zzaw {
    public zzaz() {
        this.f46241a.add(zzbl.APPLY);
        this.f46241a.add(zzbl.BLOCK);
        this.f46241a.add(zzbl.BREAK);
        this.f46241a.add(zzbl.CASE);
        this.f46241a.add(zzbl.DEFAULT);
        this.f46241a.add(zzbl.CONTINUE);
        this.f46241a.add(zzbl.DEFINE_FUNCTION);
        this.f46241a.add(zzbl.FN);
        this.f46241a.add(zzbl.IF);
        this.f46241a.add(zzbl.QUOTE);
        this.f46241a.add(zzbl.RETURN);
        this.f46241a.add(zzbl.SWITCH);
        this.f46241a.add(zzbl.TERNARY);
    }

    /* renamed from: b */
    public static zzap m47336b(zzg zzgVar, List list) {
        zzh.zzi(zzbl.FN.name(), 2, list);
        zzap zzb = zzgVar.zzb((zzap) list.get(0));
        zzap zzb2 = zzgVar.zzb((zzap) list.get(1));
        if (zzb2 instanceof zzae) {
            List zzm = ((zzae) zzb2).zzm();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new zzao(zzb.zzi(), zzm, arrayList, zzgVar);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", zzb2.getClass().getCanonicalName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0128, code lost:
        if (r8.equals("continue") == false) goto L67;
     */
    @Override // com.google.android.gms.internal.measurement.zzaw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.zzap zza(java.lang.String r8, com.google.android.gms.internal.measurement.zzg r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzaz.zza(java.lang.String, com.google.android.gms.internal.measurement.zzg, java.util.List):com.google.android.gms.internal.measurement.zzap");
    }
}
