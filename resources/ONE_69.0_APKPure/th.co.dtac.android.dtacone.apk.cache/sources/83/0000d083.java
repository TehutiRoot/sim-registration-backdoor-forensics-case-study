package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class MaybeDelaySubscriptionOtherPublisher<T, U> extends AbstractC1707Y {

    /* renamed from: a */
    public final Publisher f64816a;

    /* loaded from: classes5.dex */
    public static final class DelayMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
        private static final long serialVersionUID = 706635022205076709L;
        final MaybeObserver<? super T> downstream;

        public DelayMaybeObserver(MaybeObserver<? super T> maybeObserver) {
            this.downstream = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }
    }

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher$a */
    /* loaded from: classes5.dex */
    public static final class C10914a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final DelayMaybeObserver f64817a;

        /* renamed from: b */
        public MaybeSource f64818b;

        /* renamed from: c */
        public Subscription f64819c;

        public C10914a(MaybeObserver maybeObserver, MaybeSource maybeSource) {
            this.f64817a = new DelayMaybeObserver(maybeObserver);
            this.f64818b = maybeSource;
        }

        /* renamed from: a */
        public void m30348a() {
            MaybeSource maybeSource = this.f64818b;
            this.f64818b = null;
            maybeSource.subscribe(this.f64817a);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64819c.cancel();
            this.f64819c = SubscriptionHelper.CANCELLED;
            DisposableHelper.dispose(this.f64817a);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f64817a.get());
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            Subscription subscription = this.f64819c;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                this.f64819c = subscriptionHelper;
                m30348a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            Subscription subscription = this.f64819c;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                this.f64819c = subscriptionHelper;
                this.f64817a.downstream.onError(th2);
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            Subscription subscription = this.f64819c;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                subscription.cancel();
                this.f64819c = subscriptionHelper;
                m30348a();
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64819c, subscription)) {
                this.f64819c = subscription;
                this.f64817a.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public MaybeDelaySubscriptionOtherPublisher(MaybeSource<T> maybeSource, Publisher<U> publisher) {
        super(maybeSource);
        this.f64816a = publisher;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f64816a.subscribe(new C10914a(maybeObserver, this.source));
    }
}