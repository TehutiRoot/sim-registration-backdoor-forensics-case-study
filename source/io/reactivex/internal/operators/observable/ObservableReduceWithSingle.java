package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableReduceSeedSingle;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class ObservableReduceWithSingle<T, R> extends Single<R> {

    /* renamed from: a */
    public final ObservableSource f65440a;

    /* renamed from: b */
    public final Callable f65441b;

    /* renamed from: c */
    public final BiFunction f65442c;

    public ObservableReduceWithSingle(ObservableSource<T> observableSource, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        this.f65440a = observableSource;
        this.f65441b = callable;
        this.f65442c = biFunction;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        try {
            this.f65440a.subscribe(new ObservableReduceSeedSingle.C11039a(singleObserver, this.f65442c, ObjectHelper.requireNonNull(this.f65441b.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }
}
