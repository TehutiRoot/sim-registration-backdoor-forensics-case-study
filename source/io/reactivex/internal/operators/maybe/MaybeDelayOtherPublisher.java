package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class MaybeDelayOtherPublisher<T, U> extends AbstractC1716Y {

    /* renamed from: a */
    public final Publisher f64749a;

    /* loaded from: classes5.dex */
    public static final class OtherSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {
        private static final long serialVersionUID = -1215060610805418006L;
        final MaybeObserver<? super T> downstream;
        Throwable error;
        T value;

        public OtherSubscriber(MaybeObserver<? super T> maybeObserver) {
            this.downstream = maybeObserver;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            Throwable th2 = this.error;
            if (th2 != null) {
                this.downstream.onError(th2);
                return;
            }
            T t = this.value;
            if (t != null) {
                this.downstream.onSuccess(t);
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            Throwable th3 = this.error;
            if (th3 == null) {
                this.downstream.onError(th2);
            } else {
                this.downstream.onError(new CompositeException(th3, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            Subscription subscription = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                lazySet(subscriptionHelper);
                subscription.cancel();
                onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }
    }

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeDelayOtherPublisher$a */
    /* loaded from: classes5.dex */
    public static final class C10926a implements MaybeObserver, Disposable {

        /* renamed from: a */
        public final OtherSubscriber f64750a;

        /* renamed from: b */
        public final Publisher f64751b;

        /* renamed from: c */
        public Disposable f64752c;

        public C10926a(MaybeObserver maybeObserver, Publisher publisher) {
            this.f64750a = new OtherSubscriber(maybeObserver);
            this.f64751b = publisher;
        }

        /* renamed from: a */
        public void m30009a() {
            this.f64751b.subscribe(this.f64750a);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64752c.dispose();
            this.f64752c = DisposableHelper.DISPOSED;
            SubscriptionHelper.cancel(this.f64750a);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64750a.get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f64752c = DisposableHelper.DISPOSED;
            m30009a();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.f64752c = DisposableHelper.DISPOSED;
            this.f64750a.error = th2;
            m30009a();
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64752c, disposable)) {
                this.f64752c = disposable;
                this.f64750a.downstream.onSubscribe(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            this.f64752c = DisposableHelper.DISPOSED;
            this.f64750a.value = obj;
            m30009a();
        }
    }

    public MaybeDelayOtherPublisher(MaybeSource<T> maybeSource, Publisher<U> publisher) {
        super(maybeSource);
        this.f64749a = publisher;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new C10926a(maybeObserver, this.f64749a));
    }
}
