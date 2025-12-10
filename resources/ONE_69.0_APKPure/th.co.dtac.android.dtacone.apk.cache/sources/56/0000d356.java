package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ComputationScheduler extends Scheduler implements SchedulerMultiWorkerSupport {

    /* renamed from: d */
    public static final C11123b f66078d;

    /* renamed from: e */
    public static final RxThreadFactory f66079e;

    /* renamed from: f */
    public static final int f66080f = m30243a(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: g */
    public static final C11124c f66081g;

    /* renamed from: b */
    public final ThreadFactory f66082b;

    /* renamed from: c */
    public final AtomicReference f66083c;

    /* renamed from: io.reactivex.internal.schedulers.ComputationScheduler$b */
    /* loaded from: classes5.dex */
    public static final class C11123b implements SchedulerMultiWorkerSupport {

        /* renamed from: a */
        public final int f66089a;

        /* renamed from: b */
        public final C11124c[] f66090b;

        /* renamed from: c */
        public long f66091c;

        public C11123b(int i, ThreadFactory threadFactory) {
            this.f66089a = i;
            this.f66090b = new C11124c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f66090b[i2] = new C11124c(threadFactory);
            }
        }

        /* renamed from: a */
        public C11124c m30242a() {
            int i = this.f66089a;
            if (i == 0) {
                return ComputationScheduler.f66081g;
            }
            C11124c[] c11124cArr = this.f66090b;
            long j = this.f66091c;
            this.f66091c = 1 + j;
            return c11124cArr[(int) (j % i)];
        }

        /* renamed from: b */
        public void m30241b() {
            for (C11124c c11124c : this.f66090b) {
                c11124c.dispose();
            }
        }

        @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
        public void createWorkers(int i, SchedulerMultiWorkerSupport.WorkerCallback workerCallback) {
            int i2 = this.f66089a;
            if (i2 == 0) {
                for (int i3 = 0; i3 < i; i3++) {
                    workerCallback.onWorker(i3, ComputationScheduler.f66081g);
                }
                return;
            }
            int i4 = ((int) this.f66091c) % i2;
            for (int i5 = 0; i5 < i; i5++) {
                workerCallback.onWorker(i5, new C11122a(this.f66090b[i4]));
                i4++;
                if (i4 == i2) {
                    i4 = 0;
                }
            }
            this.f66091c = i4;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.ComputationScheduler$c */
    /* loaded from: classes5.dex */
    public static final class C11124c extends NewThreadWorker {
        public C11124c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        C11124c c11124c = new C11124c(new RxThreadFactory("RxComputationShutdown"));
        f66081g = c11124c;
        c11124c.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f66079e = rxThreadFactory;
        C11123b c11123b = new C11123b(0, rxThreadFactory);
        f66078d = c11123b;
        c11123b.m30241b();
    }

    public ComputationScheduler() {
        this(f66079e);
    }

    /* renamed from: a */
    public static int m30243a(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new C11122a(((C11123b) this.f66083c.get()).m30242a());
    }

    @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
    public void createWorkers(int i, SchedulerMultiWorkerSupport.WorkerCallback workerCallback) {
        ObjectHelper.verifyPositive(i, "number > 0 required");
        ((C11123b) this.f66083c.get()).createWorkers(i, workerCallback);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable, long j, TimeUnit timeUnit) {
        return ((C11123b) this.f66083c.get()).m30242a().scheduleDirect(runnable, j, timeUnit);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((C11123b) this.f66083c.get()).m30242a().schedulePeriodicallyDirect(runnable, j, j2, timeUnit);
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        C11123b c11123b;
        C11123b c11123b2;
        do {
            c11123b = (C11123b) this.f66083c.get();
            c11123b2 = f66078d;
            if (c11123b == c11123b2) {
                return;
            }
        } while (!AbstractC23094xo1.m479a(this.f66083c, c11123b, c11123b2));
        c11123b.m30241b();
    }

    @Override // io.reactivex.Scheduler
    public void start() {
        C11123b c11123b = new C11123b(f66080f, this.f66082b);
        if (!AbstractC23094xo1.m479a(this.f66083c, f66078d, c11123b)) {
            c11123b.m30241b();
        }
    }

    public ComputationScheduler(ThreadFactory threadFactory) {
        this.f66082b = threadFactory;
        this.f66083c = new AtomicReference(f66078d);
        start();
    }

    /* renamed from: io.reactivex.internal.schedulers.ComputationScheduler$a */
    /* loaded from: classes5.dex */
    public static final class C11122a extends Scheduler.Worker {

        /* renamed from: a */
        public final ListCompositeDisposable f66084a;

        /* renamed from: b */
        public final CompositeDisposable f66085b;

        /* renamed from: c */
        public final ListCompositeDisposable f66086c;

        /* renamed from: d */
        public final C11124c f66087d;

        /* renamed from: e */
        public volatile boolean f66088e;

        public C11122a(C11124c c11124c) {
            this.f66087d = c11124c;
            ListCompositeDisposable listCompositeDisposable = new ListCompositeDisposable();
            this.f66084a = listCompositeDisposable;
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            this.f66085b = compositeDisposable;
            ListCompositeDisposable listCompositeDisposable2 = new ListCompositeDisposable();
            this.f66086c = listCompositeDisposable2;
            listCompositeDisposable2.add(listCompositeDisposable);
            listCompositeDisposable2.add(compositeDisposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.f66088e) {
                this.f66088e = true;
                this.f66086c.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f66088e;
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable) {
            if (this.f66088e) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f66087d.scheduleActual(runnable, 0L, TimeUnit.MILLISECONDS, this.f66084a);
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f66088e) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f66087d.scheduleActual(runnable, j, timeUnit, this.f66085b);
        }
    }
}