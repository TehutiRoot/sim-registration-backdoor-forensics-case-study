package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;

/* loaded from: classes5.dex */
public final class SingleFromUnsafeSource<T> extends Single<T> {

    /* renamed from: a */
    public final SingleSource f65953a;

    public SingleFromUnsafeSource(SingleSource<T> singleSource) {
        this.f65953a = singleSource;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65953a.subscribe(singleObserver);
    }
}
