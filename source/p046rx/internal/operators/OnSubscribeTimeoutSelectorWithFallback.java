package p046rx.internal.operators;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func1;
import p046rx.internal.operators.OnSubscribeTimeoutTimedWithFallback;
import p046rx.internal.producers.ProducerArbiter;
import p046rx.internal.subscriptions.SequentialSubscription;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OnSubscribeTimeoutSelectorWithFallback */
/* loaded from: classes7.dex */
public final class OnSubscribeTimeoutSelectorWithFallback<T, U, V> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Observable f78133a;

    /* renamed from: b */
    public final Observable f78134b;

    /* renamed from: c */
    public final Func1 f78135c;

    /* renamed from: d */
    public final Observable f78136d;

    /* renamed from: rx.internal.operators.OnSubscribeTimeoutSelectorWithFallback$a */
    /* loaded from: classes7.dex */
    public static final class C13516a extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78137a;

        /* renamed from: b */
        public final Func1 f78138b;

        /* renamed from: c */
        public final Observable f78139c;

        /* renamed from: d */
        public final ProducerArbiter f78140d = new ProducerArbiter();

        /* renamed from: e */
        public final AtomicLong f78141e = new AtomicLong();

        /* renamed from: f */
        public final SequentialSubscription f78142f;

        /* renamed from: g */
        public final SequentialSubscription f78143g;

        /* renamed from: h */
        public long f78144h;

        /* renamed from: rx.internal.operators.OnSubscribeTimeoutSelectorWithFallback$a$a */
        /* loaded from: classes7.dex */
        public final class C13517a extends Subscriber {

            /* renamed from: a */
            public final long f78145a;

            /* renamed from: b */
            public boolean f78146b;

            public C13517a(long j) {
                this.f78145a = j;
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                if (!this.f78146b) {
                    this.f78146b = true;
                    C13516a.this.m23097b(this.f78145a);
                }
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                if (!this.f78146b) {
                    this.f78146b = true;
                    C13516a.this.m23096c(this.f78145a, th2);
                    return;
                }
                RxJavaHooks.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                if (!this.f78146b) {
                    this.f78146b = true;
                    unsubscribe();
                    C13516a.this.m23097b(this.f78145a);
                }
            }
        }

        public C13516a(Subscriber subscriber, Func1 func1, Observable observable) {
            this.f78137a = subscriber;
            this.f78138b = func1;
            this.f78139c = observable;
            SequentialSubscription sequentialSubscription = new SequentialSubscription();
            this.f78142f = sequentialSubscription;
            this.f78143g = new SequentialSubscription(this);
            add(sequentialSubscription);
        }

        /* renamed from: b */
        public void m23097b(long j) {
            if (!this.f78141e.compareAndSet(j, Long.MAX_VALUE)) {
                return;
            }
            unsubscribe();
            if (this.f78139c == null) {
                this.f78137a.onError(new TimeoutException());
                return;
            }
            long j2 = this.f78144h;
            if (j2 != 0) {
                this.f78140d.produced(j2);
            }
            OnSubscribeTimeoutTimedWithFallback.C13518a c13518a = new OnSubscribeTimeoutTimedWithFallback.C13518a(this.f78137a, this.f78140d);
            if (this.f78143g.replace(c13518a)) {
                this.f78139c.subscribe((Subscriber) c13518a);
            }
        }

        /* renamed from: c */
        public void m23096c(long j, Throwable th2) {
            if (this.f78141e.compareAndSet(j, Long.MAX_VALUE)) {
                unsubscribe();
                this.f78137a.onError(th2);
                return;
            }
            RxJavaHooks.onError(th2);
        }

        /* renamed from: d */
        public void m23095d(Observable observable) {
            if (observable != null) {
                C13517a c13517a = new C13517a(0L);
                if (this.f78142f.replace(c13517a)) {
                    observable.subscribe((Subscriber) c13517a);
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78141e.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f78142f.unsubscribe();
                this.f78137a.onCompleted();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78141e.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f78142f.unsubscribe();
                this.f78137a.onError(th2);
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            long j = this.f78141e.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.f78141e.compareAndSet(j, j2)) {
                    Subscription subscription = this.f78142f.get();
                    if (subscription != null) {
                        subscription.unsubscribe();
                    }
                    this.f78137a.onNext(obj);
                    this.f78144h++;
                    try {
                        Observable observable = (Observable) this.f78138b.call(obj);
                        if (observable != null) {
                            C13517a c13517a = new C13517a(j2);
                            if (this.f78142f.replace(c13517a)) {
                                observable.subscribe((Subscriber) c13517a);
                                return;
                            }
                            return;
                        }
                        throw new NullPointerException("The itemTimeoutIndicator returned a null Observable");
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        unsubscribe();
                        this.f78141e.getAndSet(Long.MAX_VALUE);
                        this.f78137a.onError(th2);
                    }
                }
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78140d.setProducer(producer);
        }
    }

    public OnSubscribeTimeoutSelectorWithFallback(Observable<T> observable, Observable<U> observable2, Func1<? super T, ? extends Observable<V>> func1, Observable<? extends T> observable3) {
        this.f78133a = observable;
        this.f78134b = observable2;
        this.f78135c = func1;
        this.f78136d = observable3;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        C13516a c13516a = new C13516a(subscriber, this.f78135c, this.f78136d);
        subscriber.add(c13516a.f78143g);
        subscriber.setProducer(c13516a.f78140d);
        c13516a.m23095d(this.f78134b);
        this.f78133a.subscribe((Subscriber) c13516a);
    }
}
