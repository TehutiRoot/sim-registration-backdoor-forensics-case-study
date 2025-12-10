package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class ExecutorUtils {

    /* renamed from: com.google.firebase.crashlytics.internal.common.ExecutorUtils$a */
    /* loaded from: classes4.dex */
    public class ThreadFactoryC8345a implements ThreadFactory {

        /* renamed from: a */
        public final /* synthetic */ String f54825a;

        /* renamed from: b */
        public final /* synthetic */ AtomicLong f54826b;

        /* renamed from: com.google.firebase.crashlytics.internal.common.ExecutorUtils$a$a */
        /* loaded from: classes4.dex */
        public class C8346a extends BackgroundPriorityRunnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f54827a;

            public C8346a(Runnable runnable) {
                this.f54827a = runnable;
            }

            @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
            public void onRun() {
                this.f54827a.run();
            }
        }

        public ThreadFactoryC8345a(String str, AtomicLong atomicLong) {
            this.f54825a = str;
            this.f54826b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C8346a(runnable));
            newThread.setName(this.f54825a + this.f54826b.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.ExecutorUtils$b */
    /* loaded from: classes4.dex */
    public class C8347b extends BackgroundPriorityRunnable {

        /* renamed from: a */
        public final /* synthetic */ String f54829a;

        /* renamed from: b */
        public final /* synthetic */ ExecutorService f54830b;

        /* renamed from: c */
        public final /* synthetic */ long f54831c;

        /* renamed from: d */
        public final /* synthetic */ TimeUnit f54832d;

        public C8347b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.f54829a = str;
            this.f54830b = executorService;
            this.f54831c = j;
            this.f54832d = timeUnit;
        }

        @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
        public void onRun() {
            try {
                Logger logger = Logger.getLogger();
                logger.m39132d("Executing shutdown hook for " + this.f54829a);
                this.f54830b.shutdown();
                if (!this.f54830b.awaitTermination(this.f54831c, this.f54832d)) {
                    Logger logger2 = Logger.getLogger();
                    logger2.m39132d(this.f54829a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f54830b.shutdownNow();
                }
            } catch (InterruptedException unused) {
                Logger.getLogger().m39132d(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f54829a));
                this.f54830b.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    public static void m39056a(String str, ExecutorService executorService) {
        m39055b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public static void m39055b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        C8347b c8347b = new C8347b(str, executorService, j, timeUnit);
        runtime.addShutdownHook(new Thread(c8347b, "Crashlytics Shutdown Hook for " + str));
    }

    public static Executor buildSequentialExecutor(Executor executor) {
        return FirebaseExecutors.newSequentialExecutor(executor);
    }

    public static ExecutorService buildSingleThreadExecutorService(String str) {
        ExecutorService m39054c = m39054c(getNamedThreadFactory(str), new ThreadPoolExecutor.DiscardPolicy());
        m39056a(str, m39054c);
        return m39054c;
    }

    public static ScheduledExecutorService buildSingleThreadScheduledExecutorService(String str) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(getNamedThreadFactory(str));
        m39056a(str, newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }

    /* renamed from: c */
    public static ExecutorService m39054c(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }

    public static ThreadFactory getNamedThreadFactory(String str) {
        return new ThreadFactoryC8345a(str, new AtomicLong(1L));
    }
}