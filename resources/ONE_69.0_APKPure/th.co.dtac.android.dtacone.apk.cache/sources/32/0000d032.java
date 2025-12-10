package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.schedulers.Timed;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableTimeInterval<T> extends AbstractC0558I {

    /* renamed from: b */
    public final Scheduler f64659b;

    /* renamed from: c */
    public final TimeUnit f64660c;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableTimeInterval$a */
    /* loaded from: classes5.dex */
    public static final class C10888a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64661a;

        /* renamed from: b */
        public final TimeUnit f64662b;

        /* renamed from: c */
        public final Scheduler f64663c;

        /* renamed from: d */
        public Subscription f64664d;

        /* renamed from: e */
        public long f64665e;

        public C10888a(Subscriber subscriber, TimeUnit timeUnit, Scheduler scheduler) {
            this.f64661a = subscriber;
            this.f64663c = scheduler;
            this.f64662b = timeUnit;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f64664d.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64661a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64661a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            long now = this.f64663c.now(this.f64662b);
            long j = this.f64665e;
            this.f64665e = now;
            this.f64661a.onNext(new Timed(obj, now - j, this.f64662b));
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64664d, subscription)) {
                this.f64665e = this.f64663c.now(this.f64662b);
                this.f64664d = subscription;
                this.f64661a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64664d.request(j);
        }
    }

    public FlowableTimeInterval(Flowable<T> flowable, TimeUnit timeUnit, Scheduler scheduler) {
        super(flowable);
        this.f64659b = scheduler;
        this.f64660c = timeUnit;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Timed<T>> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10888a(subscriber, this.f64660c, this.f64659b));
    }
}