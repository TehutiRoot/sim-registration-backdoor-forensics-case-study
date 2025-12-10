package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableToListSingle<T, U extends Collection<? super T>> extends Single<U> implements FuseToFlowable<U> {

    /* renamed from: a */
    public final Flowable f64681a;

    /* renamed from: b */
    public final Callable f64682b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableToListSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10893a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final SingleObserver f64683a;

        /* renamed from: b */
        public Subscription f64684b;

        /* renamed from: c */
        public Collection f64685c;

        public C10893a(SingleObserver singleObserver, Collection collection) {
            this.f64683a = singleObserver;
            this.f64685c = collection;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64684b.cancel();
            this.f64684b = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64684b == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64684b = SubscriptionHelper.CANCELLED;
            this.f64683a.onSuccess(this.f64685c);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64685c = null;
            this.f64684b = SubscriptionHelper.CANCELLED;
            this.f64683a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64685c.add(obj);
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64684b, subscription)) {
                this.f64684b = subscription;
                this.f64683a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableToListSingle(Flowable<T> flowable) {
        this(flowable, ArrayListSupplier.asCallable());
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<U> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableToList(this.f64681a, this.f64682b));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super U> singleObserver) {
        try {
            this.f64681a.subscribe((FlowableSubscriber) new C10893a(singleObserver, (Collection) ObjectHelper.requireNonNull(this.f64682b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }

    public FlowableToListSingle(Flowable<T> flowable, Callable<U> callable) {
        this.f64681a = flowable;
        this.f64682b = callable;
    }
}