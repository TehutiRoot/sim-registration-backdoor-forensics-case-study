package io.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.schedulers.NewThreadWorker;
import io.reactivex.internal.schedulers.SchedulerWhen;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class Scheduler {

    /* renamed from: a */
    public static final long f63795a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* loaded from: classes5.dex */
    public static abstract class Worker implements Disposable {

        /* renamed from: io.reactivex.Scheduler$Worker$a */
        /* loaded from: classes5.dex */
        public final class RunnableC10741a implements Runnable, SchedulerRunnableIntrospection {

            /* renamed from: a */
            public final Runnable f63796a;

            /* renamed from: b */
            public final SequentialDisposable f63797b;

            /* renamed from: c */
            public final long f63798c;

            /* renamed from: d */
            public long f63799d;

            /* renamed from: e */
            public long f63800e;

            /* renamed from: f */
            public long f63801f;

            public RunnableC10741a(long j, Runnable runnable, long j2, SequentialDisposable sequentialDisposable, long j3) {
                Worker.this = r1;
                this.f63796a = runnable;
                this.f63797b = sequentialDisposable;
                this.f63798c = j3;
                this.f63800e = j2;
                this.f63801f = j;
            }

            @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
            public Runnable getWrappedRunnable() {
                return this.f63796a;
            }

            @Override // java.lang.Runnable
            public void run() {
                long j;
                this.f63796a.run();
                if (!this.f63797b.isDisposed()) {
                    Worker worker = Worker.this;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long now = worker.now(timeUnit);
                    long j2 = Scheduler.f63795a;
                    long j3 = this.f63800e;
                    if (now + j2 >= j3) {
                        long j4 = this.f63798c;
                        if (now < j3 + j4 + j2) {
                            long j5 = this.f63801f;
                            long j6 = this.f63799d + 1;
                            this.f63799d = j6;
                            j = j5 + (j6 * j4);
                            this.f63800e = now;
                            this.f63797b.replace(Worker.this.schedule(this, j - now, timeUnit));
                        }
                    }
                    long j7 = this.f63798c;
                    long j8 = now + j7;
                    long j9 = this.f63799d + 1;
                    this.f63799d = j9;
                    this.f63801f = j8 - (j7 * j9);
                    j = j8;
                    this.f63800e = now;
                    this.f63797b.replace(Worker.this.schedule(this, j - now, timeUnit));
                }
            }
        }

        public long now(@NonNull TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @NonNull
        public Disposable schedule(@NonNull Runnable runnable) {
            return schedule(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        @NonNull
        public abstract Disposable schedule(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit);

        @NonNull
        public Disposable schedulePeriodically(@NonNull Runnable runnable, long j, long j2, @NonNull TimeUnit timeUnit) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
            long nanos = timeUnit.toNanos(j2);
            long now = now(TimeUnit.NANOSECONDS);
            Disposable schedule = schedule(new RunnableC10741a(now + timeUnit.toNanos(j), onSchedule, now, sequentialDisposable2, nanos), j, timeUnit);
            if (schedule == EmptyDisposable.INSTANCE) {
                return schedule;
            }
            sequentialDisposable.replace(schedule);
            return sequentialDisposable2;
        }
    }

    /* renamed from: io.reactivex.Scheduler$a */
    /* loaded from: classes5.dex */
    public static final class RunnableC10742a implements Disposable, Runnable, SchedulerRunnableIntrospection {

        /* renamed from: a */
        public final Runnable f63803a;

        /* renamed from: b */
        public final Worker f63804b;

        /* renamed from: c */
        public Thread f63805c;

        public RunnableC10742a(Runnable runnable, Worker worker) {
            this.f63803a = runnable;
            this.f63804b = worker;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.f63805c == Thread.currentThread()) {
                Worker worker = this.f63804b;
                if (worker instanceof NewThreadWorker) {
                    ((NewThreadWorker) worker).shutdown();
                    return;
                }
            }
            this.f63804b.dispose();
        }

        @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
        public Runnable getWrappedRunnable() {
            return this.f63803a;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f63804b.isDisposed();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f63805c = Thread.currentThread();
            try {
                this.f63803a.run();
            } finally {
                dispose();
                this.f63805c = null;
            }
        }
    }

    /* renamed from: io.reactivex.Scheduler$b */
    /* loaded from: classes5.dex */
    public static final class RunnableC10743b implements Disposable, Runnable, SchedulerRunnableIntrospection {

        /* renamed from: a */
        public final Runnable f63806a;

        /* renamed from: b */
        public final Worker f63807b;

        /* renamed from: c */
        public volatile boolean f63808c;

        public RunnableC10743b(Runnable runnable, Worker worker) {
            this.f63806a = runnable;
            this.f63807b = worker;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f63808c = true;
            this.f63807b.dispose();
        }

        @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
        public Runnable getWrappedRunnable() {
            return this.f63806a;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f63808c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f63808c) {
                try {
                    this.f63806a.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f63807b.dispose();
                    throw ExceptionHelper.wrapOrThrow(th2);
                }
            }
        }
    }

    public static long clockDriftTolerance() {
        return f63795a;
    }

    @NonNull
    public abstract Worker createWorker();

    public long now(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable) {
        return scheduleDirect(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j, long j2, @NonNull TimeUnit timeUnit) {
        Worker createWorker = createWorker();
        RunnableC10743b runnableC10743b = new RunnableC10743b(RxJavaPlugins.onSchedule(runnable), createWorker);
        Disposable schedulePeriodically = createWorker.schedulePeriodically(runnableC10743b, j, j2, timeUnit);
        if (schedulePeriodically == EmptyDisposable.INSTANCE) {
            return schedulePeriodically;
        }
        return runnableC10743b;
    }

    public void shutdown() {
    }

    public void start() {
    }

    @NonNull
    public <S extends Scheduler & Disposable> S when(@NonNull Function<Flowable<Flowable<Completable>>, Completable> function) {
        return new SchedulerWhen(function, this);
    }

    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
        Worker createWorker = createWorker();
        RunnableC10742a runnableC10742a = new RunnableC10742a(RxJavaPlugins.onSchedule(runnable), createWorker);
        createWorker.schedule(runnableC10742a, j, timeUnit);
        return runnableC10742a;
    }
}
