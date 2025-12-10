package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/* loaded from: classes5.dex */
public final class ObservableIgnoreElements<T> extends AbstractC11078a {

    /* renamed from: io.reactivex.internal.operators.observable.ObservableIgnoreElements$a */
    /* loaded from: classes5.dex */
    public static final class C10998a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65383a;

        /* renamed from: b */
        public Disposable f65384b;

        public C10998a(Observer observer) {
            this.f65383a = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65384b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65384b.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65383a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65383a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f65384b = disposable;
            this.f65383a.onSubscribe(this);
        }
    }

    public ObservableIgnoreElements(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C10998a(observer));
    }
}