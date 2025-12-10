package p000;

/* renamed from: oL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21464oL2 {

    /* renamed from: a */
    public static final Class f72762a = m26127a("libcore.io.Memory");

    /* renamed from: b */
    public static final boolean f72763b;

    static {
        boolean z;
        if (m26127a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        f72763b = z;
    }

    /* renamed from: a */
    public static Class m26127a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m26126b() {
        if (f72762a != null && !f72763b) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static Class m26125c() {
        return f72762a;
    }
}