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
    public final Thread.UncaughtExceptionHandler f63413a;

    /* renamed from: b */
    public final Queue f63414b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public final AtomicReference f63415c = new AtomicReference();

    /* loaded from: classes5.dex */
    public static final class ScheduledHandle {

        /* renamed from: a */
        public final RunnableC10564c f63416a;

        /* renamed from: b */
        public final ScheduledFuture f63417b;

        public /* synthetic */ ScheduledHandle(RunnableC10564c runnableC10564c, ScheduledFuture scheduledFuture, RunnableC10562a runnableC10562a) {
            this(runnableC10564c, scheduledFuture);
        }

        public void cancel() {
            this.f63416a.f63426b = true;
            this.f63417b.cancel(false);
        }

        public boolean isPending() {
            RunnableC10564c runnableC10564c = this.f63416a;
            if (!runnableC10564c.f63427c && !runnableC10564c.f63426b) {
                return true;
            }
            return false;
        }

        public ScheduledHandle(RunnableC10564c runnableC10564c, ScheduledFuture scheduledFuture) {
            this.f63416a = (RunnableC10564c) Preconditions.checkNotNull(runnableC10564c, "runnable");
            this.f63417b = (ScheduledFuture) Preconditions.checkNotNull(scheduledFuture, "future");
        }
    }

    /* renamed from: io.grpc.SynchronizationContext$a */
    /* loaded from: classes5.dex */
    public class RunnableC10562a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ RunnableC10564c f63418a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f63419b;

        public RunnableC10562a(RunnableC10564c runnableC10564c, Runnable runnable) {
            this.f63418a = runnableC10564c;
            this.f63419b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            SynchronizationContext.this.execute(this.f63418a);
        }

        public String toString() {
            return this.f63419b.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    /* renamed from: io.grpc.SynchronizationContext$b */
    /* loaded from: classes5.dex */
    public class RunnableC10563b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ RunnableC10564c f63421a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f63422b;

        /* renamed from: c */
        public final /* synthetic */ long f63423c;

        public RunnableC10563b(RunnableC10564c runnableC10564c, Runnable runnable, long j) {
            this.f63421a = runnableC10564c;
            this.f63422b = runnable;
            this.f63423c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            SynchronizationContext.this.execute(this.f63421a);
        }

        public String toString() {
            return this.f63422b.toString() + "(scheduled in SynchronizationContext with delay of " + this.f63423c + ")";
        }
    }

    /* renamed from: io.grpc.SynchronizationContext$c */
    /* loaded from: classes5.dex */
    public static class RunnableC10564c implements Runnable {

        /* renamed from: a */
        public final Runnable f63425a;

        /* renamed from: b */
        public boolean f63426b;

        /* renamed from: c */
        public boolean f63427c;

        public RunnableC10564c(Runnable runnable) {
            this.f63425a = (Runnable) Preconditions.checkNotNull(runnable, "task");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f63426b) {
                this.f63427c = true;
                this.f63425a.run();
            }
        }
    }

    public SynchronizationContext(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f63413a = (Thread.UncaughtExceptionHandler) Preconditions.checkNotNull(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    public final void drain() {
        while (AbstractC17300An1.m69050a(this.f63415c, null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.f63414b.poll();
                    if (runnable != null) {
                        runnable.run();
                    } else {
                        this.f63415c.set(null);
                        if (this.f63414b.isEmpty()) {
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    this.f63415c.set(null);
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
        this.f63414b.add((Runnable) Preconditions.checkNotNull(runnable, "runnable is null"));
    }

    public final ScheduledHandle schedule(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        RunnableC10564c runnableC10564c = new RunnableC10564c(runnable);
        return new ScheduledHandle(runnableC10564c, scheduledExecutorService.schedule(new RunnableC10562a(runnableC10564c, runnable), j, timeUnit), null);
    }

    public final ScheduledHandle scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        RunnableC10564c runnableC10564c = new RunnableC10564c(runnable);
        return new ScheduledHandle(runnableC10564c, scheduledExecutorService.scheduleWithFixedDelay(new RunnableC10563b(runnableC10564c, runnable, j2), j, j2, timeUnit), null);
    }

    public void throwIfNotInThisSynchronizationContext() {
        boolean z;
        if (Thread.currentThread() == this.f63415c.get()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Not called from the SynchronizationContext");
    }
}
