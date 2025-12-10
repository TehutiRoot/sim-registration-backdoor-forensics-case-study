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
    public final Publisher f65358a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableFromPublisher$a */
    /* loaded from: classes5.dex */
    public static final class C10993a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final Observer f65359a;

        /* renamed from: b */
        public Subscription f65360b;

        public C10993a(Observer observer) {
            this.f65359a = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65360b.cancel();
            this.f65360b = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f65360b == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f65359a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f65359a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f65359a.onNext(obj);
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f65360b, subscription)) {
                this.f65360b = subscription;
                this.f65359a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public ObservableFromPublisher(Publisher<? extends T> publisher) {
        this.f65358a = publisher;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f65358a.subscribe(new C10993a(observer));
    }
}