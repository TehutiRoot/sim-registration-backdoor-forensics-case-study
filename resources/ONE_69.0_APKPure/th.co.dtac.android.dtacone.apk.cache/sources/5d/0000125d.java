package p000;

import java.util.concurrent.Executor;

/* renamed from: TI */
/* loaded from: classes6.dex */
public final class ExecutorC1360TI implements Executor {

    /* renamed from: a */
    public static final ExecutorC1360TI f6310a = new ExecutorC1360TI();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}