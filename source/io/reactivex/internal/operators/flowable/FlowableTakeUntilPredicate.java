package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableTakeUntilPredicate<T> extends AbstractC0567I {

    /* renamed from: b */
    public final Predicate f64579b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableTakeUntilPredicate$a */
    /* loaded from: classes5.dex */
    public static final class C10899a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64580a;

        /* renamed from: b */
        public final Predicate f64581b;

        /* renamed from: c */
        public Subscription f64582c;

        /* renamed from: d */
        public boolean f64583d;

        public C10899a(Subscriber subscriber, Predicate predicate) {
            this.f64580a = subscriber;
            this.f64581b = predicate;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f64582c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (!this.f64583d) {
                this.f64583d = true;
                this.f64580a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (!this.f64583d) {
                this.f64583d = true;
                this.f64580a.onError(th2);
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (!this.f64583d) {
                this.f64580a.onNext(obj);
                try {
                    if (this.f64581b.test(obj)) {
                        this.f64583d = true;
                        this.f64582c.cancel();
                        this.f64580a.onComplete();
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f64582c.cancel();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64582c, subscription)) {
                this.f64582c = subscription;
                this.f64580a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64582c.request(j);
        }
    }

    public FlowableTakeUntilPredicate(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.f64579b = predicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10899a(subscriber, this.f64579b));
    }
}
