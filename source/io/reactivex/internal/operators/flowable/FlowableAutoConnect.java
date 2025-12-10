package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class FlowableAutoConnect<T> extends Flowable<T> {

    /* renamed from: b */
    public final ConnectableFlowable f64048b;

    /* renamed from: c */
    public final int f64049c;

    /* renamed from: d */
    public final Consumer f64050d;

    /* renamed from: e */
    public final AtomicInteger f64051e = new AtomicInteger();

    public FlowableAutoConnect(ConnectableFlowable<? extends T> connectableFlowable, int i, Consumer<? super Disposable> consumer) {
        this.f64048b = connectableFlowable;
        this.f64049c = i;
        this.f64050d = consumer;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.f64048b.subscribe(subscriber);
        if (this.f64051e.incrementAndGet() == this.f64049c) {
            this.f64048b.connect(this.f64050d);
        }
    }
}
