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
    public final Func2 f78603a;

    /* renamed from: rx.internal.operators.OperatorRetryWithPredicate$a */
    /* loaded from: classes7.dex */
    public static final class C13625a extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78604a;

        /* renamed from: b */
        public final Func2 f78605b;

        /* renamed from: c */
        public final Scheduler.Worker f78606c;

        /* renamed from: d */
        public final SerialSubscription f78607d;

        /* renamed from: e */
        public final ProducerArbiter f78608e;

        /* renamed from: f */
        public final AtomicInteger f78609f = new AtomicInteger();

        /* renamed from: rx.internal.operators.OperatorRetryWithPredicate$a$a */
        /* loaded from: classes7.dex */
        public class C13626a implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ Observable f78610a;

            /* renamed from: rx.internal.operators.OperatorRetryWithPredicate$a$a$a */
            /* loaded from: classes7.dex */
            public class C13627a extends Subscriber {

                /* renamed from: a */
                public boolean f78612a;

                /* renamed from: b */
                public final /* synthetic */ Action0 f78613b;

                public C13627a(Action0 action0) {
                    this.f78613b = action0;
                }

                @Override // p046rx.Observer
                public void onCompleted() {
                    if (!this.f78612a) {
                        this.f78612a = true;
                        C13625a.this.f78604a.onCompleted();
                    }
                }

                @Override // p046rx.Observer
                public void onError(Throwable th2) {
                    if (!this.f78612a) {
                        this.f78612a = true;
                        C13625a c13625a = C13625a.this;
                        if (((Boolean) c13625a.f78605b.call(Integer.valueOf(c13625a.f78609f.get()), th2)).booleanValue() && !C13625a.this.f78606c.isUnsubscribed()) {
                            C13625a.this.f78606c.schedule(this.f78613b);
                        } else {
                            C13625a.this.f78604a.onError(th2);
                        }
                    }
                }

                @Override // p046rx.Observer
                public void onNext(Object obj) {
                    if (!this.f78612a) {
                        C13625a.this.f78604a.onNext(obj);
                        C13625a.this.f78608e.produced(1L);
                    }
                }

                @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
                public void setProducer(Producer producer) {
                    C13625a.this.f78608e.setProducer(producer);
                }
            }

            public C13626a(Observable observable) {
                this.f78610a = observable;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13625a.this.f78609f.incrementAndGet();
                C13627a c13627a = new C13627a(this);
                C13625a.this.f78607d.set(c13627a);
                this.f78610a.unsafeSubscribe(c13627a);
            }
        }

        public C13625a(Subscriber subscriber, Func2 func2, Scheduler.Worker worker, SerialSubscription serialSubscription, ProducerArbiter producerArbiter) {
            this.f78604a = subscriber;
            this.f78605b = func2;
            this.f78606c = worker;
            this.f78607d = serialSubscription;
            this.f78608e = producerArbiter;
        }

        @Override // p046rx.Observer
        /* renamed from: b */
        public void onNext(Observable observable) {
            this.f78606c.schedule(new C13626a(observable));
        }

        @Override // p046rx.Observer
        public void onCompleted() {
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78604a.onError(th2);
        }
    }

    public OperatorRetryWithPredicate(Func2<Integer, Throwable, Boolean> func2) {
        this.f78603a = func2;
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
        return new C13625a(subscriber, this.f78603a, createWorker, serialSubscription, producerArbiter);
    }
}
