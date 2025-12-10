package p000;

/* renamed from: V2 */
/* loaded from: classes4.dex */
public abstract class AbstractC1482V2 {

    /* renamed from: a */
    public static boolean f6779a;

    /* renamed from: b */
    public static final Class f6780b = m66073a("libcore.io.Memory");

    /* renamed from: c */
    public static final boolean f6781c;

    static {
        boolean z;
        if (!f6779a && m66073a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        f6781c = z;
    }

    /* renamed from: a */
    public static Class m66073a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Class m66072b() {
        return f6780b;
    }

    /* renamed from: c */
    public static boolean m66071c() {
        if (!f6779a && (f6780b == null || f6781c)) {
            return false;
        }
        return true;
    }
}