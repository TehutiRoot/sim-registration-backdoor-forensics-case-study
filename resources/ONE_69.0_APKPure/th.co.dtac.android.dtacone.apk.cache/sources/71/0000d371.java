package io.reactivex.internal.schedulers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class SchedulerPoolFactory {
    public static final boolean PURGE_ENABLED;
    public static final int PURGE_PERIOD_SECONDS;

    /* renamed from: a */
    public static final AtomicReference f66131a = new AtomicReference();

    /* renamed from: b */
    public static final Map f66132b = new ConcurrentHashMap();

    /* renamed from: io.reactivex.internal.schedulers.SchedulerPoolFactory$a */
    /* loaded from: classes5.dex */
    public static final class C11132a {

        /* renamed from: a */
        public boolean f66133a;

        /* renamed from: b */
        public int f66134b;

        /* renamed from: a */
        public void m30231a(Properties properties) {
            if (properties.containsKey("rx2.purge-enabled")) {
                this.f66133a = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
            } else {
                this.f66133a = true;
            }
            if (this.f66133a && properties.containsKey("rx2.purge-period-seconds")) {
                try {
                    this.f66134b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
                    return;
                } catch (NumberFormatException unused) {
                    this.f66134b = 1;
                    return;
                }
            }
            this.f66134b = 1;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.SchedulerPoolFactory$b */
    /* loaded from: classes5.dex */
    public static final class RunnableC11133b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(SchedulerPoolFactory.f66132b.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    SchedulerPoolFactory.f66132b.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        C11132a c11132a = new C11132a();
        c11132a.m30231a(properties);
        PURGE_ENABLED = c11132a.f66133a;
        PURGE_PERIOD_SECONDS = c11132a.f66134b;
        start();
    }

    /* renamed from: a */
    public static void m30233a(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f66132b.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    /* renamed from: b */
    public static void m30232b(boolean z) {
        if (!z) {
            return;
        }
        while (true) {
            AtomicReference atomicReference = f66131a;
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
            if (AbstractC23094xo1.m479a(atomicReference, scheduledExecutorService, newScheduledThreadPool)) {
                RunnableC11133b runnableC11133b = new RunnableC11133b();
                int i = PURGE_PERIOD_SECONDS;
                newScheduledThreadPool.scheduleAtFixedRate(runnableC11133b, i, i, TimeUnit.SECONDS);
                return;
            }
            newScheduledThreadPool.shutdownNow();
        }
    }

    public static ScheduledExecutorService create(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m30233a(PURGE_ENABLED, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    public static void shutdown() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) f66131a.getAndSet(null);
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        f66132b.clear();
    }

    public static void start() {
        m30232b(PURGE_ENABLED);
    }
}