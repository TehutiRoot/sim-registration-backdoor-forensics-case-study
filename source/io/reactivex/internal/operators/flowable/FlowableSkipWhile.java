package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableSkipWhile<T> extends AbstractC0567I {

    /* renamed from: b */
    public final Predicate f64551b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableSkipWhile$a */
    /* loaded from: classes5.dex */
    public static final class C10896a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64552a;

        /* renamed from: b */
        public final Predicate f64553b;

        /* renamed from: c */
        public Subscription f64554c;

        /* renamed from: d */
        public boolean f64555d;

        public C10896a(Subscriber subscriber, Predicate predicate) {
            this.f64552a = subscriber;
            this.f64553b = predicate;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f64554c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64552a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64552a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64555d) {
                this.f64552a.onNext(obj);
                return;
            }
            try {
                if (this.f64553b.test(obj)) {
                    this.f64554c.request(1L);
                    return;
                }
                this.f64555d = true;
                this.f64552a.onNext(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64554c.cancel();
                this.f64552a.onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64554c, subscription)) {
                this.f64554c = subscription;
                this.f64552a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64554c.request(j);
        }
    }

    public FlowableSkipWhile(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.f64551b = predicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10896a(subscriber, this.f64551b));
    }
}
