package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class FlowableFlatMapPublisher<T, U> extends Flowable<U> {

    /* renamed from: b */
    public final Publisher f64290b;

    /* renamed from: c */
    public final Function f64291c;

    /* renamed from: d */
    public final boolean f64292d;

    /* renamed from: e */
    public final int f64293e;

    /* renamed from: f */
    public final int f64294f;

    public FlowableFlatMapPublisher(Publisher<T> publisher, Function<? super T, ? extends Publisher<? extends U>> function, boolean z, int i, int i2) {
        this.f64290b = publisher;
        this.f64291c = function;
        this.f64292d = z;
        this.f64293e = i;
        this.f64294f = i2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.f64290b, subscriber, this.f64291c)) {
            return;
        }
        this.f64290b.subscribe(FlowableFlatMap.subscribe(subscriber, this.f64291c, this.f64292d, this.f64293e, this.f64294f));
    }
}
