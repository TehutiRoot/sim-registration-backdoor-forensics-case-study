package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposables;

/* loaded from: classes5.dex */
public final class SingleJust<T> extends Single<T> {

    /* renamed from: a */
    public final Object f65959a;

    public SingleJust(T t) {
        this.f65959a = t;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        singleObserver.onSubscribe(Disposables.disposed());
        singleObserver.onSuccess((Object) this.f65959a);
    }
}
