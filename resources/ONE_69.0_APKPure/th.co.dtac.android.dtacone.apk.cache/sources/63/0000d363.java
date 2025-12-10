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
    public static final RxThreadFactory f66108d;

    /* renamed from: e */
    public static final RxThreadFactory f66109e;

    /* renamed from: h */
    public static final C11130c f66112h;

    /* renamed from: i */
    public static final RunnableC11128a f66113i;

    /* renamed from: b */
    public final ThreadFactory f66114b;

    /* renamed from: c */
    public final AtomicReference f66115c;

    /* renamed from: g */
    public static final TimeUnit f66111g = TimeUnit.SECONDS;

    /* renamed from: f */
    public static final long f66110f = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: io.reactivex.internal.schedulers.IoScheduler$a */
    /* loaded from: classes5.dex */
    public static final class RunnableC11128a implements Runnable {

        /* renamed from: a */
        public final long f66116a;

        /* renamed from: b */
        public final ConcurrentLinkedQueue f66117b;

        /* renamed from: c */
        public final CompositeDisposable f66118c;

        /* renamed from: d */
        public final ScheduledExecutorService f66119d;

        /* renamed from: e */
        public final Future f66120e;

        /* renamed from: f */
        public final ThreadFactory f66121f;

        public RunnableC11128a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            long j2;
            ScheduledExecutorService scheduledExecutorService;
            ScheduledFuture<?> scheduledFuture;
            if (timeUnit != null) {
                j2 = timeUnit.toNanos(j);
            } else {
                j2 = 0;
            }
            long j3 = j2;
            this.f66116a = j3;
            this.f66117b = new ConcurrentLinkedQueue();
            this.f66118c = new CompositeDisposable();
            this.f66121f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, IoScheduler.f66109e);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j3, j3, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.f66119d = scheduledExecutorService;
            this.f66120e = scheduledFuture;
        }

        /* renamed from: a */
        public void m30240a() {
            if (!this.f66117b.isEmpty()) {
                long m30238c = m30238c();
                Iterator it = this.f66117b.iterator();
                while (it.hasNext()) {
                    C11130c c11130c = (C11130c) it.next();
                    if (c11130c.m30235a() <= m30238c) {
                        if (this.f66117b.remove(c11130c)) {
                            this.f66118c.remove(c11130c);
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public C11130c m30239b() {
            if (this.f66118c.isDisposed()) {
                return IoScheduler.f66112h;
            }
            while (!this.f66117b.isEmpty()) {
                C11130c c11130c = (C11130c) this.f66117b.poll();
                if (c11130c != null) {
                    return c11130c;
                }
            }
            C11130c c11130c2 = new C11130c(this.f66121f);
            this.f66118c.add(c11130c2);
            return c11130c2;
        }

        /* renamed from: c */
        public long m30238c() {
            return System.nanoTime();
        }

        /* renamed from: d */
        public void m30237d(C11130c c11130c) {
            c11130c.m30234b(m30238c() + this.f66116a);
            this.f66117b.offer(c11130c);
        }

        /* renamed from: f */
        public void m30236f() {
            this.f66118c.dispose();
            Future future = this.f66120e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f66119d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            m30240a();
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.IoScheduler$b */
    /* loaded from: classes5.dex */
    public static final class C11129b extends Scheduler.Worker {

        /* renamed from: b */
        public final RunnableC11128a f66123b;

        /* renamed from: c */
        public final C11130c f66124c;

        /* renamed from: d */
        public final AtomicBoolean f66125d = new AtomicBoolean();

        /* renamed from: a */
        public final CompositeDisposable f66122a = new CompositeDisposable();

        public C11129b(RunnableC11128a runnableC11128a) {
            this.f66123b = runnableC11128a;
            this.f66124c = runnableC11128a.m30239b();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.f66125d.compareAndSet(false, true)) {
                this.f66122a.dispose();
                this.f66123b.m30237d(this.f66124c);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f66125d.get();
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f66122a.isDisposed()) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f66124c.scheduleActual(runnable, j, timeUnit, this.f66122a);
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.IoScheduler$c */
    /* loaded from: classes5.dex */
    public static final class C11130c extends NewThreadWorker {

        /* renamed from: c */
        public long f66126c;

        public C11130c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f66126c = 0L;
        }

        /* renamed from: a */
        public long m30235a() {
            return this.f66126c;
        }

        /* renamed from: b */
        public void m30234b(long j) {
            this.f66126c = j;
        }
    }

    static {
        C11130c c11130c = new C11130c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f66112h = c11130c;
        c11130c.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", max);
        f66108d = rxThreadFactory;
        f66109e = new RxThreadFactory("RxCachedWorkerPoolEvictor", max);
        RunnableC11128a runnableC11128a = new RunnableC11128a(0L, null, rxThreadFactory);
        f66113i = runnableC11128a;
        runnableC11128a.m30236f();
    }

    public IoScheduler() {
        this(f66108d);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new C11129b((RunnableC11128a) this.f66115c.get());
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        RunnableC11128a runnableC11128a;
        RunnableC11128a runnableC11128a2;
        do {
            runnableC11128a = (RunnableC11128a) this.f66115c.get();
            runnableC11128a2 = f66113i;
            if (runnableC11128a == runnableC11128a2) {
                return;
            }
        } while (!AbstractC23094xo1.m479a(this.f66115c, runnableC11128a, runnableC11128a2));
        runnableC11128a.m30236f();
    }

    public int size() {
        return ((RunnableC11128a) this.f66115c.get()).f66118c.size();
    }

    @Override // io.reactivex.Scheduler
    public void start() {
        RunnableC11128a runnableC11128a = new RunnableC11128a(f66110f, f66111g, this.f66114b);
        if (!AbstractC23094xo1.m479a(this.f66115c, f66113i, runnableC11128a)) {
            runnableC11128a.m30236f();
        }
    }

    public IoScheduler(ThreadFactory threadFactory) {
        this.f66114b = threadFactory;
        this.f66115c = new AtomicReference(f66113i);
        start();
    }
}