package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableHide<T> extends AbstractC0558I {

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableHide$a */
    /* loaded from: classes5.dex */
    public static final class C10840a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64388a;

        /* renamed from: b */
        public Subscription f64389b;

        public C10840a(Subscriber subscriber) {
            this.f64388a = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f64389b.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64388a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64388a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64388a.onNext(obj);
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64389b, subscription)) {
                this.f64389b = subscription;
                this.f64388a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64389b.request(j);
        }
    }

    public FlowableHide(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10840a(subscriber));
    }
}