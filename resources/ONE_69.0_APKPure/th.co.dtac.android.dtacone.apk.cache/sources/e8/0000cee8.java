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
    public final Flowable f64195a;

    /* renamed from: b */
    public final Callable f64196b;

    /* renamed from: c */
    public final BiConsumer f64197c;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCollectSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10810a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final SingleObserver f64198a;

        /* renamed from: b */
        public final BiConsumer f64199b;

        /* renamed from: c */
        public final Object f64200c;

        /* renamed from: d */
        public Subscription f64201d;

        /* renamed from: e */
        public boolean f64202e;

        public C10810a(SingleObserver singleObserver, Object obj, BiConsumer biConsumer) {
            this.f64198a = singleObserver;
            this.f64199b = biConsumer;
            this.f64200c = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64201d.cancel();
            this.f64201d = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64201d == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64202e) {
                return;
            }
            this.f64202e = true;
            this.f64201d = SubscriptionHelper.CANCELLED;
            this.f64198a.onSuccess(this.f64200c);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64202e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64202e = true;
            this.f64201d = SubscriptionHelper.CANCELLED;
            this.f64198a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64202e) {
                return;
            }
            try {
                this.f64199b.accept(this.f64200c, obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64201d.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64201d, subscription)) {
                this.f64201d = subscription;
                this.f64198a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableCollectSingle(Flowable<T> flowable, Callable<? extends U> callable, BiConsumer<? super U, ? super T> biConsumer) {
        this.f64195a = flowable;
        this.f64196b = callable;
        this.f64197c = biConsumer;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<U> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableCollect(this.f64195a, this.f64196b, this.f64197c));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super U> singleObserver) {
        try {
            this.f64195a.subscribe((FlowableSubscriber) new C10810a(singleObserver, ObjectHelper.requireNonNull(this.f64196b.call(), "The initialSupplier returned a null value"), this.f64197c));
        } catch (Throwable th2) {
            EmptyDisposable.error(th2, singleObserver);
        }
    }
}