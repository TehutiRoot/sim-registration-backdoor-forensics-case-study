package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableSingleSingle<T> extends Single<T> implements FuseToFlowable<T> {

    /* renamed from: a */
    public final Flowable f64533a;

    /* renamed from: b */
    public final Object f64534b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableSingleSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10894a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final SingleObserver f64535a;

        /* renamed from: b */
        public final Object f64536b;

        /* renamed from: c */
        public Subscription f64537c;

        /* renamed from: d */
        public boolean f64538d;

        /* renamed from: e */
        public Object f64539e;

        public C10894a(SingleObserver singleObserver, Object obj) {
            this.f64535a = singleObserver;
            this.f64536b = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64537c.cancel();
            this.f64537c = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64537c == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64538d) {
                return;
            }
            this.f64538d = true;
            this.f64537c = SubscriptionHelper.CANCELLED;
            Object obj = this.f64539e;
            this.f64539e = null;
            if (obj == null) {
                obj = this.f64536b;
            }
            if (obj != null) {
                this.f64535a.onSuccess(obj);
            } else {
                this.f64535a.onError(new NoSuchElementException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64538d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64538d = true;
            this.f64537c = SubscriptionHelper.CANCELLED;
            this.f64535a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64538d) {
                return;
            }
            if (this.f64539e != null) {
                this.f64538d = true;
                this.f64537c.cancel();
                this.f64537c = SubscriptionHelper.CANCELLED;
                this.f64535a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.f64539e = obj;
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64537c, subscription)) {
                this.f64537c = subscription;
                this.f64535a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSingleSingle(Flowable<T> flowable, T t) {
        this.f64533a = flowable;
        this.f64534b = t;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableSingle(this.f64533a, this.f64534b, true));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f64533a.subscribe((FlowableSubscriber) new C10894a(singleObserver, this.f64534b));
    }
}
