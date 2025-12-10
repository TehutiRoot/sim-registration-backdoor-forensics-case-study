package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class FlowableFromFuture<T> extends Flowable<T> {

    /* renamed from: b */
    public final Future f64365b;

    /* renamed from: c */
    public final long f64366c;

    /* renamed from: d */
    public final TimeUnit f64367d;

    public FlowableFromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.f64365b = future;
        this.f64366c = j;
        this.f64367d = timeUnit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        Object obj;
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(subscriber);
        subscriber.onSubscribe(deferredScalarSubscription);
        try {
            TimeUnit timeUnit = this.f64367d;
            if (timeUnit != null) {
                obj = this.f64365b.get(this.f64366c, timeUnit);
            } else {
                obj = this.f64365b.get();
            }
            if (obj == null) {
                subscriber.onError(new NullPointerException("The future returned null"));
            } else {
                deferredScalarSubscription.complete(obj);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (!deferredScalarSubscription.isCancelled()) {
                subscriber.onError(th2);
            }
        }
    }
}