package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableCountSingle<T> extends Single<Long> implements FuseToObservable<Long> {

    /* renamed from: a */
    public final ObservableSource f65146a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableCountSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10983a implements Observer, Disposable {

        /* renamed from: a */
        public final SingleObserver f65147a;

        /* renamed from: b */
        public Disposable f65148b;

        /* renamed from: c */
        public long f65149c;

        public C10983a(SingleObserver singleObserver) {
            this.f65147a = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65148b.dispose();
            this.f65148b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65148b.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65148b = DisposableHelper.DISPOSED;
            this.f65147a.onSuccess(Long.valueOf(this.f65149c));
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65148b = DisposableHelper.DISPOSED;
            this.f65147a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65149c++;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65148b, disposable)) {
                this.f65148b = disposable;
                this.f65147a.onSubscribe(this);
            }
        }
    }

    public ObservableCountSingle(ObservableSource<T> observableSource) {
        this.f65146a = observableSource;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<Long> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableCount(this.f65146a));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Long> singleObserver) {
        this.f65146a.subscribe(new C10983a(singleObserver));
    }
}
