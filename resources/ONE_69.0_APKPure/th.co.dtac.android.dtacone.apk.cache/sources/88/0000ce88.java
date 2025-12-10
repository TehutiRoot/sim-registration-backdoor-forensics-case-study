package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/* loaded from: classes5.dex */
public final class CompletableFromObservable<T> extends Completable {

    /* renamed from: a */
    public final ObservableSource f63994a;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableFromObservable$a */
    /* loaded from: classes5.dex */
    public static final class C10780a implements Observer {

        /* renamed from: a */
        public final CompletableObserver f63995a;

        public C10780a(CompletableObserver completableObserver) {
            this.f63995a = completableObserver;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f63995a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f63995a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f63995a.onSubscribe(disposable);
        }
    }

    public CompletableFromObservable(ObservableSource<T> observableSource) {
        this.f63994a = observableSource;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f63994a.subscribe(new C10780a(completableObserver));
    }
}