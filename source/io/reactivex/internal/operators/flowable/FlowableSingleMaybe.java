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
    public final Flowable f64528a;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableSingleMaybe$a */
    /* loaded from: classes5.dex */
    public static final class C10893a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64529a;

        /* renamed from: b */
        public Subscription f64530b;

        /* renamed from: c */
        public boolean f64531c;

        /* renamed from: d */
        public Object f64532d;

        public C10893a(MaybeObserver maybeObserver) {
            this.f64529a = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64530b.cancel();
            this.f64530b = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64530b == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64531c) {
                return;
            }
            this.f64531c = true;
            this.f64530b = SubscriptionHelper.CANCELLED;
            Object obj = this.f64532d;
            this.f64532d = null;
            if (obj == null) {
                this.f64529a.onComplete();
            } else {
                this.f64529a.onSuccess(obj);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64531c) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64531c = true;
            this.f64530b = SubscriptionHelper.CANCELLED;
            this.f64529a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64531c) {
                return;
            }
            if (this.f64532d != null) {
                this.f64531c = true;
                this.f64530b.cancel();
                this.f64530b = SubscriptionHelper.CANCELLED;
                this.f64529a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.f64532d = obj;
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64530b, subscription)) {
                this.f64530b = subscription;
                this.f64529a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSingleMaybe(Flowable<T> flowable) {
        this.f64528a = flowable;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableSingle(this.f64528a, null, false));
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f64528a.subscribe((FlowableSubscriber) new C10893a(maybeObserver));
    }
}
