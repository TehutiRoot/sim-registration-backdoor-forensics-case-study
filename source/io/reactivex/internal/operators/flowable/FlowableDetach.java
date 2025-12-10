package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EmptyComponent;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableDetach<T> extends AbstractC0567I {

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDetach$a */
    /* loaded from: classes5.dex */
    public static final class C10836a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public Subscriber f64210a;

        /* renamed from: b */
        public Subscription f64211b;

        public C10836a(Subscriber subscriber) {
            this.f64210a = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            Subscription subscription = this.f64211b;
            this.f64211b = EmptyComponent.INSTANCE;
            this.f64210a = EmptyComponent.asSubscriber();
            subscription.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            Subscriber subscriber = this.f64210a;
            this.f64211b = EmptyComponent.INSTANCE;
            this.f64210a = EmptyComponent.asSubscriber();
            subscriber.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            Subscriber subscriber = this.f64210a;
            this.f64211b = EmptyComponent.INSTANCE;
            this.f64210a = EmptyComponent.asSubscriber();
            subscriber.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64210a.onNext(obj);
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64211b, subscription)) {
                this.f64211b = subscription;
                this.f64210a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64211b.request(j);
        }
    }

    public FlowableDetach(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10836a(subscriber));
    }
}
