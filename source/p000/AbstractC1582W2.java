package p000;

/* renamed from: W2 */
/* loaded from: classes2.dex */
public abstract class AbstractC1582W2 {

    /* renamed from: a */
    public static final Class f7102a = m65707a("libcore.io.Memory");

    /* renamed from: b */
    public static final boolean f7103b;

    static {
        boolean z;
        if (m65707a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        f7103b = z;
    }

    /* renamed from: a */
    public static Class m65707a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Class m65706b() {
        return f7102a;
    }

    /* renamed from: c */
    public static boolean m65705c() {
        if (f7102a != null && !f7103b) {
            return true;
        }
        return false;
    }
}
