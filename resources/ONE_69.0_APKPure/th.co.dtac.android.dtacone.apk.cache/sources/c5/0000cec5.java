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
public final class FlowableAllSingle<T> extends Single<Boolean> implements FuseToFlowable<Boolean> {

    /* renamed from: a */
    public final Flowable f64093a;

    /* renamed from: b */
    public final Predicate f64094b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableAllSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10797a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final SingleObserver f64095a;

        /* renamed from: b */
        public final Predicate f64096b;

        /* renamed from: c */
        public Subscription f64097c;

        /* renamed from: d */
        public boolean f64098d;

        public C10797a(SingleObserver singleObserver, Predicate predicate) {
            this.f64095a = singleObserver;
            this.f64096b = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64097c.cancel();
            this.f64097c = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64097c == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64098d) {
                return;
            }
            this.f64098d = true;
            this.f64097c = SubscriptionHelper.CANCELLED;
            this.f64095a.onSuccess(Boolean.TRUE);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64098d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64098d = true;
            this.f64097c = SubscriptionHelper.CANCELLED;
            this.f64095a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64098d) {
                return;
            }
            try {
                if (!this.f64096b.test(obj)) {
                    this.f64098d = true;
                    this.f64097c.cancel();
                    this.f64097c = SubscriptionHelper.CANCELLED;
                    this.f64095a.onSuccess(Boolean.FALSE);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64097c.cancel();
                this.f64097c = SubscriptionHelper.CANCELLED;
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64097c, subscription)) {
                this.f64097c = subscription;
                this.f64095a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableAllSingle(Flowable<T> flowable, Predicate<? super T> predicate) {
        this.f64093a = flowable;
        this.f64094b = predicate;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<Boolean> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableAll(this.f64093a, this.f64094b));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.f64093a.subscribe((FlowableSubscriber) new C10797a(singleObserver, this.f64094b));
    }
}