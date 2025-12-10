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
    public final Flowable f64234a;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCountSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10815a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final SingleObserver f64235a;

        /* renamed from: b */
        public Subscription f64236b;

        /* renamed from: c */
        public long f64237c;

        public C10815a(SingleObserver singleObserver) {
            this.f64235a = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64236b.cancel();
            this.f64236b = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64236b == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64236b = SubscriptionHelper.CANCELLED;
            this.f64235a.onSuccess(Long.valueOf(this.f64237c));
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64236b = SubscriptionHelper.CANCELLED;
            this.f64235a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64237c++;
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64236b, subscription)) {
                this.f64236b = subscription;
                this.f64235a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableCountSingle(Flowable<T> flowable) {
        this.f64234a = flowable;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<Long> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableCount(this.f64234a));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Long> singleObserver) {
        this.f64234a.subscribe((FlowableSubscriber) new C10815a(singleObserver));
    }
}