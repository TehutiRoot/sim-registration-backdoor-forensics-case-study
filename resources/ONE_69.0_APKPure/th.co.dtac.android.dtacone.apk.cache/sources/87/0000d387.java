package io.reactivex.internal.subscribers;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class BlockingFirstSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        if (this.f66171a == null) {
            this.f66172b = th2;
        } else {
            RxJavaPlugins.onError(th2);
        }
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        if (this.f66171a == null) {
            this.f66171a = t;
            this.f66173c.cancel();
            countDown();
        }
    }
}