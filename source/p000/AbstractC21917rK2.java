package p000;

/* renamed from: rK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21917rK2 {

    /* renamed from: a */
    public static final Class f77245a = m23336a("libcore.io.Memory");

    /* renamed from: b */
    public static final boolean f77246b;

    static {
        boolean z;
        if (m23336a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        f77246b = z;
    }

    /* renamed from: a */
    public static Class m23336a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m23335b() {
        if (f77245a != null && !f77246b) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static Class m23334c() {
        return f77245a;
    }
}
