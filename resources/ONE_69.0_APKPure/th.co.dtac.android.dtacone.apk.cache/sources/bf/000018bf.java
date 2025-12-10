package p000;

import com.google.android.gms.internal.firebase_ml.zziv;
import com.google.android.gms.internal.firebase_ml.zzmg;
import java.util.Comparator;

/* renamed from: Zz2 */
/* loaded from: classes3.dex */
public final class Zz2 implements Comparator {
    public Zz2(zziv zzivVar) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (zzmg.equal(str, str2)) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }
}