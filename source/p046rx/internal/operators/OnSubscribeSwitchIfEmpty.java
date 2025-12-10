package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.internal.producers.ProducerArbiter;
import p046rx.subscriptions.SerialSubscription;

/* renamed from: rx.internal.operators.OnSubscribeSwitchIfEmpty */
/* loaded from: classes7.dex */
public final class OnSubscribeSwitchIfEmpty<T> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Observable f78119a;

    /* renamed from: b */
    public final Observable f78120b;

    /* renamed from: rx.internal.operators.OnSubscribeSwitchIfEmpty$a */
    /* loaded from: classes7.dex */
    public static final class C13513a extends Subscriber {

        /* renamed from: a */
        public final ProducerArbiter f78121a;

        /* renamed from: b */
        public final Subscriber f78122b;

        public C13513a(Subscriber subscriber, ProducerArbiter producerArbiter) {
            this.f78122b = subscriber;
            this.f78121a = producerArbiter;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78122b.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78122b.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78122b.onNext(obj);
            this.f78121a.produced(1L);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78121a.setProducer(producer);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeSwitchIfEmpty$b */
    /* loaded from: classes7.dex */
    public static final class C13514b extends Subscriber {

        /* renamed from: b */
        public final Subscriber f78124b;

        /* renamed from: c */
        public final SerialSubscription f78125c;

        /* renamed from: d */
        public final ProducerArbiter f78126d;

        /* renamed from: e */
        public final Observable f78127e;

        /* renamed from: g */
        public volatile boolean f78129g;

        /* renamed from: a */
        public boolean f78123a = true;

        /* renamed from: f */
        public final AtomicInteger f78128f = new AtomicInteger();

        public C13514b(Subscriber subscriber, SerialSubscription serialSubscription, ProducerArbiter producerArbiter, Observable observable) {
            this.f78124b = subscriber;
            this.f78125c = serialSubscription;
            this.f78126d = producerArbiter;
            this.f78127e = observable;
        }

        /* renamed from: b */
        public void m23098b(Observable observable) {
            if (this.f78128f.getAndIncrement() == 0) {
                while (!this.f78124b.isUnsubscribed()) {
                    if (!this.f78129g) {
                        if (observable == null) {
                            C13513a c13513a = new C13513a(this.f78124b, this.f78126d);
                            this.f78125c.set(c13513a);
                            this.f78129g = true;
                            this.f78127e.unsafeSubscribe(c13513a);
                        } else {
                            this.f78129g = true;
                            observable.unsafeSubscribe(this);
                            observable = null;
                        }
                    }
                    if (this.f78128f.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78123a) {
                this.f78124b.onCompleted();
            } else if (!this.f78124b.isUnsubscribed()) {
                this.f78129g = false;
                m23098b(null);
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78124b.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78123a = false;
            this.f78124b.onNext(obj);
            this.f78126d.produced(1L);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78126d.setProducer(producer);
        }
    }

    public OnSubscribeSwitchIfEmpty(Observable<? extends T> observable, Observable<? extends T> observable2) {
        this.f78119a = observable;
        this.f78120b = observable2;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        SerialSubscription serialSubscription = new SerialSubscription();
        ProducerArbiter producerArbiter = new ProducerArbiter();
        C13514b c13514b = new C13514b(subscriber, serialSubscription, producerArbiter, this.f78120b);
        serialSubscription.set(c13514b);
        subscriber.add(serialSubscription);
        subscriber.setProducer(producerArbiter);
        c13514b.m23098b(this.f78119a);
    }
}
