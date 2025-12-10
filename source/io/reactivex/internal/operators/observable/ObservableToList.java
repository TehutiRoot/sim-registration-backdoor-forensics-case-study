package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class ObservableToList<T, U extends Collection<? super T>> extends AbstractC11091a {

    /* renamed from: a */
    public final Callable f65621a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableToList$a */
    /* loaded from: classes5.dex */
    public static final class C11072a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65622a;

        /* renamed from: b */
        public Disposable f65623b;

        /* renamed from: c */
        public Collection f65624c;

        public C11072a(Observer observer, Collection collection) {
            this.f65622a = observer;
            this.f65624c = collection;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65623b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65623b.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            Collection collection = this.f65624c;
            this.f65624c = null;
            this.f65622a.onNext(collection);
            this.f65622a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65624c = null;
            this.f65622a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65624c.add(obj);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65623b, disposable)) {
                this.f65623b = disposable;
                this.f65622a.onSubscribe(this);
            }
        }
    }

    public ObservableToList(ObservableSource<T> observableSource, int i) {
        super(observableSource);
        this.f65621a = Functions.createArrayList(i);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        try {
            this.source.subscribe(new C11072a(observer, (Collection) ObjectHelper.requireNonNull(this.f65621a.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }

    public ObservableToList(ObservableSource<T> observableSource, Callable<U> callable) {
        super(observableSource);
        this.f65621a = callable;
    }
}
