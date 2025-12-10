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
    public final Scheduler f79006a;

    /* renamed from: rx.internal.operators.OperatorUnsubscribeOn$a */
    /* loaded from: classes7.dex */
    public class C13678a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f79007a;

        public C13678a(Subscriber subscriber) {
            this.f79007a = subscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79007a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79007a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f79007a.onNext(obj);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f79007a.setProducer(producer);
        }
    }

    /* renamed from: rx.internal.operators.OperatorUnsubscribeOn$b */
    /* loaded from: classes7.dex */
    public class C13679b implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f79009a;

        /* renamed from: rx.internal.operators.OperatorUnsubscribeOn$b$a */
        /* loaded from: classes7.dex */
        public class C13680a implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ Scheduler.Worker f79011a;

            public C13680a(Scheduler.Worker worker) {
                this.f79011a = worker;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13679b.this.f79009a.unsubscribe();
                this.f79011a.unsubscribe();
            }
        }

        public C13679b(Subscriber subscriber) {
            this.f79009a = subscriber;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            Scheduler.Worker createWorker = OperatorUnsubscribeOn.this.f79006a.createWorker();
            createWorker.schedule(new C13680a(createWorker));
        }
    }

    public OperatorUnsubscribeOn(Scheduler scheduler) {
        this.f79006a = scheduler;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        C13678a c13678a = new C13678a(subscriber);
        subscriber.add(Subscriptions.create(new C13679b(c13678a)));
        return c13678a;
    }
}