package com.bumptech.glide.util;

import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class Executors {

    /* renamed from: a */
    public static final Executor f42723a = new ExecutorC5934a();

    /* renamed from: b */
    public static final Executor f42724b = new ExecutorC5935b();

    /* renamed from: com.bumptech.glide.util.Executors$a */
    /* loaded from: classes3.dex */
    public class ExecutorC5934a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Util.postOnUiThread(runnable);
        }
    }

    /* renamed from: com.bumptech.glide.util.Executors$b */
    /* loaded from: classes3.dex */
    public class ExecutorC5935b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor directExecutor() {
        return f42724b;
    }

    public static Executor mainThreadExecutor() {
        return f42723a;
    }

    @VisibleForTesting
    public static void shutdownAndAwaitTermination(ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!executorService.awaitTermination(5L, timeUnit)) {
                executorService.shutdownNow();
                if (!executorService.awaitTermination(5L, timeUnit)) {
                    throw new RuntimeException("Failed to shutdown");
                }
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
