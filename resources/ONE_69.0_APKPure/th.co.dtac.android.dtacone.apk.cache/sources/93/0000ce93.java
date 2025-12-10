package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.Notification;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.internal.operators.mixed.MaterializeSingleObserver;

@Experimental
/* loaded from: classes5.dex */
public final class CompletableMaterialize<T> extends Single<Notification<T>> {

    /* renamed from: a */
    public final Completable f64008a;

    public CompletableMaterialize(Completable completable) {
        this.f64008a = completable;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Notification<T>> singleObserver) {
        this.f64008a.subscribe(new MaterializeSingleObserver(singleObserver));
    }
}