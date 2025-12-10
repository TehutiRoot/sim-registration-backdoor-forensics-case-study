package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;

/* renamed from: rx.internal.operators.DeferredScalarSubscriber */
/* loaded from: classes7.dex */
public abstract class DeferredScalarSubscriber<T, R> extends Subscriber<T> {

    /* renamed from: a */
    public final AtomicInteger f77861a = new AtomicInteger();
    protected final Subscriber<? super R> actual;
    protected boolean hasValue;
    protected R value;

    /* renamed from: rx.internal.operators.DeferredScalarSubscriber$a */
    /* loaded from: classes7.dex */
    public static final class C13455a implements Producer {

        /* renamed from: a */
        public final DeferredScalarSubscriber f77862a;

        public C13455a(DeferredScalarSubscriber deferredScalarSubscriber) {
            this.f77862a = deferredScalarSubscriber;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            this.f77862a.m23137b(j);
        }
    }

    public DeferredScalarSubscriber(Subscriber<? super R> subscriber) {
        this.actual = subscriber;
    }

    /* renamed from: b */
    public final void m23137b(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (i != 0) {
                Subscriber<? super R> subscriber = this.actual;
                do {
                    int i2 = this.f77861a.get();
                    if (i2 != 1 && i2 != 3 && !subscriber.isUnsubscribed()) {
                        if (i2 == 2) {
                            if (this.f77861a.compareAndSet(2, 3)) {
                                subscriber.onNext((R) this.value);
                                if (!subscriber.isUnsubscribed()) {
                                    subscriber.onCompleted();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                } while (!this.f77861a.compareAndSet(0, 1));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("n >= 0 required but it was " + j);
    }

    /* renamed from: c */
    public final void m23136c() {
        Subscriber<? super R> subscriber = this.actual;
        subscriber.add(this);
        subscriber.setProducer(new C13455a(this));
    }

    public final void complete() {
        this.actual.onCompleted();
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        if (this.hasValue) {
            complete(this.value);
        } else {
            complete();
        }
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        this.value = null;
        this.actual.onError(th2);
    }

    @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
    public final void setProducer(Producer producer) {
        producer.request(Long.MAX_VALUE);
    }

    public final void subscribeTo(Observable<? extends T> observable) {
        m23136c();
        observable.unsafeSubscribe(this);
    }

    public final void complete(R r) {
        Subscriber<? super R> subscriber = this.actual;
        do {
            int i = this.f77861a.get();
            if (i == 2 || i == 3 || subscriber.isUnsubscribed()) {
                return;
            }
            if (i == 1) {
                subscriber.onNext(r);
                if (!subscriber.isUnsubscribed()) {
                    subscriber.onCompleted();
                }
                this.f77861a.lazySet(3);
                return;
            }
            this.value = r;
        } while (!this.f77861a.compareAndSet(0, 2));
    }
}
