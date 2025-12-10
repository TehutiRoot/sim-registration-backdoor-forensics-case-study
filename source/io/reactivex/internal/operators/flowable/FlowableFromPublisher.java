package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class FlowableFromPublisher<T> extends Flowable<T> {

    /* renamed from: b */
    public final Publisher f64310b;

    public FlowableFromPublisher(Publisher<? extends T> publisher) {
        this.f64310b = publisher;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.f64310b.subscribe(subscriber);
    }
}
