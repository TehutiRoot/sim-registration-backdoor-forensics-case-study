package p000;

/* renamed from: V2 */
/* loaded from: classes4.dex */
public abstract class AbstractC1503V2 {

    /* renamed from: a */
    public static boolean f6523a;

    /* renamed from: b */
    public static final Class f6524b = m65950a("libcore.io.Memory");

    /* renamed from: c */
    public static final boolean f6525c;

    static {
        boolean z;
        if (!f6523a && m65950a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        f6525c = z;
    }

    /* renamed from: a */
    public static Class m65950a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Class m65949b() {
        return f6524b;
    }

    /* renamed from: c */
    public static boolean m65948c() {
        if (!f6523a && (f6524b == null || f6525c)) {
            return false;
        }
        return true;
    }
}
