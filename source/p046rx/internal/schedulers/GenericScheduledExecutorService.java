package p046rx.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx.internal.schedulers.GenericScheduledExecutorService */
/* loaded from: classes7.dex */
public final class GenericScheduledExecutorService implements SchedulerLifecycle {
    public static final GenericScheduledExecutorService INSTANCE;

    /* renamed from: b */
    public static final ScheduledExecutorService[] f79112b = new ScheduledExecutorService[0];

    /* renamed from: c */
    public static final ScheduledExecutorService f79113c;

    /* renamed from: d */
    public static int f79114d;

    /* renamed from: a */
    public final AtomicReference f79115a = new AtomicReference(f79112b);

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f79113c = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        INSTANCE = new GenericScheduledExecutorService();
    }

    public GenericScheduledExecutorService() {
        start();
    }

    public static ScheduledExecutorService getInstance() {
        ScheduledExecutorService[] scheduledExecutorServiceArr = (ScheduledExecutorService[]) INSTANCE.f79115a.get();
        if (scheduledExecutorServiceArr == f79112b) {
            return f79113c;
        }
        int i = f79114d + 1;
        if (i >= scheduledExecutorServiceArr.length) {
            i = 0;
        }
        f79114d = i;
        return scheduledExecutorServiceArr[i];
    }

    @Override // p046rx.internal.schedulers.SchedulerLifecycle
    public void shutdown() {
        ScheduledExecutorService[] scheduledExecutorServiceArr;
        ScheduledExecutorService[] scheduledExecutorServiceArr2;
        do {
            scheduledExecutorServiceArr = (ScheduledExecutorService[]) this.f79115a.get();
            scheduledExecutorServiceArr2 = f79112b;
            if (scheduledExecutorServiceArr == scheduledExecutorServiceArr2) {
                return;
            }
        } while (!AbstractC17300An1.m69050a(this.f79115a, scheduledExecutorServiceArr, scheduledExecutorServiceArr2));
        for (ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr) {
            NewThreadWorker.deregisterExecutor(scheduledExecutorService);
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // p046rx.internal.schedulers.SchedulerLifecycle
    public void start() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors > 4) {
            availableProcessors /= 2;
        }
        if (availableProcessors > 8) {
            availableProcessors = 8;
        }
        ScheduledExecutorService[] scheduledExecutorServiceArr = new ScheduledExecutorService[availableProcessors];
        int i = 0;
        for (int i2 = 0; i2 < availableProcessors; i2++) {
            scheduledExecutorServiceArr[i2] = GenericScheduledExecutorServiceFactory.create();
        }
        if (AbstractC17300An1.m69050a(this.f79115a, f79112b, scheduledExecutorServiceArr)) {
            while (i < availableProcessors) {
                ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceArr[i];
                if (!NewThreadWorker.tryEnableCancelPolicy(scheduledExecutorService) && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
                    NewThreadWorker.registerExecutor((ScheduledThreadPoolExecutor) scheduledExecutorService);
                }
                i++;
            }
            return;
        }
        while (i < availableProcessors) {
            scheduledExecutorServiceArr[i].shutdownNow();
            i++;
        }
    }
}
