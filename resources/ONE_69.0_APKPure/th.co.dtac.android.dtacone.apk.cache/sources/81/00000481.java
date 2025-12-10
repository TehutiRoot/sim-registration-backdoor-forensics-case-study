package p000;

import com.google.firebase.concurrent.PausableExecutorService;
import com.google.firebase.concurrent.PausableScheduledExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: Ek1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17575Ek1 extends ScheduledExecutorServiceC1146QF implements PausableScheduledExecutorService {

    /* renamed from: c */
    public final PausableExecutorService f1439c;

    public C17575Ek1(PausableExecutorService pausableExecutorService, ScheduledExecutorService scheduledExecutorService) {
        super(pausableExecutorService, scheduledExecutorService);
        this.f1439c = pausableExecutorService;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public boolean isPaused() {
        return this.f1439c.isPaused();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void pause() {
        this.f1439c.pause();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void resume() {
        this.f1439c.resume();
    }

    @Override // p000.ScheduledExecutorServiceC1146QF, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.ScheduledExecutorServiceC1146QF, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}