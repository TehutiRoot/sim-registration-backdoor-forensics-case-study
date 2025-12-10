package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableAmb<T> extends Flowable<T> {

    /* renamed from: b */
    public final Publisher[] f64036b;

    /* renamed from: c */
    public final Iterable f64037c;

    /* loaded from: classes5.dex */
    public static final class AmbInnerSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = -1185974347409665484L;
        final Subscriber<? super T> downstream;
        final int index;
        final AtomicLong missedRequested = new AtomicLong();
        final C10811a parent;
        boolean won;

        public AmbInnerSubscriber(C10811a c10811a, int i, Subscriber<? super T> subscriber) {
            this.parent = c10811a;
            this.index = i;
            this.downstream = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.won) {
                this.downstream.onComplete();
            } else if (this.parent.m30063b(this.index)) {
                this.won = true;
                this.downstream.onComplete();
            } else {
                get().cancel();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.won) {
                this.downstream.onError(th2);
            } else if (this.parent.m30063b(this.index)) {
                this.won = true;
                this.downstream.onError(th2);
            } else {
                get().cancel();
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.won) {
                this.downstream.onNext(t);
            } else if (this.parent.m30063b(this.index)) {
                this.won = true;
                this.downstream.onNext(t);
            } else {
                get().cancel();
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this, this.missedRequested, subscription);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            SubscriptionHelper.deferredRequest(this, this.missedRequested, j);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableAmb$a */
    /* loaded from: classes5.dex */
    public static final class C10811a implements Subscription {

        /* renamed from: a */
        public final Subscriber f64038a;

        /* renamed from: b */
        public final AmbInnerSubscriber[] f64039b;

        /* renamed from: c */
        public final AtomicInteger f64040c = new AtomicInteger();

        public C10811a(Subscriber subscriber, int i) {
            this.f64038a = subscriber;
            this.f64039b = new AmbInnerSubscriber[i];
        }

        /* renamed from: a */
        public void m30064a(Publisher[] publisherArr) {
            AmbInnerSubscriber[] ambInnerSubscriberArr = this.f64039b;
            int length = ambInnerSubscriberArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                ambInnerSubscriberArr[i] = new AmbInnerSubscriber(this, i2, this.f64038a);
                i = i2;
            }
            this.f64040c.lazySet(0);
            this.f64038a.onSubscribe(this);
            for (int i3 = 0; i3 < length && this.f64040c.get() == 0; i3++) {
                publisherArr[i3].subscribe(ambInnerSubscriberArr[i3]);
            }
        }

        /* renamed from: b */
        public boolean m30063b(int i) {
            int i2 = 0;
            if (this.f64040c.get() != 0 || !this.f64040c.compareAndSet(0, i)) {
                return false;
            }
            AmbInnerSubscriber[] ambInnerSubscriberArr = this.f64039b;
            int length = ambInnerSubscriberArr.length;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (i3 != i) {
                    ambInnerSubscriberArr[i2].cancel();
                }
                i2 = i3;
            }
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f64040c.get() != -1) {
                this.f64040c.lazySet(-1);
                for (AmbInnerSubscriber ambInnerSubscriber : this.f64039b) {
                    ambInnerSubscriber.cancel();
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                int i = this.f64040c.get();
                if (i > 0) {
                    this.f64039b[i - 1].request(j);
                } else if (i == 0) {
                    for (AmbInnerSubscriber ambInnerSubscriber : this.f64039b) {
                        ambInnerSubscriber.request(j);
                    }
                }
            }
        }
    }

    public FlowableAmb(Publisher<? extends T>[] publisherArr, Iterable<? extends Publisher<? extends T>> iterable) {
        this.f64036b = publisherArr;
        this.f64037c = iterable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        int length;
        Publisher[] publisherArr = this.f64036b;
        if (publisherArr == null) {
            publisherArr = new Publisher[8];
            try {
                length = 0;
                for (Publisher publisher : this.f64037c) {
                    if (publisher == null) {
                        EmptySubscription.error(new NullPointerException("One of the sources is null"), subscriber);
                        return;
                    }
                    if (length == publisherArr.length) {
                        Publisher[] publisherArr2 = new Publisher[(length >> 2) + length];
                        System.arraycopy(publisherArr, 0, publisherArr2, 0, length);
                        publisherArr = publisherArr2;
                    }
                    int i = length + 1;
                    publisherArr[length] = publisher;
                    length = i;
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptySubscription.error(th2, subscriber);
                return;
            }
        } else {
            length = publisherArr.length;
        }
        if (length == 0) {
            EmptySubscription.complete(subscriber);
        } else if (length == 1) {
            publisherArr[0].subscribe(subscriber);
        } else {
            new C10811a(subscriber, length).m30064a(publisherArr);
        }
    }
}
