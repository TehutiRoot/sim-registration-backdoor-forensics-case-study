package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableCountSingle<T> extends Single<Long> implements FuseToFlowable<Long> {

    /* renamed from: a */
    public final Flowable f64171a;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCountSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10828a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final SingleObserver f64172a;

        /* renamed from: b */
        public Subscription f64173b;

        /* renamed from: c */
        public long f64174c;

        public C10828a(SingleObserver singleObserver) {
            this.f64172a = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64173b.cancel();
            this.f64173b = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64173b == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64173b = SubscriptionHelper.CANCELLED;
            this.f64172a.onSuccess(Long.valueOf(this.f64174c));
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64173b = SubscriptionHelper.CANCELLED;
            this.f64172a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64174c++;
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64173b, subscription)) {
                this.f64173b = subscription;
                this.f64172a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableCountSingle(Flowable<T> flowable) {
        this.f64171a = flowable;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<Long> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableCount(this.f64171a));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Long> singleObserver) {
        this.f64171a.subscribe((FlowableSubscriber) new C10828a(singleObserver));
    }
}
