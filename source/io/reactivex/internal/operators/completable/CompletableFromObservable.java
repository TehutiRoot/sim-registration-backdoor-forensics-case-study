package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/* loaded from: classes5.dex */
public final class CompletableFromObservable<T> extends Completable {

    /* renamed from: a */
    public final ObservableSource f63931a;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableFromObservable$a */
    /* loaded from: classes5.dex */
    public static final class C10793a implements Observer {

        /* renamed from: a */
        public final CompletableObserver f63932a;

        public C10793a(CompletableObserver completableObserver) {
            this.f63932a = completableObserver;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f63932a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f63932a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f63932a.onSubscribe(disposable);
        }
    }

    public CompletableFromObservable(ObservableSource<T> observableSource) {
        this.f63931a = observableSource;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f63931a.subscribe(new C10793a(completableObserver));
    }
}
