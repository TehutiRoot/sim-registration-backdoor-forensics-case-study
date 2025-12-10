package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableSwitchIfEmpty<T> extends AbstractC0567I {

    /* renamed from: b */
    public final Publisher f64560b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableSwitchIfEmpty$a */
    /* loaded from: classes5.dex */
    public static final class C10898a implements FlowableSubscriber {

        /* renamed from: a */
        public final Subscriber f64561a;

        /* renamed from: b */
        public final Publisher f64562b;

        /* renamed from: d */
        public boolean f64564d = true;

        /* renamed from: c */
        public final SubscriptionArbiter f64563c = new SubscriptionArbiter(false);

        public C10898a(Subscriber subscriber, Publisher publisher) {
            this.f64561a = subscriber;
            this.f64562b = publisher;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64564d) {
                this.f64564d = false;
                this.f64562b.subscribe(this);
                return;
            }
            this.f64561a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64561a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64564d) {
                this.f64564d = false;
            }
            this.f64561a.onNext(obj);
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f64563c.setSubscription(subscription);
        }
    }

    public FlowableSwitchIfEmpty(Flowable<T> flowable, Publisher<? extends T> publisher) {
        super(flowable);
        this.f64560b = publisher;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        C10898a c10898a = new C10898a(subscriber, this.f64560b);
        subscriber.onSubscribe(c10898a.f64563c);
        this.source.subscribe((FlowableSubscriber<? super Object>) c10898a);
    }
}
