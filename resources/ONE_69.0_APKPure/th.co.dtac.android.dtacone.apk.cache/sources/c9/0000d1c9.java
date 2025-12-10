package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class ObservableHide<T> extends AbstractC11078a {

    /* renamed from: io.reactivex.internal.operators.observable.ObservableHide$a */
    /* loaded from: classes5.dex */
    public static final class C10997a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65381a;

        /* renamed from: b */
        public Disposable f65382b;

        public C10997a(Observer observer) {
            this.f65381a = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65382b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65382b.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65381a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65381a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65381a.onNext(obj);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65382b, disposable)) {
                this.f65382b = disposable;
                this.f65381a.onSubscribe(this);
            }
        }
    }

    public ObservableHide(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C10997a(observer));
    }
}