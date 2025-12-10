package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableSwitchIfEmpty<T> extends AbstractC0558I {

    /* renamed from: b */
    public final Publisher f64623b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableSwitchIfEmpty$a */
    /* loaded from: classes5.dex */
    public static final class C10885a implements FlowableSubscriber {

        /* renamed from: a */
        public final Subscriber f64624a;

        /* renamed from: b */
        public final Publisher f64625b;

        /* renamed from: d */
        public boolean f64627d = true;

        /* renamed from: c */
        public final SubscriptionArbiter f64626c = new SubscriptionArbiter(false);

        public C10885a(Subscriber subscriber, Publisher publisher) {
            this.f64624a = subscriber;
            this.f64625b = publisher;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64627d) {
                this.f64627d = false;
                this.f64625b.subscribe(this);
                return;
            }
            this.f64624a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64624a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64627d) {
                this.f64627d = false;
            }
            this.f64624a.onNext(obj);
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f64626c.setSubscription(subscription);
        }
    }

    public FlowableSwitchIfEmpty(Flowable<T> flowable, Publisher<? extends T> publisher) {
        super(flowable);
        this.f64623b = publisher;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        C10885a c10885a = new C10885a(subscriber, this.f64623b);
        subscriber.onSubscribe(c10885a.f64626c);
        this.source.subscribe((FlowableSubscriber<? super Object>) c10885a);
    }
}