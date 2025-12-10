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
    public final Publisher f64436a;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableLastMaybe$a */
    /* loaded from: classes5.dex */
    public static final class C10858a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64437a;

        /* renamed from: b */
        public Subscription f64438b;

        /* renamed from: c */
        public Object f64439c;

        public C10858a(MaybeObserver maybeObserver) {
            this.f64437a = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64438b.cancel();
            this.f64438b = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64438b == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64438b = SubscriptionHelper.CANCELLED;
            Object obj = this.f64439c;
            if (obj != null) {
                this.f64439c = null;
                this.f64437a.onSuccess(obj);
                return;
            }
            this.f64437a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64438b = SubscriptionHelper.CANCELLED;
            this.f64439c = null;
            this.f64437a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64439c = obj;
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64438b, subscription)) {
                this.f64438b = subscription;
                this.f64437a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableLastMaybe(Publisher<T> publisher) {
        this.f64436a = publisher;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f64436a.subscribe(new C10858a(maybeObserver));
    }
}