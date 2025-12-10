package p000;

import com.google.android.gms.internal.measurement.zzjd;
import java.util.Comparator;

/* renamed from: Oy2 */
/* loaded from: classes3.dex */
public final class Oy2 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzjd zzjdVar = (zzjd) obj;
        zzjd zzjdVar2 = (zzjd) obj2;
        Cy2 cy2 = new Cy2(zzjdVar);
        Cy2 cy22 = new Cy2(zzjdVar2);
        while (cy2.hasNext() && cy22.hasNext()) {
            int compareTo = Integer.valueOf(cy2.zza() & 255).compareTo(Integer.valueOf(cy22.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzjdVar.zzd()).compareTo(Integer.valueOf(zzjdVar2.zzd()));
    }
}
