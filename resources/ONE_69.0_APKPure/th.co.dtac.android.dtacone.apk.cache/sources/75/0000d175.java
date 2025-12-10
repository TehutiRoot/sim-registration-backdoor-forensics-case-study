package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class ObservableCount<T> extends AbstractC11078a {

    /* renamed from: io.reactivex.internal.operators.observable.ObservableCount$a */
    /* loaded from: classes5.dex */
    public static final class C10969a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65206a;

        /* renamed from: b */
        public Disposable f65207b;

        /* renamed from: c */
        public long f65208c;

        public C10969a(Observer observer) {
            this.f65206a = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65207b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65207b.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65206a.onNext(Long.valueOf(this.f65208c));
            this.f65206a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65206a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65208c++;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65207b, disposable)) {
                this.f65207b = disposable;
                this.f65206a.onSubscribe(this);
            }
        }
    }

    public ObservableCount(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Long> observer) {
        this.source.subscribe(new C10969a(observer));
    }
}