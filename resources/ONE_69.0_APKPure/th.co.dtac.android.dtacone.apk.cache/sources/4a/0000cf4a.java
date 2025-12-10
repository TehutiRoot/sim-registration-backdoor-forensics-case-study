package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class FlowableFlatMapPublisher<T, U> extends Flowable<U> {

    /* renamed from: b */
    public final Publisher f64353b;

    /* renamed from: c */
    public final Function f64354c;

    /* renamed from: d */
    public final boolean f64355d;

    /* renamed from: e */
    public final int f64356e;

    /* renamed from: f */
    public final int f64357f;

    public FlowableFlatMapPublisher(Publisher<T> publisher, Function<? super T, ? extends Publisher<? extends U>> function, boolean z, int i, int i2) {
        this.f64353b = publisher;
        this.f64354c = function;
        this.f64355d = z;
        this.f64356e = i;
        this.f64357f = i2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.f64353b, subscriber, this.f64354c)) {
            return;
        }
        this.f64353b.subscribe(FlowableFlatMap.subscribe(subscriber, this.f64354c, this.f64355d, this.f64356e, this.f64357f));
    }
}