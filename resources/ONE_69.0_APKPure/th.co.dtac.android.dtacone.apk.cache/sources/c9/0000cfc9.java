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
    public final Flowable f64507a;

    /* renamed from: b */
    public final BiFunction f64508b;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableReduceMaybe$a */
    /* loaded from: classes5.dex */
    public static final class C10866a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64509a;

        /* renamed from: b */
        public final BiFunction f64510b;

        /* renamed from: c */
        public Object f64511c;

        /* renamed from: d */
        public Subscription f64512d;

        /* renamed from: e */
        public boolean f64513e;

        public C10866a(MaybeObserver maybeObserver, BiFunction biFunction) {
            this.f64509a = maybeObserver;
            this.f64510b = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64512d.cancel();
            this.f64513e = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64513e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64513e) {
                return;
            }
            this.f64513e = true;
            Object obj = this.f64511c;
            if (obj != null) {
                this.f64509a.onSuccess(obj);
            } else {
                this.f64509a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64513e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64513e = true;
            this.f64509a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64513e) {
                return;
            }
            Object obj2 = this.f64511c;
            if (obj2 == null) {
                this.f64511c = obj;
                return;
            }
            try {
                this.f64511c = ObjectHelper.requireNonNull(this.f64510b.apply(obj2, obj), "The reducer returned a null value");
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64512d.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64512d, subscription)) {
                this.f64512d = subscription;
                this.f64509a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableReduceMaybe(Flowable<T> flowable, BiFunction<T, T, T> biFunction) {
        this.f64507a = flowable;
        this.f64508b = biFunction;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableReduce(this.f64507a, this.f64508b));
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public Publisher<T> source() {
        return this.f64507a;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f64507a.subscribe((FlowableSubscriber) new C10866a(maybeObserver, this.f64508b));
    }
}