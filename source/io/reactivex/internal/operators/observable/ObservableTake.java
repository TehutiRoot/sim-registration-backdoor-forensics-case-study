package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableTake<T> extends AbstractC11091a {

    /* renamed from: a */
    public final long f65567a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableTake$a */
    /* loaded from: classes5.dex */
    public static final class C11063a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65568a;

        /* renamed from: b */
        public boolean f65569b;

        /* renamed from: c */
        public Disposable f65570c;

        /* renamed from: d */
        public long f65571d;

        public C11063a(Observer observer, long j) {
            this.f65568a = observer;
            this.f65571d = j;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65570c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65570c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (!this.f65569b) {
                this.f65569b = true;
                this.f65570c.dispose();
                this.f65568a.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65569b) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65569b = true;
            this.f65570c.dispose();
            this.f65568a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            boolean z;
            if (!this.f65569b) {
                long j = this.f65571d;
                long j2 = j - 1;
                this.f65571d = j2;
                if (j > 0) {
                    if (j2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f65568a.onNext(obj);
                    if (z) {
                        onComplete();
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65570c, disposable)) {
                this.f65570c = disposable;
                if (this.f65571d == 0) {
                    this.f65569b = true;
                    disposable.dispose();
                    EmptyDisposable.complete(this.f65568a);
                    return;
                }
                this.f65568a.onSubscribe(this);
            }
        }
    }

    public ObservableTake(ObservableSource<T> observableSource, long j) {
        super(observableSource);
        this.f65567a = j;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C11063a(observer, this.f65567a));
    }
}
