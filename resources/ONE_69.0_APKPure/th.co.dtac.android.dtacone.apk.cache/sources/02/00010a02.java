package p046rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Emitter;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.exceptions.MissingBackpressureException;
import p046rx.functions.Action1;
import p046rx.functions.Cancellable;
import p046rx.internal.subscriptions.CancellableSubscription;
import p046rx.internal.util.RxRingBuffer;
import p046rx.internal.util.atomic.SpscUnboundedAtomicArrayQueue;
import p046rx.internal.util.unsafe.SpscUnboundedArrayQueue;
import p046rx.internal.util.unsafe.UnsafeAccess;
import p046rx.plugins.RxJavaHooks;
import p046rx.subscriptions.SerialSubscription;

/* renamed from: rx.internal.operators.OnSubscribeCreate */
/* loaded from: classes7.dex */
public final class OnSubscribeCreate<T> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Action1 f78113a;

    /* renamed from: b */
    public final Emitter.BackpressureMode f78114b;

    /* renamed from: rx.internal.operators.OnSubscribeCreate$BaseEmitter */
    /* loaded from: classes7.dex */
    public static abstract class BaseEmitter<T> extends AtomicLong implements Emitter<T>, Producer, Subscription {
        private static final long serialVersionUID = 7326289992464377023L;
        final Subscriber<? super T> actual;
        final SerialSubscription serial = new SerialSubscription();

        public BaseEmitter(Subscriber<? super T> subscriber) {
            this.actual = subscriber;
        }

        @Override // p046rx.Subscription
        public final boolean isUnsubscribed() {
            return this.serial.isUnsubscribed();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.actual.isUnsubscribed()) {
                return;
            }
            try {
                this.actual.onCompleted();
            } finally {
                this.serial.unsubscribe();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.actual.isUnsubscribed()) {
                return;
            }
            try {
                this.actual.onError(th2);
            } finally {
                this.serial.unsubscribe();
            }
        }

        public void onRequested() {
        }

        public void onUnsubscribed() {
        }

        @Override // p046rx.Producer
        public final void request(long j) {
            if (BackpressureUtils.validate(j)) {
                BackpressureUtils.getAndAddRequest(this, j);
                onRequested();
            }
        }

        @Override // p046rx.Emitter
        public final long requested() {
            return get();
        }

        @Override // p046rx.Emitter
        public final void setCancellation(Cancellable cancellable) {
            setSubscription(new CancellableSubscription(cancellable));
        }

        @Override // p046rx.Emitter
        public final void setSubscription(Subscription subscription) {
            this.serial.set(subscription);
        }

        @Override // p046rx.Subscription
        public final void unsubscribe() {
            this.serial.unsubscribe();
            onUnsubscribed();
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$BufferEmitter */
    /* loaded from: classes7.dex */
    public static final class BufferEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        volatile boolean done;
        Throwable error;
        final Queue<Object> queue;
        final AtomicInteger wip;

        public BufferEmitter(Subscriber<? super T> subscriber, int i) {
            super(subscriber);
            Queue<Object> spscUnboundedAtomicArrayQueue;
            if (UnsafeAccess.isUnsafeAvailable()) {
                spscUnboundedAtomicArrayQueue = new SpscUnboundedArrayQueue<>(i);
            } else {
                spscUnboundedAtomicArrayQueue = new SpscUnboundedAtomicArrayQueue<>(i);
            }
            this.queue = spscUnboundedAtomicArrayQueue;
            this.wip = new AtomicInteger();
        }

        public void drain() {
            int i;
            boolean z;
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.actual;
            Queue<Object> queue = this.queue;
            int i2 = 1;
            do {
                long j = get();
                long j2 = 0;
                while (true) {
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    if (i == 0) {
                        break;
                    } else if (subscriber.isUnsubscribed()) {
                        queue.clear();
                        return;
                    } else {
                        boolean z2 = this.done;
                        Object poll = queue.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z2 && z) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                super.onError(th2);
                                return;
                            } else {
                                super.onCompleted();
                                return;
                            }
                        } else if (z) {
                            break;
                        } else {
                            subscriber.onNext((Object) NotificationLite.getValue(poll));
                            j2++;
                        }
                    }
                }
                if (i == 0) {
                    if (subscriber.isUnsubscribed()) {
                        queue.clear();
                        return;
                    }
                    boolean z3 = this.done;
                    boolean isEmpty = queue.isEmpty();
                    if (z3 && isEmpty) {
                        Throwable th3 = this.error;
                        if (th3 != null) {
                            super.onError(th3);
                            return;
                        } else {
                            super.onCompleted();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    BackpressureUtils.produced(this, j2);
                }
                i2 = this.wip.addAndGet(-i2);
            } while (i2 != 0);
        }

        @Override // p046rx.internal.operators.OnSubscribeCreate.BaseEmitter, p046rx.Observer
        public void onCompleted() {
            this.done = true;
            drain();
        }

        @Override // p046rx.internal.operators.OnSubscribeCreate.BaseEmitter, p046rx.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            drain();
        }

        @Override // p046rx.Observer
        public void onNext(T t) {
            this.queue.offer(NotificationLite.next(t));
            drain();
        }

        @Override // p046rx.internal.operators.OnSubscribeCreate.BaseEmitter
        public void onRequested() {
            drain();
        }

        @Override // p046rx.internal.operators.OnSubscribeCreate.BaseEmitter
        public void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$DropEmitter */
    /* loaded from: classes7.dex */
    public static final class DropEmitter<T> extends NoOverflowBaseEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        public DropEmitter(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // p046rx.internal.operators.OnSubscribeCreate.NoOverflowBaseEmitter
        public void onOverflow() {
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$ErrorEmitter */
    /* loaded from: classes7.dex */
    public static final class ErrorEmitter<T> extends NoOverflowBaseEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;
        private boolean done;

        public ErrorEmitter(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // p046rx.internal.operators.OnSubscribeCreate.BaseEmitter, p046rx.Observer
        public void onCompleted() {
            if (this.done) {
                return;
            }
            this.done = true;
            super.onCompleted();
        }

        @Override // p046rx.internal.operators.OnSubscribeCreate.BaseEmitter, p046rx.Observer
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.done = true;
            super.onError(th2);
        }

        @Override // p046rx.internal.operators.OnSubscribeCreate.NoOverflowBaseEmitter, p046rx.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            super.onNext(t);
        }

        @Override // p046rx.internal.operators.OnSubscribeCreate.NoOverflowBaseEmitter
        public void onOverflow() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$LatestEmitter */
    /* loaded from: classes7.dex */
    public static final class LatestEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        volatile boolean done;
        Throwable error;
        final AtomicReference<Object> queue;
        final AtomicInteger wip;

        public LatestEmitter(Subscriber<? super T> subscriber) {
            super(subscriber);
            this.queue = new AtomicReference<>();
            this.wip = new AtomicInteger();
        }

        public void drain() {
            boolean z;
            int i;
            boolean z2;
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.actual;
            AtomicReference<Object> atomicReference = this.queue;
            int i2 = 1;
            do {
                long j = get();
                long j2 = 0;
                while (true) {
                    z = false;
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    if (i == 0) {
                        break;
                    } else if (subscriber.isUnsubscribed()) {
                        atomicReference.lazySet(null);
                        return;
                    } else {
                        boolean z3 = this.done;
                        Object andSet = atomicReference.getAndSet(null);
                        if (andSet == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z3 && z2) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                super.onError(th2);
                                return;
                            } else {
                                super.onCompleted();
                                return;
                            }
                        } else if (z2) {
                            break;
                        } else {
                            subscriber.onNext((Object) NotificationLite.getValue(andSet));
                            j2++;
                        }
                    }
                }
                if (i == 0) {
                    if (subscriber.isUnsubscribed()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z4 = this.done;
                    if (atomicReference.get() == null) {
                        z = true;
                    }
                    if (z4 && z) {
                        Throwable th3 = this.error;
                        if (th3 != null) {
                            super.onError(th3);
                            return;
                        } else {
                            super.onCompleted();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    BackpressureUtils.produced(this, j2);
                }
                i2 = this.wip.addAndGet(-i2);
            } while (i2 != 0);
        }

        @Override // p046rx.internal.operators.OnSubscribeCreate.BaseEmitter, p046rx.Observer
        public void onCompleted() {
            this.done = true;
            drain();
        }

        @Override // p046rx.internal.operators.OnSubscribeCreate.BaseEmitter, p046rx.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            drain();
        }

        @Override // p046rx.Observer
        public void onNext(T t) {
            this.queue.set(NotificationLite.next(t));
            drain();
        }

        @Override // p046rx.internal.operators.OnSubscribeCreate.BaseEmitter
        public void onRequested() {
            drain();
        }

        @Override // p046rx.internal.operators.OnSubscribeCreate.BaseEmitter
        public void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet(null);
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$NoOverflowBaseEmitter */
    /* loaded from: classes7.dex */
    public static abstract class NoOverflowBaseEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        public NoOverflowBaseEmitter(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        public void onNext(T t) {
            if (this.actual.isUnsubscribed()) {
                return;
            }
            if (get() != 0) {
                this.actual.onNext(t);
                BackpressureUtils.produced(this, 1L);
                return;
            }
            onOverflow();
        }

        public abstract void onOverflow();
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$NoneEmitter */
    /* loaded from: classes7.dex */
    public static final class NoneEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public NoneEmitter(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // p046rx.Observer
        public void onNext(T t) {
            long j;
            if (this.actual.isUnsubscribed()) {
                return;
            }
            this.actual.onNext(t);
            do {
                j = get();
                if (j == 0) {
                    return;
                }
            } while (!compareAndSet(j, j - 1));
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$a */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C13468a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78115a;

        static {
            int[] iArr = new int[Emitter.BackpressureMode.values().length];
            f78115a = iArr;
            try {
                iArr[Emitter.BackpressureMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78115a[Emitter.BackpressureMode.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78115a[Emitter.BackpressureMode.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f78115a[Emitter.BackpressureMode.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public OnSubscribeCreate(Action1<Emitter<T>> action1, Emitter.BackpressureMode backpressureMode) {
        this.f78113a = action1;
        this.f78114b = backpressureMode;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        BaseEmitter noneEmitter;
        int i = C13468a.f78115a[this.f78114b.ordinal()];
        if (i == 1) {
            noneEmitter = new NoneEmitter(subscriber);
        } else if (i == 2) {
            noneEmitter = new ErrorEmitter(subscriber);
        } else if (i == 3) {
            noneEmitter = new DropEmitter(subscriber);
        } else if (i != 4) {
            noneEmitter = new BufferEmitter(subscriber, RxRingBuffer.SIZE);
        } else {
            noneEmitter = new LatestEmitter(subscriber);
        }
        subscriber.add(noneEmitter);
        subscriber.setProducer(noneEmitter);
        this.f78113a.call(noneEmitter);
    }
}