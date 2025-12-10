package io.reactivex.internal.operators.single;

import io.reactivex.Notification;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.internal.operators.mixed.MaterializeSingleObserver;

@Experimental
/* loaded from: classes5.dex */
public final class SingleMaterialize<T> extends Single<Notification<T>> {

    /* renamed from: a */
    public final Single f66029a;

    public SingleMaterialize(Single<T> single) {
        this.f66029a = single;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Notification<T>> singleObserver) {
        this.f66029a.subscribe(new MaterializeSingleObserver(singleObserver));
    }
}