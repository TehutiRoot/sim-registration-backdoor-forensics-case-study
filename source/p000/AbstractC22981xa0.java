package p000;

import org.apache.commons.p028io.function.IORunnable;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: xa0 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC22981xa0 {
    /* renamed from: a */
    public static Runnable m424a(final IORunnable iORunnable) {
        return new Runnable() { // from class: wa0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC22981xa0.m423b(iORunnable);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ void m423b(IORunnable iORunnable) {
        Uncheck.run(iORunnable);
    }

    /* renamed from: c */
    public static IORunnable m422c() {
        return AbstractC12253lx.f71779b;
    }
}
