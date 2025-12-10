package p000;

import com.google.android.gms.internal.firebase_ml.zzwd;
import com.google.android.gms.internal.firebase_ml.zzwi;
import java.util.Comparator;

/* renamed from: EK2 */
/* loaded from: classes3.dex */
public final class EK2 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int zzb;
        int zzb2;
        zzwd zzwdVar = (zzwd) obj;
        zzwd zzwdVar2 = (zzwd) obj2;
        zzwi zzwiVar = (zzwi) zzwdVar.iterator();
        zzwi zzwiVar2 = (zzwi) zzwdVar2.iterator();
        while (zzwiVar.hasNext() && zzwiVar2.hasNext()) {
            zzb = zzwd.zzb(zzwiVar.nextByte());
            zzb2 = zzwd.zzb(zzwiVar2.nextByte());
            int compare = Integer.compare(zzb, zzb2);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzwdVar.size(), zzwdVar2.size());
    }
}
