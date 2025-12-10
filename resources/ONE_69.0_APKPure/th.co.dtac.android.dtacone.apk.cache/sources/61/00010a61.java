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
    public final Observable f78325a;

    /* renamed from: b */
    public final Observable f78326b;

    /* renamed from: rx.internal.operators.OnSubscribeSwitchIfEmpty$a */
    /* loaded from: classes7.dex */
    public static final class C13514a extends Subscriber {

        /* renamed from: a */
        public final ProducerArbiter f78327a;

        /* renamed from: b */
        public final Subscriber f78328b;

        public C13514a(Subscriber subscriber, ProducerArbiter producerArbiter) {
            this.f78328b = subscriber;
            this.f78327a = producerArbiter;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78328b.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78328b.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78328b.onNext(obj);
            this.f78327a.produced(1L);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78327a.setProducer(producer);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeSwitchIfEmpty$b */
    /* loaded from: classes7.dex */
    public static final class C13515b extends Subscriber {

        /* renamed from: b */
        public final Subscriber f78330b;

        /* renamed from: c */
        public final SerialSubscription f78331c;

        /* renamed from: d */
        public final ProducerArbiter f78332d;

        /* renamed from: e */
        public final Observable f78333e;

        /* renamed from: g */
        public volatile boolean f78335g;

        /* renamed from: a */
        public boolean f78329a = true;

        /* renamed from: f */
        public final AtomicInteger f78334f = new AtomicInteger();

        public C13515b(Subscriber subscriber, SerialSubscription serialSubscription, ProducerArbiter producerArbiter, Observable observable) {
            this.f78330b = subscriber;
            this.f78331c = serialSubscription;
            this.f78332d = producerArbiter;
            this.f78333e = observable;
        }

        /* renamed from: b */
        public void m23286b(Observable observable) {
            if (this.f78334f.getAndIncrement() == 0) {
                while (!this.f78330b.isUnsubscribed()) {
                    if (!this.f78335g) {
                        if (observable == null) {
                            C13514a c13514a = new C13514a(this.f78330b, this.f78332d);
                            this.f78331c.set(c13514a);
                            this.f78335g = true;
                            this.f78333e.unsafeSubscribe(c13514a);
                        } else {
                            this.f78335g = true;
                            observable.unsafeSubscribe(this);
                            observable = null;
                        }
                    }
                    if (this.f78334f.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78329a) {
                this.f78330b.onCompleted();
            } else if (!this.f78330b.isUnsubscribed()) {
                this.f78335g = false;
                m23286b(null);
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78330b.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78329a = false;
            this.f78330b.onNext(obj);
            this.f78332d.produced(1L);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78332d.setProducer(producer);
        }
    }

    public OnSubscribeSwitchIfEmpty(Observable<? extends T> observable, Observable<? extends T> observable2) {
        this.f78325a = observable;
        this.f78326b = observable2;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        SerialSubscription serialSubscription = new SerialSubscription();
        ProducerArbiter producerArbiter = new ProducerArbiter();
        C13515b c13515b = new C13515b(subscriber, serialSubscription, producerArbiter, this.f78326b);
        serialSubscription.set(c13515b);
        subscriber.add(serialSubscription);
        subscriber.setProducer(producerArbiter);
        c13515b.m23286b(this.f78325a);
    }
}