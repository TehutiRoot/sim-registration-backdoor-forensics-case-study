package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ResumeSingleObserver<T> implements SingleObserver<T> {

    /* renamed from: a */
    public final AtomicReference f63879a;

    /* renamed from: b */
    public final SingleObserver f63880b;

    public ResumeSingleObserver(AtomicReference<Disposable> atomicReference, SingleObserver<? super T> singleObserver) {
        this.f63879a = atomicReference;
        this.f63880b = singleObserver;
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th2) {
        this.f63880b.onError(th2);
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.replace(this.f63879a, disposable);
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t) {
        this.f63880b.onSuccess(t);
    }
}
