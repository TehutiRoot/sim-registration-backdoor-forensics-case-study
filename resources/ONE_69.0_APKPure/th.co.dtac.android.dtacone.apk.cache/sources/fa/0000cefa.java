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
    public final Publisher f64222b;

    /* renamed from: c */
    public final Function f64223c;

    /* renamed from: d */
    public final int f64224d;

    /* renamed from: e */
    public final int f64225e;

    /* renamed from: f */
    public final ErrorMode f64226f;

    public FlowableConcatMapEagerPublisher(Publisher<T> publisher, Function<? super T, ? extends Publisher<? extends R>> function, int i, int i2, ErrorMode errorMode) {
        this.f64222b = publisher;
        this.f64223c = function;
        this.f64224d = i;
        this.f64225e = i2;
        this.f64226f = errorMode;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f64222b.subscribe(new FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber(subscriber, this.f64223c, this.f64224d, this.f64225e, this.f64226f));
    }
}