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
    public static final Subscription f79346d = new C13751c();

    /* renamed from: e */
    public static final Subscription f79347e = Subscriptions.unsubscribed();

    /* renamed from: a */
    public final Scheduler f79348a;

    /* renamed from: b */
    public final Observer f79349b;

    /* renamed from: c */
    public final Subscription f79350c;

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
            return worker.schedule(new C13752d(this.action, completableSubscriber), this.delayTime, this.unit);
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
            return worker.schedule(new C13752d(this.action, completableSubscriber));
        }
    }

    /* renamed from: rx.internal.schedulers.SchedulerWhen$ScheduledAction */
    /* loaded from: classes7.dex */
    public static abstract class ScheduledAction extends AtomicReference<Subscription> implements Subscription {
        public ScheduledAction() {
            super(SchedulerWhen.f79346d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void call(Scheduler.Worker worker, CompletableSubscriber completableSubscriber) {
            Subscription subscription;
            Subscription subscription2 = get();
            if (subscription2 == SchedulerWhen.f79347e || subscription2 != (subscription = SchedulerWhen.f79346d)) {
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
            Subscription subscription2 = SchedulerWhen.f79347e;
            do {
                subscription = get();
                if (subscription == SchedulerWhen.f79347e) {
                    return;
                }
            } while (!compareAndSet(subscription, subscription2));
            if (subscription != SchedulerWhen.f79346d) {
                subscription.unsubscribe();
            }
        }
    }

    /* renamed from: rx.internal.schedulers.SchedulerWhen$a */
    /* loaded from: classes7.dex */
    public class C13748a implements Func1 {

        /* renamed from: a */
        public final /* synthetic */ Scheduler.Worker f79351a;

        /* renamed from: rx.internal.schedulers.SchedulerWhen$a$a */
        /* loaded from: classes7.dex */
        public class C13749a implements Completable.OnSubscribe {

            /* renamed from: a */
            public final /* synthetic */ ScheduledAction f79353a;

            public C13749a(ScheduledAction scheduledAction) {
                this.f79353a = scheduledAction;
            }

            @Override // p046rx.functions.Action1
            /* renamed from: a */
            public void call(CompletableSubscriber completableSubscriber) {
                completableSubscriber.onSubscribe(this.f79353a);
                this.f79353a.call(C13748a.this.f79351a, completableSubscriber);
            }
        }

        public C13748a(Scheduler.Worker worker) {
            this.f79351a = worker;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Completable call(ScheduledAction scheduledAction) {
            return Completable.create(new C13749a(scheduledAction));
        }
    }

    /* renamed from: rx.internal.schedulers.SchedulerWhen$c */
    /* loaded from: classes7.dex */
    public static class C13751c implements Subscription {
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
    public static class C13752d implements Action0 {

        /* renamed from: a */
        public CompletableSubscriber f79359a;

        /* renamed from: b */
        public Action0 f79360b;

        public C13752d(Action0 action0, CompletableSubscriber completableSubscriber) {
            this.f79360b = action0;
            this.f79359a = completableSubscriber;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            try {
                this.f79360b.call();
            } finally {
                this.f79359a.onCompleted();
            }
        }
    }

    public SchedulerWhen(Func1<Observable<Observable<Completable>>, Completable> func1, Scheduler scheduler) {
        this.f79348a = scheduler;
        PublishSubject create = PublishSubject.create();
        this.f79349b = new SerializedObserver(create);
        this.f79350c = func1.call(create.onBackpressureBuffer()).subscribe();
    }

    @Override // p046rx.Scheduler
    public Scheduler.Worker createWorker() {
        Scheduler.Worker createWorker = this.f79348a.createWorker();
        BufferUntilSubscriber create = BufferUntilSubscriber.create();
        SerializedObserver serializedObserver = new SerializedObserver(create);
        Object map = create.map(new C13748a(createWorker));
        C13750b c13750b = new C13750b(createWorker, serializedObserver);
        this.f79349b.onNext(map);
        return c13750b;
    }

    @Override // p046rx.Subscription
    public boolean isUnsubscribed() {
        return this.f79350c.isUnsubscribed();
    }

    @Override // p046rx.Subscription
    public void unsubscribe() {
        this.f79350c.unsubscribe();
    }

    /* renamed from: rx.internal.schedulers.SchedulerWhen$b */
    /* loaded from: classes7.dex */
    public class C13750b extends Scheduler.Worker {

        /* renamed from: a */
        public final AtomicBoolean f79355a = new AtomicBoolean();

        /* renamed from: b */
        public final /* synthetic */ Scheduler.Worker f79356b;

        /* renamed from: c */
        public final /* synthetic */ Observer f79357c;

        public C13750b(Scheduler.Worker worker, Observer observer) {
            this.f79356b = worker;
            this.f79357c = observer;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f79355a.get();
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            DelayedAction delayedAction = new DelayedAction(action0, j, timeUnit);
            this.f79357c.onNext(delayedAction);
            return delayedAction;
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            if (this.f79355a.compareAndSet(false, true)) {
                this.f79356b.unsubscribe();
                this.f79357c.onCompleted();
            }
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            ImmediateAction immediateAction = new ImmediateAction(action0);
            this.f79357c.onNext(immediateAction);
            return immediateAction;
        }
    }
}