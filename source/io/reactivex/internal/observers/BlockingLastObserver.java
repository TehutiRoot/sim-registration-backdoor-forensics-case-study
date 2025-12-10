package io.reactivex.internal.observers;

/* loaded from: classes5.dex */
public final class BlockingLastObserver<T> extends BlockingBaseObserver<T> {
    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        this.f63861a = null;
        this.f63862b = th2;
        countDown();
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        this.f63861a = t;
    }
}
