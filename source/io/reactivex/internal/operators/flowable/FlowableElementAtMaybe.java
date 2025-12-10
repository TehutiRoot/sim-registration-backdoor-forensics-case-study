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
public final class FlowableElementAtMaybe<T> extends Maybe<T> implements FuseToFlowable<T> {

    /* renamed from: a */
    public final Flowable f64255a;

    /* renamed from: b */
    public final long f64256b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableElementAtMaybe$a */
    /* loaded from: classes5.dex */
    public static final class C10845a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64257a;

        /* renamed from: b */
        public final long f64258b;

        /* renamed from: c */
        public Subscription f64259c;

        /* renamed from: d */
        public long f64260d;

        /* renamed from: e */
        public boolean f64261e;

        public C10845a(MaybeObserver maybeObserver, long j) {
            this.f64257a = maybeObserver;
            this.f64258b = j;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64259c.cancel();
            this.f64259c = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64259c == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64259c = SubscriptionHelper.CANCELLED;
            if (!this.f64261e) {
                this.f64261e = true;
                this.f64257a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64261e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64261e = true;
            this.f64259c = SubscriptionHelper.CANCELLED;
            this.f64257a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64261e) {
                return;
            }
            long j = this.f64260d;
            if (j == this.f64258b) {
                this.f64261e = true;
                this.f64259c.cancel();
                this.f64259c = SubscriptionHelper.CANCELLED;
                this.f64257a.onSuccess(obj);
                return;
            }
            this.f64260d = j + 1;
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64259c, subscription)) {
                this.f64259c = subscription;
                this.f64257a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableElementAtMaybe(Flowable<T> flowable, long j) {
        this.f64255a = flowable;
        this.f64256b = j;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableElementAt(this.f64255a, this.f64256b, null, false));
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f64255a.subscribe((FlowableSubscriber) new C10845a(maybeObserver, this.f64256b));
    }
}
