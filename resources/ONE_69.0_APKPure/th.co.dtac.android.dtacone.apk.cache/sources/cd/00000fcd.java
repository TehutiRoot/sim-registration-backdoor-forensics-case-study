package p000;

/* renamed from: Qd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18335Qd2 {

    /* renamed from: a */
    public static final Class f5261a = m66754a("libcore.io.Memory");

    /* renamed from: b */
    public static final boolean f5262b;

    static {
        boolean z;
        if (m66754a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        f5262b = z;
    }

    /* renamed from: a */
    public static Class m66754a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m66753b() {
        if (f5261a != null && !f5262b) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static Class m66752c() {
        return f5261a;
    }
}