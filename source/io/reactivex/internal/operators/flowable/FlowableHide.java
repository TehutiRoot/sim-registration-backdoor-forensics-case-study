package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableHide<T> extends AbstractC0567I {

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableHide$a */
    /* loaded from: classes5.dex */
    public static final class C10853a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64325a;

        /* renamed from: b */
        public Subscription f64326b;

        public C10853a(Subscriber subscriber) {
            this.f64325a = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f64326b.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64325a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64325a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64325a.onNext(obj);
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64326b, subscription)) {
                this.f64326b = subscription;
                this.f64325a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64326b.request(j);
        }
    }

    public FlowableHide(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10853a(subscriber));
    }
}
