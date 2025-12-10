package p000;

import com.google.android.gms.internal.firebase_ml.zzxl;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: ML2 */
/* loaded from: classes3.dex */
public final class ML2 {

    /* renamed from: c */
    public static final ML2 f3758c = new ML2();

    /* renamed from: b */
    public final ConcurrentMap f3760b = new ConcurrentHashMap();

    /* renamed from: a */
    public final QL2 f3759a = new C21576pL2();

    /* renamed from: c */
    public static ML2 m67395c() {
        return f3758c;
    }

    /* renamed from: a */
    public final OL2 m67397a(Object obj) {
        return m67396b(obj.getClass());
    }

    /* renamed from: b */
    public final OL2 m67396b(Class cls) {
        zzxl.m47421b(cls, "messageType");
        OL2 ol2 = (OL2) this.f3760b.get(cls);
        if (ol2 == null) {
            OL2 mo23696a = this.f3759a.mo23696a(cls);
            zzxl.m47421b(cls, "messageType");
            zzxl.m47421b(mo23696a, "schema");
            OL2 ol22 = (OL2) this.f3760b.putIfAbsent(cls, mo23696a);
            if (ol22 != null) {
                return ol22;
            }
            return mo23696a;
        }
        return ol2;
    }
}
