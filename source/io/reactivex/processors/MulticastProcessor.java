package io.reactivex.processors;

import io.reactivex.Flowable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

@SchedulerSupport(SchedulerSupport.NONE)
@BackpressureSupport(BackpressureKind.FULL)
/* loaded from: classes5.dex */
public final class MulticastProcessor<T> extends FlowableProcessor<T> {

    /* renamed from: n */
    public static final MulticastSubscription[] f66199n = new MulticastSubscription[0];

    /* renamed from: o */
    public static final MulticastSubscription[] f66200o = new MulticastSubscription[0];

    /* renamed from: b */
    public final AtomicInteger f66201b;

    /* renamed from: c */
    public final AtomicReference f66202c;

    /* renamed from: d */
    public final AtomicReference f66203d;

    /* renamed from: e */
    public final AtomicBoolean f66204e;

    /* renamed from: f */
    public final int f66205f;

    /* renamed from: g */
    public final int f66206g;

    /* renamed from: h */
    public final boolean f66207h;

    /* renamed from: i */
    public volatile SimpleQueue f66208i;

    /* renamed from: j */
    public volatile boolean f66209j;

    /* renamed from: k */
    public volatile Throwable f66210k;

    /* renamed from: l */
    public int f66211l;

    /* renamed from: m */
    public int f66212m;

    /* loaded from: classes5.dex */
    public static final class MulticastSubscription<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = -363282618957264509L;
        final Subscriber<? super T> downstream;
        long emitted;
        final MulticastProcessor<T> parent;

