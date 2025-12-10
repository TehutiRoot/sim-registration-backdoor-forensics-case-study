package hu.akarnokd.rxjava.interop;

import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.Subscription;

/* loaded from: classes5.dex */
public final class SingleV2ToSingleV1 implements Single.OnSubscribe {

    /* renamed from: a */
    public final SingleSource f62637a;

    /* loaded from: classes5.dex */
    public static final class SourceSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Subscription {
        private static final long serialVersionUID = 4758098209431016997L;
        final SingleSubscriber<? super T> actual;

        public SourceSingleObserver(SingleSubscriber<? super T> singleSubscriber) {
            this.actual = singleSubscriber;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.actual.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.actual.onSuccess(t);
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            DisposableHelper.dispose(this);
        }
    }

    public SingleV2ToSingleV1(SingleSource singleSource) {
        this.f62637a = singleSource;
    }

    @Override // p046rx.functions.Action1
    /* renamed from: a */
    public void call(SingleSubscriber singleSubscriber) {
        SourceSingleObserver sourceSingleObserver = new SourceSingleObserver(singleSubscriber);
        singleSubscriber.add(sourceSingleObserver);
        this.f62637a.subscribe(sourceSingleObserver);
    }
}
