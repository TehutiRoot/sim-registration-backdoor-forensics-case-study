package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleOperator;
import io.reactivex.SingleSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;

/* loaded from: classes5.dex */
public final class SingleLift<T, R> extends Single<R> {

    /* renamed from: a */
    public final SingleSource f65960a;

    /* renamed from: b */
    public final SingleOperator f65961b;

    public SingleLift(SingleSource<T> singleSource, SingleOperator<? extends R, ? super T> singleOperator) {
        this.f65960a = singleSource;
        this.f65961b = singleOperator;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        try {
            this.f65960a.subscribe((SingleObserver) ObjectHelper.requireNonNull(this.f65961b.apply(singleObserver), "The onLift returned a null SingleObserver"));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }
}
