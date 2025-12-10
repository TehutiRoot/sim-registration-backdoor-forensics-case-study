package io.reactivex.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class TestScheduler extends Scheduler {

    /* renamed from: b */
    public final Queue f66439b = new PriorityBlockingQueue(11);

    /* renamed from: c */
    public long f66440c;

    /* renamed from: d */
    public volatile long f66441d;

    /* renamed from: io.reactivex.schedulers.TestScheduler$b */
    /* loaded from: classes5.dex */
    public static final class C11207b implements Comparable {

        /* renamed from: a */
        public final long f66446a;

        /* renamed from: b */
        public final Runnable f66447b;

        /* renamed from: c */
        public final C11205a f66448c;

        /* renamed from: d */
        public final long f66449d;

        public C11207b(C11205a c11205a, long j, Runnable runnable, long j2) {
            this.f66446a = j;
            this.f66447b = runnable;
            this.f66448c = c11205a;
            this.f66449d = j2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C11207b c11207b) {
            long j = this.f66446a;
            long j2 = c11207b.f66446a;
            if (j == j2) {
                return ObjectHelper.compare(this.f66449d, c11207b.f66449d);
            }
            return ObjectHelper.compare(j, j2);
        }

        public String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", Long.valueOf(this.f66446a), this.f66447b.toString());
        }
    }

    public TestScheduler() {
    }

    /* renamed from: a */
    public final void m30133a(long j) {
        while (true) {
            C11207b c11207b = (C11207b) this.f66439b.peek();
            if (c11207b == null) {
                break;
            }
            long j2 = c11207b.f66446a;
            if (j2 > j) {
                break;
            }
            if (j2 == 0) {
                j2 = this.f66441d;
            }
            this.f66441d = j2;
            this.f66439b.remove(c11207b);
            if (!c11207b.f66448c.f66442a) {
                c11207b.f66447b.run();
            }
        }
        this.f66441d = j;
    }

    public void advanceTimeBy(long j, TimeUnit timeUnit) {
        advanceTimeTo(this.f66441d + timeUnit.toNanos(j), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j, TimeUnit timeUnit) {
        m30133a(timeUnit.toNanos(j));
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new C11205a();
    }

    @Override // io.reactivex.Scheduler
    public long now(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.f66441d, TimeUnit.NANOSECONDS);
    }

    public void triggerActions() {
        m30133a(this.f66441d);
    }

    public TestScheduler(long j, TimeUnit timeUnit) {
        this.f66441d = timeUnit.toNanos(j);
    }

    /* renamed from: io.reactivex.schedulers.TestScheduler$a */
    /* loaded from: classes5.dex */
    public final class C11205a extends Scheduler.Worker {

        /* renamed from: a */
        public volatile boolean f66442a;

        /* renamed from: io.reactivex.schedulers.TestScheduler$a$a */
        /* loaded from: classes5.dex */
        public final class RunnableC11206a implements Runnable {

            /* renamed from: a */
            public final C11207b f66444a;

            public RunnableC11206a(C11207b c11207b) {
                this.f66444a = c11207b;
            }

            @Override // java.lang.Runnable
            public void run() {
                TestScheduler.this.f66439b.remove(this.f66444a);
            }
        }

        public C11205a() {
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f66442a = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f66442a;
        }

        @Override // io.reactivex.Scheduler.Worker
        public long now(TimeUnit timeUnit) {
            return TestScheduler.this.now(timeUnit);
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f66442a) {
                return EmptyDisposable.INSTANCE;
            }
            long nanos = TestScheduler.this.f66441d + timeUnit.toNanos(j);
            TestScheduler testScheduler = TestScheduler.this;
            long j2 = testScheduler.f66440c;
            testScheduler.f66440c = 1 + j2;
            C11207b c11207b = new C11207b(this, nanos, runnable, j2);
            TestScheduler.this.f66439b.add(c11207b);
            return Disposables.fromRunnable(new RunnableC11206a(c11207b));
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable) {
            if (this.f66442a) {
                return EmptyDisposable.INSTANCE;
            }
            TestScheduler testScheduler = TestScheduler.this;
            long j = testScheduler.f66440c;
            testScheduler.f66440c = 1 + j;
            C11207b c11207b = new C11207b(this, 0L, runnable, j);
            TestScheduler.this.f66439b.add(c11207b);
            return Disposables.fromRunnable(new RunnableC11206a(c11207b));
        }
    }
}