package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableSkip<T> extends AbstractC0567I {

    /* renamed from: b */
    public final long f64540b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableSkip$a */
    /* loaded from: classes5.dex */
    public static final class C10895a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64541a;

        /* renamed from: b */
        public long f64542b;

        /* renamed from: c */
        public Subscription f64543c;

        public C10895a(Subscriber subscriber, long j) {
            this.f64541a = subscriber;
            this.f64542b = j;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f64543c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64541a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64541a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            long j = this.f64542b;
            if (j != 0) {
                this.f64542b = j - 1;
            } else {
                this.f64541a.onNext(obj);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64543c, subscription)) {
                long j = this.f64542b;
                this.f64543c = subscription;
                this.f64541a.onSubscribe(this);
                subscription.request(j);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64543c.request(j);
        }
    }

    public FlowableSkip(Flowable<T> flowable, long j) {
        super(flowable);
        this.f64540b = j;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10895a(subscriber, this.f64540b));
    }
}
