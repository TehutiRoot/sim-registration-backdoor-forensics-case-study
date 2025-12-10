package io.reactivex.internal.operators.observable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class ObservableFromPublisher<T> extends Observable<T> {

    /* renamed from: a */
    public final Publisher f65295a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableFromPublisher$a */
    /* loaded from: classes5.dex */
    public static final class C11006a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final Observer f65296a;

        /* renamed from: b */
        public Subscription f65297b;

        public C11006a(Observer observer) {
            this.f65296a = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65297b.cancel();
            this.f65297b = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f65297b == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f65296a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f65296a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f65296a.onNext(obj);
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f65297b, subscription)) {
                this.f65297b = subscription;
                this.f65296a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public ObservableFromPublisher(Publisher<? extends T> publisher) {
        this.f65295a = publisher;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f65295a.subscribe(new C11006a(observer));
    }
}
