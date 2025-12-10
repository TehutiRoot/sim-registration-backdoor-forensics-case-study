package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class ObservableSkip<T> extends AbstractC11091a {

    /* renamed from: a */
    public final long f65530a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSkip$a */
    /* loaded from: classes5.dex */
    public static final class C11057a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65531a;

        /* renamed from: b */
        public long f65532b;

        /* renamed from: c */
        public Disposable f65533c;

        public C11057a(Observer observer, long j) {
            this.f65531a = observer;
            this.f65532b = j;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65533c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65533c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65531a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65531a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            long j = this.f65532b;
            if (j != 0) {
                this.f65532b = j - 1;
            } else {
                this.f65531a.onNext(obj);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65533c, disposable)) {
                this.f65533c = disposable;
                this.f65531a.onSubscribe(this);
            }
        }
    }

    public ObservableSkip(ObservableSource<T> observableSource, long j) {
        super(observableSource);
        this.f65530a = j;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C11057a(observer, this.f65530a));
    }
}
