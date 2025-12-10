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
    public final Queue f66376b = new PriorityBlockingQueue(11);

    /* renamed from: c */
    public long f66377c;

    /* renamed from: d */
    public volatile long f66378d;

    /* renamed from: io.reactivex.schedulers.TestScheduler$b */
    /* loaded from: classes5.dex */
    public static final class C11220b implements Comparable {

        /* renamed from: a */
        public final long f66383a;

        /* renamed from: b */
        public final Runnable f66384b;

        /* renamed from: c */
        public final C11218a f66385c;

        /* renamed from: d */
        public final long f66386d;

        public C11220b(C11218a c11218a, long j, Runnable runnable, long j2) {
            this.f66383a = j;
            this.f66384b = runnable;
            this.f66385c = c11218a;
            this.f66386d = j2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C11220b c11220b) {
            long j = this.f66383a;
            long j2 = c11220b.f66383a;
            if (j == j2) {
                return ObjectHelper.compare(this.f66386d, c11220b.f66386d);
            }
            return ObjectHelper.compare(j, j2);
        }

        public String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", Long.valueOf(this.f66383a), this.f66384b.toString());
        }
    }

    public TestScheduler() {
    }

    /* renamed from: a */
    public final void m29793a(long j) {
        while (true) {
            C11220b c11220b = (C11220b) this.f66376b.peek();
            if (c11220b == null) {
                break;
            }
            long j2 = c11220b.f66383a;
            if (j2 > j) {
                break;
            }
            if (j2 == 0) {
                j2 = this.f66378d;
            }
            this.f66378d = j2;
            this.f66376b.remove(c11220b);
            if (!c11220b.f66385c.f66379a) {
                c11220b.f66384b.run();
            }
        }
        this.f66378d = j;
    }

    public void advanceTimeBy(long j, TimeUnit timeUnit) {
        advanceTimeTo(this.f66378d + timeUnit.toNanos(j), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j, TimeUnit timeUnit) {
        m29793a(timeUnit.toNanos(j));
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new C11218a();
    }

    @Override // io.reactivex.Scheduler
    public long now(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.f66378d, TimeUnit.NANOSECONDS);
    }

    public void triggerActions() {
        m29793a(this.f66378d);
    }

    public TestScheduler(long j, TimeUnit timeUnit) {
        this.f66378d = timeUnit.toNanos(j);
    }

    /* renamed from: io.reactivex.schedulers.TestScheduler$a */
    /* loaded from: classes5.dex */
    public final class C11218a extends Scheduler.Worker {

        /* renamed from: a */
        public volatile boolean f66379a;

        /* renamed from: io.reactivex.schedulers.TestScheduler$a$a */
        /* loaded from: classes5.dex */
        public final class RunnableC11219a implements Runnable {

            /* renamed from: a */
            public final C11220b f66381a;

            public RunnableC11219a(C11220b c11220b) {
                this.f66381a = c11220b;
            }

            @Override // java.lang.Runnable
            public void run() {
                TestScheduler.this.f66376b.remove(this.f66381a);
            }
        }

        public C11218a() {
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f66379a = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f66379a;
        }

        @Override // io.reactivex.Scheduler.Worker
        public long now(TimeUnit timeUnit) {
            return TestScheduler.this.now(timeUnit);
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f66379a) {
                return EmptyDisposable.INSTANCE;
            }
            long nanos = TestScheduler.this.f66378d + timeUnit.toNanos(j);
            TestScheduler testScheduler = TestScheduler.this;
            long j2 = testScheduler.f66377c;
            testScheduler.f66377c = 1 + j2;
            C11220b c11220b = new C11220b(this, nanos, runnable, j2);
            TestScheduler.this.f66376b.add(c11220b);
            return Disposables.fromRunnable(new RunnableC11219a(c11220b));
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable) {
            if (this.f66379a) {
                return EmptyDisposable.INSTANCE;
            }
            TestScheduler testScheduler = TestScheduler.this;
            long j = testScheduler.f66377c;
            testScheduler.f66377c = 1 + j;
            C11220b c11220b = new C11220b(this, 0L, runnable, j);
            TestScheduler.this.f66376b.add(c11220b);
            return Disposables.fromRunnable(new RunnableC11219a(c11220b));
        }
    }
}
