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
    public final ObservableSource f65209a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableCountSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10970a implements Observer, Disposable {

        /* renamed from: a */
        public final SingleObserver f65210a;

        /* renamed from: b */
        public Disposable f65211b;

        /* renamed from: c */
        public long f65212c;

        public C10970a(SingleObserver singleObserver) {
            this.f65210a = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65211b.dispose();
            this.f65211b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65211b.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65211b = DisposableHelper.DISPOSED;
            this.f65210a.onSuccess(Long.valueOf(this.f65212c));
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65211b = DisposableHelper.DISPOSED;
            this.f65210a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65212c++;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65211b, disposable)) {
                this.f65211b = disposable;
                this.f65210a.onSubscribe(this);
            }
        }
    }

    public ObservableCountSingle(ObservableSource<T> observableSource) {
        this.f65209a = observableSource;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<Long> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableCount(this.f65209a));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Long> singleObserver) {
        this.f65209a.subscribe(new C10970a(singleObserver));
    }
}