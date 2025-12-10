package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEager;
import io.reactivex.internal.util.ErrorMode;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class FlowableConcatMapEagerPublisher<T, R> extends Flowable<R> {

    /* renamed from: b */
    public final Publisher f64159b;

    /* renamed from: c */
    public final Function f64160c;

    /* renamed from: d */
    public final int f64161d;

    /* renamed from: e */
    public final int f64162e;

    /* renamed from: f */
    public final ErrorMode f64163f;

    public FlowableConcatMapEagerPublisher(Publisher<T> publisher, Function<? super T, ? extends Publisher<? extends R>> function, int i, int i2, ErrorMode errorMode) {
        this.f64159b = publisher;
        this.f64160c = function;
        this.f64161d = i;
        this.f64162e = i2;
        this.f64163f = errorMode;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f64159b.subscribe(new FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber(subscriber, this.f64160c, this.f64161d, this.f64162e, this.f64163f));
    }
}
