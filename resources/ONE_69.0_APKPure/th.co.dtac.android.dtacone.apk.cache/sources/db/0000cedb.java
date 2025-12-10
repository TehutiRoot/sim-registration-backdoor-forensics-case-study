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
public final class FlowableBufferExactBoundary<T, U extends Collection<? super T>, B> extends AbstractC0558I {

    /* renamed from: b */
    public final Publisher f64137b;

    /* renamed from: c */
    public final Callable f64138c;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary$a */
    /* loaded from: classes5.dex */
    public static final class C10803a extends DisposableSubscriber {

        /* renamed from: b */
        public final C10804b f64139b;

        public C10803a(C10804b c10804b) {
            this.f64139b = c10804b;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64139b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64139b.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64139b.m30398b();
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary$b */
    /* loaded from: classes5.dex */
    public static final class C10804b extends QueueDrainSubscriber implements FlowableSubscriber, Subscription, Disposable {

        /* renamed from: c */
        public final Callable f64140c;

        /* renamed from: d */
        public final Publisher f64141d;

        /* renamed from: e */
        public Subscription f64142e;

        /* renamed from: f */
        public Disposable f64143f;

        /* renamed from: g */
        public Collection f64144g;

        public C10804b(Subscriber subscriber, Callable callable, Publisher publisher) {
            super(subscriber, new MpscLinkedQueue());
            this.f64140c = callable;
            this.f64141d = publisher;
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        /* renamed from: a */
        public boolean accept(Subscriber subscriber, Collection collection) {
            this.downstream.onNext(collection);
            return true;
        }

        /* renamed from: b */
        public void m30398b() {
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.f64140c.call(), "The buffer supplied is null");
                synchronized (this) {
                    try {
                        Collection collection2 = this.f64144g;
                        if (collection2 == null) {
                            return;
                        }
                        this.f64144g = collection;
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
                this.f64143f.dispose();
                this.f64142e.cancel();
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
                    Collection collection = this.f64144g;
                    if (collection == null) {
                        return;
                    }
                    this.f64144g = null;
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
                    Collection collection = this.f64144g;
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
            if (!SubscriptionHelper.validate(this.f64142e, subscription)) {
                return;
            }
            this.f64142e = subscription;
            try {
                this.f64144g = (Collection) ObjectHelper.requireNonNull(this.f64140c.call(), "The buffer supplied is null");
                C10803a c10803a = new C10803a(this);
                this.f64143f = c10803a;
                this.downstream.onSubscribe(this);
                if (!this.cancelled) {
                    subscription.request(Long.MAX_VALUE);
                    this.f64141d.subscribe(c10803a);
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
        this.f64137b = publisher;
        this.f64138c = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10804b(new SerializedSubscriber(subscriber), this.f64138c, this.f64137b));
    }
}