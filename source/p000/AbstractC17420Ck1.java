package p000;

import com.google.common.base.Preconditions;

/* renamed from: Ck1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17420Ck1 {
    /* renamed from: a */
    public static boolean m68742a(Throwable th2, Class cls) {
        return cls.isInstance(th2);
    }

    /* renamed from: b */
    public static void m68741b(Throwable th2) {
        Preconditions.checkNotNull(th2);
        if (th2 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
