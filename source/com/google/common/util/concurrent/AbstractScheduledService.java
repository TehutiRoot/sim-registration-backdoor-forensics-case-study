package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.AbstractScheduledService;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.cli.HelpFormatter;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public abstract class AbstractScheduledService implements Service {

    /* renamed from: b */
    public static final C23005xi0 f54186b = new C23005xi0(AbstractScheduledService.class);

    /* renamed from: a */
    public final AbstractService f54187a = new C8202e(this, null);

    /* loaded from: classes4.dex */
    public static abstract class CustomScheduler extends Scheduler {

        /* loaded from: classes4.dex */
        public static final class Schedule {

            /* renamed from: a */
            public final long f54188a;

            /* renamed from: b */
            public final TimeUnit f54189b;

            public Schedule(long j, TimeUnit timeUnit) {
                this.f54188a = j;
                this.f54189b = (TimeUnit) Preconditions.checkNotNull(timeUnit);
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$CustomScheduler$a */
        /* loaded from: classes4.dex */
        public final class CallableC8194a implements Callable {

            /* renamed from: a */
            public final Runnable f54190a;

            /* renamed from: b */
            public final ScheduledExecutorService f54191b;

            /* renamed from: c */
            public final AbstractService f54192c;

            /* renamed from: d */
            public final ReentrantLock f54193d = new ReentrantLock();

            /* renamed from: e */
            public C8195b f54194e;

            public CallableC8194a(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                CustomScheduler.this = r1;
                this.f54190a = runnable;
                this.f54191b = scheduledExecutorService;
                this.f54192c = abstractService;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Void call() {
                this.f54190a.run();
                m39643c();
                return null;
            }

            /* renamed from: b */
            public final InterfaceC8200c m39644b(Schedule schedule) {
                C8195b c8195b = this.f54194e;
                if (c8195b == null) {
                    C8195b c8195b2 = new C8195b(this.f54193d, m39642d(schedule));
                    this.f54194e = c8195b2;
                    return c8195b2;
                }
                if (!c8195b.f54197b.isCancelled()) {
                    this.f54194e.f54197b = m39642d(schedule);
                }
                return this.f54194e;
            }

            /* renamed from: c */
            public InterfaceC8200c m39643c() {
                InterfaceC8200c c8201d;
                try {
                    Schedule nextSchedule = CustomScheduler.this.getNextSchedule();
                    this.f54193d.lock();
                    try {
                        c8201d = m39644b(nextSchedule);
                        this.f54193d.unlock();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            c8201d = new C8201d(Futures.immediateCancelledFuture());
                        } finally {
                            this.f54193d.unlock();
                        }
                    }
                    if (th != null) {
                        this.f54192c.notifyFailed(th);
                    }
                    return c8201d;
                } catch (Throwable th3) {
                    AbstractC17420Ck1.m68741b(th3);
                    this.f54192c.notifyFailed(th3);
                    return new C8201d(Futures.immediateCancelledFuture());
                }
            }

            /* renamed from: d */
            public final ScheduledFuture m39642d(Schedule schedule) {
                return this.f54191b.schedule(this, schedule.f54188a, schedule.f54189b);
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$CustomScheduler$b */
        /* loaded from: classes4.dex */
        public static final class C8195b implements InterfaceC8200c {

            /* renamed from: a */
            public final ReentrantLock f54196a;

            /* renamed from: b */
            public Future f54197b;

            public C8195b(ReentrantLock reentrantLock, Future future) {
                this.f54196a = reentrantLock;
                this.f54197b = future;
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.InterfaceC8200c
            public void cancel(boolean z) {
                this.f54196a.lock();
                try {
                    this.f54197b.cancel(z);
                } finally {
                    this.f54196a.unlock();
                }
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.InterfaceC8200c
            public boolean isCancelled() {
                this.f54196a.lock();
                try {
                    return this.f54197b.isCancelled();
                } finally {
                    this.f54196a.unlock();
                }
            }
        }

        public CustomScheduler() {
            super(null);
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
        /* renamed from: a */
        public final InterfaceC8200c mo39639a(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
            return new CallableC8194a(abstractService, scheduledExecutorService, runnable).m39643c();
        }

        public abstract Schedule getNextSchedule() throws Exception;
    }

    /* loaded from: classes4.dex */
    public static abstract class Scheduler {

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$Scheduler$a */
        /* loaded from: classes4.dex */
        public class C8196a extends Scheduler {

            /* renamed from: a */
            public final /* synthetic */ long f54198a;

            /* renamed from: b */
            public final /* synthetic */ long f54199b;

            /* renamed from: c */
            public final /* synthetic */ TimeUnit f54200c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8196a(long j, long j2, TimeUnit timeUnit) {
                super(null);
                this.f54198a = j;
                this.f54199b = j2;
                this.f54200c = timeUnit;
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
            /* renamed from: a */
            public InterfaceC8200c mo39639a(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                return new C8201d(scheduledExecutorService.scheduleWithFixedDelay(runnable, this.f54198a, this.f54199b, this.f54200c));
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$Scheduler$b */
        /* loaded from: classes4.dex */
        public class C8197b extends Scheduler {

            /* renamed from: a */
            public final /* synthetic */ long f54201a;

            /* renamed from: b */
            public final /* synthetic */ long f54202b;

            /* renamed from: c */
            public final /* synthetic */ TimeUnit f54203c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8197b(long j, long j2, TimeUnit timeUnit) {
                super(null);
                this.f54201a = j;
                this.f54202b = j2;
                this.f54203c = timeUnit;
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
            /* renamed from: a */
            public InterfaceC8200c mo39639a(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                return new C8201d(scheduledExecutorService.scheduleAtFixedRate(runnable, this.f54201a, this.f54202b, this.f54203c));
            }
        }

        public /* synthetic */ Scheduler(C8198a c8198a) {
            this();
        }

        public static Scheduler newFixedDelaySchedule(long j, long j2, TimeUnit timeUnit) {
            boolean z;
            Preconditions.checkNotNull(timeUnit);
            if (j2 > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "delay must be > 0, found %s", j2);
            return new C8196a(j, j2, timeUnit);
        }

        public static Scheduler newFixedRateSchedule(long j, long j2, TimeUnit timeUnit) {
            boolean z;
            Preconditions.checkNotNull(timeUnit);
            if (j2 > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "period must be > 0, found %s", j2);
            return new C8197b(j, j2, timeUnit);
        }

        /* renamed from: a */
        public abstract InterfaceC8200c mo39639a(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable);

        public Scheduler() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$a */
    /* loaded from: classes4.dex */
    public class C8198a extends Service.Listener {

        /* renamed from: a */
        public final /* synthetic */ ScheduledExecutorService f54204a;

        /* renamed from: b */
        public final /* synthetic */ AbstractScheduledService f54205b;

        public C8198a(AbstractScheduledService abstractScheduledService, ScheduledExecutorService scheduledExecutorService) {
            this.f54204a = scheduledExecutorService;
            this.f54205b = abstractScheduledService;
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void failed(Service.State state, Throwable th2) {
            this.f54204a.shutdown();
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void terminated(Service.State state) {
            this.f54204a.shutdown();
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$b */
    /* loaded from: classes4.dex */
    public class ThreadFactoryC8199b implements ThreadFactory {
        public ThreadFactoryC8199b() {
            AbstractScheduledService.this = r1;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return MoreExecutors.m39476c(AbstractScheduledService.this.serviceName(), runnable);
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC8200c {
        void cancel(boolean z);

        boolean isCancelled();
    }

    /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$d */
    /* loaded from: classes4.dex */
    public static final class C8201d implements InterfaceC8200c {

        /* renamed from: a */
        public final Future f54207a;

        public C8201d(Future future) {
            this.f54207a = future;
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.InterfaceC8200c
        public void cancel(boolean z) {
            this.f54207a.cancel(z);
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.InterfaceC8200c
        public boolean isCancelled() {
            return this.f54207a.isCancelled();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.f54187a.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.f54187a.awaitRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.f54187a.awaitTerminated();
    }

    public ScheduledExecutorService executor() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC8199b());
        addListener(new C8198a(this, newSingleThreadScheduledExecutor), MoreExecutors.directExecutor());
        return newSingleThreadScheduledExecutor;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.f54187a.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.f54187a.isRunning();
    }

    public abstract void runOneIteration() throws Exception;

    public abstract Scheduler scheduler();

    public String serviceName() {
        return getClass().getSimpleName();
    }

    public void shutDown() throws Exception {
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
        this.f54187a.startAsync();
        return this;
    }

    public void startUp() throws Exception {
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.f54187a.state();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() {
        this.f54187a.stopAsync();
        return this;
    }

    public String toString() {
        return serviceName() + " [" + state() + "]";
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f54187a.awaitRunning(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f54187a.awaitTerminated(j, timeUnit);
    }

    /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$e */
    /* loaded from: classes4.dex */
    public final class C8202e extends AbstractService {

        /* renamed from: p */
        public volatile InterfaceC8200c f54208p;

        /* renamed from: q */
        public volatile ScheduledExecutorService f54209q;

        /* renamed from: r */
        public final ReentrantLock f54210r;

        /* renamed from: s */
        public final Runnable f54211s;

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$e$a */
        /* loaded from: classes4.dex */
        public class RunnableC8203a implements Runnable {
            public RunnableC8203a() {
                C8202e.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC8200c interfaceC8200c;
                C8202e.this.f54210r.lock();
                try {
                    interfaceC8200c = C8202e.this.f54208p;
                    Objects.requireNonNull(interfaceC8200c);
                } finally {
                    try {
                    } finally {
                    }
                }
                if (interfaceC8200c.isCancelled()) {
                    return;
                }
                AbstractScheduledService.this.runOneIteration();
            }
        }

        public C8202e() {
            AbstractScheduledService.this = r1;
            this.f54210r = new ReentrantLock();
            this.f54211s = new RunnableC8203a();
        }

        /* renamed from: k */
        public static /* synthetic */ String m39638k(C8202e c8202e) {
            return c8202e.m39633p();
        }

        /* renamed from: l */
        public static /* synthetic */ void m39637l(C8202e c8202e) {
            c8202e.m39632q();
        }

        /* renamed from: m */
        public static /* synthetic */ void m39636m(C8202e c8202e) {
            c8202e.m39631r();
        }

        /* renamed from: p */
        public /* synthetic */ String m39633p() {
            return AbstractScheduledService.this.serviceName() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + state();
        }

        /* renamed from: q */
        public /* synthetic */ void m39632q() {
            this.f54210r.lock();
            try {
                AbstractScheduledService.this.startUp();
                Objects.requireNonNull(this.f54209q);
                this.f54208p = AbstractScheduledService.this.scheduler().mo39639a(AbstractScheduledService.this.f54187a, this.f54209q, this.f54211s);
                notifyStarted();
            } finally {
                try {
                } finally {
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStart() {
            this.f54209q = MoreExecutors.m39473f(AbstractScheduledService.this.executor(), new Supplier() { // from class: q0
                {
                    AbstractScheduledService.C8202e.this = this;
                }

                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return AbstractScheduledService.C8202e.m39638k(AbstractScheduledService.C8202e.this);
                }
            });
            this.f54209q.execute(new Runnable() { // from class: r0
                {
                    AbstractScheduledService.C8202e.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractScheduledService.C8202e.m39637l(AbstractScheduledService.C8202e.this);
                }
            });
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStop() {
            Objects.requireNonNull(this.f54208p);
            Objects.requireNonNull(this.f54209q);
            this.f54208p.cancel(false);
            this.f54209q.execute(new Runnable() { // from class: s0
                {
                    AbstractScheduledService.C8202e.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractScheduledService.C8202e.m39636m(AbstractScheduledService.C8202e.this);
                }
            });
        }

        /* renamed from: r */
        public final /* synthetic */ void m39631r() {
            try {
                this.f54210r.lock();
                if (state() != Service.State.STOPPING) {
                    this.f54210r.unlock();
                    return;
                }
                AbstractScheduledService.this.shutDown();
                this.f54210r.unlock();
                notifyStopped();
            } catch (Throwable th2) {
                AbstractC17420Ck1.m68741b(th2);
                notifyFailed(th2);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return AbstractScheduledService.this.toString();
        }

        public /* synthetic */ C8202e(AbstractScheduledService abstractScheduledService, C8198a c8198a) {
            this();
        }
    }
}
