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
    public final Observable f78339a;

    /* renamed from: b */
    public final Observable f78340b;

    /* renamed from: c */
    public final Func1 f78341c;

    /* renamed from: d */
    public final Observable f78342d;

    /* renamed from: rx.internal.operators.OnSubscribeTimeoutSelectorWithFallback$a */
    /* loaded from: classes7.dex */
    public static final class C13517a extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78343a;

        /* renamed from: b */
        public final Func1 f78344b;

        /* renamed from: c */
        public final Observable f78345c;

        /* renamed from: d */
        public final ProducerArbiter f78346d = new ProducerArbiter();

        /* renamed from: e */
        public final AtomicLong f78347e = new AtomicLong();

        /* renamed from: f */
        public final SequentialSubscription f78348f;

        /* renamed from: g */
        public final SequentialSubscription f78349g;

        /* renamed from: h */
        public long f78350h;

        /* renamed from: rx.internal.operators.OnSubscribeTimeoutSelectorWithFallback$a$a */
        /* loaded from: classes7.dex */
        public final class C13518a extends Subscriber {

            /* renamed from: a */
            public final long f78351a;

            /* renamed from: b */
            public boolean f78352b;

            public C13518a(long j) {
                this.f78351a = j;
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                if (!this.f78352b) {
                    this.f78352b = true;
                    C13517a.this.m23285b(this.f78351a);
                }
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                if (!this.f78352b) {
                    this.f78352b = true;
                    C13517a.this.m23284c(this.f78351a, th2);
                    return;
                }
                RxJavaHooks.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                if (!this.f78352b) {
                    this.f78352b = true;
                    unsubscribe();
                    C13517a.this.m23285b(this.f78351a);
                }
            }
        }

        public C13517a(Subscriber subscriber, Func1 func1, Observable observable) {
            this.f78343a = subscriber;
            this.f78344b = func1;
            this.f78345c = observable;
            SequentialSubscription sequentialSubscription = new SequentialSubscription();
            this.f78348f = sequentialSubscription;
            this.f78349g = new SequentialSubscription(this);
            add(sequentialSubscription);
        }

        /* renamed from: b */
        public void m23285b(long j) {
            if (!this.f78347e.compareAndSet(j, Long.MAX_VALUE)) {
                return;
            }
            unsubscribe();
            if (this.f78345c == null) {
                this.f78343a.onError(new TimeoutException());
                return;
            }
            long j2 = this.f78350h;
            if (j2 != 0) {
                this.f78346d.produced(j2);
            }
            OnSubscribeTimeoutTimedWithFallback.C13519a c13519a = new OnSubscribeTimeoutTimedWithFallback.C13519a(this.f78343a, this.f78346d);
            if (this.f78349g.replace(c13519a)) {
                this.f78345c.subscribe((Subscriber) c13519a);
            }
        }

        /* renamed from: c */
        public void m23284c(long j, Throwable th2) {
            if (this.f78347e.compareAndSet(j, Long.MAX_VALUE)) {
                unsubscribe();
                this.f78343a.onError(th2);
                return;
            }
            RxJavaHooks.onError(th2);
        }

        /* renamed from: d */
        public void m23283d(Observable observable) {
            if (observable != null) {
                C13518a c13518a = new C13518a(0L);
                if (this.f78348f.replace(c13518a)) {
                    observable.subscribe((Subscriber) c13518a);
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78347e.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f78348f.unsubscribe();
                this.f78343a.onCompleted();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78347e.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f78348f.unsubscribe();
                this.f78343a.onError(th2);
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            long j = this.f78347e.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.f78347e.compareAndSet(j, j2)) {
                    Subscription subscription = this.f78348f.get();
                    if (subscription != null) {
                        subscription.unsubscribe();
                    }
                    this.f78343a.onNext(obj);
                    this.f78350h++;
                    try {
                        Observable observable = (Observable) this.f78344b.call(obj);
                        if (observable != null) {
                            C13518a c13518a = new C13518a(j2);
                            if (this.f78348f.replace(c13518a)) {
                                observable.subscribe((Subscriber) c13518a);
                                return;
                            }
                            return;
                        }
                        throw new NullPointerException("The itemTimeoutIndicator returned a null Observable");
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        unsubscribe();
                        this.f78347e.getAndSet(Long.MAX_VALUE);
                        this.f78343a.onError(th2);
                    }
                }
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78346d.setProducer(producer);
        }
    }

    public OnSubscribeTimeoutSelectorWithFallback(Observable<T> observable, Observable<U> observable2, Func1<? super T, ? extends Observable<V>> func1, Observable<? extends T> observable3) {
        this.f78339a = observable;
        this.f78340b = observable2;
        this.f78341c = func1;
        this.f78342d = observable3;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        C13517a c13517a = new C13517a(subscriber, this.f78341c, this.f78342d);
        subscriber.add(c13517a.f78349g);
        subscriber.setProducer(c13517a.f78346d);
        c13517a.m23283d(this.f78340b);
        this.f78339a.subscribe((Subscriber) c13517a);
    }
}