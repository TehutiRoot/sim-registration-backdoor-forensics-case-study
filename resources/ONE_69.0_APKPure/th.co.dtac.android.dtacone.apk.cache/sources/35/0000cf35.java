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
    public final Flowable f64318a;

    /* renamed from: b */
    public final long f64319b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableElementAtMaybe$a */
    /* loaded from: classes5.dex */
    public static final class C10832a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64320a;

        /* renamed from: b */
        public final long f64321b;

        /* renamed from: c */
        public Subscription f64322c;

        /* renamed from: d */
        public long f64323d;

        /* renamed from: e */
        public boolean f64324e;

        public C10832a(MaybeObserver maybeObserver, long j) {
            this.f64320a = maybeObserver;
            this.f64321b = j;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64322c.cancel();
            this.f64322c = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64322c == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64322c = SubscriptionHelper.CANCELLED;
            if (!this.f64324e) {
                this.f64324e = true;
                this.f64320a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64324e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64324e = true;
            this.f64322c = SubscriptionHelper.CANCELLED;
            this.f64320a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64324e) {
                return;
            }
            long j = this.f64323d;
            if (j == this.f64321b) {
                this.f64324e = true;
                this.f64322c.cancel();
                this.f64322c = SubscriptionHelper.CANCELLED;
                this.f64320a.onSuccess(obj);
                return;
            }
            this.f64323d = j + 1;
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64322c, subscription)) {
                this.f64322c = subscription;
                this.f64320a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableElementAtMaybe(Flowable<T> flowable, long j) {
        this.f64318a = flowable;
        this.f64319b = j;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableElementAt(this.f64318a, this.f64319b, null, false));
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f64318a.subscribe((FlowableSubscriber) new C10832a(maybeObserver, this.f64319b));
    }
}