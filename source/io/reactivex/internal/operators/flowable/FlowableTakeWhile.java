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
public final class FlowableTakeWhile<T> extends AbstractC0567I {

    /* renamed from: b */
    public final Predicate f64584b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableTakeWhile$a */
    /* loaded from: classes5.dex */
    public static final class C10900a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64585a;

        /* renamed from: b */
        public final Predicate f64586b;

        /* renamed from: c */
        public Subscription f64587c;

        /* renamed from: d */
        public boolean f64588d;

        public C10900a(Subscriber subscriber, Predicate predicate) {
            this.f64585a = subscriber;
            this.f64586b = predicate;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f64587c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64588d) {
                return;
            }
            this.f64588d = true;
            this.f64585a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64588d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64588d = true;
            this.f64585a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64588d) {
                return;
            }
            try {
                if (!this.f64586b.test(obj)) {
                    this.f64588d = true;
                    this.f64587c.cancel();
                    this.f64585a.onComplete();
                    return;
                }
                this.f64585a.onNext(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64587c.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64587c, subscription)) {
                this.f64587c = subscription;
                this.f64585a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64587c.request(j);
        }
    }

    public FlowableTakeWhile(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.f64584b = predicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10900a(subscriber, this.f64584b));
    }
}
