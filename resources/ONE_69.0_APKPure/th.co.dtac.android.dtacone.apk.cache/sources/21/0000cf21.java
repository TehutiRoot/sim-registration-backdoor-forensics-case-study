package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EmptyComponent;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableDetach<T> extends AbstractC0558I {

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDetach$a */
    /* loaded from: classes5.dex */
    public static final class C10823a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public Subscriber f64273a;

        /* renamed from: b */
        public Subscription f64274b;

        public C10823a(Subscriber subscriber) {
            this.f64273a = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            Subscription subscription = this.f64274b;
            this.f64274b = EmptyComponent.INSTANCE;
            this.f64273a = EmptyComponent.asSubscriber();
            subscription.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            Subscriber subscriber = this.f64273a;
            this.f64274b = EmptyComponent.INSTANCE;
            this.f64273a = EmptyComponent.asSubscriber();
            subscriber.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            Subscriber subscriber = this.f64273a;
            this.f64274b = EmptyComponent.INSTANCE;
            this.f64273a = EmptyComponent.asSubscriber();
            subscriber.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64273a.onNext(obj);
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64274b, subscription)) {
                this.f64274b = subscription;
                this.f64273a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64274b.request(j);
        }
    }

    public FlowableDetach(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10823a(subscriber));
    }
}