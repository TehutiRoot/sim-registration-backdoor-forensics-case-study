package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableSingleMaybe<T> extends Maybe<T> implements FuseToFlowable<T> {

    /* renamed from: a */
    public final Flowable f64591a;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableSingleMaybe$a */
    /* loaded from: classes5.dex */
    public static final class C10880a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64592a;

        /* renamed from: b */
        public Subscription f64593b;

        /* renamed from: c */
        public boolean f64594c;

        /* renamed from: d */
        public Object f64595d;

        public C10880a(MaybeObserver maybeObserver) {
            this.f64592a = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64593b.cancel();
            this.f64593b = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64593b == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64594c) {
                return;
            }
            this.f64594c = true;
            this.f64593b = SubscriptionHelper.CANCELLED;
            Object obj = this.f64595d;
            this.f64595d = null;
            if (obj == null) {
                this.f64592a.onComplete();
            } else {
                this.f64592a.onSuccess(obj);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64594c) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64594c = true;
            this.f64593b = SubscriptionHelper.CANCELLED;
            this.f64592a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64594c) {
                return;
            }
            if (this.f64595d != null) {
                this.f64594c = true;
                this.f64593b.cancel();
                this.f64593b = SubscriptionHelper.CANCELLED;
                this.f64592a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.f64595d = obj;
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64593b, subscription)) {
                this.f64593b = subscription;
                this.f64592a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSingleMaybe(Flowable<T> flowable) {
        this.f64591a = flowable;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableSingle(this.f64591a, null, false));
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f64591a.subscribe((FlowableSubscriber) new C10880a(maybeObserver));
    }
}