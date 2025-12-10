package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableBufferBoundarySupplier<T, U extends Collection<? super T>, B> extends AbstractC0558I {

    /* renamed from: b */
    public final Callable f64128b;

    /* renamed from: c */
    public final Callable f64129c;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier$a */
    /* loaded from: classes5.dex */
    public static final class C10801a extends DisposableSubscriber {

        /* renamed from: b */
        public final C10802b f64130b;

        /* renamed from: c */
        public boolean f64131c;

        public C10801a(C10802b c10802b) {
            this.f64130b = c10802b;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64131c) {
                return;
            }
            this.f64131c = true;
            this.f64130b.m30400c();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64131c) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64131c = true;
            this.f64130b.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64131c) {
                return;
            }
            this.f64131c = true;
            cancel();
            this.f64130b.m30400c();
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier$b */
    /* loaded from: classes5.dex */
    public static final class C10802b extends QueueDrainSubscriber implements FlowableSubscriber, Subscription, Disposable {

        /* renamed from: c */
        public final Callable f64132c;

        /* renamed from: d */
        public final Callable f64133d;

        /* renamed from: e */
        public Subscription f64134e;

        /* renamed from: f */
        public final AtomicReference f64135f;

        /* renamed from: g */
        public Collection f64136g;

        public C10802b(Subscriber subscriber, Callable callable, Callable callable2) {
            super(subscriber, new MpscLinkedQueue());
            this.f64135f = new AtomicReference();
            this.f64132c = callable;
            this.f64133d = callable2;
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        /* renamed from: a */
        public boolean accept(Subscriber subscriber, Collection collection) {
            this.downstream.onNext(collection);
            return true;
        }

        /* renamed from: b */
        public void m30401b() {
            DisposableHelper.dispose(this.f64135f);
        }

        /* renamed from: c */
        public void m30400c() {
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.f64132c.call(), "The buffer supplied is null");
                try {
                    Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.f64133d.call(), "The boundary publisher supplied is null");
                    C10801a c10801a = new C10801a(this);
                    if (DisposableHelper.replace(this.f64135f, c10801a)) {
                        synchronized (this) {
                            try {
                                Collection collection2 = this.f64136g;
                                if (collection2 == null) {
                                    return;
                                }
                                this.f64136g = collection;
                                publisher.subscribe(c10801a);
                                fastPathEmitMax(collection2, false, this);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    this.cancelled = true;
                    this.f64134e.cancel();
                    this.downstream.onError(th3);
                }
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                cancel();
                this.downstream.onError(th4);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.f64134e.cancel();
                m30401b();
                if (enter()) {
                    this.queue.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64134e.cancel();
            m30401b();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64135f.get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            synchronized (this) {
                try {
                    Collection collection = this.f64136g;
                    if (collection == null) {
                        return;
                    }
                    this.f64136g = null;
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
                    Collection collection = this.f64136g;
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
            if (!SubscriptionHelper.validate(this.f64134e, subscription)) {
                return;
            }
            this.f64134e = subscription;
            Subscriber<? super V> subscriber = this.downstream;
            try {
                this.f64136g = (Collection) ObjectHelper.requireNonNull(this.f64132c.call(), "The buffer supplied is null");
                try {
                    Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.f64133d.call(), "The boundary publisher supplied is null");
                    C10801a c10801a = new C10801a(this);
                    this.f64135f.set(c10801a);
                    subscriber.onSubscribe(this);
                    if (!this.cancelled) {
                        subscription.request(Long.MAX_VALUE);
                        publisher.subscribe(c10801a);
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.cancelled = true;
                    subscription.cancel();
                    EmptySubscription.error(th2, subscriber);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.cancelled = true;
                subscription.cancel();
                EmptySubscription.error(th3, subscriber);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            requested(j);
        }
    }

    public FlowableBufferBoundarySupplier(Flowable<T> flowable, Callable<? extends Publisher<B>> callable, Callable<U> callable2) {
        super(flowable);
        this.f64128b = callable;
        this.f64129c = callable2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10802b(new SerializedSubscriber(subscriber), this.f64129c, this.f64128b));
    }
}