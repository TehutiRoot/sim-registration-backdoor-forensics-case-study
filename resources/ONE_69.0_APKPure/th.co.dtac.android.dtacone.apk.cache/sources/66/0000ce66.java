package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ResumeSingleObserver<T> implements SingleObserver<T> {

    /* renamed from: a */
    public final AtomicReference f63942a;

    /* renamed from: b */
    public final SingleObserver f63943b;

    public ResumeSingleObserver(AtomicReference<Disposable> atomicReference, SingleObserver<? super T> singleObserver) {
        this.f63942a = atomicReference;
        this.f63943b = singleObserver;
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th2) {
        this.f63943b.onError(th2);
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.replace(this.f63942a, disposable);
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t) {
        this.f63943b.onSuccess(t);
    }
}