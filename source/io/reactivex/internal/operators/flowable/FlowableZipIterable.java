package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableZipIterable<T, U, V> extends AbstractC0567I {

    /* renamed from: b */
    public final Iterable f64714b;

    /* renamed from: c */
    public final BiFunction f64715c;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableZipIterable$a */
    /* loaded from: classes5.dex */
    public static final class C10922a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64716a;

        /* renamed from: b */
        public final Iterator f64717b;

        /* renamed from: c */
        public final BiFunction f64718c;

        /* renamed from: d */
        public Subscription f64719d;

        /* renamed from: e */
        public boolean f64720e;

        public C10922a(Subscriber subscriber, Iterator it, BiFunction biFunction) {
            this.f64716a = subscriber;
            this.f64717b = it;
            this.f64718c = biFunction;
        }

        /* renamed from: a */
        public void m30012a(Throwable th2) {
            Exceptions.throwIfFatal(th2);
            this.f64720e = true;
            this.f64719d.cancel();
            this.f64716a.onError(th2);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f64719d.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64720e) {
                return;
            }
            this.f64720e = true;
            this.f64716a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64720e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64720e = true;
            this.f64716a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64720e) {
                return;
            }
            try {
                try {
                    this.f64716a.onNext(ObjectHelper.requireNonNull(this.f64718c.apply(obj, ObjectHelper.requireNonNull(this.f64717b.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (!this.f64717b.hasNext()) {
                            this.f64720e = true;
                            this.f64719d.cancel();
                            this.f64716a.onComplete();
                        }
                    } catch (Throwable th2) {
                        m30012a(th2);
                    }
                } catch (Throwable th3) {
                    m30012a(th3);
                }
            } catch (Throwable th4) {
                m30012a(th4);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64719d, subscription)) {
                this.f64719d = subscription;
                this.f64716a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64719d.request(j);
        }
    }

    public FlowableZipIterable(Flowable<T> flowable, Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        super(flowable);
        this.f64714b = iterable;
        this.f64715c = biFunction;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super V> subscriber) {
        try {
            Iterator it = (Iterator) ObjectHelper.requireNonNull(this.f64714b.iterator(), "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    EmptySubscription.complete(subscriber);
                } else {
                    this.source.subscribe((FlowableSubscriber<? super Object>) new C10922a(subscriber, it, this.f64715c));
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptySubscription.error(th2, subscriber);
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            EmptySubscription.error(th3, subscriber);
        }
    }
}
