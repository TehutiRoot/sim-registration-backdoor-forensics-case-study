package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class ObservableFromFuture<T> extends Observable<T> {

    /* renamed from: a */
    public final Future f65285a;

    /* renamed from: b */
    public final long f65286b;

    /* renamed from: c */
    public final TimeUnit f65287c;

    public ObservableFromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.f65285a = future;
        this.f65286b = j;
        this.f65287c = timeUnit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        Object obj;
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(observer);
        observer.onSubscribe(deferredScalarDisposable);
        if (!deferredScalarDisposable.isDisposed()) {
            try {
                TimeUnit timeUnit = this.f65287c;
                if (timeUnit != null) {
                    obj = this.f65285a.get(this.f65286b, timeUnit);
                } else {
                    obj = this.f65285a.get();
                }
                deferredScalarDisposable.complete(ObjectHelper.requireNonNull(obj, "Future returned null"));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                if (!deferredScalarDisposable.isDisposed()) {
                    observer.onError(th2);
                }
            }
        }
    }
}
