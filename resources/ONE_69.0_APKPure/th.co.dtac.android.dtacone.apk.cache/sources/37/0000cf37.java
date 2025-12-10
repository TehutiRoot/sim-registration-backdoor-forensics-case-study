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
public final class FlowableElementAtSingle<T> extends Single<T> implements FuseToFlowable<T> {

    /* renamed from: a */
    public final Flowable f64325a;

    /* renamed from: b */
    public final long f64326b;

    /* renamed from: c */
    public final Object f64327c;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableElementAtSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10833a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final SingleObserver f64328a;

        /* renamed from: b */
        public final long f64329b;

        /* renamed from: c */
        public final Object f64330c;

        /* renamed from: d */
        public Subscription f64331d;

        /* renamed from: e */
        public long f64332e;

        /* renamed from: f */
        public boolean f64333f;

        public C10833a(SingleObserver singleObserver, long j, Object obj) {
            this.f64328a = singleObserver;
            this.f64329b = j;
            this.f64330c = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64331d.cancel();
            this.f64331d = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64331d == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64331d = SubscriptionHelper.CANCELLED;
            if (!this.f64333f) {
                this.f64333f = true;
                Object obj = this.f64330c;
                if (obj != null) {
                    this.f64328a.onSuccess(obj);
                } else {
                    this.f64328a.onError(new NoSuchElementException());
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64333f) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64333f = true;
            this.f64331d = SubscriptionHelper.CANCELLED;
            this.f64328a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64333f) {
                return;
            }
            long j = this.f64332e;
            if (j == this.f64329b) {
                this.f64333f = true;
                this.f64331d.cancel();
                this.f64331d = SubscriptionHelper.CANCELLED;
                this.f64328a.onSuccess(obj);
                return;
            }
            this.f64332e = j + 1;
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64331d, subscription)) {
                this.f64331d = subscription;
                this.f64328a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableElementAtSingle(Flowable<T> flowable, long j, T t) {
        this.f64325a = flowable;
        this.f64326b = j;
        this.f64327c = t;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableElementAt(this.f64325a, this.f64326b, this.f64327c, true));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f64325a.subscribe((FlowableSubscriber) new C10833a(singleObserver, this.f64326b, this.f64327c));
    }
}