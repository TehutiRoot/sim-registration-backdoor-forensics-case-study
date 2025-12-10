package p000;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p000.ScheduledFutureC1208RF;

/* renamed from: QF */
/* loaded from: classes4.dex */
public class ScheduledExecutorServiceC1146QF implements ScheduledExecutorService {

    /* renamed from: a */
    public final ExecutorService f5170a;

    /* renamed from: b */
    public final ScheduledExecutorService f5171b;

    public ScheduledExecutorServiceC1146QF(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f5170a = executorService;
        this.f5171b = scheduledExecutorService;
    }

    /* renamed from: a */
    public static /* synthetic */ ScheduledFuture m66799a(ScheduledExecutorServiceC1146QF scheduledExecutorServiceC1146QF, Callable callable, long j, TimeUnit timeUnit, ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        return scheduledExecutorServiceC1146QF.m66782t(callable, j, timeUnit, interfaceC1210b);
    }

    /* renamed from: c */
    public static /* synthetic */ ScheduledFuture m66798c(ScheduledExecutorServiceC1146QF scheduledExecutorServiceC1146QF, Runnable runnable, long j, long j2, TimeUnit timeUnit, ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        return scheduledExecutorServiceC1146QF.m66777y(runnable, j, j2, timeUnit, interfaceC1210b);
    }

    /* renamed from: d */
    public static /* synthetic */ ScheduledFuture m66797d(ScheduledExecutorServiceC1146QF scheduledExecutorServiceC1146QF, Runnable runnable, long j, long j2, TimeUnit timeUnit, ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        return scheduledExecutorServiceC1146QF.m66779w(runnable, j, j2, timeUnit, interfaceC1210b);
    }

    /* renamed from: e */
    public static /* synthetic */ void m66796e(Callable callable, ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        m66784r(callable, interfaceC1210b);
    }

    /* renamed from: f */
    public static /* synthetic */ void m66795f(Runnable runnable, ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        m66781u(runnable, interfaceC1210b);
    }

    /* renamed from: h */
    public static /* synthetic */ void m66794h(ScheduledExecutorServiceC1146QF scheduledExecutorServiceC1146QF, Runnable runnable, ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        scheduledExecutorServiceC1146QF.m66780v(runnable, interfaceC1210b);
    }

    /* renamed from: i */
    public static /* synthetic */ Future m66793i(ScheduledExecutorServiceC1146QF scheduledExecutorServiceC1146QF, Callable callable, ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        return scheduledExecutorServiceC1146QF.m66783s(callable, interfaceC1210b);
    }

    /* renamed from: j */
    public static /* synthetic */ void m66792j(Runnable runnable, ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        m66776z(runnable, interfaceC1210b);
    }

    /* renamed from: k */
    public static /* synthetic */ void m66791k(ScheduledExecutorServiceC1146QF scheduledExecutorServiceC1146QF, Runnable runnable, ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        scheduledExecutorServiceC1146QF.m66786p(runnable, interfaceC1210b);
    }

    /* renamed from: l */
    public static /* synthetic */ void m66790l(Runnable runnable, ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        m66787o(runnable, interfaceC1210b);
    }

    /* renamed from: m */
    public static /* synthetic */ void m66789m(ScheduledExecutorServiceC1146QF scheduledExecutorServiceC1146QF, Runnable runnable, ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        scheduledExecutorServiceC1146QF.m66778x(runnable, interfaceC1210b);
    }

    /* renamed from: n */
    public static /* synthetic */ ScheduledFuture m66788n(ScheduledExecutorServiceC1146QF scheduledExecutorServiceC1146QF, Runnable runnable, long j, TimeUnit timeUnit, ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        return scheduledExecutorServiceC1146QF.m66785q(runnable, j, timeUnit, interfaceC1210b);
    }

    /* renamed from: o */
    public static /* synthetic */ void m66787o(Runnable runnable, ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        try {
            runnable.run();
            interfaceC1210b.set(null);
        } catch (Exception e) {
            interfaceC1210b.mo66677a(e);
        }
    }

    /* renamed from: r */
    public static /* synthetic */ void m66784r(Callable callable, ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        try {
            interfaceC1210b.set(callable.call());
        } catch (Exception e) {
            interfaceC1210b.mo66677a(e);
        }
    }

    /* renamed from: u */
    public static /* synthetic */ void m66781u(Runnable runnable, ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        try {
            runnable.run();
        } catch (Exception e) {
            interfaceC1210b.mo66677a(e);
            throw e;
        }
    }

