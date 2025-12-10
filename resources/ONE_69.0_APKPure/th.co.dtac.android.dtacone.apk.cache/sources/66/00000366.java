package p000;

import org.apache.commons.p028io.function.IORunnable;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: Da0 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC17479Da0 {
    /* renamed from: a */
    public static Runnable m68815a(final IORunnable iORunnable) {
        return new Runnable() { // from class: Ca0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC17479Da0.m68814b(IORunnable.this);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ void m68814b(IORunnable iORunnable) {
        Uncheck.run(iORunnable);
    }

    /* renamed from: c */
    public static IORunnable m68813c() {
        return AbstractC12237lx.f71859b;
    }
}