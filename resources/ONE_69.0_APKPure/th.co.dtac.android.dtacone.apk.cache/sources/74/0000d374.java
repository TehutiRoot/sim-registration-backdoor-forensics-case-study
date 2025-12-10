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
    public static final Disposable f66135e = new C11138d();

    /* renamed from: f */
    public static final Disposable f66136f = Disposables.disposed();

    /* renamed from: b */
    public final Scheduler f66137b;

    /* renamed from: c */
    public final FlowableProcessor f66138c;

    /* renamed from: d */
    public Disposable f66139d;

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
            return worker.schedule(new RunnableC11136b(this.action, completableObserver), this.delayTime, this.unit);
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
            return worker.schedule(new RunnableC11136b(this.action, completableObserver));
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class ScheduledAction extends AtomicReference<Disposable> implements Disposable {
        public ScheduledAction() {
            super(SchedulerWhen.f66135e);
        }

        public void call(Scheduler.Worker worker, CompletableObserver completableObserver) {
            Disposable disposable;
            Disposable disposable2 = get();
            if (disposable2 == SchedulerWhen.f66136f || disposable2 != (disposable = SchedulerWhen.f66135e)) {
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
            Disposable disposable2 = SchedulerWhen.f66136f;
            do {
                disposable = get();
                if (disposable == SchedulerWhen.f66136f) {
                    return;
                }
            } while (!compareAndSet(disposable, disposable2));
            if (disposable != SchedulerWhen.f66135e) {
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
    public static final class C11134a implements Function {

        /* renamed from: a */
        public final Scheduler.Worker f66140a;

        /* renamed from: io.reactivex.internal.schedulers.SchedulerWhen$a$a */
        /* loaded from: classes5.dex */
        public final class C11135a extends Completable {

            /* renamed from: a */
            public final ScheduledAction f66141a;

            public C11135a(ScheduledAction scheduledAction) {
                this.f66141a = scheduledAction;
            }

            @Override // io.reactivex.Completable
            public void subscribeActual(CompletableObserver completableObserver) {
                completableObserver.onSubscribe(this.f66141a);
                this.f66141a.call(C11134a.this.f66140a, completableObserver);
            }
        }

        public C11134a(Scheduler.Worker worker) {
            this.f66140a = worker;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Completable apply(ScheduledAction scheduledAction) {
            return new C11135a(scheduledAction);
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.SchedulerWhen$b */
    /* loaded from: classes5.dex */
    public static class RunnableC11136b implements Runnable {

        /* renamed from: a */
        public final CompletableObserver f66143a;

        /* renamed from: b */
        public final Runnable f66144b;

        public RunnableC11136b(Runnable runnable, CompletableObserver completableObserver) {
            this.f66144b = runnable;
            this.f66143a = completableObserver;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f66144b.run();
            } finally {
                this.f66143a.onComplete();
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.SchedulerWhen$d */
    /* loaded from: classes5.dex */
    public static final class C11138d implements Disposable {
        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return false;
        }
    }

    public SchedulerWhen(Function<Flowable<Flowable<Completable>>, Completable> function, Scheduler scheduler) {
        this.f66137b = scheduler;
        FlowableProcessor<T> serialized = UnicastProcessor.create().toSerialized();
        this.f66138c = serialized;
        try {
            this.f66139d = function.apply(serialized).subscribe();
        } catch (Throwable th2) {
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        Scheduler.Worker createWorker = this.f66137b.createWorker();
        FlowableProcessor<T> serialized = UnicastProcessor.create().toSerialized();
        Flowable map = serialized.map(new C11134a(createWorker));
        C11137c c11137c = new C11137c(serialized, createWorker);
        this.f66138c.onNext(map);
        return c11137c;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.f66139d.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f66139d.isDisposed();
    }

    /* renamed from: io.reactivex.internal.schedulers.SchedulerWhen$c */
    /* loaded from: classes5.dex */
    public static final class C11137c extends Scheduler.Worker {

        /* renamed from: a */
        public final AtomicBoolean f66145a = new AtomicBoolean();

        /* renamed from: b */
        public final FlowableProcessor f66146b;

        /* renamed from: c */
        public final Scheduler.Worker f66147c;

        public C11137c(FlowableProcessor flowableProcessor, Scheduler.Worker worker) {
            this.f66146b = flowableProcessor;
            this.f66147c = worker;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.f66145a.compareAndSet(false, true)) {
                this.f66146b.onComplete();
                this.f66147c.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f66145a.get();
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            DelayedAction delayedAction = new DelayedAction(runnable, j, timeUnit);
            this.f66146b.onNext(delayedAction);
            return delayedAction;
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable) {
            ImmediateAction immediateAction = new ImmediateAction(runnable);
            this.f66146b.onNext(immediateAction);
            return immediateAction;
        }
    }
}