package p000;

import com.google.common.base.Preconditions;

/* renamed from: zl1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23431zl1 {
    /* renamed from: a */
    public static boolean m75a(Throwable th2, Class cls) {
        return cls.isInstance(th2);
    }

    /* renamed from: b */
    public static void m74b(Throwable th2) {
        Preconditions.checkNotNull(th2);
        if (th2 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}