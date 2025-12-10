package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.LongConsumer;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableDoOnLifecycle<T> extends AbstractC0558I {

    /* renamed from: b */
    public final Consumer f64307b;

    /* renamed from: c */
    public final LongConsumer f64308c;

    /* renamed from: d */
    public final Action f64309d;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDoOnLifecycle$a */
    /* loaded from: classes5.dex */
    public static final class C10831a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64310a;

        /* renamed from: b */
        public final Consumer f64311b;

        /* renamed from: c */
        public final LongConsumer f64312c;

        /* renamed from: d */
        public final Action f64313d;

        /* renamed from: e */
        public Subscription f64314e;

        public C10831a(Subscriber subscriber, Consumer consumer, LongConsumer longConsumer, Action action) {
            this.f64310a = subscriber;
            this.f64311b = consumer;
            this.f64313d = action;
            this.f64312c = longConsumer;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            Subscription subscription = this.f64314e;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                this.f64314e = subscriptionHelper;
                try {
                    this.f64313d.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
                subscription.cancel();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64314e != SubscriptionHelper.CANCELLED) {
                this.f64310a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64314e != SubscriptionHelper.CANCELLED) {
                this.f64310a.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64310a.onNext(obj);
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            try {
                this.f64311b.accept(subscription);
                if (SubscriptionHelper.validate(this.f64314e, subscription)) {
                    this.f64314e = subscription;
                    this.f64310a.onSubscribe(this);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                subscription.cancel();
                this.f64314e = SubscriptionHelper.CANCELLED;
                EmptySubscription.error(th2, this.f64310a);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            try {
                this.f64312c.accept(j);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f64314e.request(j);
        }
    }

    public FlowableDoOnLifecycle(Flowable<T> flowable, Consumer<? super Subscription> consumer, LongConsumer longConsumer, Action action) {
        super(flowable);
        this.f64307b = consumer;
        this.f64308c = longConsumer;
        this.f64309d = action;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10831a(subscriber, this.f64307b, this.f64308c, this.f64309d));
    }
}