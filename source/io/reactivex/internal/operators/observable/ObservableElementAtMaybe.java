package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableElementAtMaybe<T> extends Maybe<T> implements FuseToObservable<T> {

    /* renamed from: a */
    public final ObservableSource f65241a;

    /* renamed from: b */
    public final long f65242b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableElementAtMaybe$a */
    /* loaded from: classes5.dex */
    public static final class C11000a implements Observer, Disposable {

        /* renamed from: a */
        public final MaybeObserver f65243a;

        /* renamed from: b */
        public final long f65244b;

        /* renamed from: c */
        public Disposable f65245c;

        /* renamed from: d */
        public long f65246d;

        /* renamed from: e */
        public boolean f65247e;

        public C11000a(MaybeObserver maybeObserver, long j) {
            this.f65243a = maybeObserver;
            this.f65244b = j;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65245c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65245c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (!this.f65247e) {
                this.f65247e = true;
                this.f65243a.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65247e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65247e = true;
            this.f65243a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65247e) {
                return;
            }
            long j = this.f65246d;
            if (j == this.f65244b) {
                this.f65247e = true;
                this.f65245c.dispose();
                this.f65243a.onSuccess(obj);
                return;
            }
            this.f65246d = j + 1;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65245c, disposable)) {
                this.f65245c = disposable;
                this.f65243a.onSubscribe(this);
            }
        }
    }

    public ObservableElementAtMaybe(ObservableSource<T> observableSource, long j) {
        this.f65241a = observableSource;
        this.f65242b = j;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<T> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableElementAt(this.f65241a, this.f65242b, null, false));
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f65241a.subscribe(new C11000a(maybeObserver, this.f65242b));
    }
}
