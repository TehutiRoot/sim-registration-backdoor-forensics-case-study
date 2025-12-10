package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OnSubscribeDetach */
/* loaded from: classes7.dex */
public final class OnSubscribeDetach<T> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Observable f77927a;

    /* renamed from: rx.internal.operators.OnSubscribeDetach$TerminatedProducer */
    /* loaded from: classes7.dex */
    public enum TerminatedProducer implements Producer {
        INSTANCE;

        @Override // p046rx.Producer
        public void request(long j) {
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeDetach$a */
    /* loaded from: classes7.dex */
    public static final class C13471a implements Producer, Subscription {

        /* renamed from: a */
        public final C13472b f77928a;

        public C13471a(C13472b c13472b) {
            this.f77928a = c13472b;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f77928a.isUnsubscribed();
        }

        @Override // p046rx.Producer
        public void request(long j) {
            this.f77928a.m23126b(j);
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            this.f77928a.m23125c();
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeDetach$b */
    /* loaded from: classes7.dex */
    public static final class C13472b extends Subscriber {

        /* renamed from: a */
        public final AtomicReference f77929a;

        /* renamed from: b */
        public final AtomicReference f77930b = new AtomicReference();

        /* renamed from: c */
        public final AtomicLong f77931c = new AtomicLong();

        public C13472b(Subscriber subscriber) {
            this.f77929a = new AtomicReference(subscriber);
        }

        /* renamed from: b */
        public void m23126b(long j) {
            if (j >= 0) {
                Producer producer = (Producer) this.f77930b.get();
                if (producer != null) {
                    producer.request(j);
                    return;
                }
                BackpressureUtils.getAndAddRequest(this.f77931c, j);
                Producer producer2 = (Producer) this.f77930b.get();
                if (producer2 != null && producer2 != TerminatedProducer.INSTANCE) {
                    producer2.request(this.f77931c.getAndSet(0L));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("n >= 0 required but it was " + j);
        }

        /* renamed from: c */
        public void m23125c() {
            this.f77930b.lazySet(TerminatedProducer.INSTANCE);
            this.f77929a.lazySet(null);
            unsubscribe();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f77930b.lazySet(TerminatedProducer.INSTANCE);
            Subscriber subscriber = (Subscriber) this.f77929a.getAndSet(null);
            if (subscriber != null) {
                subscriber.onCompleted();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f77930b.lazySet(TerminatedProducer.INSTANCE);
            Subscriber subscriber = (Subscriber) this.f77929a.getAndSet(null);
            if (subscriber != null) {
                subscriber.onError(th2);
            } else {
                RxJavaHooks.onError(th2);
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            Subscriber subscriber = (Subscriber) this.f77929a.get();
            if (subscriber != null) {
                subscriber.onNext(obj);
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            if (AbstractC17300An1.m69050a(this.f77930b, null, producer)) {
                producer.request(this.f77931c.getAndSet(0L));
            } else if (this.f77930b.get() == TerminatedProducer.INSTANCE) {
            } else {
                throw new IllegalStateException("Producer already set!");
            }
        }
    }

    public OnSubscribeDetach(Observable<T> observable) {
        this.f77927a = observable;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        C13472b c13472b = new C13472b(subscriber);
        C13471a c13471a = new C13471a(c13472b);
        subscriber.add(c13471a);
        subscriber.setProducer(c13471a);
        this.f77927a.unsafeSubscribe(c13472b);
    }
}
