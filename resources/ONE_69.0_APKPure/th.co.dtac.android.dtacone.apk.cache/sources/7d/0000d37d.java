package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class SingleScheduler extends Scheduler {

    /* renamed from: d */
    public static final RxThreadFactory f66148d;

    /* renamed from: e */
    public static final ScheduledExecutorService f66149e;

    /* renamed from: b */
    public final ThreadFactory f66150b;

    /* renamed from: c */
    public final AtomicReference f66151c;

    /* renamed from: io.reactivex.internal.schedulers.SingleScheduler$a */
    /* loaded from: classes5.dex */
    public static final class C11139a extends Scheduler.Worker {

        /* renamed from: a */
        public final ScheduledExecutorService f66152a;

        /* renamed from: b */
        public final CompositeDisposable f66153b = new CompositeDisposable();

        /* renamed from: c */
        public volatile boolean f66154c;

        public C11139a(ScheduledExecutorService scheduledExecutorService) {
            this.f66152a = scheduledExecutorService;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.f66154c) {
                this.f66154c = true;
                this.f66153b.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f66154c;
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            Future<?> schedule;
            if (this.f66154c) {
                return EmptyDisposable.INSTANCE;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(RxJavaPlugins.onSchedule(runnable), this.f66153b);
            this.f66153b.add(scheduledRunnable);
            try {
                if (j <= 0) {
                    schedule = this.f66152a.submit((Callable) scheduledRunnable);
                } else {
                    schedule = this.f66152a.schedule((Callable) scheduledRunnable, j, timeUnit);
                }
                scheduledRunnable.setFuture(schedule);
                return scheduledRunnable;
            } catch (RejectedExecutionException e) {
                dispose();
                RxJavaPlugins.onError(e);
                return EmptyDisposable.INSTANCE;
            }
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f66149e = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f66148d = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public SingleScheduler() {
        this(f66148d);
    }

    /* renamed from: a */
    public static ScheduledExecutorService m30229a(ThreadFactory threadFactory) {
        return SchedulerPoolFactory.create(threadFactory);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new C11139a((ScheduledExecutorService) this.f66151c.get());
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> schedule;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(RxJavaPlugins.onSchedule(runnable));
        try {
            if (j <= 0) {
                schedule = ((ScheduledExecutorService) this.f66151c.get()).submit(scheduledDirectTask);
            } else {
                schedule = ((ScheduledExecutorService) this.f66151c.get()).schedule(scheduledDirectTask, j, timeUnit);
            }
            scheduledDirectTask.setFuture(schedule);
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.onError(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future schedule;
        Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f66151c.get();
            CallableC20817kf0 callableC20817kf0 = new CallableC20817kf0(onSchedule, scheduledExecutorService);
            try {
                if (j <= 0) {
                    schedule = scheduledExecutorService.submit(callableC20817kf0);
                } else {
                    schedule = scheduledExecutorService.schedule(callableC20817kf0, j, timeUnit);
                }
                callableC20817kf0.m29177b(schedule);
                return callableC20817kf0;
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.onError(e);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(onSchedule);
        try {
            scheduledDirectPeriodicTask.setFuture(((ScheduledExecutorService) this.f66151c.get()).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e2) {
            RxJavaPlugins.onError(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f66151c.get();
        ScheduledExecutorService scheduledExecutorService3 = f66149e;
        if (scheduledExecutorService2 != scheduledExecutorService3 && (scheduledExecutorService = (ScheduledExecutorService) this.f66151c.getAndSet(scheduledExecutorService3)) != scheduledExecutorService3) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // io.reactivex.Scheduler
    public void start() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = null;
        do {
            scheduledExecutorService = (ScheduledExecutorService) this.f66151c.get();
            if (scheduledExecutorService != f66149e) {
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorService2 == null) {
                scheduledExecutorService2 = m30229a(this.f66150b);
            }
        } while (!AbstractC23094xo1.m479a(this.f66151c, scheduledExecutorService, scheduledExecutorService2));
    }

    public SingleScheduler(ThreadFactory threadFactory) {
        AtomicReference atomicReference = new AtomicReference();
        this.f66151c = atomicReference;
        this.f66150b = threadFactory;
        atomicReference.lazySet(m30229a(threadFactory));
    }
}