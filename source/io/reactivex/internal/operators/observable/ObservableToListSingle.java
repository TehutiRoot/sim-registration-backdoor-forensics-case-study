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
    public final ObservableSource f65625a;

    /* renamed from: b */
    public final Callable f65626b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableToListSingle$a */
    /* loaded from: classes5.dex */
    public static final class C11073a implements Observer, Disposable {

        /* renamed from: a */
        public final SingleObserver f65627a;

        /* renamed from: b */
        public Collection f65628b;

        /* renamed from: c */
        public Disposable f65629c;

        public C11073a(SingleObserver singleObserver, Collection collection) {
            this.f65627a = singleObserver;
            this.f65628b = collection;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65629c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65629c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            Collection collection = this.f65628b;
            this.f65628b = null;
            this.f65627a.onSuccess(collection);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65628b = null;
            this.f65627a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65628b.add(obj);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65629c, disposable)) {
                this.f65629c = disposable;
                this.f65627a.onSubscribe(this);
            }
        }
    }

    public ObservableToListSingle(ObservableSource<T> observableSource, int i) {
        this.f65625a = observableSource;
        this.f65626b = Functions.createArrayList(i);
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<U> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableToList(this.f65625a, this.f65626b));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super U> singleObserver) {
        try {
            this.f65625a.subscribe(new C11073a(singleObserver, (Collection) ObjectHelper.requireNonNull(this.f65626b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }

    public ObservableToListSingle(ObservableSource<T> observableSource, Callable<U> callable) {
        this.f65625a = observableSource;
        this.f65626b = callable;
    }
}
