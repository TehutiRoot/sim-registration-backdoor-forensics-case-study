package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.Notification;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.internal.operators.mixed.MaterializeSingleObserver;

@Experimental
/* loaded from: classes5.dex */
public final class MaybeMaterialize<T> extends Single<Notification<T>> {

    /* renamed from: a */
    public final Maybe f64851a;

    public MaybeMaterialize(Maybe<T> maybe) {
        this.f64851a = maybe;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Notification<T>> singleObserver) {
        this.f64851a.subscribe(new MaterializeSingleObserver(singleObserver));
    }
}
