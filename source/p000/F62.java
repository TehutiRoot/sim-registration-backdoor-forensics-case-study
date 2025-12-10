package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: F62 */
/* loaded from: classes4.dex */
public abstract class F62 extends E62 implements ScheduledExecutorService {

    /* renamed from: b */
    public final ScheduledExecutorService f1510b;

    public F62(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f1510b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f1510b.schedule(mo39471a(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f1510b.scheduleAtFixedRate(mo39471a(runnable), j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f1510b.scheduleWithFixedDelay(mo39471a(runnable), j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.f1510b.schedule(mo39470c(callable), j, timeUnit);
    }
}
