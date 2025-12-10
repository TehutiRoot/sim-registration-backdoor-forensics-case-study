package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class FlowableConcatMapPublisher<T, R> extends Flowable<R> {

    /* renamed from: b */
    public final Publisher f64164b;

    /* renamed from: c */
    public final Function f64165c;

    /* renamed from: d */
    public final int f64166d;

    /* renamed from: e */
    public final ErrorMode f64167e;

    public FlowableConcatMapPublisher(Publisher<T> publisher, Function<? super T, ? extends Publisher<? extends R>> function, int i, ErrorMode errorMode) {
        this.f64164b = publisher;
        this.f64165c = function;
        this.f64166d = i;
        this.f64167e = errorMode;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.f64164b, subscriber, this.f64165c)) {
            return;
        }
        this.f64164b.subscribe(FlowableConcatMap.subscribe(subscriber, this.f64165c, this.f64166d, this.f64167e));
    }
}
