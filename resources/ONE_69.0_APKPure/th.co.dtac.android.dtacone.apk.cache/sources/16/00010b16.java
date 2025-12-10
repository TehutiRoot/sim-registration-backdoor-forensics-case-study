package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.functions.Action0;
import p046rx.functions.Func2;
import p046rx.internal.producers.ProducerArbiter;
import p046rx.schedulers.Schedulers;
import p046rx.subscriptions.SerialSubscription;

/* renamed from: rx.internal.operators.OperatorRetryWithPredicate */
/* loaded from: classes7.dex */
public final class OperatorRetryWithPredicate<T> implements Observable.Operator<T, Observable<T>> {

    /* renamed from: a */
    public final Func2 f78809a;

    /* renamed from: rx.internal.operators.OperatorRetryWithPredicate$a */
    /* loaded from: classes7.dex */
    public static final class C13626a extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78810a;

        /* renamed from: b */
        public final Func2 f78811b;

        /* renamed from: c */
        public final Scheduler.Worker f78812c;

        /* renamed from: d */
        public final SerialSubscription f78813d;

        /* renamed from: e */
        public final ProducerArbiter f78814e;

        /* renamed from: f */
        public final AtomicInteger f78815f = new AtomicInteger();

        /* renamed from: rx.internal.operators.OperatorRetryWithPredicate$a$a */
        /* loaded from: classes7.dex */
        public class C13627a implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ Observable f78816a;

            /* renamed from: rx.internal.operators.OperatorRetryWithPredicate$a$a$a */
            /* loaded from: classes7.dex */
            public class C13628a extends Subscriber {

                /* renamed from: a */
                public boolean f78818a;

                /* renamed from: b */
                public final /* synthetic */ Action0 f78819b;

                public C13628a(Action0 action0) {
                    this.f78819b = action0;
                }

                @Override // p046rx.Observer
                public void onCompleted() {
                    if (!this.f78818a) {
                        this.f78818a = true;
                        C13626a.this.f78810a.onCompleted();
                    }
                }

                @Override // p046rx.Observer
                public void onError(Throwable th2) {
                    if (!this.f78818a) {
                        this.f78818a = true;
                        C13626a c13626a = C13626a.this;
                        if (((Boolean) c13626a.f78811b.call(Integer.valueOf(c13626a.f78815f.get()), th2)).booleanValue() && !C13626a.this.f78812c.isUnsubscribed()) {
                            C13626a.this.f78812c.schedule(this.f78819b);
                        } else {
                            C13626a.this.f78810a.onError(th2);
                        }
                    }
                }

                @Override // p046rx.Observer
                public void onNext(Object obj) {
                    if (!this.f78818a) {
                        C13626a.this.f78810a.onNext(obj);
                        C13626a.this.f78814e.produced(1L);
                    }
                }

                @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
                public void setProducer(Producer producer) {
                    C13626a.this.f78814e.setProducer(producer);
                }
            }

            public C13627a(Observable observable) {
                this.f78816a = observable;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13626a.this.f78815f.incrementAndGet();
                C13628a c13628a = new C13628a(this);
                C13626a.this.f78813d.set(c13628a);
                this.f78816a.unsafeSubscribe(c13628a);
            }
        }

        public C13626a(Subscriber subscriber, Func2 func2, Scheduler.Worker worker, SerialSubscription serialSubscription, ProducerArbiter producerArbiter) {
            this.f78810a = subscriber;
            this.f78811b = func2;
            this.f78812c = worker;
            this.f78813d = serialSubscription;
            this.f78814e = producerArbiter;
        }

        @Override // p046rx.Observer
        /* renamed from: b */
        public void onNext(Observable observable) {
            this.f78812c.schedule(new C13627a(observable));
        }

        @Override // p046rx.Observer
        public void onCompleted() {
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78810a.onError(th2);
        }
    }

    public OperatorRetryWithPredicate(Func2<Integer, Throwable, Boolean> func2) {
        this.f78809a = func2;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super Observable<T>> call(Subscriber<? super T> subscriber) {
        Scheduler.Worker createWorker = Schedulers.trampoline().createWorker();
        subscriber.add(createWorker);
        SerialSubscription serialSubscription = new SerialSubscription();
        subscriber.add(serialSubscription);
        ProducerArbiter producerArbiter = new ProducerArbiter();
        subscriber.setProducer(producerArbiter);
        return new C13626a(subscriber, this.f78809a, createWorker, serialSubscription, producerArbiter);
    }
}