package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;

/* loaded from: classes5.dex */
public final class SingleFromUnsafeSource<T> extends Single<T> {

    /* renamed from: a */
    public final SingleSource f66016a;

    public SingleFromUnsafeSource(SingleSource<T> singleSource) {
        this.f66016a = singleSource;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f66016a.subscribe(singleObserver);
    }
}