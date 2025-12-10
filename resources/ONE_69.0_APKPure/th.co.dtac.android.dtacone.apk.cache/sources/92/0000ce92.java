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
    public final CompletableSource f64006a;

    /* renamed from: b */
    public final CompletableOperator f64007b;

    public CompletableLift(CompletableSource completableSource, CompletableOperator completableOperator) {
        this.f64006a = completableSource;
        this.f64007b = completableOperator;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        try {
            this.f64006a.subscribe(this.f64007b.apply(completableObserver));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
        }
    }
}