package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class IoScheduler extends Scheduler {
    public static final long KEEP_ALIVE_TIME_DEFAULT = 60;

    /* renamed from: d */
    public static final RxThreadFactory f66045d;

    /* renamed from: e */
    public static final RxThreadFactory f66046e;

    /* renamed from: h */
    public static final C11143c f66049h;

    /* renamed from: i */
    public static final RunnableC11141a f66050i;

    /* renamed from: b */
    public final ThreadFactory f66051b;

    /* renamed from: c */
    public final AtomicReference f66052c;

    /* renamed from: g */
    public static final TimeUnit f66048g = TimeUnit.SECONDS;

    /* renamed from: f */
    public static final long f66047f = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: io.reactivex.internal.schedulers.IoScheduler$a */
    /* loaded from: classes5.dex */
    public static final class RunnableC11141a implements Runnable {

        /* renamed from: a */
        public final long f66053a;

        /* renamed from: b */
        public final ConcurrentLinkedQueue f66054b;

        /* renamed from: c */
        public final CompositeDisposable f66055c;

        /* renamed from: d */
        public final ScheduledExecutorService f66056d;

        /* renamed from: e */
        public final Future f66057e;

        /* renamed from: f */
        public final ThreadFactory f66058f;

        public RunnableC11141a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            long j2;
            ScheduledExecutorService scheduledExecutorService;
            ScheduledFuture<?> scheduledFuture;
            if (timeUnit != null) {
                j2 = timeUnit.toNanos(j);
            } else {
                j2 = 0;
            }
            long j3 = j2;
            this.f66053a = j3;
            this.f66054b = new ConcurrentLinkedQueue();
            this.f66055c = new CompositeDisposable();
            this.f66058f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, IoScheduler.f66046e);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j3, j3, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.f66056d = scheduledExecutorService;
            this.f66057e = scheduledFuture;
        }

        /* renamed from: a */
        public void m29900a() {
            if (!this.f66054b.isEmpty()) {
                long m29898c = m29898c();
                Iterator it = this.f66054b.iterator();
                while (it.hasNext()) {
                    C11143c c11143c = (C11143c) it.next();
                    if (c11143c.m29895a() <= m29898c) {
                        if (this.f66054b.remove(c11143c)) {
                            this.f66055c.remove(c11143c);
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public C11143c m29899b() {
            if (this.f66055c.isDisposed()) {
                return IoScheduler.f66049h;
            }
            while (!this.f66054b.isEmpty()) {
                C11143c c11143c = (C11143c) this.f66054b.poll();
                if (c11143c != null) {
                    return c11143c;
                }
            }
            C11143c c11143c2 = new C11143c(this.f66058f);
            this.f66055c.add(c11143c2);
            return c11143c2;
        }

        /* renamed from: c */
        public long m29898c() {
            return System.nanoTime();
        }

        /* renamed from: d */
        public void m29897d(C11143c c11143c) {
            c11143c.m29894b(m29898c() + this.f66053a);
            this.f66054b.offer(c11143c);
        }

        /* renamed from: f */
        public void m29896f() {
            this.f66055c.dispose();
            Future future = this.f66057e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f66056d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            m29900a();
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.IoScheduler$b */
    /* loaded from: classes5.dex */
    public static final class C11142b extends Scheduler.Worker {

        /* renamed from: b */
        public final RunnableC11141a f66060b;

        /* renamed from: c */
        public final C11143c f66061c;

        /* renamed from: d */
        public final AtomicBoolean f66062d = new AtomicBoolean();

        /* renamed from: a */
        public final CompositeDisposable f66059a = new CompositeDisposable();

        public C11142b(RunnableC11141a runnableC11141a) {
            this.f66060b = runnableC11141a;
            this.f66061c = runnableC11141a.m29899b();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.f66062d.compareAndSet(false, true)) {
                this.f66059a.dispose();
                this.f66060b.m29897d(this.f66061c);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f66062d.get();
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f66059a.isDisposed()) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f66061c.scheduleActual(runnable, j, timeUnit, this.f66059a);
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.IoScheduler$c */
    /* loaded from: classes5.dex */
    public static final class C11143c extends NewThreadWorker {

        /* renamed from: c */
        public long f66063c;

        public C11143c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f66063c = 0L;
        }

        /* renamed from: a */
        public long m29895a() {
            return this.f66063c;
        }

        /* renamed from: b */
        public void m29894b(long j) {
            this.f66063c = j;
        }
    }

    static {
        C11143c c11143c = new C11143c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f66049h = c11143c;
        c11143c.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", max);
        f66045d = rxThreadFactory;
        f66046e = new RxThreadFactory("RxCachedWorkerPoolEvictor", max);
        RunnableC11141a runnableC11141a = new RunnableC11141a(0L, null, rxThreadFactory);
        f66050i = runnableC11141a;
        runnableC11141a.m29896f();
    }

    public IoScheduler() {
        this(f66045d);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new C11142b((RunnableC11141a) this.f66052c.get());
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        RunnableC11141a runnableC11141a;
        RunnableC11141a runnableC11141a2;
        do {
            runnableC11141a = (RunnableC11141a) this.f66052c.get();
            runnableC11141a2 = f66050i;
            if (runnableC11141a == runnableC11141a2) {
                return;
            }
        } while (!AbstractC17300An1.m69050a(this.f66052c, runnableC11141a, runnableC11141a2));
        runnableC11141a.m29896f();
    }

    public int size() {
        return ((RunnableC11141a) this.f66052c.get()).f66055c.size();
    }

    @Override // io.reactivex.Scheduler
    public void start() {
        RunnableC11141a runnableC11141a = new RunnableC11141a(f66047f, f66048g, this.f66051b);
        if (!AbstractC17300An1.m69050a(this.f66052c, f66050i, runnableC11141a)) {
            runnableC11141a.m29896f();
        }
    }

    public IoScheduler(ThreadFactory threadFactory) {
        this.f66051b = threadFactory;
        this.f66052c = new AtomicReference(f66050i);
        start();
    }
}
