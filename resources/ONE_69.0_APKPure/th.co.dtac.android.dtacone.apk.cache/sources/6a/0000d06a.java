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
public final class FlowableZipIterable<T, U, V> extends AbstractC0558I {

    /* renamed from: b */
    public final Iterable f64777b;

    /* renamed from: c */
    public final BiFunction f64778c;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableZipIterable$a */
    /* loaded from: classes5.dex */
    public static final class C10909a implements FlowableSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f64779a;

        /* renamed from: b */
        public final Iterator f64780b;

        /* renamed from: c */
        public final BiFunction f64781c;

        /* renamed from: d */
        public Subscription f64782d;

        /* renamed from: e */
        public boolean f64783e;

        public C10909a(Subscriber subscriber, Iterator it, BiFunction biFunction) {
            this.f64779a = subscriber;
            this.f64780b = it;
            this.f64781c = biFunction;
        }

        /* renamed from: a */
        public void m30352a(Throwable th2) {
            Exceptions.throwIfFatal(th2);
            this.f64783e = true;
            this.f64782d.cancel();
            this.f64779a.onError(th2);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f64782d.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64783e) {
                return;
            }
            this.f64783e = true;
            this.f64779a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64783e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64783e = true;
            this.f64779a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64783e) {
                return;
            }
            try {
                try {
                    this.f64779a.onNext(ObjectHelper.requireNonNull(this.f64781c.apply(obj, ObjectHelper.requireNonNull(this.f64780b.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (!this.f64780b.hasNext()) {
                            this.f64783e = true;
                            this.f64782d.cancel();
                            this.f64779a.onComplete();
                        }
                    } catch (Throwable th2) {
                        m30352a(th2);
                    }
                } catch (Throwable th3) {
                    m30352a(th3);
                }
            } catch (Throwable th4) {
                m30352a(th4);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64782d, subscription)) {
                this.f64782d = subscription;
                this.f64779a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f64782d.request(j);
        }
    }

    public FlowableZipIterable(Flowable<T> flowable, Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        super(flowable);
        this.f64777b = iterable;
        this.f64778c = biFunction;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super V> subscriber) {
        try {
            Iterator it = (Iterator) ObjectHelper.requireNonNull(this.f64777b.iterator(), "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    EmptySubscription.complete(subscriber);
                } else {
                    this.source.subscribe((FlowableSubscriber<? super Object>) new C10909a(subscriber, it, this.f64778c));
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