package p046rx.internal.schedulers;

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
import p046rx.Scheduler;
import p046rx.Subscription;
import p046rx.functions.Action0;
import p046rx.internal.util.RxThreadFactory;
import p046rx.subscriptions.CompositeSubscription;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.schedulers.CachedThreadScheduler */
/* loaded from: classes7.dex */
public final class CachedThreadScheduler extends Scheduler implements SchedulerLifecycle {

    /* renamed from: c */
    public static final long f79268c;

    /* renamed from: d */
    public static final TimeUnit f79269d = TimeUnit.SECONDS;

    /* renamed from: e */
    public static final C13735c f79270e;

    /* renamed from: f */
    public static final C13730a f79271f;

    /* renamed from: a */
    public final ThreadFactory f79272a;

    /* renamed from: b */
    public final AtomicReference f79273b = new AtomicReference(f79271f);

    /* renamed from: rx.internal.schedulers.CachedThreadScheduler$a */
    /* loaded from: classes7.dex */
    public static final class C13730a {

        /* renamed from: a */
        public final ThreadFactory f79274a;

        /* renamed from: b */
        public final long f79275b;

        /* renamed from: c */
        public final ConcurrentLinkedQueue f79276c;

        /* renamed from: d */
        public final CompositeSubscription f79277d;

        /* renamed from: e */
        public final ScheduledExecutorService f79278e;

        /* renamed from: f */
        public final Future f79279f;

        /* renamed from: rx.internal.schedulers.CachedThreadScheduler$a$a */
        /* loaded from: classes7.dex */
        public class ThreadFactoryC13731a implements ThreadFactory {

            /* renamed from: a */
            public final /* synthetic */ ThreadFactory f79280a;

            public ThreadFactoryC13731a(ThreadFactory threadFactory) {
                this.f79280a = threadFactory;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread newThread = this.f79280a.newThread(runnable);
                newThread.setName(newThread.getName() + " (Evictor)");
                return newThread;
            }
        }

        /* renamed from: rx.internal.schedulers.CachedThreadScheduler$a$b */
        /* loaded from: classes7.dex */
        public class RunnableC13732b implements Runnable {
            public RunnableC13732b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C13730a.this.m23112a();
            }
        }

        public C13730a(ThreadFactory threadFactory, long j, TimeUnit timeUnit) {
            long j2;
            ScheduledExecutorService scheduledExecutorService;
            ScheduledFuture<?> scheduledFuture;
            this.f79274a = threadFactory;
            if (timeUnit != null) {
                j2 = timeUnit.toNanos(j);
            } else {
                j2 = 0;
            }
            long j3 = j2;
            this.f79275b = j3;
            this.f79276c = new ConcurrentLinkedQueue();
            this.f79277d = new CompositeSubscription();
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, new ThreadFactoryC13731a(threadFactory));
                NewThreadWorker.tryEnableCancelPolicy(scheduledExecutorService);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(new RunnableC13732b(), j3, j3, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.f79278e = scheduledExecutorService;
            this.f79279f = scheduledFuture;
        }

