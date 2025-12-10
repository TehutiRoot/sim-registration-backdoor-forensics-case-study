package p046rx.internal.operators;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.functions.Action0;
import p046rx.internal.producers.ProducerArbiter;
import p046rx.internal.subscriptions.SequentialSubscription;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OnSubscribeTimeoutTimedWithFallback */
/* loaded from: classes7.dex */
public final class OnSubscribeTimeoutTimedWithFallback<T> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Observable f78148a;

    /* renamed from: b */
    public final long f78149b;

    /* renamed from: c */
    public final TimeUnit f78150c;

    /* renamed from: d */
    public final Scheduler f78151d;

    /* renamed from: e */
    public final Observable f78152e;

    /* renamed from: rx.internal.operators.OnSubscribeTimeoutTimedWithFallback$a */
    /* loaded from: classes7.dex */
    public static final class C13518a extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78153a;

        /* renamed from: b */
        public final ProducerArbiter f78154b;

        public C13518a(Subscriber subscriber, ProducerArbiter producerArbiter) {
            this.f78153a = subscriber;
            this.f78154b = producerArbiter;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78153a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78153a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78153a.onNext(obj);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78154b.setProducer(producer);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeTimeoutTimedWithFallback$b */
    /* loaded from: classes7.dex */
    public static final class C13519b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78155a;

        /* renamed from: b */
        public final long f78156b;

        /* renamed from: c */
        public final TimeUnit f78157c;

        /* renamed from: d */
        public final Scheduler.Worker f78158d;

        /* renamed from: e */
        public final Observable f78159e;

        /* renamed from: f */
        public final ProducerArbiter f78160f = new ProducerArbiter();

        /* renamed from: g */
        public final AtomicLong f78161g = new AtomicLong();

        /* renamed from: h */
        public final SequentialSubscription f78162h;

        /* renamed from: i */
        public final SequentialSubscription f78163i;

        /* renamed from: j */
        public long f78164j;

        /* renamed from: rx.internal.operators.OnSubscribeTimeoutTimedWithFallback$b$a */
        /* loaded from: classes7.dex */
        public final class C13520a implements Action0 {

            /* renamed from: a */
            public final long f78165a;

            public C13520a(long j) {
                this.f78165a = j;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13519b.this.m23094b(this.f78165a);
            }
        }

        public C13519b(Subscriber subscriber, long j, TimeUnit timeUnit, Scheduler.Worker worker, Observable observable) {
            this.f78155a = subscriber;
            this.f78156b = j;
            this.f78157c = timeUnit;
            this.f78158d = worker;
            this.f78159e = observable;
            SequentialSubscription sequentialSubscription = new SequentialSubscription();
            this.f78162h = sequentialSubscription;
            this.f78163i = new SequentialSubscription(this);
            add(worker);
            add(sequentialSubscription);
        }

        /* renamed from: b */
        public void m23094b(long j) {
            if (!this.f78161g.compareAndSet(j, Long.MAX_VALUE)) {
                return;
            }
            unsubscribe();
            if (this.f78159e == null) {
                this.f78155a.onError(new TimeoutException());
                return;
            }
            long j2 = this.f78164j;
            if (j2 != 0) {
                this.f78160f.produced(j2);
            }
            C13518a c13518a = new C13518a(this.f78155a, this.f78160f);
            if (this.f78163i.replace(c13518a)) {
                this.f78159e.subscribe((Subscriber) c13518a);
            }
        }

        /* renamed from: c */
        public void m23093c(long j) {
            this.f78162h.replace(this.f78158d.schedule(new C13520a(j), this.f78156b, this.f78157c));
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78161g.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f78162h.unsubscribe();
                this.f78155a.onCompleted();
                this.f78158d.unsubscribe();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78161g.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f78162h.unsubscribe();
                this.f78155a.onError(th2);
                this.f78158d.unsubscribe();
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            long j = this.f78161g.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.f78161g.compareAndSet(j, j2)) {
                    Subscription subscription = this.f78162h.get();
                    if (subscription != null) {
                        subscription.unsubscribe();
                    }
                    this.f78164j++;
                    this.f78155a.onNext(obj);
                    m23093c(j2);
                }
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78160f.setProducer(producer);
        }
    }

    public OnSubscribeTimeoutTimedWithFallback(Observable<T> observable, long j, TimeUnit timeUnit, Scheduler scheduler, Observable<? extends T> observable2) {
        this.f78148a = observable;
        this.f78149b = j;
        this.f78150c = timeUnit;
        this.f78151d = scheduler;
        this.f78152e = observable2;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        C13519b c13519b = new C13519b(subscriber, this.f78149b, this.f78150c, this.f78151d.createWorker(), this.f78152e);
        subscriber.add(c13519b.f78163i);
        subscriber.setProducer(c13519b.f78160f);
        c13519b.m23093c(0L);
        this.f78148a.subscribe((Subscriber) c13519b);
    }
}
