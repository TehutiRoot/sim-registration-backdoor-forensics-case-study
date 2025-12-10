package io.reactivex.internal.schedulers;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.UnicastProcessor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public class SchedulerWhen extends Scheduler implements Disposable {

    /* renamed from: e */
    public static final Disposable f66072e = new C11151d();

    /* renamed from: f */
    public static final Disposable f66073f = Disposables.disposed();

    /* renamed from: b */
    public final Scheduler f66074b;

    /* renamed from: c */
    public final FlowableProcessor f66075c;

    /* renamed from: d */
    public Disposable f66076d;

    /* loaded from: classes5.dex */
    public static class DelayedAction extends ScheduledAction {
        private final Runnable action;
        private final long delayTime;
        private final TimeUnit unit;

        public DelayedAction(Runnable runnable, long j, TimeUnit timeUnit) {
            this.action = runnable;
            this.delayTime = j;
            this.unit = timeUnit;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction
        public Disposable callActual(Scheduler.Worker worker, CompletableObserver completableObserver) {
            return worker.schedule(new RunnableC11149b(this.action, completableObserver), this.delayTime, this.unit);
        }
    }

    /* loaded from: classes5.dex */
    public static class ImmediateAction extends ScheduledAction {
        private final Runnable action;

        public ImmediateAction(Runnable runnable) {
            this.action = runnable;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction
        public Disposable callActual(Scheduler.Worker worker, CompletableObserver completableObserver) {
            return worker.schedule(new RunnableC11149b(this.action, completableObserver));
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class ScheduledAction extends AtomicReference<Disposable> implements Disposable {
        public ScheduledAction() {
            super(SchedulerWhen.f66072e);
        }

        public void call(Scheduler.Worker worker, CompletableObserver completableObserver) {
            Disposable disposable;
            Disposable disposable2 = get();
            if (disposable2 == SchedulerWhen.f66073f || disposable2 != (disposable = SchedulerWhen.f66072e)) {
                return;
            }
            Disposable callActual = callActual(worker, completableObserver);
            if (!compareAndSet(disposable, callActual)) {
                callActual.dispose();
            }
        }

        public abstract Disposable callActual(Scheduler.Worker worker, CompletableObserver completableObserver);

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Disposable disposable;
            Disposable disposable2 = SchedulerWhen.f66073f;
            do {
                disposable = get();
                if (disposable == SchedulerWhen.f66073f) {
                    return;
                }
            } while (!compareAndSet(disposable, disposable2));
            if (disposable != SchedulerWhen.f66072e) {
                disposable.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get().isDisposed();
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.SchedulerWhen$a */
    /* loaded from: classes5.dex */
    public static final class C11147a implements Function {

        /* renamed from: a */
        public final Scheduler.Worker f66077a;

        /* renamed from: io.reactivex.internal.schedulers.SchedulerWhen$a$a */
        /* loaded from: classes5.dex */
        public final class C11148a extends Completable {

            /* renamed from: a */
            public final ScheduledAction f66078a;

            public C11148a(ScheduledAction scheduledAction) {
                this.f66078a = scheduledAction;
            }

            @Override // io.reactivex.Completable
            public void subscribeActual(CompletableObserver completableObserver) {
                completableObserver.onSubscribe(this.f66078a);
                this.f66078a.call(C11147a.this.f66077a, completableObserver);
            }
        }

        public C11147a(Scheduler.Worker worker) {
            this.f66077a = worker;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Completable apply(ScheduledAction scheduledAction) {
            return new C11148a(scheduledAction);
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.SchedulerWhen$b */
    /* loaded from: classes5.dex */
    public static class RunnableC11149b implements Runnable {

        /* renamed from: a */
        public final CompletableObserver f66080a;

        /* renamed from: b */
        public final Runnable f66081b;

        public RunnableC11149b(Runnable runnable, CompletableObserver completableObserver) {
            this.f66081b = runnable;
            this.f66080a = completableObserver;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f66081b.run();
            } finally {
                this.f66080a.onComplete();
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.SchedulerWhen$d */
    /* loaded from: classes5.dex */
    public static final class C11151d implements Disposable {
        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return false;
        }
    }

    public SchedulerWhen(Function<Flowable<Flowable<Completable>>, Completable> function, Scheduler scheduler) {
        this.f66074b = scheduler;
        FlowableProcessor<T> serialized = UnicastProcessor.create().toSerialized();
        this.f66075c = serialized;
        try {
            this.f66076d = function.apply(serialized).subscribe();
        } catch (Throwable th2) {
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        Scheduler.Worker createWorker = this.f66074b.createWorker();
        FlowableProcessor<T> serialized = UnicastProcessor.create().toSerialized();
        Flowable map = serialized.map(new C11147a(createWorker));
        C11150c c11150c = new C11150c(serialized, createWorker);
        this.f66075c.onNext(map);
        return c11150c;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.f66076d.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f66076d.isDisposed();
    }

    /* renamed from: io.reactivex.internal.schedulers.SchedulerWhen$c */
    /* loaded from: classes5.dex */
    public static final class C11150c extends Scheduler.Worker {

        /* renamed from: a */
        public final AtomicBoolean f66082a = new AtomicBoolean();

        /* renamed from: b */
        public final FlowableProcessor f66083b;

        /* renamed from: c */
        public final Scheduler.Worker f66084c;

        public C11150c(FlowableProcessor flowableProcessor, Scheduler.Worker worker) {
            this.f66083b = flowableProcessor;
            this.f66084c = worker;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.f66082a.compareAndSet(false, true)) {
                this.f66083b.onComplete();
                this.f66084c.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f66082a.get();
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            DelayedAction delayedAction = new DelayedAction(runnable, j, timeUnit);
            this.f66083b.onNext(delayedAction);
            return delayedAction;
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable) {
            ImmediateAction immediateAction = new ImmediateAction(runnable);
            this.f66083b.onNext(immediateAction);
            return immediateAction;
        }
    }
}
