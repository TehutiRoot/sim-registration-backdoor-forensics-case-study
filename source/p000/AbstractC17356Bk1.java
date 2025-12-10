package p000;

import java.util.Objects;

/* renamed from: Bk1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17356Bk1 {

    /* renamed from: a */
    public static final ThreadLocal f498a = new C0128a();

    /* renamed from: Bk1$a */
    /* loaded from: classes4.dex */
    public class C0128a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public char[] initialValue() {
            return new char[1024];
        }
    }

    /* renamed from: a */
    public static char[] m68882a() {
        char[] cArr = (char[]) f498a.get();
        Objects.requireNonNull(cArr);
        return cArr;
    }
}
