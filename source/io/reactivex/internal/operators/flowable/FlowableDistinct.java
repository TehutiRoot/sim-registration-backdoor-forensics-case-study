package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class FlowableDistinct<T, K> extends AbstractC0567I {

    /* renamed from: b */
    public final Function f64212b;

    /* renamed from: c */
    public final Callable f64213c;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDistinct$a */
    /* loaded from: classes5.dex */
    public static final class C10837a extends BasicFuseableSubscriber {

        /* renamed from: a */
        public final Collection f64214a;

        /* renamed from: b */
        public final Function f64215b;

        public C10837a(Subscriber subscriber, Function function, Collection collection) {
            super(subscriber);
            this.f64215b = function;
            this.f64214a = collection;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f64214a.clear();
            super.clear();
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.f64214a.clear();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            this.f64214a.clear();
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.done) {
                return;
            }
            if (this.sourceMode == 0) {
                try {
                    if (this.f64214a.add(ObjectHelper.requireNonNull(this.f64215b.apply(obj), "The keySelector returned a null key"))) {
                        this.downstream.onNext(obj);
                        return;
                    } else {
                        this.upstream.request(1L);
                        return;
                    }
                } catch (Throwable th2) {
                    fail(th2);
                    return;
                }
            }
            this.downstream.onNext(null);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            T poll;
            while (true) {
                poll = this.f66107qs.poll();
                if (poll == null || this.f64214a.add(ObjectHelper.requireNonNull(this.f64215b.apply(poll), "The keySelector returned a null key"))) {
                    break;
                } else if (this.sourceMode == 2) {
                    this.upstream.request(1L);
                }
            }
            return poll;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }
    }

    public FlowableDistinct(Flowable<T> flowable, Function<? super T, K> function, Callable<? extends Collection<? super K>> callable) {
        super(flowable);
        this.f64212b = function;
        this.f64213c = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        try {
            this.source.subscribe((FlowableSubscriber<? super Object>) new C10837a(subscriber, this.f64212b, (Collection) ObjectHelper.requireNonNull(this.f64213c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
