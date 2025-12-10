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
    public class ThreadFactoryC8356a implements ThreadFactory {

        /* renamed from: a */
        public final /* synthetic */ String f54813a;

        /* renamed from: b */
        public final /* synthetic */ AtomicLong f54814b;

        /* renamed from: com.google.firebase.crashlytics.internal.common.ExecutorUtils$a$a */
        /* loaded from: classes4.dex */
        public class C8357a extends BackgroundPriorityRunnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f54815a;

            public C8357a(Runnable runnable) {
                this.f54815a = runnable;
            }

            @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
            public void onRun() {
                this.f54815a.run();
            }
        }

        public ThreadFactoryC8356a(String str, AtomicLong atomicLong) {
            this.f54813a = str;
            this.f54814b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C8357a(runnable));
            newThread.setName(this.f54813a + this.f54814b.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.ExecutorUtils$b */
    /* loaded from: classes4.dex */
    public class C8358b extends BackgroundPriorityRunnable {

        /* renamed from: a */
        public final /* synthetic */ String f54817a;

        /* renamed from: b */
        public final /* synthetic */ ExecutorService f54818b;

        /* renamed from: c */
        public final /* synthetic */ long f54819c;

        /* renamed from: d */
        public final /* synthetic */ TimeUnit f54820d;

        public C8358b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.f54817a = str;
            this.f54818b = executorService;
            this.f54819c = j;
            this.f54820d = timeUnit;
        }

        @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
        public void onRun() {
            try {
                Logger logger = Logger.getLogger();
                logger.m39140d("Executing shutdown hook for " + this.f54817a);
                this.f54818b.shutdown();
                if (!this.f54818b.awaitTermination(this.f54819c, this.f54820d)) {
                    Logger logger2 = Logger.getLogger();
                    logger2.m39140d(this.f54817a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f54818b.shutdownNow();
                }
            } catch (InterruptedException unused) {
                Logger.getLogger().m39140d(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f54817a));
                this.f54818b.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    public static void m39064a(String str, ExecutorService executorService) {
        m39063b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public static void m39063b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        C8358b c8358b = new C8358b(str, executorService, j, timeUnit);
        runtime.addShutdownHook(new Thread(c8358b, "Crashlytics Shutdown Hook for " + str));
    }

    public static Executor buildSequentialExecutor(Executor executor) {
        return FirebaseExecutors.newSequentialExecutor(executor);
    }

    public static ExecutorService buildSingleThreadExecutorService(String str) {
        ExecutorService m39062c = m39062c(getNamedThreadFactory(str), new ThreadPoolExecutor.DiscardPolicy());
        m39064a(str, m39062c);
        return m39062c;
    }

    public static ScheduledExecutorService buildSingleThreadScheduledExecutorService(String str) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(getNamedThreadFactory(str));
        m39064a(str, newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }

    /* renamed from: c */
    public static ExecutorService m39062c(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }

    public static ThreadFactory getNamedThreadFactory(String str) {
        return new ThreadFactoryC8356a(str, new AtomicLong(1L));
    }
}
