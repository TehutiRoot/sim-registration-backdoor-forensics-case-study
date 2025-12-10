package p000;

/* renamed from: W2 */
/* loaded from: classes2.dex */
public abstract class AbstractC1569W2 {

    /* renamed from: a */
    public static final Class f7167a = m65826a("libcore.io.Memory");

    /* renamed from: b */
    public static final boolean f7168b;

    static {
        boolean z;
        if (m65826a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        f7168b = z;
    }

    /* renamed from: a */
    public static Class m65826a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Class m65825b() {
        return f7167a;
    }

    /* renamed from: c */
    public static boolean m65824c() {
        if (f7167a != null && !f7168b) {
            return true;
        }
        return false;
    }
}