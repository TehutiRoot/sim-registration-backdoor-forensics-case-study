package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class CompletableFromPublisher<T> extends Completable {

    /* renamed from: a */
    public final Publisher f63996a;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableFromPublisher$a */
    /* loaded from: classes5.dex */
    public static final class C10781a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final CompletableObserver f63997a;

        /* renamed from: b */
        public Subscription f63998b;

        public C10781a(CompletableObserver completableObserver) {
            this.f63997a = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f63998b.cancel();
            this.f63998b = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f63998b == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f63997a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f63997a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f63998b, subscription)) {
                this.f63998b = subscription;
                this.f63997a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public CompletableFromPublisher(Publisher<T> publisher) {
        this.f63996a = publisher;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f63996a.subscribe(new C10781a(completableObserver));
    }
}