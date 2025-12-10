package io.reactivex.processors;

import io.reactivex.Flowable;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class UnicastProcessor<T> extends FlowableProcessor<T> {

    /* renamed from: b */
    public final SpscLinkedArrayQueue f66242b;

    /* renamed from: c */
    public final AtomicReference f66243c;

    /* renamed from: d */
    public final boolean f66244d;

    /* renamed from: e */
    public volatile boolean f66245e;

    /* renamed from: f */
    public Throwable f66246f;

    /* renamed from: g */
    public final AtomicReference f66247g;

    /* renamed from: h */
    public volatile boolean f66248h;

    /* renamed from: i */
    public final AtomicBoolean f66249i;

    /* renamed from: j */
    public final BasicIntQueueSubscription f66250j;

    /* renamed from: k */
    public final AtomicLong f66251k;

    /* renamed from: l */
    public boolean f66252l;

    /* loaded from: classes5.dex */
    public final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        public UnicastQueueSubscription() {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (UnicastProcessor.this.f66248h) {
                return;
            }
            UnicastProcessor.this.f66248h = true;
            UnicastProcessor.this.m29849f();
            UnicastProcessor unicastProcessor = UnicastProcessor.this;
            if (!unicastProcessor.f66252l && unicastProcessor.f66250j.getAndIncrement() == 0) {
                UnicastProcessor.this.f66242b.clear();
                UnicastProcessor.this.f66247g.lazySet(null);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            UnicastProcessor.this.f66242b.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return UnicastProcessor.this.f66242b.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            return (T) UnicastProcessor.this.f66242b.poll();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(UnicastProcessor.this.f66251k, j);
                UnicastProcessor.this.m29848g();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            if ((i & 2) != 0) {
                UnicastProcessor.this.f66252l = true;
                return 2;
            }
            return 0;
        }
    }

    public UnicastProcessor(int i) {
        this(i, null, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create() {
        return new UnicastProcessor<>(Flowable.bufferSize());
    }

    /* renamed from: e */
    public boolean m29850e(boolean z, boolean z2, boolean z3, Subscriber subscriber, SpscLinkedArrayQueue spscLinkedArrayQueue) {
        if (this.f66248h) {
            spscLinkedArrayQueue.clear();
            this.f66247g.lazySet(null);
            return true;
        } else if (z2) {
            if (z && this.f66246f != null) {
                spscLinkedArrayQueue.clear();
                this.f66247g.lazySet(null);
                subscriber.onError(this.f66246f);
                return true;
            } else if (z3) {
                Throwable th2 = this.f66246f;
                this.f66247g.lazySet(null);
                if (th2 != null) {
                    subscriber.onError(th2);
                } else {
                    subscriber.onComplete();
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /* renamed from: f */
    public void m29849f() {
        Runnable runnable = (Runnable) this.f66243c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: g */
    public void m29848g() {
        if (this.f66250j.getAndIncrement() != 0) {
            return;
        }
        Subscriber subscriber = (Subscriber) this.f66247g.get();
        int i = 1;
        while (subscriber == null) {
            i = this.f66250j.addAndGet(-i);
            if (i == 0) {
                return;
            }
            subscriber = (Subscriber) this.f66247g.get();
        }
        if (this.f66252l) {
            m29847h(subscriber);
        } else {
            m29846i(subscriber);
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        if (this.f66245e) {
            return this.f66246f;
        }
        return null;
    }

    /* renamed from: h */
    public void m29847h(Subscriber subscriber) {
        SpscLinkedArrayQueue spscLinkedArrayQueue = this.f66242b;
        int i = 1;
        boolean z = !this.f66244d;
        while (!this.f66248h) {
            boolean z2 = this.f66245e;
            if (z && z2 && this.f66246f != null) {
                spscLinkedArrayQueue.clear();
                this.f66247g.lazySet(null);
                subscriber.onError(this.f66246f);
                return;
            }
            subscriber.onNext(null);
            if (z2) {
                this.f66247g.lazySet(null);
                Throwable th2 = this.f66246f;
                if (th2 != null) {
                    subscriber.onError(th2);
                    return;
                } else {
                    subscriber.onComplete();
                    return;
                }
            }
            i = this.f66250j.addAndGet(-i);
            if (i == 0) {
                return;
            }
        }
        spscLinkedArrayQueue.clear();
        this.f66247g.lazySet(null);
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        if (this.f66245e && this.f66246f == null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        if (this.f66247g.get() != null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        if (this.f66245e && this.f66246f != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public void m29846i(Subscriber subscriber) {
        int i;
        long j;
        boolean z;
        SpscLinkedArrayQueue spscLinkedArrayQueue = this.f66242b;
        boolean z2 = !this.f66244d;
        int i2 = 1;
        while (true) {
            long j2 = this.f66251k.get();
            long j3 = 0;
            while (true) {
                i = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
                if (i != 0) {
                    boolean z3 = this.f66245e;
                    Object poll = spscLinkedArrayQueue.poll();
                    if (poll == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    j = j3;
                    if (m29850e(z2, z3, z, subscriber, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z) {
                        break;
                    }
                    subscriber.onNext(poll);
                    j3 = 1 + j;
                } else {
                    j = j3;
                    break;
                }
            }
            if (i == 0 && m29850e(z2, this.f66245e, spscLinkedArrayQueue.isEmpty(), subscriber, spscLinkedArrayQueue)) {
                return;
            }
            if (j != 0 && j2 != Long.MAX_VALUE) {
                this.f66251k.addAndGet(-j);
            }
            i2 = this.f66250j.addAndGet(-i2);
            if (i2 == 0) {
                return;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (!this.f66245e && !this.f66248h) {
            this.f66245e = true;
            m29849f();
            m29848g();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f66245e && !this.f66248h) {
            this.f66246f = th2;
            this.f66245e = true;
            m29849f();
            m29848g();
            return;
        }
        RxJavaPlugins.onError(th2);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f66245e && !this.f66248h) {
            this.f66242b.offer(t);
            m29848g();
        }
    }

    @Override // org.reactivestreams.Subscriber, io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription) {
        if (!this.f66245e && !this.f66248h) {
            subscription.request(Long.MAX_VALUE);
        } else {
            subscription.cancel();
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        if (!this.f66249i.get() && this.f66249i.compareAndSet(false, true)) {
            subscriber.onSubscribe(this.f66250j);
            this.f66247g.set(subscriber);
            if (this.f66248h) {
                this.f66247g.lazySet(null);
                return;
            } else {
                m29848g();
                return;
            }
        }
        EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), subscriber);
    }

    public UnicastProcessor(int i, Runnable runnable) {
        this(i, runnable, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i) {
        return new UnicastProcessor<>(i);
    }

    public UnicastProcessor(int i, Runnable runnable, boolean z) {
        this.f66242b = new SpscLinkedArrayQueue(ObjectHelper.verifyPositive(i, "capacityHint"));
        this.f66243c = new AtomicReference(runnable);
        this.f66244d = z;
        this.f66247g = new AtomicReference();
        this.f66249i = new AtomicBoolean();
        this.f66250j = new UnicastQueueSubscription();
        this.f66251k = new AtomicLong();
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(boolean z) {
        return new UnicastProcessor<>(Flowable.bufferSize(), null, z);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i, Runnable runnable) {
        ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new UnicastProcessor<>(i, runnable);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i, Runnable runnable, boolean z) {
        ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new UnicastProcessor<>(i, runnable, z);
    }
}