        /* renamed from: a */
        public void m23112a() {
            if (!this.f79276c.isEmpty()) {
                long m23110c = m23110c();
                Iterator it = this.f79276c.iterator();
                while (it.hasNext()) {
                    C13735c c13735c = (C13735c) it.next();
                    if (c13735c.m23107c() <= m23110c) {
                        if (this.f79276c.remove(c13735c)) {
                            this.f79277d.remove(c13735c);
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public C13735c m23111b() {
            if (this.f79277d.isUnsubscribed()) {
                return CachedThreadScheduler.f79270e;
            }
            while (!this.f79276c.isEmpty()) {
                C13735c c13735c = (C13735c) this.f79276c.poll();
                if (c13735c != null) {
                    return c13735c;
                }
            }
            C13735c c13735c2 = new C13735c(this.f79274a);
            this.f79277d.add(c13735c2);
            return c13735c2;
        }

        /* renamed from: c */
        public long m23110c() {
            return System.nanoTime();
        }

        /* renamed from: d */
        public void m23109d(C13735c c13735c) {
            c13735c.m23106d(m23110c() + this.f79275b);
            this.f79276c.offer(c13735c);
        }

        /* renamed from: e */
        public void m23108e() {
            try {
                Future future = this.f79279f;
                if (future != null) {
                    future.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = this.f79278e;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
                this.f79277d.unsubscribe();
            } catch (Throwable th2) {
                this.f79277d.unsubscribe();
                throw th2;
            }
        }
    }

    /* renamed from: rx.internal.schedulers.CachedThreadScheduler$b */
    /* loaded from: classes7.dex */
    public static final class C13733b extends Scheduler.Worker implements Action0 {

        /* renamed from: b */
        public final C13730a f79284b;

        /* renamed from: c */
        public final C13735c f79285c;

        /* renamed from: a */
        public final CompositeSubscription f79283a = new CompositeSubscription();

        /* renamed from: d */
        public final AtomicBoolean f79286d = new AtomicBoolean();

        /* renamed from: rx.internal.schedulers.CachedThreadScheduler$b$a */
        /* loaded from: classes7.dex */
        public class C13734a implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ Action0 f79287a;

            public C13734a(Action0 action0) {
                this.f79287a = action0;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                if (C13733b.this.isUnsubscribed()) {
                    return;
                }
                this.f79287a.call();
            }
        }

        public C13733b(C13730a c13730a) {
            this.f79284b = c13730a;
            this.f79285c = c13730a.m23111b();
        }

        @Override // p046rx.functions.Action0
        public void call() {
            this.f79284b.m23109d(this.f79285c);
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f79283a.isUnsubscribed();
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            return schedule(action0, 0L, null);
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            if (this.f79286d.compareAndSet(false, true)) {
                this.f79285c.schedule(this);
            }
            this.f79283a.unsubscribe();
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            if (this.f79283a.isUnsubscribed()) {
                return Subscriptions.unsubscribed();
            }
            ScheduledAction scheduleActual = this.f79285c.scheduleActual(new C13734a(action0), j, timeUnit);
            this.f79283a.add(scheduleActual);
            scheduleActual.addParent(this.f79283a);
            return scheduleActual;
        }
    }

    /* renamed from: rx.internal.schedulers.CachedThreadScheduler$c */
    /* loaded from: classes7.dex */
    public static final class C13735c extends NewThreadWorker {

        /* renamed from: h */
        public long f79289h;

        public C13735c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f79289h = 0L;
        }

        /* renamed from: c */
        public long m23107c() {
            return this.f79289h;
        }

        /* renamed from: d */
        public void m23106d(long j) {
            this.f79289h = j;
        }
    }

    static {
        C13735c c13735c = new C13735c(RxThreadFactory.NONE);
        f79270e = c13735c;
        c13735c.unsubscribe();
        C13730a c13730a = new C13730a(null, 0L, null);
        f79271f = c13730a;
        c13730a.m23108e();
        f79268c = Integer.getInteger("rx.io-scheduler.keepalive", 60).intValue();
    }

    public CachedThreadScheduler(ThreadFactory threadFactory) {
        this.f79272a = threadFactory;
        start();
    }

    @Override // p046rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new C13733b((C13730a) this.f79273b.get());
    }

    @Override // p046rx.internal.schedulers.SchedulerLifecycle
    public void shutdown() {
        C13730a c13730a;
        C13730a c13730a2;
        do {
            c13730a = (C13730a) this.f79273b.get();
            c13730a2 = f79271f;
            if (c13730a == c13730a2) {
                return;
            }
        } while (!AbstractC23094xo1.m479a(this.f79273b, c13730a, c13730a2));
        c13730a.m23108e();
    }

    @Override // p046rx.internal.schedulers.SchedulerLifecycle
    public void start() {
        C13730a c13730a = new C13730a(this.f79272a, f79268c, f79269d);
        if (!AbstractC23094xo1.m479a(this.f79273b, f79271f, c13730a)) {
            c13730a.m23108e();
        }
    }
}