        public MulticastSubscription(Subscriber<? super T> subscriber, MulticastProcessor<T> multicastProcessor) {
            this.downstream = subscriber;
            this.parent = multicastProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.m29861g(this);
            }
        }

        public void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th2) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th2);
            }
        }

        public void onNext(T t) {
            if (get() != Long.MIN_VALUE) {
                this.emitted++;
                this.downstream.onNext(t);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            long j2;
            long j3;
            if (SubscriptionHelper.validate(j)) {
                do {
                    j2 = get();
                    if (j2 != Long.MIN_VALUE) {
                        j3 = Long.MAX_VALUE;
                        if (j2 != Long.MAX_VALUE) {
                            long j4 = j2 + j;
                            if (j4 >= 0) {
                                j3 = j4;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } while (!compareAndSet(j2, j3));
                this.parent.m29862f();
            }
        }
    }

    public MulticastProcessor(int i, boolean z) {
        ObjectHelper.verifyPositive(i, "bufferSize");
        this.f66205f = i;
        this.f66206g = i - (i >> 2);
        this.f66201b = new AtomicInteger();
        this.f66203d = new AtomicReference(f66199n);
        this.f66202c = new AtomicReference();
        this.f66207h = z;
        this.f66204e = new AtomicBoolean();
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create() {
        return new MulticastProcessor<>(Flowable.bufferSize(), false);
    }

    /* renamed from: e */
    public boolean m29863e(MulticastSubscription multicastSubscription) {
        MulticastSubscription[] multicastSubscriptionArr;
        MulticastSubscription[] multicastSubscriptionArr2;
        do {
            multicastSubscriptionArr = (MulticastSubscription[]) this.f66203d.get();
            if (multicastSubscriptionArr == f66200o) {
                return false;
            }
            int length = multicastSubscriptionArr.length;
            multicastSubscriptionArr2 = new MulticastSubscription[length + 1];
            System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, length);
            multicastSubscriptionArr2[length] = multicastSubscription;
        } while (!AbstractC17300An1.m69050a(this.f66203d, multicastSubscriptionArr, multicastSubscriptionArr2));
        return true;
    }

    /* renamed from: f */
    public void m29862f() {
        int i;
        Object obj;
        boolean z;
        if (this.f66201b.getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference = this.f66203d;
        int i2 = this.f66211l;
        int i3 = this.f66206g;
        int i4 = this.f66212m;
        int i5 = 1;
        while (true) {
            SimpleQueue simpleQueue = this.f66208i;
            if (simpleQueue != null) {
                MulticastSubscription[] multicastSubscriptionArr = (MulticastSubscription[]) atomicReference.get();
                if (multicastSubscriptionArr.length != 0) {
                    int length = multicastSubscriptionArr.length;
                    long j = -1;
                    long j2 = -1;
                    int i6 = 0;
                    while (i6 < length) {
                        MulticastSubscription multicastSubscription = multicastSubscriptionArr[i6];
                        long j3 = multicastSubscription.get();
                        if (j3 >= 0) {
                            if (j2 == j) {
                                j2 = j3 - multicastSubscription.emitted;
                            } else {
                                j2 = Math.min(j2, j3 - multicastSubscription.emitted);
                            }
                        }
                        i6++;
                        j = -1;
                    }
                    int i7 = i2;
                    while (true) {
                        i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                        if (i <= 0) {
                            break;
                        }
                        MulticastSubscription[] multicastSubscriptionArr2 = (MulticastSubscription[]) atomicReference.get();
                        if (multicastSubscriptionArr2 == f66200o) {
                            simpleQueue.clear();
                            return;
                        } else if (multicastSubscriptionArr != multicastSubscriptionArr2) {
                            break;
                        } else {
                            boolean z2 = this.f66209j;
                            try {
                                obj = simpleQueue.poll();
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                SubscriptionHelper.cancel(this.f66202c);
                                this.f66210k = th2;
                                this.f66209j = true;
                                obj = null;
                                z2 = true;
                            }
                            if (obj == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z2 && z) {
                                Throwable th3 = this.f66210k;
                                if (th3 != null) {
                                    for (MulticastSubscription multicastSubscription2 : (MulticastSubscription[]) atomicReference.getAndSet(f66200o)) {
                                        multicastSubscription2.onError(th3);
                                    }
                                    return;
                                }
                                for (MulticastSubscription multicastSubscription3 : (MulticastSubscription[]) atomicReference.getAndSet(f66200o)) {
                                    multicastSubscription3.onComplete();
                                }
                                return;
                            } else if (z) {
                                break;
                            } else {
                                for (MulticastSubscription multicastSubscription4 : multicastSubscriptionArr) {
                                    multicastSubscription4.onNext(obj);
                                }
                                j2--;
                                if (i4 != 1 && (i7 = i7 + 1) == i3) {
                                    ((Subscription) this.f66202c.get()).request(i3);
                                    i7 = 0;
                                }
                            }
                        }
                    }
                    if (i == 0) {
                        MulticastSubscription[] multicastSubscriptionArr3 = (MulticastSubscription[]) atomicReference.get();
                        MulticastSubscription[] multicastSubscriptionArr4 = f66200o;
                        if (multicastSubscriptionArr3 == multicastSubscriptionArr4) {
                            simpleQueue.clear();
                            return;
                        } else if (multicastSubscriptionArr != multicastSubscriptionArr3) {
                            i2 = i7;
                        } else if (this.f66209j && simpleQueue.isEmpty()) {
                            Throwable th4 = this.f66210k;
                            if (th4 != null) {
                                for (MulticastSubscription multicastSubscription5 : (MulticastSubscription[]) atomicReference.getAndSet(multicastSubscriptionArr4)) {
                                    multicastSubscription5.onError(th4);
                                }
                                return;
                            }
                            for (MulticastSubscription multicastSubscription6 : (MulticastSubscription[]) atomicReference.getAndSet(multicastSubscriptionArr4)) {
                                multicastSubscription6.onComplete();
                            }
                            return;
                        }
                    }
                    i2 = i7;
                }
            }
            i5 = this.f66201b.addAndGet(-i5);
            if (i5 == 0) {
                return;
            }
        }
    }

    /* renamed from: g */
    public void m29861g(MulticastSubscription multicastSubscription) {
        while (true) {
            MulticastSubscription[] multicastSubscriptionArr = (MulticastSubscription[]) this.f66203d.get();
            int length = multicastSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i < length) {
                    if (multicastSubscriptionArr[i] == multicastSubscription) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                if (length == 1) {
                    if (this.f66207h) {
                        if (AbstractC17300An1.m69050a(this.f66203d, multicastSubscriptionArr, f66200o)) {
                            SubscriptionHelper.cancel(this.f66202c);
                            this.f66204e.set(true);
                            return;
                        }
                    } else if (AbstractC17300An1.m69050a(this.f66203d, multicastSubscriptionArr, f66199n)) {
                        return;
                    }
                } else {
                    MulticastSubscription[] multicastSubscriptionArr2 = new MulticastSubscription[length - 1];
                    System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, i);
                    System.arraycopy(multicastSubscriptionArr, i + 1, multicastSubscriptionArr2, i, (length - i) - 1);
                    if (AbstractC17300An1.m69050a(this.f66203d, multicastSubscriptionArr, multicastSubscriptionArr2)) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public Throwable getThrowable() {
        if (this.f66204e.get()) {
            return this.f66210k;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        if (this.f66204e.get() && this.f66210k == null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        if (((MulticastSubscription[]) this.f66203d.get()).length != 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        if (this.f66204e.get() && this.f66210k != null) {
            return true;
        }
        return false;
    }

    public boolean offer(T t) {
        if (this.f66204e.get()) {
            return false;
        }
        ObjectHelper.requireNonNull(t, "offer called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f66212m != 0 || !this.f66208i.offer(t)) {
            return false;
        }
        m29862f();
        return true;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f66204e.compareAndSet(false, true)) {
            this.f66209j = true;
            m29862f();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f66204e.compareAndSet(false, true)) {
            this.f66210k = th2;
            this.f66209j = true;
            m29862f();
            return;
        }
        RxJavaPlugins.onError(th2);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        if (this.f66204e.get()) {
            return;
        }
        if (this.f66212m == 0) {
            ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if (!this.f66208i.offer(t)) {
                SubscriptionHelper.cancel(this.f66202c);
                onError(new MissingBackpressureException());
                return;
            }
        }
        m29862f();
    }

    @Override // org.reactivestreams.Subscriber, io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this.f66202c, subscription)) {
            if (subscription instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) subscription;
                int requestFusion = queueSubscription.requestFusion(3);
                if (requestFusion == 1) {
                    this.f66212m = requestFusion;
                    this.f66208i = queueSubscription;
                    this.f66209j = true;
                    m29862f();
                    return;
                } else if (requestFusion == 2) {
                    this.f66212m = requestFusion;
                    this.f66208i = queueSubscription;
                    subscription.request(this.f66205f);
                    return;
                }
            }
            this.f66208i = new SpscArrayQueue(this.f66205f);
            subscription.request(this.f66205f);
        }
    }

    public void start() {
        if (SubscriptionHelper.setOnce(this.f66202c, EmptySubscription.INSTANCE)) {
            this.f66208i = new SpscArrayQueue(this.f66205f);
        }
    }

    public void startUnbounded() {
        if (SubscriptionHelper.setOnce(this.f66202c, EmptySubscription.INSTANCE)) {
            this.f66208i = new SpscLinkedArrayQueue(this.f66205f);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        Throwable th2;
        MulticastSubscription multicastSubscription = new MulticastSubscription(subscriber, this);
        subscriber.onSubscribe(multicastSubscription);
        if (m29863e(multicastSubscription)) {
            if (multicastSubscription.get() == Long.MIN_VALUE) {
                m29861g(multicastSubscription);
            } else {
                m29862f();
            }
        } else if ((this.f66204e.get() || !this.f66207h) && (th2 = this.f66210k) != null) {
            subscriber.onError(th2);
        } else {
            subscriber.onComplete();
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(boolean z) {
        return new MulticastProcessor<>(Flowable.bufferSize(), z);
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(int i) {
        return new MulticastProcessor<>(i, false);
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(int i, boolean z) {
        return new MulticastProcessor<>(i, z);
    }
}
