package hu.akarnokd.rxjava.interop;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Completable;
import p046rx.CompletableSubscriber;
import p046rx.Subscription;

/* loaded from: classes5.dex */
public final class MaybeV2ToCompletableV1 implements Completable.OnSubscribe {

    /* renamed from: a */
    public final MaybeSource f62627a;

    /* loaded from: classes5.dex */
    public static final class MaybeV2Observer<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Subscription {
        private static final long serialVersionUID = 5045507662443540605L;
        final CompletableSubscriber actual;

        public MaybeV2Observer(CompletableSubscriber completableSubscriber) {
            this.actual = completableSubscriber;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.actual.onCompleted();
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
            this.actual.onCompleted();
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            DisposableHelper.dispose(this);
        }
    }

    public MaybeV2ToCompletableV1(MaybeSource maybeSource) {
        this.f62627a = maybeSource;
    }

    @Override // p046rx.functions.Action1
    /* renamed from: a */
    public void call(CompletableSubscriber completableSubscriber) {
        MaybeV2Observer maybeV2Observer = new MaybeV2Observer(completableSubscriber);
        completableSubscriber.onSubscribe(maybeV2Observer);
        this.f62627a.subscribe(maybeV2Observer);
    }
}
