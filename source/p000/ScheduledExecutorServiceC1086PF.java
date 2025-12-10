package p000;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p000.ScheduledFutureC1158QF;

/* renamed from: PF */
/* loaded from: classes4.dex */
public class ScheduledExecutorServiceC1086PF implements ScheduledExecutorService {

    /* renamed from: a */
    public final ExecutorService f4688a;

    /* renamed from: b */
    public final ScheduledExecutorService f4689b;

    public ScheduledExecutorServiceC1086PF(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f4688a = executorService;
        this.f4689b = scheduledExecutorService;
    }

    /* renamed from: a */
    public static /* synthetic */ ScheduledFuture m66891a(ScheduledExecutorServiceC1086PF scheduledExecutorServiceC1086PF, Callable callable, long j, TimeUnit timeUnit, ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        return scheduledExecutorServiceC1086PF.m66874t(callable, j, timeUnit, interfaceC1160b);
    }

    /* renamed from: c */
    public static /* synthetic */ ScheduledFuture m66890c(ScheduledExecutorServiceC1086PF scheduledExecutorServiceC1086PF, Runnable runnable, long j, long j2, TimeUnit timeUnit, ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        return scheduledExecutorServiceC1086PF.m66869y(runnable, j, j2, timeUnit, interfaceC1160b);
    }

    /* renamed from: d */
    public static /* synthetic */ ScheduledFuture m66889d(ScheduledExecutorServiceC1086PF scheduledExecutorServiceC1086PF, Runnable runnable, long j, long j2, TimeUnit timeUnit, ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        return scheduledExecutorServiceC1086PF.m66871w(runnable, j, j2, timeUnit, interfaceC1160b);
    }

    /* renamed from: e */
    public static /* synthetic */ void m66888e(Callable callable, ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        m66876r(callable, interfaceC1160b);
    }

    /* renamed from: f */
    public static /* synthetic */ void m66887f(Runnable runnable, ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        m66873u(runnable, interfaceC1160b);
    }

    /* renamed from: h */
    public static /* synthetic */ void m66886h(ScheduledExecutorServiceC1086PF scheduledExecutorServiceC1086PF, Runnable runnable, ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        scheduledExecutorServiceC1086PF.m66872v(runnable, interfaceC1160b);
    }

    /* renamed from: i */
    public static /* synthetic */ Future m66885i(ScheduledExecutorServiceC1086PF scheduledExecutorServiceC1086PF, Callable callable, ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        return scheduledExecutorServiceC1086PF.m66875s(callable, interfaceC1160b);
    }

    /* renamed from: j */
    public static /* synthetic */ void m66884j(Runnable runnable, ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        m66868z(runnable, interfaceC1160b);
    }

    /* renamed from: k */
    public static /* synthetic */ void m66883k(ScheduledExecutorServiceC1086PF scheduledExecutorServiceC1086PF, Runnable runnable, ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        scheduledExecutorServiceC1086PF.m66878p(runnable, interfaceC1160b);
    }

    /* renamed from: l */
    public static /* synthetic */ void m66882l(Runnable runnable, ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        m66879o(runnable, interfaceC1160b);
    }

    /* renamed from: m */
    public static /* synthetic */ void m66881m(ScheduledExecutorServiceC1086PF scheduledExecutorServiceC1086PF, Runnable runnable, ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        scheduledExecutorServiceC1086PF.m66870x(runnable, interfaceC1160b);
    }

    /* renamed from: n */
    public static /* synthetic */ ScheduledFuture m66880n(ScheduledExecutorServiceC1086PF scheduledExecutorServiceC1086PF, Runnable runnable, long j, TimeUnit timeUnit, ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        return scheduledExecutorServiceC1086PF.m66877q(runnable, j, timeUnit, interfaceC1160b);
    }

    /* renamed from: o */
    public static /* synthetic */ void m66879o(Runnable runnable, ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        try {
            runnable.run();
            interfaceC1160b.set(null);
        } catch (Exception e) {
            interfaceC1160b.mo66630a(e);
        }
    }

    /* renamed from: r */
    public static /* synthetic */ void m66876r(Callable callable, ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        try {
            interfaceC1160b.set(callable.call());
        } catch (Exception e) {
            interfaceC1160b.mo66630a(e);
        }
    }

    /* renamed from: u */
    public static /* synthetic */ void m66873u(Runnable runnable, ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        try {
            runnable.run();
        } catch (Exception e) {
            interfaceC1160b.mo66630a(e);
            throw e;
        }
    }

