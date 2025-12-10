package p046rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Completable;
import p046rx.CompletableSubscriber;
import p046rx.Observable;
import p046rx.Observer;
import p046rx.Scheduler;
import p046rx.Subscription;
import p046rx.functions.Action0;
import p046rx.functions.Func1;
import p046rx.internal.operators.BufferUntilSubscriber;
import p046rx.observers.SerializedObserver;
import p046rx.subjects.PublishSubject;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.schedulers.SchedulerWhen */
/* loaded from: classes7.dex */
public class SchedulerWhen extends Scheduler implements Subscription {

    /* renamed from: d */
    public static final Subscription f79140d = new C13750c();

    /* renamed from: e */
    public static final Subscription f79141e = Subscriptions.unsubscribed();

    /* renamed from: a */
    public final Scheduler f79142a;

    /* renamed from: b */
    public final Observer f79143b;

    /* renamed from: c */
    public final Subscription f79144c;

    /* renamed from: rx.internal.schedulers.SchedulerWhen$DelayedAction */
    /* loaded from: classes7.dex */
    public static class DelayedAction extends ScheduledAction {
        private final Action0 action;
        private final long delayTime;
        private final TimeUnit unit;

        public DelayedAction(Action0 action0, long j, TimeUnit timeUnit) {
            this.action = action0;
            this.delayTime = j;
            this.unit = timeUnit;
        }

        @Override // p046rx.internal.schedulers.SchedulerWhen.ScheduledAction
        public Subscription callActual(Scheduler.Worker worker, CompletableSubscriber completableSubscriber) {
            return worker.schedule(new C13751d(this.action, completableSubscriber), this.delayTime, this.unit);
        }
    }

    /* renamed from: rx.internal.schedulers.SchedulerWhen$ImmediateAction */
    /* loaded from: classes7.dex */
    public static class ImmediateAction extends ScheduledAction {
        private final Action0 action;

        public ImmediateAction(Action0 action0) {
            this.action = action0;
        }

        @Override // p046rx.internal.schedulers.SchedulerWhen.ScheduledAction
        public Subscription callActual(Scheduler.Worker worker, CompletableSubscriber completableSubscriber) {
            return worker.schedule(new C13751d(this.action, completableSubscriber));
        }
    }

    /* renamed from: rx.internal.schedulers.SchedulerWhen$ScheduledAction */
    /* loaded from: classes7.dex */
    public static abstract class ScheduledAction extends AtomicReference<Subscription> implements Subscription {
        public ScheduledAction() {
            super(SchedulerWhen.f79140d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void call(Scheduler.Worker worker, CompletableSubscriber completableSubscriber) {
            Subscription subscription;
            Subscription subscription2 = get();
            if (subscription2 == SchedulerWhen.f79141e || subscription2 != (subscription = SchedulerWhen.f79140d)) {
                return;
            }
            Subscription callActual = callActual(worker, completableSubscriber);
            if (!compareAndSet(subscription, callActual)) {
                callActual.unsubscribe();
            }
        }

        public abstract Subscription callActual(Scheduler.Worker worker, CompletableSubscriber completableSubscriber);

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return get().isUnsubscribed();
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            Subscription subscription;
            Subscription subscription2 = SchedulerWhen.f79141e;
            do {
                subscription = get();
                if (subscription == SchedulerWhen.f79141e) {
                    return;
                }
            } while (!compareAndSet(subscription, subscription2));
            if (subscription != SchedulerWhen.f79140d) {
                subscription.unsubscribe();
            }
        }
    }

    /* renamed from: rx.internal.schedulers.SchedulerWhen$a */
    /* loaded from: classes7.dex */
    public class C13747a implements Func1 {

        /* renamed from: a */
        public final /* synthetic */ Scheduler.Worker f79145a;

        /* renamed from: rx.internal.schedulers.SchedulerWhen$a$a */
        /* loaded from: classes7.dex */
        public class C13748a implements Completable.OnSubscribe {

            /* renamed from: a */
            public final /* synthetic */ ScheduledAction f79147a;

            public C13748a(ScheduledAction scheduledAction) {
                this.f79147a = scheduledAction;
            }

            @Override // p046rx.functions.Action1
            /* renamed from: a */
            public void call(CompletableSubscriber completableSubscriber) {
                completableSubscriber.onSubscribe(this.f79147a);
                this.f79147a.call(C13747a.this.f79145a, completableSubscriber);
            }
        }

        public C13747a(Scheduler.Worker worker) {
            this.f79145a = worker;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Completable call(ScheduledAction scheduledAction) {
            return Completable.create(new C13748a(scheduledAction));
        }
    }

    /* renamed from: rx.internal.schedulers.SchedulerWhen$c */
    /* loaded from: classes7.dex */
    public static class C13750c implements Subscription {
        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return false;
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
        }
    }

    /* renamed from: rx.internal.schedulers.SchedulerWhen$d */
    /* loaded from: classes7.dex */
    public static class C13751d implements Action0 {

        /* renamed from: a */
        public CompletableSubscriber f79153a;

        /* renamed from: b */
        public Action0 f79154b;

        public C13751d(Action0 action0, CompletableSubscriber completableSubscriber) {
            this.f79154b = action0;
            this.f79153a = completableSubscriber;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            try {
                this.f79154b.call();
            } finally {
                this.f79153a.onCompleted();
            }
        }
    }

    public SchedulerWhen(Func1<Observable<Observable<Completable>>, Completable> func1, Scheduler scheduler) {
        this.f79142a = scheduler;
        PublishSubject create = PublishSubject.create();
        this.f79143b = new SerializedObserver(create);
        this.f79144c = func1.call(create.onBackpressureBuffer()).subscribe();
    }

    @Override // p046rx.Scheduler
    public Scheduler.Worker createWorker() {
        Scheduler.Worker createWorker = this.f79142a.createWorker();
        BufferUntilSubscriber create = BufferUntilSubscriber.create();
        SerializedObserver serializedObserver = new SerializedObserver(create);
        Object map = create.map(new C13747a(createWorker));
        C13749b c13749b = new C13749b(createWorker, serializedObserver);
        this.f79143b.onNext(map);
        return c13749b;
    }

    @Override // p046rx.Subscription
    public boolean isUnsubscribed() {
        return this.f79144c.isUnsubscribed();
    }

    @Override // p046rx.Subscription
    public void unsubscribe() {
        this.f79144c.unsubscribe();
    }

    /* renamed from: rx.internal.schedulers.SchedulerWhen$b */
    /* loaded from: classes7.dex */
    public class C13749b extends Scheduler.Worker {

        /* renamed from: a */
        public final AtomicBoolean f79149a = new AtomicBoolean();

        /* renamed from: b */
        public final /* synthetic */ Scheduler.Worker f79150b;

        /* renamed from: c */
        public final /* synthetic */ Observer f79151c;

        public C13749b(Scheduler.Worker worker, Observer observer) {
            this.f79150b = worker;
            this.f79151c = observer;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f79149a.get();
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            DelayedAction delayedAction = new DelayedAction(action0, j, timeUnit);
            this.f79151c.onNext(delayedAction);
            return delayedAction;
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            if (this.f79149a.compareAndSet(false, true)) {
                this.f79150b.unsubscribe();
                this.f79151c.onCompleted();
            }
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            ImmediateAction immediateAction = new ImmediateAction(action0);
            this.f79151c.onNext(immediateAction);
            return immediateAction;
        }
    }
}