    /* renamed from: z */
    public static /* synthetic */ void m66776z(Runnable runnable, ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        try {
            runnable.run();
        } catch (Exception e) {
            interfaceC1210b.mo66677a(e);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f5170a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f5170a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f5170a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f5170a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f5170a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f5170a.isTerminated();
    }

    /* renamed from: p */
    public final /* synthetic */ void m66786p(final Runnable runnable, final ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        this.f5170a.execute(new Runnable() { // from class: OF
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC1146QF.m66790l(runnable, interfaceC1210b);
            }
        });
    }

    /* renamed from: q */
    public final /* synthetic */ ScheduledFuture m66785q(final Runnable runnable, long j, TimeUnit timeUnit, final ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        return this.f5171b.schedule(new Runnable() { // from class: LF
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC1146QF.m66791k(ScheduledExecutorServiceC1146QF.this, runnable, interfaceC1210b);
            }
        }, j, timeUnit);
    }

    /* renamed from: s */
    public final /* synthetic */ Future m66783s(final Callable callable, final ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        return this.f5170a.submit(new Runnable() { // from class: PF
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC1146QF.m66796e(callable, interfaceC1210b);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new ScheduledFutureC1208RF(new ScheduledFutureC1208RF.InterfaceC1211c() { // from class: EF
            @Override // p000.ScheduledFutureC1208RF.InterfaceC1211c
            /* renamed from: a */
            public final ScheduledFuture mo66676a(ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
                return ScheduledExecutorServiceC1146QF.m66788n(ScheduledExecutorServiceC1146QF.this, runnable, j, timeUnit, interfaceC1210b);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new ScheduledFutureC1208RF(new ScheduledFutureC1208RF.InterfaceC1211c() { // from class: HF
            @Override // p000.ScheduledFutureC1208RF.InterfaceC1211c
            /* renamed from: a */
            public final ScheduledFuture mo66676a(ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
                return ScheduledExecutorServiceC1146QF.m66797d(ScheduledExecutorServiceC1146QF.this, runnable, j, j2, timeUnit, interfaceC1210b);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new ScheduledFutureC1208RF(new ScheduledFutureC1208RF.InterfaceC1211c() { // from class: IF
            @Override // p000.ScheduledFutureC1208RF.InterfaceC1211c
            /* renamed from: a */
            public final ScheduledFuture mo66676a(ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
                return ScheduledExecutorServiceC1146QF.m66798c(ScheduledExecutorServiceC1146QF.this, runnable, j, j2, timeUnit, interfaceC1210b);
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
        return this.f5170a.submit(callable);
    }

    /* renamed from: t */
    public final /* synthetic */ ScheduledFuture m66782t(final Callable callable, long j, TimeUnit timeUnit, final ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        return this.f5171b.schedule(new Callable() { // from class: MF
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ScheduledExecutorServiceC1146QF.m66793i(ScheduledExecutorServiceC1146QF.this, callable, interfaceC1210b);
            }
        }, j, timeUnit);
    }

    /* renamed from: v */
    public final /* synthetic */ void m66780v(final Runnable runnable, final ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        this.f5170a.execute(new Runnable() { // from class: FF
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC1146QF.m66795f(runnable, interfaceC1210b);
            }
        });
    }

    /* renamed from: w */
    public final /* synthetic */ ScheduledFuture m66779w(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        return this.f5171b.scheduleAtFixedRate(new Runnable() { // from class: KF
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC1146QF.m66794h(ScheduledExecutorServiceC1146QF.this, runnable, interfaceC1210b);
            }
        }, j, j2, timeUnit);
    }

    /* renamed from: x */
    public final /* synthetic */ void m66778x(final Runnable runnable, final ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        this.f5170a.execute(new Runnable() { // from class: GF
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC1146QF.m66792j(runnable, interfaceC1210b);
            }
        });
    }

    /* renamed from: y */
    public final /* synthetic */ ScheduledFuture m66777y(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
        return this.f5171b.scheduleWithFixedDelay(new Runnable() { // from class: NF
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC1146QF.m66789m(ScheduledExecutorServiceC1146QF.this, runnable, interfaceC1210b);
            }
        }, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.f5170a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f5170a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j, final TimeUnit timeUnit) {
        return new ScheduledFutureC1208RF(new ScheduledFutureC1208RF.InterfaceC1211c() { // from class: JF
            @Override // p000.ScheduledFutureC1208RF.InterfaceC1211c
            /* renamed from: a */
            public final ScheduledFuture mo66676a(ScheduledFutureC1208RF.InterfaceC1210b interfaceC1210b) {
                return ScheduledExecutorServiceC1146QF.m66799a(ScheduledExecutorServiceC1146QF.this, callable, j, timeUnit, interfaceC1210b);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f5170a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f5170a.submit(runnable);
    }
}