package p000;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzhy;
import java.util.Comparator;

/* renamed from: Iv2 */
/* loaded from: classes3.dex */
public final class Iv2 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int zzb;
        int zzb2;
        zzht zzhtVar = (zzht) obj;
        zzht zzhtVar2 = (zzht) obj2;
        zzhy zzhyVar = (zzhy) zzhtVar.iterator();
        zzhy zzhyVar2 = (zzhy) zzhtVar2.iterator();
        while (zzhyVar.hasNext() && zzhyVar2.hasNext()) {
            zzb = zzht.zzb(zzhyVar.zza());
            zzb2 = zzht.zzb(zzhyVar2.zza());
            int compare = Integer.compare(zzb, zzb2);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzhtVar.zza(), zzhtVar2.zza());
    }
}
