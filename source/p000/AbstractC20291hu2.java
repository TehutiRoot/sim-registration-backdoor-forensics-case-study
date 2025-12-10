package p000;

/* renamed from: hu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20291hu2 {

    /* renamed from: a */
    public static final Class f62651a = m30709a("libcore.io.Memory");

    /* renamed from: b */
    public static final boolean f62652b;

    static {
        boolean z;
        if (m30709a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        f62652b = z;
    }

    /* renamed from: a */
    public static Class m30709a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m30708b() {
        if (f62651a != null && !f62652b) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static Class m30707c() {
        return f62651a;
    }
}
