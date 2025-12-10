package io.reactivex.internal.observers;

/* loaded from: classes5.dex */
public final class BlockingFirstObserver<T> extends BlockingBaseObserver<T> {
    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        if (this.f63924a == null) {
            this.f63925b = th2;
        }
        countDown();
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        if (this.f63924a == null) {
            this.f63924a = t;
            this.f63926c.dispose();
            countDown();
        }
    }
}