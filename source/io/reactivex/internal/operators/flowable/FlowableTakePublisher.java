package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.operators.flowable.FlowableTake;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class FlowableTakePublisher<T> extends Flowable<T> {

    /* renamed from: b */
    public final Publisher f64576b;

    /* renamed from: c */
    public final long f64577c;

    public FlowableTakePublisher(Publisher<T> publisher, long j) {
        this.f64576b = publisher;
        this.f64577c = j;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.f64576b.subscribe(new FlowableTake.TakeSubscriber(subscriber, this.f64577c));
    }
}
