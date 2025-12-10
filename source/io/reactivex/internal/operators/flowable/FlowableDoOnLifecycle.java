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
public final class FlowableDoOnLifecycle<T> extends AbstractC0567I {

    /* renamed from: b */
    public final Consumer f64244b;

    /* renamed from: c */
    public final LongConsumer f64245c;

    /* renamed from: d */
    public final Action f64246d;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDoOnLifecycle$a */
    /* loaded from: classes5.dex */
    public static final class C10844a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64247a;

        /* renamed from: b */
        public final Consumer f64248b;

        /* renamed from: c */
        public final LongConsumer f64249c;

        /* renamed from: d */
        public final Action f64250d;

        /* renamed from: e */
        public Subscription f64251e;

        public C10844a(Subscriber subscriber, Consumer consumer, LongConsumer longConsumer, Action action) {
            this.f64247a = subscriber;
            this.f64248b = consumer;
            this.f64250d = action;
            this.f64249c = longConsumer;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            Subscription subscription = this.f64251e;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                this.f64251e = subscriptionHelper;
                try {
                    this.f64250d.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
                subscription.cancel();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64251e != SubscriptionHelper.CANCELLED) {
                this.f64247a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64251e != SubscriptionHelper.CANCELLED) {
                this.f64247a.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64247a.onNext(obj);
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            try {
                this.f64248b.accept(subscription);
                if (SubscriptionHelper.validate(this.f64251e, subscription)) {
                    this.f64251e = subscription;
                    this.f64247a.onSubscribe(this);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                subscription.cancel();
                this.f64251e = SubscriptionHelper.CANCELLED;
                EmptySubscription.error(th2, this.f64247a);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            try {
                this.f64249c.accept(j);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.f64251e.request(j);
        }
    }

    public FlowableDoOnLifecycle(Flowable<T> flowable, Consumer<? super Subscription> consumer, LongConsumer longConsumer, Action action) {
        super(flowable);
        this.f64244b = consumer;
        this.f64245c = longConsumer;
        this.f64246d = action;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10844a(subscriber, this.f64244b, this.f64245c, this.f64246d));
    }
}
