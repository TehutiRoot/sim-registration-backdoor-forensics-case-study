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
    public final Publisher f64514a;

    /* renamed from: b */
    public final Object f64515b;

    /* renamed from: c */
    public final BiFunction f64516c;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableReduceSeedSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10867a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final SingleObserver f64517a;

        /* renamed from: b */
        public final BiFunction f64518b;

        /* renamed from: c */
        public Object f64519c;

        /* renamed from: d */
        public Subscription f64520d;

        public C10867a(SingleObserver singleObserver, BiFunction biFunction, Object obj) {
            this.f64517a = singleObserver;
            this.f64519c = obj;
            this.f64518b = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64520d.cancel();
            this.f64520d = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64520d == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            Object obj = this.f64519c;
            if (obj != null) {
                this.f64519c = null;
                this.f64520d = SubscriptionHelper.CANCELLED;
                this.f64517a.onSuccess(obj);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64519c != null) {
                this.f64519c = null;
                this.f64520d = SubscriptionHelper.CANCELLED;
                this.f64517a.onError(th2);
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            Object obj2 = this.f64519c;
            if (obj2 != null) {
                try {
                    this.f64519c = ObjectHelper.requireNonNull(this.f64518b.apply(obj2, obj), "The reducer returned a null value");
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f64520d.cancel();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64520d, subscription)) {
                this.f64520d = subscription;
                this.f64517a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableReduceSeedSingle(Publisher<T> publisher, R r, BiFunction<R, ? super T, R> biFunction) {
        this.f64514a = publisher;
        this.f64515b = r;
        this.f64516c = biFunction;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        this.f64514a.subscribe(new C10867a(singleObserver, this.f64516c, this.f64515b));
    }
}