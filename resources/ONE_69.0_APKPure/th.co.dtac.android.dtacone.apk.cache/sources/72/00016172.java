package p000;

/* renamed from: xl1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23085xl1 {

    /* renamed from: a */
    public static final ThreadLocal f108833a = new C17076a();

    /* renamed from: xl1$a */
    /* loaded from: classes4.dex */
    public static class C17076a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public char[] initialValue() {
            return new char[1024];
        }
    }

    /* renamed from: a */
    public static char[] m485a() {
        return (char[]) f108833a.get();
    }
}