package p000;

/* renamed from: qR1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC21823qR1 {

    /* renamed from: a */
    public static final int f77212a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m23635a() {
        return f77212a;
    }

    /* renamed from: b */
    public static final String m23634b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}