package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableReduceMaybe<T> extends Maybe<T> implements HasUpstreamPublisher<T>, FuseToFlowable<T> {

    /* renamed from: a */
    public final Flowable f64444a;

    /* renamed from: b */
    public final BiFunction f64445b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableReduceMaybe$a */
    /* loaded from: classes5.dex */
    public static final class C10879a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64446a;

        /* renamed from: b */
        public final BiFunction f64447b;

        /* renamed from: c */
        public Object f64448c;

        /* renamed from: d */
        public Subscription f64449d;

        /* renamed from: e */
        public boolean f64450e;

        public C10879a(MaybeObserver maybeObserver, BiFunction biFunction) {
            this.f64446a = maybeObserver;
            this.f64447b = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64449d.cancel();
            this.f64450e = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64450e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64450e) {
                return;
            }
            this.f64450e = true;
            Object obj = this.f64448c;
            if (obj != null) {
                this.f64446a.onSuccess(obj);
            } else {
                this.f64446a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64450e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64450e = true;
            this.f64446a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64450e) {
                return;
            }
            Object obj2 = this.f64448c;
            if (obj2 == null) {
                this.f64448c = obj;
                return;
            }
            try {
                this.f64448c = ObjectHelper.requireNonNull(this.f64447b.apply(obj2, obj), "The reducer returned a null value");
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64449d.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64449d, subscription)) {
                this.f64449d = subscription;
                this.f64446a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableReduceMaybe(Flowable<T> flowable, BiFunction<T, T, T> biFunction) {
        this.f64444a = flowable;
        this.f64445b = biFunction;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableReduce(this.f64444a, this.f64445b));
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public Publisher<T> source() {
        return this.f64444a;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f64444a.subscribe((FlowableSubscriber) new C10879a(maybeObserver, this.f64445b));
    }
}
