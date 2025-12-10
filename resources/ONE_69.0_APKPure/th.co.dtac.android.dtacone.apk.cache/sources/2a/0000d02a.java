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
public final class FlowableTakeUntilPredicate<T> extends AbstractC0558I {

    /* renamed from: b */
    public final Predicate f64642b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableTakeUntilPredicate$a */
    /* loaded from: classes5.dex */
    public static final class C10886a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64643a;

        /* renamed from: b */
        public final Predicate f64644b;

        /* renamed from: c */
        public Subscription f64645c;

        /* renamed from: d */
        public boolean f64646d;

        public C10886a(Subscriber subscriber, Predicate predicate) {
            this.f64643a = subscriber;
            this.f64644b = predicate;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f64645c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (!this.f64646d) {
                this.f64646d = true;
                this.f64643a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (!this.f64646d) {
                this.f64646d = true;
                this.f64643a.onError(th2);
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (!this.f64646d) {
                this.f64643a.onNext(obj);
                try {
                    if (this.f64644b.test(obj)) {
                        this.f64646d = true;
                        this.f64645c.cancel();
                        this.f64643a.onComplete();
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f64645c.cancel();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64645c, subscription)) {
                this.f64645c = subscription;
                this.f64643a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64645c.request(j);
        }
    }

    public FlowableTakeUntilPredicate(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.f64642b = predicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10886a(subscriber, this.f64642b));
    }
}