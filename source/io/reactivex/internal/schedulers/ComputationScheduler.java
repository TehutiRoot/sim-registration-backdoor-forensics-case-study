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
    public static final C11136b f66015d;

    /* renamed from: e */
    public static final RxThreadFactory f66016e;

    /* renamed from: f */
    public static final int f66017f = m29903a(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: g */
    public static final C11137c f66018g;

    /* renamed from: b */
    public final ThreadFactory f66019b;

    /* renamed from: c */
    public final AtomicReference f66020c;

    /* renamed from: io.reactivex.internal.schedulers.ComputationScheduler$b */
    /* loaded from: classes5.dex */
    public static final class C11136b implements SchedulerMultiWorkerSupport {

        /* renamed from: a */
        public final int f66026a;

        /* renamed from: b */
        public final C11137c[] f66027b;

        /* renamed from: c */
        public long f66028c;

        public C11136b(int i, ThreadFactory threadFactory) {
            this.f66026a = i;
            this.f66027b = new C11137c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f66027b[i2] = new C11137c(threadFactory);
            }
        }

        /* renamed from: a */
        public C11137c m29902a() {
            int i = this.f66026a;
            if (i == 0) {
                return ComputationScheduler.f66018g;
            }
            C11137c[] c11137cArr = this.f66027b;
            long j = this.f66028c;
            this.f66028c = 1 + j;
            return c11137cArr[(int) (j % i)];
        }

        /* renamed from: b */
        public void m29901b() {
            for (C11137c c11137c : this.f66027b) {
                c11137c.dispose();
            }
        }

        @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
        public void createWorkers(int i, SchedulerMultiWorkerSupport.WorkerCallback workerCallback) {
            int i2 = this.f66026a;
            if (i2 == 0) {
                for (int i3 = 0; i3 < i; i3++) {
                    workerCallback.onWorker(i3, ComputationScheduler.f66018g);
                }
                return;
            }
            int i4 = ((int) this.f66028c) % i2;
            for (int i5 = 0; i5 < i; i5++) {
                workerCallback.onWorker(i5, new C11135a(this.f66027b[i4]));
                i4++;
                if (i4 == i2) {
                    i4 = 0;
                }
            }
            this.f66028c = i4;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.ComputationScheduler$c */
    /* loaded from: classes5.dex */
    public static final class C11137c extends NewThreadWorker {
        public C11137c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        C11137c c11137c = new C11137c(new RxThreadFactory("RxComputationShutdown"));
        f66018g = c11137c;
        c11137c.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f66016e = rxThreadFactory;
        C11136b c11136b = new C11136b(0, rxThreadFactory);
        f66015d = c11136b;
        c11136b.m29901b();
    }

    public ComputationScheduler() {
        this(f66016e);
    }

    /* renamed from: a */
    public static int m29903a(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new C11135a(((C11136b) this.f66020c.get()).m29902a());
    }

    @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
    public void createWorkers(int i, SchedulerMultiWorkerSupport.WorkerCallback workerCallback) {
        ObjectHelper.verifyPositive(i, "number > 0 required");
        ((C11136b) this.f66020c.get()).createWorkers(i, workerCallback);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable, long j, TimeUnit timeUnit) {
        return ((C11136b) this.f66020c.get()).m29902a().scheduleDirect(runnable, j, timeUnit);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((C11136b) this.f66020c.get()).m29902a().schedulePeriodicallyDirect(runnable, j, j2, timeUnit);
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        C11136b c11136b;
        C11136b c11136b2;
        do {
            c11136b = (C11136b) this.f66020c.get();
            c11136b2 = f66015d;
            if (c11136b == c11136b2) {
                return;
            }
        } while (!AbstractC17300An1.m69050a(this.f66020c, c11136b, c11136b2));
        c11136b.m29901b();
    }

    @Override // io.reactivex.Scheduler
    public void start() {
        C11136b c11136b = new C11136b(f66017f, this.f66019b);
        if (!AbstractC17300An1.m69050a(this.f66020c, f66015d, c11136b)) {
            c11136b.m29901b();
        }
    }

    public ComputationScheduler(ThreadFactory threadFactory) {
        this.f66019b = threadFactory;
        this.f66020c = new AtomicReference(f66015d);
        start();
    }

    /* renamed from: io.reactivex.internal.schedulers.ComputationScheduler$a */
    /* loaded from: classes5.dex */
    public static final class C11135a extends Scheduler.Worker {

        /* renamed from: a */
        public final ListCompositeDisposable f66021a;

        /* renamed from: b */
        public final CompositeDisposable f66022b;

        /* renamed from: c */
        public final ListCompositeDisposable f66023c;

        /* renamed from: d */
        public final C11137c f66024d;

        /* renamed from: e */
        public volatile boolean f66025e;

        public C11135a(C11137c c11137c) {
            this.f66024d = c11137c;
            ListCompositeDisposable listCompositeDisposable = new ListCompositeDisposable();
            this.f66021a = listCompositeDisposable;
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            this.f66022b = compositeDisposable;
            ListCompositeDisposable listCompositeDisposable2 = new ListCompositeDisposable();
            this.f66023c = listCompositeDisposable2;
            listCompositeDisposable2.add(listCompositeDisposable);
            listCompositeDisposable2.add(compositeDisposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.f66025e) {
                this.f66025e = true;
                this.f66023c.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f66025e;
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable) {
            if (this.f66025e) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f66024d.scheduleActual(runnable, 0L, TimeUnit.MILLISECONDS, this.f66021a);
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f66025e) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f66024d.scheduleActual(runnable, j, timeUnit, this.f66022b);
        }
    }
}
