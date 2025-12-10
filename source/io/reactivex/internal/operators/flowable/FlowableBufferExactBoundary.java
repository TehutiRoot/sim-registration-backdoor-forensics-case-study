package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Collection;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableBufferExactBoundary<T, U extends Collection<? super T>, B> extends AbstractC0567I {

    /* renamed from: b */
    public final Publisher f64074b;

    /* renamed from: c */
    public final Callable f64075c;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary$a */
    /* loaded from: classes5.dex */
    public static final class C10816a extends DisposableSubscriber {

        /* renamed from: b */
        public final C10817b f64076b;

        public C10816a(C10817b c10817b) {
            this.f64076b = c10817b;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64076b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64076b.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64076b.m30058b();
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary$b */
    /* loaded from: classes5.dex */
    public static final class C10817b extends QueueDrainSubscriber implements FlowableSubscriber, Subscription, Disposable {

        /* renamed from: c */
        public final Callable f64077c;

        /* renamed from: d */
        public final Publisher f64078d;

        /* renamed from: e */
        public Subscription f64079e;

        /* renamed from: f */
        public Disposable f64080f;

        /* renamed from: g */
        public Collection f64081g;

        public C10817b(Subscriber subscriber, Callable callable, Publisher publisher) {
            super(subscriber, new MpscLinkedQueue());
            this.f64077c = callable;
            this.f64078d = publisher;
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        /* renamed from: a */
        public boolean accept(Subscriber subscriber, Collection collection) {
            this.downstream.onNext(collection);
            return true;
        }

        /* renamed from: b */
        public void m30058b() {
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.f64077c.call(), "The buffer supplied is null");
                synchronized (this) {
                    try {
                        Collection collection2 = this.f64081g;
                        if (collection2 == null) {
                            return;
                        }
                        this.f64081g = collection;
                        fastPathEmitMax(collection2, false, this);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                cancel();
                this.downstream.onError(th3);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.f64080f.dispose();
                this.f64079e.cancel();
                if (enter()) {
                    this.queue.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            synchronized (this) {
                try {
                    Collection collection = this.f64081g;
                    if (collection == null) {
                        return;
                    }
                    this.f64081g = null;
                    this.queue.offer(collection);
                    this.done = true;
                    if (enter()) {
                        QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            cancel();
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            synchronized (this) {
                try {
                    Collection collection = this.f64081g;
                    if (collection == null) {
                        return;
                    }
                    collection.add(obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (!SubscriptionHelper.validate(this.f64079e, subscription)) {
                return;
            }
            this.f64079e = subscription;
            try {
                this.f64081g = (Collection) ObjectHelper.requireNonNull(this.f64077c.call(), "The buffer supplied is null");
                C10816a c10816a = new C10816a(this);
                this.f64080f = c10816a;
                this.downstream.onSubscribe(this);
                if (!this.cancelled) {
                    subscription.request(Long.MAX_VALUE);
                    this.f64078d.subscribe(c10816a);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.cancelled = true;
                subscription.cancel();
                EmptySubscription.error(th2, this.downstream);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            requested(j);
        }
    }

    public FlowableBufferExactBoundary(Flowable<T> flowable, Publisher<B> publisher, Callable<U> callable) {
        super(flowable);
        this.f64074b = publisher;
        this.f64075c = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10817b(new SerializedSubscriber(subscriber), this.f64075c, this.f64074b));
    }
}
