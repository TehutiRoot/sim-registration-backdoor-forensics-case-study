package io.reactivex.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.NonNull;
import io.reactivex.internal.schedulers.ComputationScheduler;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.internal.schedulers.IoScheduler;
import io.reactivex.internal.schedulers.NewThreadScheduler;
import io.reactivex.internal.schedulers.SchedulerPoolFactory;
import io.reactivex.internal.schedulers.SingleScheduler;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class Schedulers {

    /* renamed from: a */
    public static final Scheduler f66367a = RxJavaPlugins.initSingleScheduler(new CallableC11217h());

    /* renamed from: b */
    public static final Scheduler f66368b = RxJavaPlugins.initComputationScheduler(new CallableC11211b());

    /* renamed from: c */
    public static final Scheduler f66369c = RxJavaPlugins.initIoScheduler(new CallableC11212c());

    /* renamed from: d */
    public static final Scheduler f66370d = TrampolineScheduler.instance();

    /* renamed from: e */
    public static final Scheduler f66371e = RxJavaPlugins.initNewThreadScheduler(new CallableC11215f());

    /* renamed from: io.reactivex.schedulers.Schedulers$a */
    /* loaded from: classes5.dex */
    public static final class C11210a {

        /* renamed from: a */
        public static final Scheduler f66372a = new ComputationScheduler();
    }

    /* renamed from: io.reactivex.schedulers.Schedulers$b */
    /* loaded from: classes5.dex */
    public static final class CallableC11211b implements Callable {
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Scheduler call() {
            return C11210a.f66372a;
        }
    }

    /* renamed from: io.reactivex.schedulers.Schedulers$c */
    /* loaded from: classes5.dex */
    public static final class CallableC11212c implements Callable {
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Scheduler call() {
            return C11213d.f66373a;
        }
    }

    /* renamed from: io.reactivex.schedulers.Schedulers$d */
    /* loaded from: classes5.dex */
    public static final class C11213d {

        /* renamed from: a */
        public static final Scheduler f66373a = new IoScheduler();
    }

    /* renamed from: io.reactivex.schedulers.Schedulers$e */
    /* loaded from: classes5.dex */
    public static final class C11214e {

        /* renamed from: a */
        public static final Scheduler f66374a = new NewThreadScheduler();
    }

    /* renamed from: io.reactivex.schedulers.Schedulers$f */
    /* loaded from: classes5.dex */
    public static final class CallableC11215f implements Callable {
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Scheduler call() {
            return C11214e.f66374a;
        }
    }

    /* renamed from: io.reactivex.schedulers.Schedulers$g */
    /* loaded from: classes5.dex */
    public static final class C11216g {

        /* renamed from: a */
        public static final Scheduler f66375a = new SingleScheduler();
    }

    /* renamed from: io.reactivex.schedulers.Schedulers$h */
    /* loaded from: classes5.dex */
    public static final class CallableC11217h implements Callable {
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Scheduler call() {
            return C11216g.f66375a;
        }
    }

    @NonNull
    public static Scheduler computation() {
        return RxJavaPlugins.onComputationScheduler(f66368b);
    }

    @NonNull
    public static Scheduler from(@NonNull Executor executor) {
        return new ExecutorScheduler(executor, false);
    }

    @NonNull
    /* renamed from: io */
    public static Scheduler m29798io() {
        return RxJavaPlugins.onIoScheduler(f66369c);
    }

    @NonNull
    public static Scheduler newThread() {
        return RxJavaPlugins.onNewThreadScheduler(f66371e);
    }

    public static void shutdown() {
        computation().shutdown();
        m29798io().shutdown();
        newThread().shutdown();
        single().shutdown();
        trampoline().shutdown();
        SchedulerPoolFactory.shutdown();
    }

    @NonNull
    public static Scheduler single() {
        return RxJavaPlugins.onSingleScheduler(f66367a);
    }

    public static void start() {
        computation().start();
        m29798io().start();
        newThread().start();
        single().start();
        trampoline().start();
        SchedulerPoolFactory.start();
    }

    @NonNull
    public static Scheduler trampoline() {
        return f66370d;
    }

    @Experimental
    @NonNull
    public static Scheduler from(@NonNull Executor executor, boolean z) {
        return new ExecutorScheduler(executor, z);
    }
}
