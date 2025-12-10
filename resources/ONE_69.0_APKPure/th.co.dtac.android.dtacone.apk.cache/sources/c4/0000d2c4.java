package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.parallel.ParallelFlowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class ParallelFlatMap<T, R> extends ParallelFlowable<R> {

    /* renamed from: a */
    public final ParallelFlowable f65835a;

    /* renamed from: b */
    public final Function f65836b;

    /* renamed from: c */
    public final boolean f65837c;

    /* renamed from: d */
    public final int f65838d;

    /* renamed from: e */
    public final int f65839e;

    public ParallelFlatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends Publisher<? extends R>> function, boolean z, int i, int i2) {
        this.f65835a = parallelFlowable;
        this.f65836b = function;
        this.f65837c = z;
        this.f65838d = i;
        this.f65839e = i2;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f65835a.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super R>[] subscriberArr) {
        if (!validate(subscriberArr)) {
            return;
        }
        int length = subscriberArr.length;
        Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
        for (int i = 0; i < length; i++) {
            subscriberArr2[i] = FlowableFlatMap.subscribe(subscriberArr[i], this.f65836b, this.f65837c, this.f65838d, this.f65839e);
        }
        this.f65835a.subscribe(subscriberArr2);
    }
}