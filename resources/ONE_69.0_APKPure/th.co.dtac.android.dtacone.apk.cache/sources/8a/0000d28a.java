package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class ObservableToListSingle<T, U extends Collection<? super T>> extends Single<U> implements FuseToObservable<U> {

    /* renamed from: a */
    public final ObservableSource f65688a;

    /* renamed from: b */
    public final Callable f65689b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableToListSingle$a */
    /* loaded from: classes5.dex */
    public static final class C11060a implements Observer, Disposable {

        /* renamed from: a */
        public final SingleObserver f65690a;

        /* renamed from: b */
        public Collection f65691b;

        /* renamed from: c */
        public Disposable f65692c;

        public C11060a(SingleObserver singleObserver, Collection collection) {
            this.f65690a = singleObserver;
            this.f65691b = collection;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65692c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65692c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            Collection collection = this.f65691b;
            this.f65691b = null;
            this.f65690a.onSuccess(collection);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65691b = null;
            this.f65690a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65691b.add(obj);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65692c, disposable)) {
                this.f65692c = disposable;
                this.f65690a.onSubscribe(this);
            }
        }
    }

    public ObservableToListSingle(ObservableSource<T> observableSource, int i) {
        this.f65688a = observableSource;
        this.f65689b = Functions.createArrayList(i);
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<U> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableToList(this.f65688a, this.f65689b));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super U> singleObserver) {
        try {
            this.f65688a.subscribe(new C11060a(singleObserver, (Collection) ObjectHelper.requireNonNull(this.f65689b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }

    public ObservableToListSingle(ObservableSource<T> observableSource, Callable<U> callable) {
        this.f65688a = observableSource;
        this.f65689b = callable;
    }
}