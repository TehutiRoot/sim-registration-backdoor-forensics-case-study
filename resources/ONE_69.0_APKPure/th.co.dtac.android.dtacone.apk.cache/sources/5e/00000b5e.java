package p000;

import com.google.android.gms.internal.measurement.zzjd;
import java.util.Comparator;

/* renamed from: Lz2 */
/* loaded from: classes3.dex */
public final class Lz2 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzjd zzjdVar = (zzjd) obj;
        zzjd zzjdVar2 = (zzjd) obj2;
        C23474zz2 c23474zz2 = new C23474zz2(zzjdVar);
        C23474zz2 c23474zz22 = new C23474zz2(zzjdVar2);
        while (c23474zz2.hasNext() && c23474zz22.hasNext()) {
            int compareTo = Integer.valueOf(c23474zz2.zza() & 255).compareTo(Integer.valueOf(c23474zz22.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzjdVar.zzd()).compareTo(Integer.valueOf(zzjdVar2.zzd()));
    }
}