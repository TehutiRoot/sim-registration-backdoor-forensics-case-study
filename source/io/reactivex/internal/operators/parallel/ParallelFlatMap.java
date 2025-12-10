package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.parallel.ParallelFlowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class ParallelFlatMap<T, R> extends ParallelFlowable<R> {

    /* renamed from: a */
    public final ParallelFlowable f65772a;

    /* renamed from: b */
    public final Function f65773b;

    /* renamed from: c */
    public final boolean f65774c;

    /* renamed from: d */
    public final int f65775d;

    /* renamed from: e */
    public final int f65776e;

    public ParallelFlatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends Publisher<? extends R>> function, boolean z, int i, int i2) {
        this.f65772a = parallelFlowable;
        this.f65773b = function;
        this.f65774c = z;
        this.f65775d = i;
        this.f65776e = i2;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f65772a.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super R>[] subscriberArr) {
        if (!validate(subscriberArr)) {
            return;
        }
        int length = subscriberArr.length;
        Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
        for (int i = 0; i < length; i++) {
            subscriberArr2[i] = FlowableFlatMap.subscribe(subscriberArr[i], this.f65773b, this.f65774c, this.f65775d, this.f65776e);
        }
        this.f65772a.subscribe(subscriberArr2);
    }
}
