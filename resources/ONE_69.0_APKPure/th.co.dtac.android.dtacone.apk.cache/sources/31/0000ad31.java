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
    public static final C17503Di0 f54198b = new C17503Di0(AbstractScheduledService.class);

    /* renamed from: a */
    public final AbstractService f54199a = new C8191e(this, null);

    /* loaded from: classes4.dex */
    public static abstract class CustomScheduler extends Scheduler {

        /* loaded from: classes4.dex */
        public static final class Schedule {

            /* renamed from: a */
            public final long f54200a;

            /* renamed from: b */
            public final TimeUnit f54201b;

            public Schedule(long j, TimeUnit timeUnit) {
                this.f54200a = j;
                this.f54201b = (TimeUnit) Preconditions.checkNotNull(timeUnit);
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$CustomScheduler$a */
        /* loaded from: classes4.dex */
        public final class CallableC8183a implements Callable {

            /* renamed from: a */
            public final Runnable f54202a;

            /* renamed from: b */
            public final ScheduledExecutorService f54203b;

            /* renamed from: c */
            public final AbstractService f54204c;

            /* renamed from: d */
            public final ReentrantLock f54205d = new ReentrantLock();

            /* renamed from: e */
            public C8184b f54206e;

            public CallableC8183a(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                CustomScheduler.this = r1;
                this.f54202a = runnable;
                this.f54203b = scheduledExecutorService;
                this.f54204c = abstractService;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Void call() {
                this.f54202a.run();
                m39635c();
                return null;
            }

            /* renamed from: b */
            public final InterfaceC8189c m39636b(Schedule schedule) {
                C8184b c8184b = this.f54206e;
                if (c8184b == null) {
                    C8184b c8184b2 = new C8184b(this.f54205d, m39634d(schedule));
                    this.f54206e = c8184b2;
                    return c8184b2;
                }
                if (!c8184b.f54209b.isCancelled()) {
                    this.f54206e.f54209b = m39634d(schedule);
                }
                return this.f54206e;
            }

            /* renamed from: c */
            public InterfaceC8189c m39635c() {
                InterfaceC8189c c8190d;
                try {
                    Schedule nextSchedule = CustomScheduler.this.getNextSchedule();
                    this.f54205d.lock();
                    try {
                        c8190d = m39636b(nextSchedule);
                        this.f54205d.unlock();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            c8190d = new C8190d(Futures.immediateCancelledFuture());
                        } finally {
                            this.f54205d.unlock();
                        }
                    }
                    if (th != null) {
                        this.f54204c.notifyFailed(th);
                    }
                    return c8190d;
                } catch (Throwable th3) {
                    AbstractC23431zl1.m74b(th3);
                    this.f54204c.notifyFailed(th3);
                    return new C8190d(Futures.immediateCancelledFuture());
                }
            }

            /* renamed from: d */
            public final ScheduledFuture m39634d(Schedule schedule) {
                return this.f54203b.schedule(this, schedule.f54200a, schedule.f54201b);
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$CustomScheduler$b */
        /* loaded from: classes4.dex */
        public static final class C8184b implements InterfaceC8189c {

            /* renamed from: a */
            public final ReentrantLock f54208a;

            /* renamed from: b */
            public Future f54209b;

            public C8184b(ReentrantLock reentrantLock, Future future) {
                this.f54208a = reentrantLock;
                this.f54209b = future;
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.InterfaceC8189c
            public void cancel(boolean z) {
                this.f54208a.lock();
                try {
                    this.f54209b.cancel(z);
                } finally {
                    this.f54208a.unlock();
                }
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.InterfaceC8189c
            public boolean isCancelled() {
                this.f54208a.lock();
                try {
                    return this.f54209b.isCancelled();
                } finally {
                    this.f54208a.unlock();
                }
            }
        }

        public CustomScheduler() {
            super(null);
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
        /* renamed from: a */
        public final InterfaceC8189c mo39631a(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
            return new CallableC8183a(abstractService, scheduledExecutorService, runnable).m39635c();
        }

        public abstract Schedule getNextSchedule() throws Exception;
    }

    /* loaded from: classes4.dex */
    public static abstract class Scheduler {

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$Scheduler$a */
        /* loaded from: classes4.dex */
        public class C8185a extends Scheduler {

            /* renamed from: a */
            public final /* synthetic */ long f54210a;

            /* renamed from: b */
            public final /* synthetic */ long f54211b;

            /* renamed from: c */
            public final /* synthetic */ TimeUnit f54212c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8185a(long j, long j2, TimeUnit timeUnit) {
                super(null);
                this.f54210a = j;
                this.f54211b = j2;
                this.f54212c = timeUnit;
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
            /* renamed from: a */
            public InterfaceC8189c mo39631a(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                return new C8190d(scheduledExecutorService.scheduleWithFixedDelay(runnable, this.f54210a, this.f54211b, this.f54212c));
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$Scheduler$b */
        /* loaded from: classes4.dex */
        public class C8186b extends Scheduler {

            /* renamed from: a */
            public final /* synthetic */ long f54213a;

            /* renamed from: b */
            public final /* synthetic */ long f54214b;

            /* renamed from: c */
            public final /* synthetic */ TimeUnit f54215c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8186b(long j, long j2, TimeUnit timeUnit) {
                super(null);
                this.f54213a = j;
                this.f54214b = j2;
                this.f54215c = timeUnit;
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
            /* renamed from: a */
            public InterfaceC8189c mo39631a(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                return new C8190d(scheduledExecutorService.scheduleAtFixedRate(runnable, this.f54213a, this.f54214b, this.f54215c));
            }
        }

        public /* synthetic */ Scheduler(C8187a c8187a) {
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
            return new C8185a(j, j2, timeUnit);
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
            return new C8186b(j, j2, timeUnit);
        }

        /* renamed from: a */
        public abstract InterfaceC8189c mo39631a(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable);

        public Scheduler() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$a */
    /* loaded from: classes4.dex */
    public class C8187a extends Service.Listener {

        /* renamed from: a */
        public final /* synthetic */ ScheduledExecutorService f54216a;

        /* renamed from: b */
        public final /* synthetic */ AbstractScheduledService f54217b;

        public C8187a(AbstractScheduledService abstractScheduledService, ScheduledExecutorService scheduledExecutorService) {
            this.f54216a = scheduledExecutorService;
            this.f54217b = abstractScheduledService;
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void failed(Service.State state, Throwable th2) {
            this.f54216a.shutdown();
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void terminated(Service.State state) {
            this.f54216a.shutdown();
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$b */
    /* loaded from: classes4.dex */
    public class ThreadFactoryC8188b implements ThreadFactory {
        public ThreadFactoryC8188b() {
            AbstractScheduledService.this = r1;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return MoreExecutors.m39468c(AbstractScheduledService.this.serviceName(), runnable);
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC8189c {
        void cancel(boolean z);

        boolean isCancelled();
    }

    /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$d */
    /* loaded from: classes4.dex */
    public static final class C8190d implements InterfaceC8189c {

        /* renamed from: a */
        public final Future f54219a;

        public C8190d(Future future) {
            this.f54219a = future;
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.InterfaceC8189c
        public void cancel(boolean z) {
            this.f54219a.cancel(z);
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.InterfaceC8189c
        public boolean isCancelled() {
            return this.f54219a.isCancelled();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.f54199a.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.f54199a.awaitRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.f54199a.awaitTerminated();
    }

    public ScheduledExecutorService executor() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC8188b());
        addListener(new C8187a(this, newSingleThreadScheduledExecutor), MoreExecutors.directExecutor());
        return newSingleThreadScheduledExecutor;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.f54199a.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.f54199a.isRunning();
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
        this.f54199a.startAsync();
        return this;
    }

    public void startUp() throws Exception {
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.f54199a.state();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() {
        this.f54199a.stopAsync();
        return this;
    }

    public String toString() {
        return serviceName() + " [" + state() + "]";
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f54199a.awaitRunning(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f54199a.awaitTerminated(j, timeUnit);
    }

    /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$e */
    /* loaded from: classes4.dex */
    public final class C8191e extends AbstractService {

        /* renamed from: p */
        public volatile InterfaceC8189c f54220p;

        /* renamed from: q */
        public volatile ScheduledExecutorService f54221q;

        /* renamed from: r */
        public final ReentrantLock f54222r;

        /* renamed from: s */
        public final Runnable f54223s;

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$e$a */
        /* loaded from: classes4.dex */
        public class RunnableC8192a implements Runnable {
            public RunnableC8192a() {
                C8191e.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC8189c interfaceC8189c;
                C8191e.this.f54222r.lock();
                try {
                    interfaceC8189c = C8191e.this.f54220p;
                    Objects.requireNonNull(interfaceC8189c);
                } finally {
                    try {
                    } finally {
                    }
                }
                if (interfaceC8189c.isCancelled()) {
                    return;
                }
                AbstractScheduledService.this.runOneIteration();
            }
        }

        public C8191e() {
            AbstractScheduledService.this = r1;
            this.f54222r = new ReentrantLock();
            this.f54223s = new RunnableC8192a();
        }

        /* renamed from: k */
        public static /* synthetic */ String m39630k(C8191e c8191e) {
            return c8191e.m39625p();
        }

        /* renamed from: l */
        public static /* synthetic */ void m39629l(C8191e c8191e) {
            c8191e.m39624q();
        }

        /* renamed from: m */
        public static /* synthetic */ void m39628m(C8191e c8191e) {
            c8191e.m39623r();
        }

        /* renamed from: p */
        public /* synthetic */ String m39625p() {
            return AbstractScheduledService.this.serviceName() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + state();
        }

        /* renamed from: q */
        public /* synthetic */ void m39624q() {
            this.f54222r.lock();
            try {
                AbstractScheduledService.this.startUp();
                Objects.requireNonNull(this.f54221q);
                this.f54220p = AbstractScheduledService.this.scheduler().mo39631a(AbstractScheduledService.this.f54199a, this.f54221q, this.f54223s);
                notifyStarted();
            } finally {
                try {
                } finally {
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStart() {
            this.f54221q = MoreExecutors.m39465f(AbstractScheduledService.this.executor(), new Supplier() { // from class: q0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return AbstractScheduledService.C8191e.m39630k(AbstractScheduledService.C8191e.this);
                }
            });
            this.f54221q.execute(new Runnable() { // from class: r0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractScheduledService.C8191e.m39629l(AbstractScheduledService.C8191e.this);
                }
            });
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStop() {
            Objects.requireNonNull(this.f54220p);
            Objects.requireNonNull(this.f54221q);
            this.f54220p.cancel(false);
            this.f54221q.execute(new Runnable() { // from class: s0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractScheduledService.C8191e.m39628m(AbstractScheduledService.C8191e.this);
                }
            });
        }

        /* renamed from: r */
        public final /* synthetic */ void m39623r() {
            try {
                this.f54222r.lock();
                if (state() != Service.State.STOPPING) {
                    this.f54222r.unlock();
                    return;
                }
                AbstractScheduledService.this.shutDown();
                this.f54222r.unlock();
                notifyStopped();
            } catch (Throwable th2) {
                AbstractC23431zl1.m74b(th2);
                notifyFailed(th2);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return AbstractScheduledService.this.toString();
        }

        public /* synthetic */ C8191e(AbstractScheduledService abstractScheduledService, C8187a c8187a) {
            this();
        }
    }
}