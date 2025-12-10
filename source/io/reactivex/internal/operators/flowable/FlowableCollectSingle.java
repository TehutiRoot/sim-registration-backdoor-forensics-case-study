package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableCollectSingle<T, U> extends Single<U> implements FuseToFlowable<U> {

    /* renamed from: a */
    public final Flowable f64132a;

    /* renamed from: b */
    public final Callable f64133b;

    /* renamed from: c */
    public final BiConsumer f64134c;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCollectSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10823a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final SingleObserver f64135a;

        /* renamed from: b */
        public final BiConsumer f64136b;

        /* renamed from: c */
        public final Object f64137c;

        /* renamed from: d */
        public Subscription f64138d;

        /* renamed from: e */
        public boolean f64139e;

        public C10823a(SingleObserver singleObserver, Object obj, BiConsumer biConsumer) {
            this.f64135a = singleObserver;
            this.f64136b = biConsumer;
            this.f64137c = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64138d.cancel();
            this.f64138d = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64138d == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64139e) {
                return;
            }
            this.f64139e = true;
            this.f64138d = SubscriptionHelper.CANCELLED;
            this.f64135a.onSuccess(this.f64137c);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64139e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64139e = true;
            this.f64138d = SubscriptionHelper.CANCELLED;
            this.f64135a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64139e) {
                return;
            }
            try {
                this.f64136b.accept(this.f64137c, obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64138d.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64138d, subscription)) {
                this.f64138d = subscription;
                this.f64135a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableCollectSingle(Flowable<T> flowable, Callable<? extends U> callable, BiConsumer<? super U, ? super T> biConsumer) {
        this.f64132a = flowable;
        this.f64133b = callable;
        this.f64134c = biConsumer;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<U> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableCollect(this.f64132a, this.f64133b, this.f64134c));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super U> singleObserver) {
        try {
            this.f64132a.subscribe((FlowableSubscriber) new C10823a(singleObserver, ObjectHelper.requireNonNull(this.f64133b.call(), "The initialSupplier returned a null value"), this.f64134c));
        } catch (Throwable th2) {
            EmptyDisposable.error(th2, singleObserver);
        }
    }
}
