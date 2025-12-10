package p000;

/* renamed from: ev2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19829ev2 {

    /* renamed from: a */
    public static final Class f61723a = m31582a("libcore.io.Memory");

    /* renamed from: b */
    public static final boolean f61724b;

    static {
        boolean z;
        if (m31582a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        f61724b = z;
    }

    /* renamed from: a */
    public static Class m31582a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m31581b() {
        if (f61723a != null && !f61724b) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static Class m31580c() {
        return f61723a;
    }
}