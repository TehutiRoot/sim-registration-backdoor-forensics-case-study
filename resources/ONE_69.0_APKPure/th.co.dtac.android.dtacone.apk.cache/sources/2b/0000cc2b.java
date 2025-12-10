package io.grpc;

import com.google.common.base.Preconditions;
import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes5.dex */
public final class SynchronizationContext implements Executor {

    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler f63476a;

    /* renamed from: b */
    public final Queue f63477b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public final AtomicReference f63478c = new AtomicReference();

    /* loaded from: classes5.dex */
    public static final class ScheduledHandle {

        /* renamed from: a */
        public final RunnableC10551c f63479a;

        /* renamed from: b */
        public final ScheduledFuture f63480b;

        public /* synthetic */ ScheduledHandle(RunnableC10551c runnableC10551c, ScheduledFuture scheduledFuture, RunnableC10549a runnableC10549a) {
            this(runnableC10551c, scheduledFuture);
        }

        public void cancel() {
            this.f63479a.f63489b = true;
            this.f63480b.cancel(false);
        }

        public boolean isPending() {
            RunnableC10551c runnableC10551c = this.f63479a;
            if (!runnableC10551c.f63490c && !runnableC10551c.f63489b) {
                return true;
            }
            return false;
        }

        public ScheduledHandle(RunnableC10551c runnableC10551c, ScheduledFuture scheduledFuture) {
            this.f63479a = (RunnableC10551c) Preconditions.checkNotNull(runnableC10551c, "runnable");
            this.f63480b = (ScheduledFuture) Preconditions.checkNotNull(scheduledFuture, "future");
        }
    }

    /* renamed from: io.grpc.SynchronizationContext$a */
    /* loaded from: classes5.dex */
    public class RunnableC10549a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ RunnableC10551c f63481a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f63482b;

        public RunnableC10549a(RunnableC10551c runnableC10551c, Runnable runnable) {
            this.f63481a = runnableC10551c;
            this.f63482b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            SynchronizationContext.this.execute(this.f63481a);
        }

        public String toString() {
            return this.f63482b.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    /* renamed from: io.grpc.SynchronizationContext$b */
    /* loaded from: classes5.dex */
    public class RunnableC10550b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ RunnableC10551c f63484a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f63485b;

        /* renamed from: c */
        public final /* synthetic */ long f63486c;

        public RunnableC10550b(RunnableC10551c runnableC10551c, Runnable runnable, long j) {
            this.f63484a = runnableC10551c;
            this.f63485b = runnable;
            this.f63486c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            SynchronizationContext.this.execute(this.f63484a);
        }

        public String toString() {
            return this.f63485b.toString() + "(scheduled in SynchronizationContext with delay of " + this.f63486c + ")";
        }
    }

    /* renamed from: io.grpc.SynchronizationContext$c */
    /* loaded from: classes5.dex */
    public static class RunnableC10551c implements Runnable {

        /* renamed from: a */
        public final Runnable f63488a;

        /* renamed from: b */
        public boolean f63489b;

        /* renamed from: c */
        public boolean f63490c;

        public RunnableC10551c(Runnable runnable) {
            this.f63488a = (Runnable) Preconditions.checkNotNull(runnable, "task");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f63489b) {
                this.f63490c = true;
                this.f63488a.run();
            }
        }
    }

    public SynchronizationContext(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f63476a = (Thread.UncaughtExceptionHandler) Preconditions.checkNotNull(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    public final void drain() {
        while (AbstractC23094xo1.m479a(this.f63478c, null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.f63477b.poll();
                    if (runnable != null) {
                        runnable.run();
                    } else {
                        this.f63478c.set(null);
                        if (this.f63477b.isEmpty()) {
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    this.f63478c.set(null);
                    throw th2;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        executeLater(runnable);
        drain();
    }

    public final void executeLater(Runnable runnable) {
        this.f63477b.add((Runnable) Preconditions.checkNotNull(runnable, "runnable is null"));
    }

    public final ScheduledHandle schedule(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        RunnableC10551c runnableC10551c = new RunnableC10551c(runnable);
        return new ScheduledHandle(runnableC10551c, scheduledExecutorService.schedule(new RunnableC10549a(runnableC10551c, runnable), j, timeUnit), null);
    }

    public final ScheduledHandle scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        RunnableC10551c runnableC10551c = new RunnableC10551c(runnable);
        return new ScheduledHandle(runnableC10551c, scheduledExecutorService.scheduleWithFixedDelay(new RunnableC10550b(runnableC10551c, runnable, j2), j, j2, timeUnit), null);
    }

    public void throwIfNotInThisSynchronizationContext() {
        boolean z;
        if (Thread.currentThread() == this.f63478c.get()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Not called from the SynchronizationContext");
    }
}