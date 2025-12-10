package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableAnySingle<T> extends Single<Boolean> implements FuseToObservable<Boolean> {

    /* renamed from: a */
    public final ObservableSource f65088a;

    /* renamed from: b */
    public final Predicate f65089b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableAnySingle$a */
    /* loaded from: classes5.dex */
    public static final class C10955a implements Observer, Disposable {

        /* renamed from: a */
        public final SingleObserver f65090a;

        /* renamed from: b */
        public final Predicate f65091b;

        /* renamed from: c */
        public Disposable f65092c;

        /* renamed from: d */
        public boolean f65093d;

        public C10955a(SingleObserver singleObserver, Predicate predicate) {
            this.f65090a = singleObserver;
            this.f65091b = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65092c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65092c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (!this.f65093d) {
                this.f65093d = true;
                this.f65090a.onSuccess(Boolean.FALSE);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65093d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65093d = true;
            this.f65090a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65093d) {
                return;
            }
            try {
                if (this.f65091b.test(obj)) {
                    this.f65093d = true;
                    this.f65092c.dispose();
                    this.f65090a.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65092c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65092c, disposable)) {
                this.f65092c = disposable;
                this.f65090a.onSubscribe(this);
            }
        }
    }

    public ObservableAnySingle(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        this.f65088a = observableSource;
        this.f65089b = predicate;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<Boolean> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableAny(this.f65088a, this.f65089b));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.f65088a.subscribe(new C10955a(singleObserver, this.f65089b));
    }
}