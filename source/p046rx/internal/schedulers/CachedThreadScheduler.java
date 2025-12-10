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
    public static final long f79062c;

    /* renamed from: d */
    public static final TimeUnit f79063d = TimeUnit.SECONDS;

    /* renamed from: e */
    public static final C13734c f79064e;

    /* renamed from: f */
    public static final C13729a f79065f;

    /* renamed from: a */
    public final ThreadFactory f79066a;

    /* renamed from: b */
    public final AtomicReference f79067b = new AtomicReference(f79065f);

    /* renamed from: rx.internal.schedulers.CachedThreadScheduler$a */
    /* loaded from: classes7.dex */
    public static final class C13729a {

        /* renamed from: a */
        public final ThreadFactory f79068a;

        /* renamed from: b */
        public final long f79069b;

        /* renamed from: c */
        public final ConcurrentLinkedQueue f79070c;

        /* renamed from: d */
        public final CompositeSubscription f79071d;

        /* renamed from: e */
        public final ScheduledExecutorService f79072e;

        /* renamed from: f */
        public final Future f79073f;

        /* renamed from: rx.internal.schedulers.CachedThreadScheduler$a$a */
        /* loaded from: classes7.dex */
        public class ThreadFactoryC13730a implements ThreadFactory {

            /* renamed from: a */
            public final /* synthetic */ ThreadFactory f79074a;

            public ThreadFactoryC13730a(ThreadFactory threadFactory) {
                this.f79074a = threadFactory;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread newThread = this.f79074a.newThread(runnable);
                newThread.setName(newThread.getName() + " (Evictor)");
                return newThread;
            }
        }

        /* renamed from: rx.internal.schedulers.CachedThreadScheduler$a$b */
        /* loaded from: classes7.dex */
        public class RunnableC13731b implements Runnable {
            public RunnableC13731b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C13729a.this.m22924a();
            }
        }

        public C13729a(ThreadFactory threadFactory, long j, TimeUnit timeUnit) {
            long j2;
            ScheduledExecutorService scheduledExecutorService;
            ScheduledFuture<?> scheduledFuture;
            this.f79068a = threadFactory;
            if (timeUnit != null) {
                j2 = timeUnit.toNanos(j);
            } else {
                j2 = 0;
            }
            long j3 = j2;
            this.f79069b = j3;
            this.f79070c = new ConcurrentLinkedQueue();
            this.f79071d = new CompositeSubscription();
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, new ThreadFactoryC13730a(threadFactory));
                NewThreadWorker.tryEnableCancelPolicy(scheduledExecutorService);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(new RunnableC13731b(), j3, j3, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.f79072e = scheduledExecutorService;
            this.f79073f = scheduledFuture;
        }

        /* renamed from: a */
        public void m22924a() {
            if (!this.f79070c.isEmpty()) {
                long m22922c = m22922c();
                Iterator it = this.f79070c.iterator();
                while (it.hasNext()) {
                    C13734c c13734c = (C13734c) it.next();
                    if (c13734c.m22919c() <= m22922c) {
                        if (this.f79070c.remove(c13734c)) {
                            this.f79071d.remove(c13734c);
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public C13734c m22923b() {
            if (this.f79071d.isUnsubscribed()) {
                return CachedThreadScheduler.f79064e;
            }
            while (!this.f79070c.isEmpty()) {
                C13734c c13734c = (C13734c) this.f79070c.poll();
                if (c13734c != null) {
                    return c13734c;
                }
            }
            C13734c c13734c2 = new C13734c(this.f79068a);
            this.f79071d.add(c13734c2);
            return c13734c2;
        }

        /* renamed from: c */
        public long m22922c() {
            return System.nanoTime();
        }

        /* renamed from: d */
        public void m22921d(C13734c c13734c) {
            c13734c.m22918d(m22922c() + this.f79069b);
            this.f79070c.offer(c13734c);
        }

        /* renamed from: e */
        public void m22920e() {
            try {
                Future future = this.f79073f;
                if (future != null) {
                    future.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = this.f79072e;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
                this.f79071d.unsubscribe();
            } catch (Throwable th2) {
                this.f79071d.unsubscribe();
                throw th2;
            }
        }
    }

    /* renamed from: rx.internal.schedulers.CachedThreadScheduler$b */
    /* loaded from: classes7.dex */
    public static final class C13732b extends Scheduler.Worker implements Action0 {

        /* renamed from: b */
        public final C13729a f79078b;

        /* renamed from: c */
        public final C13734c f79079c;

        /* renamed from: a */
        public final CompositeSubscription f79077a = new CompositeSubscription();

        /* renamed from: d */
        public final AtomicBoolean f79080d = new AtomicBoolean();

        /* renamed from: rx.internal.schedulers.CachedThreadScheduler$b$a */
        /* loaded from: classes7.dex */
        public class C13733a implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ Action0 f79081a;

            public C13733a(Action0 action0) {
                this.f79081a = action0;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                if (C13732b.this.isUnsubscribed()) {
                    return;
                }
                this.f79081a.call();
            }
        }

        public C13732b(C13729a c13729a) {
            this.f79078b = c13729a;
            this.f79079c = c13729a.m22923b();
        }

        @Override // p046rx.functions.Action0
        public void call() {
            this.f79078b.m22921d(this.f79079c);
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f79077a.isUnsubscribed();
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            return schedule(action0, 0L, null);
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            if (this.f79080d.compareAndSet(false, true)) {
                this.f79079c.schedule(this);
            }
            this.f79077a.unsubscribe();
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            if (this.f79077a.isUnsubscribed()) {
                return Subscriptions.unsubscribed();
            }
            ScheduledAction scheduleActual = this.f79079c.scheduleActual(new C13733a(action0), j, timeUnit);
            this.f79077a.add(scheduleActual);
            scheduleActual.addParent(this.f79077a);
            return scheduleActual;
        }
    }

    /* renamed from: rx.internal.schedulers.CachedThreadScheduler$c */
    /* loaded from: classes7.dex */
    public static final class C13734c extends NewThreadWorker {

        /* renamed from: h */
        public long f79083h;

        public C13734c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f79083h = 0L;
        }

        /* renamed from: c */
        public long m22919c() {
            return this.f79083h;
        }

        /* renamed from: d */
        public void m22918d(long j) {
            this.f79083h = j;
        }
    }

    static {
        C13734c c13734c = new C13734c(RxThreadFactory.NONE);
        f79064e = c13734c;
        c13734c.unsubscribe();
        C13729a c13729a = new C13729a(null, 0L, null);
        f79065f = c13729a;
        c13729a.m22920e();
        f79062c = Integer.getInteger("rx.io-scheduler.keepalive", 60).intValue();
    }

    public CachedThreadScheduler(ThreadFactory threadFactory) {
        this.f79066a = threadFactory;
        start();
    }

    @Override // p046rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new C13732b((C13729a) this.f79067b.get());
    }

    @Override // p046rx.internal.schedulers.SchedulerLifecycle
    public void shutdown() {
        C13729a c13729a;
        C13729a c13729a2;
        do {
            c13729a = (C13729a) this.f79067b.get();
            c13729a2 = f79065f;
            if (c13729a == c13729a2) {
                return;
            }
        } while (!AbstractC17300An1.m69050a(this.f79067b, c13729a, c13729a2));
        c13729a.m22920e();
    }

    @Override // p046rx.internal.schedulers.SchedulerLifecycle
    public void start() {
        C13729a c13729a = new C13729a(this.f79066a, f79062c, f79063d);
        if (!AbstractC17300An1.m69050a(this.f79067b, f79065f, c13729a)) {
            c13729a.m22920e();
        }
    }
}
