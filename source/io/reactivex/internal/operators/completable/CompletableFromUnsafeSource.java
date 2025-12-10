package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;

/* loaded from: classes5.dex */
public final class CompletableFromUnsafeSource extends Completable {

    /* renamed from: a */
    public final CompletableSource f63939a;

    public CompletableFromUnsafeSource(CompletableSource completableSource) {
        this.f63939a = completableSource;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f63939a.subscribe(completableObserver);
    }
}
