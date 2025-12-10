package io.reactivex.internal.operators.observable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableIgnoreElementsCompletable<T> extends Completable implements FuseToObservable<T> {

    /* renamed from: a */
    public final ObservableSource f65385a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableIgnoreElementsCompletable$a */
    /* loaded from: classes5.dex */
    public static final class C10999a implements Observer, Disposable {

        /* renamed from: a */
        public final CompletableObserver f65386a;

        /* renamed from: b */
        public Disposable f65387b;

        public C10999a(CompletableObserver completableObserver) {
            this.f65386a = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65387b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65387b.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65386a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65386a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f65387b = disposable;
            this.f65386a.onSubscribe(this);
        }
    }

    public ObservableIgnoreElementsCompletable(ObservableSource<T> observableSource) {
        this.f65385a = observableSource;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<T> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableIgnoreElements(this.f65385a));
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f65385a.subscribe(new C10999a(completableObserver));
    }
}