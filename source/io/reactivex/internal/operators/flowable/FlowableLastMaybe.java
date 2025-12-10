package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableLastMaybe<T> extends Maybe<T> {

    /* renamed from: a */
    public final Publisher f64373a;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableLastMaybe$a */
    /* loaded from: classes5.dex */
    public static final class C10871a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64374a;

        /* renamed from: b */
        public Subscription f64375b;

        /* renamed from: c */
        public Object f64376c;

        public C10871a(MaybeObserver maybeObserver) {
            this.f64374a = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64375b.cancel();
            this.f64375b = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64375b == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64375b = SubscriptionHelper.CANCELLED;
            Object obj = this.f64376c;
            if (obj != null) {
                this.f64376c = null;
                this.f64374a.onSuccess(obj);
                return;
            }
            this.f64374a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64375b = SubscriptionHelper.CANCELLED;
            this.f64376c = null;
            this.f64374a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64376c = obj;
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64375b, subscription)) {
                this.f64375b = subscription;
                this.f64374a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableLastMaybe(Publisher<T> publisher) {
        this.f64373a = publisher;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f64373a.subscribe(new C10871a(maybeObserver));
    }
}
