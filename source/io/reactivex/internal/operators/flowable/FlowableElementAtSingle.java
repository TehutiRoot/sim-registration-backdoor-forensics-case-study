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
    public final Flowable f64262a;

    /* renamed from: b */
    public final long f64263b;

    /* renamed from: c */
    public final Object f64264c;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableElementAtSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10846a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final SingleObserver f64265a;

        /* renamed from: b */
        public final long f64266b;

        /* renamed from: c */
        public final Object f64267c;

        /* renamed from: d */
        public Subscription f64268d;

        /* renamed from: e */
        public long f64269e;

        /* renamed from: f */
        public boolean f64270f;

        public C10846a(SingleObserver singleObserver, long j, Object obj) {
            this.f64265a = singleObserver;
            this.f64266b = j;
            this.f64267c = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64268d.cancel();
            this.f64268d = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64268d == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64268d = SubscriptionHelper.CANCELLED;
            if (!this.f64270f) {
                this.f64270f = true;
                Object obj = this.f64267c;
                if (obj != null) {
                    this.f64265a.onSuccess(obj);
                } else {
                    this.f64265a.onError(new NoSuchElementException());
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64270f) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64270f = true;
            this.f64268d = SubscriptionHelper.CANCELLED;
            this.f64265a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64270f) {
                return;
            }
            long j = this.f64269e;
            if (j == this.f64266b) {
                this.f64270f = true;
                this.f64268d.cancel();
                this.f64268d = SubscriptionHelper.CANCELLED;
                this.f64265a.onSuccess(obj);
                return;
            }
            this.f64269e = j + 1;
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64268d, subscription)) {
                this.f64268d = subscription;
                this.f64265a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableElementAtSingle(Flowable<T> flowable, long j, T t) {
        this.f64262a = flowable;
        this.f64263b = j;
        this.f64264c = t;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableElementAt(this.f64262a, this.f64263b, this.f64264c, true));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f64262a.subscribe((FlowableSubscriber) new C10846a(singleObserver, this.f64263b, this.f64264c));
    }
}
