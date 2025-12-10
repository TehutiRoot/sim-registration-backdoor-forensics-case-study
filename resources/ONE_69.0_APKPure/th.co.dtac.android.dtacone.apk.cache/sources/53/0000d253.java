package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class ObservableSkip<T> extends AbstractC11078a {

    /* renamed from: a */
    public final long f65593a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSkip$a */
    /* loaded from: classes5.dex */
    public static final class C11044a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65594a;

        /* renamed from: b */
        public long f65595b;

        /* renamed from: c */
        public Disposable f65596c;

        public C11044a(Observer observer, long j) {
            this.f65594a = observer;
            this.f65595b = j;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65596c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65596c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65594a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65594a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            long j = this.f65595b;
            if (j != 0) {
                this.f65595b = j - 1;
            } else {
                this.f65594a.onNext(obj);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65596c, disposable)) {
                this.f65596c = disposable;
                this.f65594a.onSubscribe(this);
            }
        }
    }

    public ObservableSkip(ObservableSource<T> observableSource, long j) {
        super(observableSource);
        this.f65593a = j;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C11044a(observer, this.f65593a));
    }
}