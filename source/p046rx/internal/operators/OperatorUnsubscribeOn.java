package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Producer;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.functions.Action0;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.operators.OperatorUnsubscribeOn */
/* loaded from: classes7.dex */
public class OperatorUnsubscribeOn<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final Scheduler f78800a;

    /* renamed from: rx.internal.operators.OperatorUnsubscribeOn$a */
    /* loaded from: classes7.dex */
    public class C13677a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78801a;

        public C13677a(Subscriber subscriber) {
            this.f78801a = subscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78801a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78801a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78801a.onNext(obj);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78801a.setProducer(producer);
        }
    }

    /* renamed from: rx.internal.operators.OperatorUnsubscribeOn$b */
    /* loaded from: classes7.dex */
    public class C13678b implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78803a;

        /* renamed from: rx.internal.operators.OperatorUnsubscribeOn$b$a */
        /* loaded from: classes7.dex */
        public class C13679a implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ Scheduler.Worker f78805a;

            public C13679a(Scheduler.Worker worker) {
                this.f78805a = worker;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13678b.this.f78803a.unsubscribe();
                this.f78805a.unsubscribe();
            }
        }

        public C13678b(Subscriber subscriber) {
            this.f78803a = subscriber;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            Scheduler.Worker createWorker = OperatorUnsubscribeOn.this.f78800a.createWorker();
            createWorker.schedule(new C13679a(createWorker));
        }
    }

    public OperatorUnsubscribeOn(Scheduler scheduler) {
        this.f78800a = scheduler;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        C13677a c13677a = new C13677a(subscriber);
        subscriber.add(Subscriptions.create(new C13678b(c13677a)));
        return c13677a;
    }
}
