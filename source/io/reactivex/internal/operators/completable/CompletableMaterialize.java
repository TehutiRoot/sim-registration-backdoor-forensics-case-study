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
    public final Completable f63945a;

    public CompletableMaterialize(Completable completable) {
        this.f63945a = completable;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Notification<T>> singleObserver) {
        this.f63945a.subscribe(new MaterializeSingleObserver(singleObserver));
    }
}
