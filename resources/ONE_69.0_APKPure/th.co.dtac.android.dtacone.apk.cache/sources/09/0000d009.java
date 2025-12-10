package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableSingleSingle<T> extends Single<T> implements FuseToFlowable<T> {

    /* renamed from: a */
    public final Flowable f64596a;

    /* renamed from: b */
    public final Object f64597b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableSingleSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10881a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final SingleObserver f64598a;

        /* renamed from: b */
        public final Object f64599b;

        /* renamed from: c */
        public Subscription f64600c;

        /* renamed from: d */
        public boolean f64601d;

        /* renamed from: e */
        public Object f64602e;

        public C10881a(SingleObserver singleObserver, Object obj) {
            this.f64598a = singleObserver;
            this.f64599b = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64600c.cancel();
            this.f64600c = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64600c == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64601d) {
                return;
            }
            this.f64601d = true;
            this.f64600c = SubscriptionHelper.CANCELLED;
            Object obj = this.f64602e;
            this.f64602e = null;
            if (obj == null) {
                obj = this.f64599b;
            }
            if (obj != null) {
                this.f64598a.onSuccess(obj);
            } else {
                this.f64598a.onError(new NoSuchElementException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64601d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64601d = true;
            this.f64600c = SubscriptionHelper.CANCELLED;
            this.f64598a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64601d) {
                return;
            }
            if (this.f64602e != null) {
                this.f64601d = true;
                this.f64600c.cancel();
                this.f64600c = SubscriptionHelper.CANCELLED;
                this.f64598a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.f64602e = obj;
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64600c, subscription)) {
                this.f64600c = subscription;
                this.f64598a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSingleSingle(Flowable<T> flowable, T t) {
        this.f64596a = flowable;
        this.f64597b = t;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableSingle(this.f64596a, this.f64597b, true));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f64596a.subscribe((FlowableSubscriber) new C10881a(singleObserver, this.f64597b));
    }
}