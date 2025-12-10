package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class SingleFromCallable<T> extends Single<T> {

    /* renamed from: a */
    public final Callable f66009a;

    public SingleFromCallable(Callable<? extends T> callable) {
        this.f66009a = callable;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        Disposable empty = Disposables.empty();
        singleObserver.onSubscribe(empty);
        if (empty.isDisposed()) {
            return;
        }
        try {
            Object obj = (Object) ObjectHelper.requireNonNull(this.f66009a.call(), "The callable returned a null value");
            if (!empty.isDisposed()) {
                singleObserver.onSuccess(obj);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (!empty.isDisposed()) {
                singleObserver.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }
    }
}