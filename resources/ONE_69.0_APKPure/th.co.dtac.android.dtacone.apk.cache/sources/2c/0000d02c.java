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
public final class FlowableTakeWhile<T> extends AbstractC0558I {

    /* renamed from: b */
    public final Predicate f64647b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableTakeWhile$a */
    /* loaded from: classes5.dex */
    public static final class C10887a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64648a;

        /* renamed from: b */
        public final Predicate f64649b;

        /* renamed from: c */
        public Subscription f64650c;

        /* renamed from: d */
        public boolean f64651d;

        public C10887a(Subscriber subscriber, Predicate predicate) {
            this.f64648a = subscriber;
            this.f64649b = predicate;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f64650c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64651d) {
                return;
            }
            this.f64651d = true;
            this.f64648a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64651d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64651d = true;
            this.f64648a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64651d) {
                return;
            }
            try {
                if (!this.f64649b.test(obj)) {
                    this.f64651d = true;
                    this.f64650c.cancel();
                    this.f64648a.onComplete();
                    return;
                }
                this.f64648a.onNext(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64650c.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64650c, subscription)) {
                this.f64650c = subscription;
                this.f64648a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64650c.request(j);
        }
    }

    public FlowableTakeWhile(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.f64647b = predicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10887a(subscriber, this.f64647b));
    }
}