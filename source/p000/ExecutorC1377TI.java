package p000;

import java.util.concurrent.Executor;

/* renamed from: TI */
/* loaded from: classes.dex */
public final class ExecutorC1377TI implements Executor {

    /* renamed from: a */
    public static volatile ExecutorC1377TI f5978a;

    /* renamed from: a */
    public static Executor m66216a() {
        if (f5978a != null) {
            return f5978a;
        }
        synchronized (ExecutorC1377TI.class) {
            try {
                if (f5978a == null) {
                    f5978a = new ExecutorC1377TI();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f5978a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
