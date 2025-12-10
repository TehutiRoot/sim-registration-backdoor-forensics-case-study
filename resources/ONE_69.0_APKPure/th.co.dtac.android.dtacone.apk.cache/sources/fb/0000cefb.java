package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class FlowableConcatMapPublisher<T, R> extends Flowable<R> {

    /* renamed from: b */
    public final Publisher f64227b;

    /* renamed from: c */
    public final Function f64228c;

    /* renamed from: d */
    public final int f64229d;

    /* renamed from: e */
    public final ErrorMode f64230e;

    public FlowableConcatMapPublisher(Publisher<T> publisher, Function<? super T, ? extends Publisher<? extends R>> function, int i, ErrorMode errorMode) {
        this.f64227b = publisher;
        this.f64228c = function;
        this.f64229d = i;
        this.f64230e = errorMode;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.f64227b, subscriber, this.f64228c)) {
            return;
        }
        this.f64227b.subscribe(FlowableConcatMap.subscribe(subscriber, this.f64228c, this.f64229d, this.f64230e));
    }
}