    /* renamed from: z */
    public static /* synthetic */ void m66868z(Runnable runnable, ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        try {
            runnable.run();
        } catch (Exception e) {
            interfaceC1160b.mo66630a(e);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f4688a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f4688a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f4688a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f4688a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f4688a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f4688a.isTerminated();
    }

    /* renamed from: p */
    public final /* synthetic */ void m66878p(final Runnable runnable, final ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        this.f4688a.execute(new Runnable() { // from class: NF
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC1086PF.m66882l(runnable, interfaceC1160b);
            }
        });
    }

    /* renamed from: q */
    public final /* synthetic */ ScheduledFuture m66877q(final Runnable runnable, long j, TimeUnit timeUnit, final ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        return this.f4689b.schedule(new Runnable() { // from class: KF
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC1086PF.m66883k(ScheduledExecutorServiceC1086PF.this, runnable, interfaceC1160b);
            }
        }, j, timeUnit);
    }

    /* renamed from: s */
    public final /* synthetic */ Future m66875s(final Callable callable, final ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        return this.f4688a.submit(new Runnable() { // from class: OF
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC1086PF.m66888e(callable, interfaceC1160b);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new ScheduledFutureC1158QF(new ScheduledFutureC1158QF.InterfaceC1161c() { // from class: DF
            @Override // p000.ScheduledFutureC1158QF.InterfaceC1161c
            /* renamed from: a */
            public final ScheduledFuture mo66629a(ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
                return ScheduledExecutorServiceC1086PF.m66880n(ScheduledExecutorServiceC1086PF.this, runnable, j, timeUnit, interfaceC1160b);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new ScheduledFutureC1158QF(new ScheduledFutureC1158QF.InterfaceC1161c() { // from class: GF
            @Override // p000.ScheduledFutureC1158QF.InterfaceC1161c
            /* renamed from: a */
            public final ScheduledFuture mo66629a(ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
                return ScheduledExecutorServiceC1086PF.m66889d(ScheduledExecutorServiceC1086PF.this, runnable, j, j2, timeUnit, interfaceC1160b);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new ScheduledFutureC1158QF(new ScheduledFutureC1158QF.InterfaceC1161c() { // from class: HF
            @Override // p000.ScheduledFutureC1158QF.InterfaceC1161c
            /* renamed from: a */
            public final ScheduledFuture mo66629a(ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
                return ScheduledExecutorServiceC1086PF.m66890c(ScheduledExecutorServiceC1086PF.this, runnable, j, j2, timeUnit, interfaceC1160b);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f4688a.submit(callable);
    }

    /* renamed from: t */
    public final /* synthetic */ ScheduledFuture m66874t(final Callable callable, long j, TimeUnit timeUnit, final ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        return this.f4689b.schedule(new Callable() { // from class: LF
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ScheduledExecutorServiceC1086PF.m66885i(ScheduledExecutorServiceC1086PF.this, callable, interfaceC1160b);
            }
        }, j, timeUnit);
    }

    /* renamed from: v */
    public final /* synthetic */ void m66872v(final Runnable runnable, final ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        this.f4688a.execute(new Runnable() { // from class: EF
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC1086PF.m66887f(runnable, interfaceC1160b);
            }
        });
    }

    /* renamed from: w */
    public final /* synthetic */ ScheduledFuture m66871w(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        return this.f4689b.scheduleAtFixedRate(new Runnable() { // from class: JF
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC1086PF.m66886h(ScheduledExecutorServiceC1086PF.this, runnable, interfaceC1160b);
            }
        }, j, j2, timeUnit);
    }

    /* renamed from: x */
    public final /* synthetic */ void m66870x(final Runnable runnable, final ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        this.f4688a.execute(new Runnable() { // from class: FF
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC1086PF.m66884j(runnable, interfaceC1160b);
            }
        });
    }

    /* renamed from: y */
    public final /* synthetic */ ScheduledFuture m66869y(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
        return this.f4689b.scheduleWithFixedDelay(new Runnable() { // from class: MF
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC1086PF.m66881m(ScheduledExecutorServiceC1086PF.this, runnable, interfaceC1160b);
            }
        }, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.f4688a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f4688a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j, final TimeUnit timeUnit) {
        return new ScheduledFutureC1158QF(new ScheduledFutureC1158QF.InterfaceC1161c() { // from class: IF
            @Override // p000.ScheduledFutureC1158QF.InterfaceC1161c
            /* renamed from: a */
            public final ScheduledFuture mo66629a(ScheduledFutureC1158QF.InterfaceC1160b interfaceC1160b) {
                return ScheduledExecutorServiceC1086PF.m66891a(ScheduledExecutorServiceC1086PF.this, callable, j, timeUnit, interfaceC1160b);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f4688a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f4688a.submit(runnable);
    }
}
