package hu.akarnokd.rxjava.interop;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p046rx.Observable;
import p046rx.Producer;

/* loaded from: classes5.dex */
public final class FlowableV2ToObservableV1 implements Observable.OnSubscribe {

    /* renamed from: a */
    public final Publisher f62626a;

    /* loaded from: classes5.dex */
    public static final class SourceSubscriber<T> extends AtomicReference<Subscription> implements Subscriber<T>, p046rx.Subscription, Producer {
        private static final long serialVersionUID = -6567012932544037069L;
        final p046rx.Subscriber<? super T> actual;
        final AtomicLong requested = new AtomicLong();

        public SourceSubscriber(p046rx.Subscriber<? super T> subscriber) {
            this.actual = subscriber;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return SubscriptionHelper.isCancelled(get());
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.actual.onCompleted();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.actual.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.actual.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber, io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this, this.requested, subscription);
        }

        @Override // p046rx.Producer
        public void request(long j) {
            if (j != 0) {
                SubscriptionHelper.deferredRequest(this, this.requested, j);
            }
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            SubscriptionHelper.cancel(this);
        }
    }

    public FlowableV2ToObservableV1(Publisher publisher) {
        this.f62626a = publisher;
    }

    @Override // p046rx.functions.Action1
    /* renamed from: a */
    public void call(p046rx.Subscriber subscriber) {
        SourceSubscriber sourceSubscriber = new SourceSubscriber(subscriber);
        subscriber.add(sourceSubscriber);
        subscriber.setProducer(sourceSubscriber);
        this.f62626a.subscribe(sourceSubscriber);
    }
}
