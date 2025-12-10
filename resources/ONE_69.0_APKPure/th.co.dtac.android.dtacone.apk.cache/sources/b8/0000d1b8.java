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
    public final Future f65348a;

    /* renamed from: b */
    public final long f65349b;

    /* renamed from: c */
    public final TimeUnit f65350c;

    public ObservableFromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.f65348a = future;
        this.f65349b = j;
        this.f65350c = timeUnit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        Object obj;
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(observer);
        observer.onSubscribe(deferredScalarDisposable);
        if (!deferredScalarDisposable.isDisposed()) {
            try {
                TimeUnit timeUnit = this.f65350c;
                if (timeUnit != null) {
                    obj = this.f65348a.get(this.f65349b, timeUnit);
                } else {
                    obj = this.f65348a.get();
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