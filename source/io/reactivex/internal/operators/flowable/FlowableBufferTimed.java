package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableBufferTimed<T, U extends Collection<? super T>> extends AbstractC0567I {

    /* renamed from: b */
    public final long f64082b;

    /* renamed from: c */
    public final long f64083c;

    /* renamed from: d */
    public final TimeUnit f64084d;

    /* renamed from: e */
    public final Scheduler f64085e;

    /* renamed from: f */
    public final Callable f64086f;

    /* renamed from: g */
    public final int f64087g;

    /* renamed from: h */
    public final boolean f64088h;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableBufferTimed$a */
    /* loaded from: classes5.dex */
    public static final class RunnableC10818a extends QueueDrainSubscriber implements Subscription, Runnable, Disposable {

        /* renamed from: c */
        public final Callable f64089c;

        /* renamed from: d */
        public final long f64090d;

        /* renamed from: e */
        public final TimeUnit f64091e;

        /* renamed from: f */
        public final int f64092f;

        /* renamed from: g */
        public final boolean f64093g;

        /* renamed from: h */
        public final Scheduler.Worker f64094h;

        /* renamed from: i */
        public Collection f64095i;

        /* renamed from: j */
        public Disposable f64096j;

        /* renamed from: k */
        public Subscription f64097k;

        /* renamed from: l */
        public long f64098l;

        /* renamed from: m */
        public long f64099m;

        public RunnableC10818a(Subscriber subscriber, Callable callable, long j, TimeUnit timeUnit, int i, boolean z, Scheduler.Worker worker) {
            super(subscriber, new MpscLinkedQueue());
            this.f64089c = callable;
            this.f64090d = j;
            this.f64091e = timeUnit;
            this.f64092f = i;
            this.f64093g = z;
            this.f64094h = worker;
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        /* renamed from: a */
        public boolean accept(Subscriber subscriber, Collection collection) {
            subscriber.onNext(collection);
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            synchronized (this) {
                this.f64095i = null;
            }
            this.f64097k.cancel();
            this.f64094h.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64094h.isDisposed();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            Collection collection;
            synchronized (this) {
                collection = this.f64095i;
                this.f64095i = null;
            }
            if (collection != null) {
                this.queue.offer(collection);
                this.done = true;
                if (enter()) {
                    QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this, this);
                }
                this.f64094h.dispose();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            synchronized (this) {
                this.f64095i = null;
            }
            this.downstream.onError(th2);
            this.f64094h.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            synchronized (this) {
                try {
                    Collection collection = this.f64095i;
                    if (collection == null) {
                        return;
                    }
                    collection.add(obj);
                    if (collection.size() < this.f64092f) {
                        return;
                    }
                    this.f64095i = null;
                    this.f64098l++;
                    if (this.f64093g) {
                        this.f64096j.dispose();
                    }
                    fastPathOrderedEmitMax(collection, false, this);
                    try {
                        Collection collection2 = (Collection) ObjectHelper.requireNonNull(this.f64089c.call(), "The supplied buffer is null");
                        synchronized (this) {
                            this.f64095i = collection2;
                            this.f64099m++;
                        }
                        if (this.f64093g) {
                            Scheduler.Worker worker = this.f64094h;
                            long j = this.f64090d;
                            this.f64096j = worker.schedulePeriodically(this, j, j, this.f64091e);
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        cancel();
                        this.downstream.onError(th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (!SubscriptionHelper.validate(this.f64097k, subscription)) {
                return;
            }
            this.f64097k = subscription;
            try {
                this.f64095i = (Collection) ObjectHelper.requireNonNull(this.f64089c.call(), "The supplied buffer is null");
                this.downstream.onSubscribe(this);
                Scheduler.Worker worker = this.f64094h;
                long j = this.f64090d;
                this.f64096j = worker.schedulePeriodically(this, j, j, this.f64091e);
                subscription.request(Long.MAX_VALUE);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64094h.dispose();
                subscription.cancel();
                EmptySubscription.error(th2, this.downstream);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            requested(j);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.f64089c.call(), "The supplied buffer is null");
                synchronized (this) {
                    Collection collection2 = this.f64095i;
                    if (collection2 != null && this.f64098l == this.f64099m) {
                        this.f64095i = collection;
                        fastPathOrderedEmitMax(collection2, false, this);
                    }
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                this.downstream.onError(th2);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableBufferTimed$b */
    /* loaded from: classes5.dex */
    public static final class RunnableC10819b extends QueueDrainSubscriber implements Subscription, Runnable, Disposable {

        /* renamed from: c */
        public final Callable f64100c;

        /* renamed from: d */
        public final long f64101d;

        /* renamed from: e */
        public final TimeUnit f64102e;

        /* renamed from: f */
        public final Scheduler f64103f;

        /* renamed from: g */
        public Subscription f64104g;

        /* renamed from: h */
        public Collection f64105h;

        /* renamed from: i */
        public final AtomicReference f64106i;

        public RunnableC10819b(Subscriber subscriber, Callable callable, long j, TimeUnit timeUnit, Scheduler scheduler) {
            super(subscriber, new MpscLinkedQueue());
            this.f64106i = new AtomicReference();
            this.f64100c = callable;
            this.f64101d = j;
            this.f64102e = timeUnit;
            this.f64103f = scheduler;
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        /* renamed from: a */
        public boolean accept(Subscriber subscriber, Collection collection) {
            this.downstream.onNext(collection);
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
            this.f64104g.cancel();
            DisposableHelper.dispose(this.f64106i);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64106i.get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            DisposableHelper.dispose(this.f64106i);
            synchronized (this) {
                try {
                    Collection collection = this.f64105h;
                    if (collection == null) {
                        return;
                    }
                    this.f64105h = null;
                    this.queue.offer(collection);
                    this.done = true;
                    if (enter()) {
                        QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, null, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.f64106i);
            synchronized (this) {
                this.f64105h = null;
            }
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            synchronized (this) {
                try {
                    Collection collection = this.f64105h;
                    if (collection != null) {
                        collection.add(obj);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64104g, subscription)) {
                this.f64104g = subscription;
                try {
                    this.f64105h = (Collection) ObjectHelper.requireNonNull(this.f64100c.call(), "The supplied buffer is null");
                    this.downstream.onSubscribe(this);
                    if (!this.cancelled) {
                        subscription.request(Long.MAX_VALUE);
                        Scheduler scheduler = this.f64103f;
                        long j = this.f64101d;
                        Disposable schedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(this, j, j, this.f64102e);
                        if (!AbstractC17300An1.m69050a(this.f64106i, null, schedulePeriodicallyDirect)) {
                            schedulePeriodicallyDirect.dispose();
                        }
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cancel();
                    EmptySubscription.error(th2, this.downstream);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            requested(j);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.f64100c.call(), "The supplied buffer is null");
                synchronized (this) {
                    try {
                        Collection collection2 = this.f64105h;
                        if (collection2 == null) {
                            return;
                        }
                        this.f64105h = collection;
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
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableBufferTimed$c */
    /* loaded from: classes5.dex */
    public static final class RunnableC10820c extends QueueDrainSubscriber implements Subscription, Runnable {

        /* renamed from: c */
        public final Callable f64107c;

        /* renamed from: d */
        public final long f64108d;

        /* renamed from: e */
        public final long f64109e;

        /* renamed from: f */
        public final TimeUnit f64110f;

        /* renamed from: g */
        public final Scheduler.Worker f64111g;

        /* renamed from: h */
        public final List f64112h;

        /* renamed from: i */
        public Subscription f64113i;

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableBufferTimed$c$a */
        /* loaded from: classes5.dex */
        public final class RunnableC10821a implements Runnable {

            /* renamed from: a */
            public final Collection f64114a;

            public RunnableC10821a(Collection collection) {
                this.f64114a = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (RunnableC10820c.this) {
                    RunnableC10820c.this.f64112h.remove(this.f64114a);
                }
                RunnableC10820c runnableC10820c = RunnableC10820c.this;
                runnableC10820c.fastPathOrderedEmitMax(this.f64114a, false, runnableC10820c.f64111g);
            }
        }

        public RunnableC10820c(Subscriber subscriber, Callable callable, long j, long j2, TimeUnit timeUnit, Scheduler.Worker worker) {
            super(subscriber, new MpscLinkedQueue());
            this.f64107c = callable;
            this.f64108d = j;
            this.f64109e = j2;
            this.f64110f = timeUnit;
            this.f64111g = worker;
            this.f64112h = new LinkedList();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        /* renamed from: a */
        public boolean accept(Subscriber subscriber, Collection collection) {
            subscriber.onNext(collection);
            return true;
        }

        /* renamed from: c */
        public void m30053c() {
            synchronized (this) {
                this.f64112h.clear();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
            this.f64113i.cancel();
            this.f64111g.dispose();
            m30053c();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            ArrayList<Collection> arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f64112h);
                this.f64112h.clear();
            }
            for (Collection collection : arrayList) {
                this.queue.offer(collection);
            }
            this.done = true;
            if (enter()) {
                QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this.f64111g, this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.done = true;
            this.f64111g.dispose();
            m30053c();
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            synchronized (this) {
                try {
                    for (Collection collection : this.f64112h) {
                        collection.add(obj);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (!SubscriptionHelper.validate(this.f64113i, subscription)) {
                return;
            }
            this.f64113i = subscription;
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.f64107c.call(), "The supplied buffer is null");
                this.f64112h.add(collection);
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
                Scheduler.Worker worker = this.f64111g;
                long j = this.f64109e;
                worker.schedulePeriodically(this, j, j, this.f64110f);
                this.f64111g.schedule(new RunnableC10821a(collection), this.f64108d, this.f64110f);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64111g.dispose();
                subscription.cancel();
                EmptySubscription.error(th2, this.downstream);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            requested(j);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                return;
            }
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.f64107c.call(), "The supplied buffer is null");
                synchronized (this) {
                    try {
                        if (this.cancelled) {
                            return;
                        }
                        this.f64112h.add(collection);
                        this.f64111g.schedule(new RunnableC10821a(collection), this.f64108d, this.f64110f);
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
    }

    public FlowableBufferTimed(Flowable<T> flowable, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, Callable<U> callable, int i, boolean z) {
        super(flowable);
        this.f64082b = j;
        this.f64083c = j2;
        this.f64084d = timeUnit;
        this.f64085e = scheduler;
        this.f64086f = callable;
        this.f64087g = i;
        this.f64088h = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        if (this.f64082b == this.f64083c && this.f64087g == Integer.MAX_VALUE) {
            this.source.subscribe((FlowableSubscriber<? super Object>) new RunnableC10819b(new SerializedSubscriber(subscriber), this.f64086f, this.f64082b, this.f64084d, this.f64085e));
            return;
        }
        Scheduler.Worker createWorker = this.f64085e.createWorker();
        if (this.f64082b == this.f64083c) {
            this.source.subscribe((FlowableSubscriber<? super Object>) new RunnableC10818a(new SerializedSubscriber(subscriber), this.f64086f, this.f64082b, this.f64084d, this.f64087g, this.f64088h, createWorker));
        } else {
            this.source.subscribe((FlowableSubscriber<? super Object>) new RunnableC10820c(new SerializedSubscriber(subscriber), this.f64086f, this.f64082b, this.f64083c, this.f64084d, createWorker));
        }
    }
}
