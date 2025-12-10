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
    public final Observable f78133a;

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
    public static final class C13472a implements Producer, Subscription {

        /* renamed from: a */
        public final C13473b f78134a;

        public C13472a(C13473b c13473b) {
            this.f78134a = c13473b;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f78134a.isUnsubscribed();
        }

        @Override // p046rx.Producer
        public void request(long j) {
            this.f78134a.m23314b(j);
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            this.f78134a.m23313c();
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeDetach$b */
    /* loaded from: classes7.dex */
    public static final class C13473b extends Subscriber {

        /* renamed from: a */
        public final AtomicReference f78135a;

        /* renamed from: b */
        public final AtomicReference f78136b = new AtomicReference();

        /* renamed from: c */
        public final AtomicLong f78137c = new AtomicLong();

        public C13473b(Subscriber subscriber) {
            this.f78135a = new AtomicReference(subscriber);
        }

        /* renamed from: b */
        public void m23314b(long j) {
            if (j >= 0) {
                Producer producer = (Producer) this.f78136b.get();
                if (producer != null) {
                    producer.request(j);
                    return;
                }
                BackpressureUtils.getAndAddRequest(this.f78137c, j);
                Producer producer2 = (Producer) this.f78136b.get();
                if (producer2 != null && producer2 != TerminatedProducer.INSTANCE) {
                    producer2.request(this.f78137c.getAndSet(0L));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("n >= 0 required but it was " + j);
        }

        /* renamed from: c */
        public void m23313c() {
            this.f78136b.lazySet(TerminatedProducer.INSTANCE);
            this.f78135a.lazySet(null);
            unsubscribe();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78136b.lazySet(TerminatedProducer.INSTANCE);
            Subscriber subscriber = (Subscriber) this.f78135a.getAndSet(null);
            if (subscriber != null) {
                subscriber.onCompleted();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78136b.lazySet(TerminatedProducer.INSTANCE);
            Subscriber subscriber = (Subscriber) this.f78135a.getAndSet(null);
            if (subscriber != null) {
                subscriber.onError(th2);
            } else {
                RxJavaHooks.onError(th2);
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            Subscriber subscriber = (Subscriber) this.f78135a.get();
            if (subscriber != null) {
                subscriber.onNext(obj);
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            if (AbstractC23094xo1.m479a(this.f78136b, null, producer)) {
                producer.request(this.f78137c.getAndSet(0L));
            } else if (this.f78136b.get() == TerminatedProducer.INSTANCE) {
            } else {
                throw new IllegalStateException("Producer already set!");
            }
        }
    }

    public OnSubscribeDetach(Observable<T> observable) {
        this.f78133a = observable;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        C13473b c13473b = new C13473b(subscriber);
        C13472a c13472a = new C13472a(c13473b);
        subscriber.add(c13472a);
        subscriber.setProducer(c13472a);
        this.f78133a.unsafeSubscribe(c13473b);
    }
}