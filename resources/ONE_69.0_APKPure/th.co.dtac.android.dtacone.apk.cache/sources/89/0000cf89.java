package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableLastSingle<T> extends Single<T> {

    /* renamed from: a */
    public final Publisher f64440a;

    /* renamed from: b */
    public final Object f64441b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableLastSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10859a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final SingleObserver f64442a;

        /* renamed from: b */
        public final Object f64443b;

        /* renamed from: c */
        public Subscription f64444c;

        /* renamed from: d */
        public Object f64445d;

        public C10859a(SingleObserver singleObserver, Object obj) {
            this.f64442a = singleObserver;
            this.f64443b = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64444c.cancel();
            this.f64444c = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64444c == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64444c = SubscriptionHelper.CANCELLED;
            Object obj = this.f64445d;
            if (obj != null) {
                this.f64445d = null;
                this.f64442a.onSuccess(obj);
                return;
            }
            Object obj2 = this.f64443b;
            if (obj2 != null) {
                this.f64442a.onSuccess(obj2);
            } else {
                this.f64442a.onError(new NoSuchElementException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64444c = SubscriptionHelper.CANCELLED;
            this.f64445d = null;
            this.f64442a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64445d = obj;
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64444c, subscription)) {
                this.f64444c = subscription;
                this.f64442a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableLastSingle(Publisher<T> publisher, T t) {
        this.f64440a = publisher;
        this.f64441b = t;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f64440a.subscribe(new C10859a(singleObserver, this.f64441b));
    }
}