package io.reactivex.internal.operators.flowable;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableReduceSeedSingle;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;

/* loaded from: classes5.dex */
public final class FlowableReduceWithSingle<T, R> extends Single<R> {

    /* renamed from: a */
    public final Publisher f64458a;

    /* renamed from: b */
    public final Callable f64459b;

    /* renamed from: c */
    public final BiFunction f64460c;

    public FlowableReduceWithSingle(Publisher<T> publisher, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        this.f64458a = publisher;
        this.f64459b = callable;
        this.f64460c = biFunction;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        try {
            this.f64458a.subscribe(new FlowableReduceSeedSingle.C10880a(singleObserver, this.f64460c, ObjectHelper.requireNonNull(this.f64459b.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }
}
