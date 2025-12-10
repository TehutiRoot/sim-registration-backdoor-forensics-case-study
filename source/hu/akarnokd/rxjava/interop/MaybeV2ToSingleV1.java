package hu.akarnokd.rxjava.interop;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.Subscription;

/* loaded from: classes5.dex */
public final class MaybeV2ToSingleV1 implements Single.OnSubscribe {

    /* renamed from: a */
    public final MaybeSource f62628a;

    /* loaded from: classes5.dex */
    public static final class MaybeV2Observer<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Subscription {
        private static final long serialVersionUID = 5045507662443540605L;
        final SingleSubscriber<? super T> actual;

        public MaybeV2Observer(SingleSubscriber<? super T> singleSubscriber) {
            this.actual = singleSubscriber;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.actual.onError(new NoSuchElementException("The source Maybe was empty."));
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.actual.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.actual.onSuccess(t);
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            DisposableHelper.dispose(this);
        }
    }

    public MaybeV2ToSingleV1(MaybeSource maybeSource) {
        this.f62628a = maybeSource;
    }

    @Override // p046rx.functions.Action1
    /* renamed from: a */
    public void call(SingleSubscriber singleSubscriber) {
        MaybeV2Observer maybeV2Observer = new MaybeV2Observer(singleSubscriber);
        singleSubscriber.add(maybeV2Observer);
        this.f62628a.subscribe(maybeV2Observer);
    }
}
