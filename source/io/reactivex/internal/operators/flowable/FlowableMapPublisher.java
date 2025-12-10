package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableMap;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class FlowableMapPublisher<T, U> extends Flowable<U> {

    /* renamed from: b */
    public final Publisher f64391b;

    /* renamed from: c */
    public final Function f64392c;

    public FlowableMapPublisher(Publisher<T> publisher, Function<? super T, ? extends U> function) {
        this.f64391b = publisher;
        this.f64392c = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        this.f64391b.subscribe(new FlowableMap.C10874b(subscriber, this.f64392c));
    }
}
