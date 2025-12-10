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
public final class FlowableTimeInterval<T> extends AbstractC0567I {

    /* renamed from: b */
    public final Scheduler f64596b;

    /* renamed from: c */
    public final TimeUnit f64597c;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableTimeInterval$a */
    /* loaded from: classes5.dex */
    public static final class C10901a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64598a;

        /* renamed from: b */
        public final TimeUnit f64599b;

        /* renamed from: c */
        public final Scheduler f64600c;

        /* renamed from: d */
        public Subscription f64601d;

        /* renamed from: e */
        public long f64602e;

        public C10901a(Subscriber subscriber, TimeUnit timeUnit, Scheduler scheduler) {
            this.f64598a = subscriber;
            this.f64600c = scheduler;
            this.f64599b = timeUnit;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f64601d.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64598a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64598a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            long now = this.f64600c.now(this.f64599b);
            long j = this.f64602e;
            this.f64602e = now;
            this.f64598a.onNext(new Timed(obj, now - j, this.f64599b));
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64601d, subscription)) {
                this.f64602e = this.f64600c.now(this.f64599b);
                this.f64601d = subscription;
                this.f64598a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64601d.request(j);
        }
    }

    public FlowableTimeInterval(Flowable<T> flowable, TimeUnit timeUnit, Scheduler scheduler) {
        super(flowable);
        this.f64596b = scheduler;
        this.f64597c = timeUnit;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Timed<T>> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10901a(subscriber, this.f64597c, this.f64596b));
    }
}
