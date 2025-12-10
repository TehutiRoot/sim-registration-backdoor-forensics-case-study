package p000;

/* renamed from: tQ1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC22274tQ1 {

    /* renamed from: a */
    public static final int f80114a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m22438a() {
        return f80114a;
    }

    /* renamed from: b */
    public static final String m22437b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
