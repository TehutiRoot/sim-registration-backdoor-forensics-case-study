package p000;

import com.google.android.gms.internal.firebase_ml.zzxl;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: JM2 */
/* loaded from: classes3.dex */
public final class JM2 {

    /* renamed from: c */
    public static final JM2 f2991c = new JM2();

    /* renamed from: b */
    public final ConcurrentMap f2993b = new ConcurrentHashMap();

    /* renamed from: a */
    public final NM2 f2992a = new C21121mM2();

    /* renamed from: c */
    public static JM2 m67886c() {
        return f2991c;
    }

    /* renamed from: a */
    public final LM2 m67888a(Object obj) {
        return m67887b(obj.getClass());
    }

    /* renamed from: b */
    public final LM2 m67887b(Class cls) {
        zzxl.m47430b(cls, "messageType");
        LM2 lm2 = (LM2) this.f2993b.get(cls);
        if (lm2 == null) {
            LM2 mo26666a = this.f2992a.mo26666a(cls);
            zzxl.m47430b(cls, "messageType");
            zzxl.m47430b(mo26666a, "schema");
            LM2 lm22 = (LM2) this.f2993b.putIfAbsent(cls, mo26666a);
            if (lm22 != null) {
                return lm22;
            }
            return mo26666a;
        }
        return lm2;
    }
}