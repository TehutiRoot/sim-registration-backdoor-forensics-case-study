package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/* loaded from: classes5.dex */
public final class ObservableIgnoreElements<T> extends AbstractC11091a {

    /* renamed from: io.reactivex.internal.operators.observable.ObservableIgnoreElements$a */
    /* loaded from: classes5.dex */
    public static final class C11011a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65320a;

        /* renamed from: b */
        public Disposable f65321b;

        public C11011a(Observer observer) {
            this.f65320a = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65321b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65321b.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65320a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65320a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f65321b = disposable;
            this.f65320a.onSubscribe(this);
        }
    }

    public ObservableIgnoreElements(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C11011a(observer));
    }
}
