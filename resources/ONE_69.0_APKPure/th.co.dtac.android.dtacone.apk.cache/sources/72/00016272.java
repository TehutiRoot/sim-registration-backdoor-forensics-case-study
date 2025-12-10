package p000;

import java.util.Objects;

/* renamed from: yl1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23258yl1 {

    /* renamed from: a */
    public static final ThreadLocal f109149a = new C17159a();

    /* renamed from: yl1$a */
    /* loaded from: classes4.dex */
    public class C17159a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public char[] initialValue() {
            return new char[1024];
        }
    }

    /* renamed from: a */
    public static char[] m248a() {
        char[] cArr = (char[]) f109149a.get();
        Objects.requireNonNull(cArr);
        return cArr;
    }
}