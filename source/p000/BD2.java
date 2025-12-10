package p000;

import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.measurement.zzkw;

/* renamed from: BD2 */
/* loaded from: classes3.dex */
public final class BD2 extends ID2 {
    public /* synthetic */ BD2(zzkw zzkwVar) {
        super(null);
    }

    @Override // p000.ID2
    /* renamed from: a */
    public final void mo1309a(Object obj, long j) {
        ((zzkl) BH2.m68939k(obj, j)).zzb();
    }

    @Override // p000.ID2
    /* renamed from: b */
    public final void mo1308b(Object obj, Object obj2, long j) {
        zzkl zzklVar = (zzkl) BH2.m68939k(obj, j);
        zzkl zzklVar2 = (zzkl) BH2.m68939k(obj2, j);
        int size = zzklVar.size();
        int size2 = zzklVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzklVar.zzc()) {
                zzklVar = zzklVar.zzd(size2 + size);
            }
            zzklVar.addAll(zzklVar2);
        }
        if (size > 0) {
            zzklVar2 = zzklVar;
        }
        BH2.m68926x(obj, j, zzklVar2);
    }
}
