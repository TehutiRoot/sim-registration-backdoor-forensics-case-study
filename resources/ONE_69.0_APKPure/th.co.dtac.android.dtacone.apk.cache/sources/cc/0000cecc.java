package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableAnySingle<T> extends Single<Boolean> implements FuseToFlowable<Boolean> {

    /* renamed from: a */
    public final Flowable f64105a;

    /* renamed from: b */
    public final Predicate f64106b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableAnySingle$a */
    /* loaded from: classes5.dex */
    public static final class C10799a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final SingleObserver f64107a;

        /* renamed from: b */
        public final Predicate f64108b;

        /* renamed from: c */
        public Subscription f64109c;

        /* renamed from: d */
        public boolean f64110d;

        public C10799a(SingleObserver singleObserver, Predicate predicate) {
            this.f64107a = singleObserver;
            this.f64108b = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64109c.cancel();
            this.f64109c = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64109c == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (!this.f64110d) {
                this.f64110d = true;
                this.f64109c = SubscriptionHelper.CANCELLED;
                this.f64107a.onSuccess(Boolean.FALSE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64110d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64110d = true;
            this.f64109c = SubscriptionHelper.CANCELLED;
            this.f64107a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64110d) {
                return;
            }
            try {
                if (this.f64108b.test(obj)) {
                    this.f64110d = true;
                    this.f64109c.cancel();
                    this.f64109c = SubscriptionHelper.CANCELLED;
                    this.f64107a.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64109c.cancel();
                this.f64109c = SubscriptionHelper.CANCELLED;
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64109c, subscription)) {
                this.f64109c = subscription;
                this.f64107a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableAnySingle(Flowable<T> flowable, Predicate<? super T> predicate) {
        this.f64105a = flowable;
        this.f64106b = predicate;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<Boolean> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableAny(this.f64105a, this.f64106b));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.f64105a.subscribe((FlowableSubscriber) new C10799a(singleObserver, this.f64106b));
    }
}