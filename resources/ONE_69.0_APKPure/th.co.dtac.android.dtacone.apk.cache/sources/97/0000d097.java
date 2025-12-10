package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposables;

/* loaded from: classes5.dex */
public final class MaybeError<T> extends Maybe<T> {

    /* renamed from: a */
    public final Throwable f64842a;

    public MaybeError(Throwable th2) {
        this.f64842a = th2;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        maybeObserver.onSubscribe(Disposables.disposed());
        maybeObserver.onError(this.f64842a);
    }
}