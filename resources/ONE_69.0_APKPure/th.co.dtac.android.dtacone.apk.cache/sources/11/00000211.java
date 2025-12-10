package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: C72 */
/* loaded from: classes4.dex */
public abstract class C72 extends B72 implements ScheduledExecutorService {

    /* renamed from: b */
    public final ScheduledExecutorService f656b;

    public C72(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f656b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f656b.schedule(mo39463a(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f656b.scheduleAtFixedRate(mo39463a(runnable), j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f656b.scheduleWithFixedDelay(mo39463a(runnable), j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.f656b.schedule(mo39462c(callable), j, timeUnit);
    }
}