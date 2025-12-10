package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableReduceSeedSingle<T, R> extends Single<R> {

    /* renamed from: a */
    public final Publisher f64451a;

    /* renamed from: b */
    public final Object f64452b;

    /* renamed from: c */
    public final BiFunction f64453c;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableReduceSeedSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10880a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final SingleObserver f64454a;

        /* renamed from: b */
        public final BiFunction f64455b;

        /* renamed from: c */
        public Object f64456c;

        /* renamed from: d */
        public Subscription f64457d;

        public C10880a(SingleObserver singleObserver, BiFunction biFunction, Object obj) {
            this.f64454a = singleObserver;
            this.f64456c = obj;
            this.f64455b = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64457d.cancel();
            this.f64457d = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64457d == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            Object obj = this.f64456c;
            if (obj != null) {
                this.f64456c = null;
                this.f64457d = SubscriptionHelper.CANCELLED;
                this.f64454a.onSuccess(obj);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64456c != null) {
                this.f64456c = null;
                this.f64457d = SubscriptionHelper.CANCELLED;
                this.f64454a.onError(th2);
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            Object obj2 = this.f64456c;
            if (obj2 != null) {
                try {
                    this.f64456c = ObjectHelper.requireNonNull(this.f64455b.apply(obj2, obj), "The reducer returned a null value");
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f64457d.cancel();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64457d, subscription)) {
                this.f64457d = subscription;
                this.f64454a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableReduceSeedSingle(Publisher<T> publisher, R r, BiFunction<R, ? super T, R> biFunction) {
        this.f64451a = publisher;
        this.f64452b = r;
        this.f64453c = biFunction;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        this.f64451a.subscribe(new C10880a(singleObserver, this.f64453c, this.f64452b));
    }
}
