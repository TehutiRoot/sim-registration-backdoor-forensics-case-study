package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableOperator;
import io.reactivex.CompletableSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class CompletableLift extends Completable {

    /* renamed from: a */
    public final CompletableSource f63943a;

    /* renamed from: b */
    public final CompletableOperator f63944b;

    public CompletableLift(CompletableSource completableSource, CompletableOperator completableOperator) {
        this.f63943a = completableSource;
        this.f63944b = completableOperator;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        try {
            this.f63943a.subscribe(this.f63944b.apply(completableObserver));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
        }
    }
}
