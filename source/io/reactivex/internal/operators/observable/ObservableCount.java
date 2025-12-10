package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class ObservableCount<T> extends AbstractC11091a {

    /* renamed from: io.reactivex.internal.operators.observable.ObservableCount$a */
    /* loaded from: classes5.dex */
    public static final class C10982a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65143a;

        /* renamed from: b */
        public Disposable f65144b;

        /* renamed from: c */
        public long f65145c;

        public C10982a(Observer observer) {
            this.f65143a = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65144b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65144b.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65143a.onNext(Long.valueOf(this.f65145c));
            this.f65143a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65143a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65145c++;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65144b, disposable)) {
                this.f65144b = disposable;
                this.f65143a.onSubscribe(this);
            }
        }
    }

    public ObservableCount(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Long> observer) {
        this.source.subscribe(new C10982a(observer));
    }
}
