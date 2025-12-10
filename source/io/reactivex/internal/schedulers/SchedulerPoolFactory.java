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
    public static final AtomicReference f66068a = new AtomicReference();

    /* renamed from: b */
    public static final Map f66069b = new ConcurrentHashMap();

    /* renamed from: io.reactivex.internal.schedulers.SchedulerPoolFactory$a */
    /* loaded from: classes5.dex */
    public static final class C11145a {

        /* renamed from: a */
        public boolean f66070a;

        /* renamed from: b */
        public int f66071b;

        /* renamed from: a */
        public void m29891a(Properties properties) {
            if (properties.containsKey("rx2.purge-enabled")) {
                this.f66070a = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
            } else {
                this.f66070a = true;
            }
            if (this.f66070a && properties.containsKey("rx2.purge-period-seconds")) {
                try {
                    this.f66071b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
                    return;
                } catch (NumberFormatException unused) {
                    this.f66071b = 1;
                    return;
                }
            }
            this.f66071b = 1;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.SchedulerPoolFactory$b */
    /* loaded from: classes5.dex */
    public static final class RunnableC11146b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(SchedulerPoolFactory.f66069b.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    SchedulerPoolFactory.f66069b.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        C11145a c11145a = new C11145a();
        c11145a.m29891a(properties);
        PURGE_ENABLED = c11145a.f66070a;
        PURGE_PERIOD_SECONDS = c11145a.f66071b;
        start();
    }

    /* renamed from: a */
    public static void m29893a(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f66069b.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    /* renamed from: b */
    public static void m29892b(boolean z) {
        if (!z) {
            return;
        }
        while (true) {
            AtomicReference atomicReference = f66068a;
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
            if (AbstractC17300An1.m69050a(atomicReference, scheduledExecutorService, newScheduledThreadPool)) {
                RunnableC11146b runnableC11146b = new RunnableC11146b();
                int i = PURGE_PERIOD_SECONDS;
                newScheduledThreadPool.scheduleAtFixedRate(runnableC11146b, i, i, TimeUnit.SECONDS);
                return;
            }
            newScheduledThreadPool.shutdownNow();
        }
    }

    public static ScheduledExecutorService create(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m29893a(PURGE_ENABLED, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    public static void shutdown() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) f66068a.getAndSet(null);
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        f66069b.clear();
    }

    public static void start() {
        m29892b(PURGE_ENABLED);
    }
}
