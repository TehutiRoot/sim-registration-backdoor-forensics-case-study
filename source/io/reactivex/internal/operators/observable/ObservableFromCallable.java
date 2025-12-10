package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class ObservableFromCallable<T> extends Observable<T> implements Callable<T> {

    /* renamed from: a */
    public final Callable f65284a;

    public ObservableFromCallable(Callable<? extends T> callable) {
        this.f65284a = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return (T) ObjectHelper.requireNonNull(this.f65284a.call(), "The callable returned a null value");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(observer);
        observer.onSubscribe(deferredScalarDisposable);
        if (deferredScalarDisposable.isDisposed()) {
            return;
        }
        try {
            deferredScalarDisposable.complete(ObjectHelper.requireNonNull(this.f65284a.call(), "Callable returned null"));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (!deferredScalarDisposable.isDisposed()) {
                observer.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }
    }
}
