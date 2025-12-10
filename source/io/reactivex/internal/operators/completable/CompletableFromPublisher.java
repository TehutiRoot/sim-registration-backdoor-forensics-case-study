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
    public final Publisher f63933a;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableFromPublisher$a */
    /* loaded from: classes5.dex */
    public static final class C10794a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final CompletableObserver f63934a;

        /* renamed from: b */
        public Subscription f63935b;

        public C10794a(CompletableObserver completableObserver) {
            this.f63934a = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f63935b.cancel();
            this.f63935b = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f63935b == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f63934a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f63934a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f63935b, subscription)) {
                this.f63935b = subscription;
                this.f63934a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public CompletableFromPublisher(Publisher<T> publisher) {
        this.f63933a = publisher;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f63933a.subscribe(new C10794a(completableObserver));
    }
}
