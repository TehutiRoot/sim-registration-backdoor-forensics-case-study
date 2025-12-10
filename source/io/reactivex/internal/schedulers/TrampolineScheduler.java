package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class TrampolineScheduler extends Scheduler {

    /* renamed from: b */
    public static final TrampolineScheduler f66092b = new TrampolineScheduler();

    /* renamed from: io.reactivex.internal.schedulers.TrampolineScheduler$a */
    /* loaded from: classes5.dex */
    public static final class RunnableC11153a implements Runnable {

        /* renamed from: a */
        public final Runnable f66093a;

        /* renamed from: b */
        public final C11155c f66094b;

        /* renamed from: c */
        public final long f66095c;

        public RunnableC11153a(Runnable runnable, C11155c c11155c, long j) {
            this.f66093a = runnable;
            this.f66094b = c11155c;
            this.f66095c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f66094b.f66103d) {
                long now = this.f66094b.now(TimeUnit.MILLISECONDS);
                long j = this.f66095c;
                if (j > now) {
                    try {
                        Thread.sleep(j - now);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        RxJavaPlugins.onError(e);
                        return;
                    }
                }
                if (!this.f66094b.f66103d) {
                    this.f66093a.run();
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.TrampolineScheduler$b */
    /* loaded from: classes5.dex */
    public static final class C11154b implements Comparable {

        /* renamed from: a */
        public final Runnable f66096a;

        /* renamed from: b */
        public final long f66097b;

        /* renamed from: c */
        public final int f66098c;

        /* renamed from: d */
        public volatile boolean f66099d;

        public C11154b(Runnable runnable, Long l, int i) {
            this.f66096a = runnable;
            this.f66097b = l.longValue();
            this.f66098c = i;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C11154b c11154b) {
            int compare = ObjectHelper.compare(this.f66097b, c11154b.f66097b);
            if (compare == 0) {
                return ObjectHelper.compare(this.f66098c, c11154b.f66098c);
            }
            return compare;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.TrampolineScheduler$c */
    /* loaded from: classes5.dex */
    public static final class C11155c extends Scheduler.Worker implements Disposable {

        /* renamed from: a */
        public final PriorityBlockingQueue f66100a = new PriorityBlockingQueue();

        /* renamed from: b */
        public final AtomicInteger f66101b = new AtomicInteger();

        /* renamed from: c */
        public final AtomicInteger f66102c = new AtomicInteger();

        /* renamed from: d */
        public volatile boolean f66103d;

        /* renamed from: io.reactivex.internal.schedulers.TrampolineScheduler$c$a */
        /* loaded from: classes5.dex */
        public final class RunnableC11156a implements Runnable {

            /* renamed from: a */
            public final C11154b f66104a;

            public RunnableC11156a(C11154b c11154b) {
                this.f66104a = c11154b;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f66104a.f66099d = true;
                C11155c.this.f66100a.remove(this.f66104a);
            }
        }

        /* renamed from: a */
        public Disposable m29887a(Runnable runnable, long j) {
            if (this.f66103d) {
                return EmptyDisposable.INSTANCE;
            }
            C11154b c11154b = new C11154b(runnable, Long.valueOf(j), this.f66102c.incrementAndGet());
            this.f66100a.add(c11154b);
            if (this.f66101b.getAndIncrement() == 0) {
                int i = 1;
                while (!this.f66103d) {
                    C11154b c11154b2 = (C11154b) this.f66100a.poll();
                    if (c11154b2 == null) {
                        i = this.f66101b.addAndGet(-i);
                        if (i == 0) {
                            return EmptyDisposable.INSTANCE;
                        }
                    } else if (!c11154b2.f66099d) {
                        c11154b2.f66096a.run();
                    }
                }
                this.f66100a.clear();
                return EmptyDisposable.INSTANCE;
            }
            return Disposables.fromRunnable(new RunnableC11156a(c11154b));
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f66103d = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f66103d;
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable) {
            return m29887a(runnable, now(TimeUnit.MILLISECONDS));
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            long now = now(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return m29887a(new RunnableC11153a(runnable, this, now), now);
        }
    }

    public static TrampolineScheduler instance() {
        return f66092b;
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new C11155c();
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable) {
        RxJavaPlugins.onSchedule(runnable).run();
        return EmptyDisposable.INSTANCE;
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            RxJavaPlugins.onSchedule(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            RxJavaPlugins.onError(e);
        }
        return EmptyDisposable.INSTANCE;
    }
}
