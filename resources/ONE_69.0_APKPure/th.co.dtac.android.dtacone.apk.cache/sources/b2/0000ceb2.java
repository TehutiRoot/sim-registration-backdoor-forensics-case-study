package io.reactivex.internal.operators.completable;

import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.internal.observers.SubscriberCompletableObserver;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class CompletableToFlowable<T> extends Flowable<T> {

    /* renamed from: b */
    public final CompletableSource f64058b;

    public CompletableToFlowable(CompletableSource completableSource) {
        this.f64058b = completableSource;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.f64058b.subscribe(new SubscriberCompletableObserver(subscriber));
    }
}