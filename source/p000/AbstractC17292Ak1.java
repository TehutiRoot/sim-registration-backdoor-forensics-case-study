package p000;

/* renamed from: Ak1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17292Ak1 {

    /* renamed from: a */
    public static final ThreadLocal f183a = new C0051a();

    /* renamed from: Ak1$a */
    /* loaded from: classes4.dex */
    public static class C0051a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public char[] initialValue() {
            return new char[1024];
        }
    }

    /* renamed from: a */
    public static char[] m69054a() {
        return (char[]) f183a.get();
    }
}
