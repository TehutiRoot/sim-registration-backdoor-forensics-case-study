package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

/* loaded from: classes5.dex */
public final class CompletableError extends Completable {

    /* renamed from: a */
    public final Throwable f63990a;

    public CompletableError(Throwable th2) {
        this.f63990a = th2;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        EmptyDisposable.error(this.f63990a, completableObserver);
    }
}