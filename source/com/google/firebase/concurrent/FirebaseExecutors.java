package com.google.firebase.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public class FirebaseExecutors {

    /* loaded from: classes4.dex */
    public enum DirectExecutor implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor directExecutor() {
        return DirectExecutor.INSTANCE;
    }

    public static Executor newLimitedConcurrencyExecutor(Executor executor, int i) {
        return new ExecutorC18373Ri0(executor, i);
    }

    public static ExecutorService newLimitedConcurrencyExecutorService(ExecutorService executorService, int i) {
        return new ExecutorServiceC18565Ui0(executorService, i);
    }

    public static ScheduledExecutorService newLimitedConcurrencyScheduledExecutorService(ExecutorService executorService, int i) {
        return new ScheduledExecutorServiceC1086PF(newLimitedConcurrencyExecutorService(executorService, i), (ScheduledExecutorService) ExecutorsRegistrar.f54730d.get());
    }

    public static PausableExecutor newPausableExecutor(Executor executor) {
        return new C17481Dj1(false, executor);
    }

    public static PausableExecutorService newPausableExecutorService(ExecutorService executorService) {
        return new C17673Gj1(false, executorService);
    }

    public static PausableScheduledExecutorService newPausableScheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        return new C17737Hj1(newPausableExecutorService(scheduledExecutorService), (ScheduledExecutorService) ExecutorsRegistrar.f54730d.get());
    }

    public static Executor newSequentialExecutor(Executor executor) {
        return new SequentialExecutor(executor);
    }
}
