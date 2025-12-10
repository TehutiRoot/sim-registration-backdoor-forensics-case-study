package ch.qos.logback.core.util;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ExecutorServiceUtil {

    /* renamed from: a */
    public static final ThreadFactory f40171a = new ThreadFactoryC5490a();

    /* renamed from: ch.qos.logback.core.util.ExecutorServiceUtil$a */
    /* loaded from: classes.dex */
    public static class ThreadFactoryC5490a implements ThreadFactory {

        /* renamed from: a */
        public final ThreadFactory f40172a = Executors.defaultThreadFactory();

        /* renamed from: b */
        public final AtomicInteger f40173b = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f40172a.newThread(runnable);
            if (!newThread.isDaemon()) {
                newThread.setDaemon(true);
            }
            newThread.setName("logback-" + this.f40173b.getAndIncrement());
            return newThread;
        }
    }

    public static ExecutorService newExecutorService() {
        return new ThreadPoolExecutor(CoreConstants.CORE_POOL_SIZE, 32, 0L, TimeUnit.MILLISECONDS, new SynchronousQueue(), f40171a);
    }

    public static ScheduledExecutorService newScheduledExecutorService() {
        return new ScheduledThreadPoolExecutor(2, f40171a);
    }

    public static void shutdown(ExecutorService executorService) {
        executorService.shutdownNow();
    }
}