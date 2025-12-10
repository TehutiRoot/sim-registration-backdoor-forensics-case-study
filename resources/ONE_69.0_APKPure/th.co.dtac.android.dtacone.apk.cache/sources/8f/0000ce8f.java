package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;

/* loaded from: classes5.dex */
public final class CompletableFromUnsafeSource extends Completable {

    /* renamed from: a */
    public final CompletableSource f64002a;

    public CompletableFromUnsafeSource(CompletableSource completableSource) {
        this.f64002a = completableSource;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f64002a.subscribe(completableObserver);
    }
}