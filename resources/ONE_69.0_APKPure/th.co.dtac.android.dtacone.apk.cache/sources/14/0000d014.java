package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableSkipWhile<T> extends AbstractC0558I {

    /* renamed from: b */
    public final Predicate f64614b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableSkipWhile$a */
    /* loaded from: classes5.dex */
    public static final class C10883a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64615a;

        /* renamed from: b */
        public final Predicate f64616b;

        /* renamed from: c */
        public Subscription f64617c;

        /* renamed from: d */
        public boolean f64618d;

        public C10883a(Subscriber subscriber, Predicate predicate) {
            this.f64615a = subscriber;
            this.f64616b = predicate;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f64617c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64615a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64615a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64618d) {
                this.f64615a.onNext(obj);
                return;
            }
            try {
                if (this.f64616b.test(obj)) {
                    this.f64617c.request(1L);
                    return;
                }
                this.f64618d = true;
                this.f64615a.onNext(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64617c.cancel();
                this.f64615a.onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64617c, subscription)) {
                this.f64617c = subscription;
                this.f64615a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64617c.request(j);
        }
    }

    public FlowableSkipWhile(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.f64614b = predicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10883a(subscriber, this.f64614b));
    }
}