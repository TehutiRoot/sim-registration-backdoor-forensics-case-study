package p000;

/* renamed from: Tc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18485Tc2 {

    /* renamed from: a */
    public static final Class f6044a = m66189a("libcore.io.Memory");

    /* renamed from: b */
    public static final boolean f6045b;

    static {
        boolean z;
        if (m66189a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        f6045b = z;
    }

    /* renamed from: a */
    public static Class m66189a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m66188b() {
        if (f6044a != null && !f6045b) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static Class m66187c() {
        return f6044a;
    }
}
