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
    public final Publisher f64377a;

    /* renamed from: b */
    public final Object f64378b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableLastSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10872a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final SingleObserver f64379a;

        /* renamed from: b */
        public final Object f64380b;

        /* renamed from: c */
        public Subscription f64381c;

        /* renamed from: d */
        public Object f64382d;

        public C10872a(SingleObserver singleObserver, Object obj) {
            this.f64379a = singleObserver;
            this.f64380b = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64381c.cancel();
            this.f64381c = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64381c == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64381c = SubscriptionHelper.CANCELLED;
            Object obj = this.f64382d;
            if (obj != null) {
                this.f64382d = null;
                this.f64379a.onSuccess(obj);
                return;
            }
            Object obj2 = this.f64380b;
            if (obj2 != null) {
                this.f64379a.onSuccess(obj2);
            } else {
                this.f64379a.onError(new NoSuchElementException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64381c = SubscriptionHelper.CANCELLED;
            this.f64382d = null;
            this.f64379a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64382d = obj;
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64381c, subscription)) {
                this.f64381c = subscription;
                this.f64379a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableLastSingle(Publisher<T> publisher, T t) {
        this.f64377a = publisher;
        this.f64378b = t;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f64377a.subscribe(new C10872a(singleObserver, this.f64378b));
    }
}
