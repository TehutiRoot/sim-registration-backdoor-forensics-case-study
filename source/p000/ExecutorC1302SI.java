package p000;

import java.util.concurrent.Executor;

/* renamed from: SI */
/* loaded from: classes6.dex */
public final class ExecutorC1302SI implements Executor {

    /* renamed from: a */
    public static final ExecutorC1302SI f5579a = new ExecutorC1302SI();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
