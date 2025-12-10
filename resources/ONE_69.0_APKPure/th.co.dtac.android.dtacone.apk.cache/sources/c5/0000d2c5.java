package io.reactivex.internal.operators.parallel;

import io.reactivex.parallel.ParallelFlowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class ParallelFromArray<T> extends ParallelFlowable<T> {

    /* renamed from: a */
    public final Publisher[] f65840a;

    public ParallelFromArray(Publisher<T>[] publisherArr) {
        this.f65840a = publisherArr;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f65840a.length;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super T>[] subscriberArr) {
        if (!validate(subscriberArr)) {
            return;
        }
        int length = subscriberArr.length;
        for (int i = 0; i < length; i++) {
            this.f65840a[i].subscribe(subscriberArr[i]);
        }
    }
}