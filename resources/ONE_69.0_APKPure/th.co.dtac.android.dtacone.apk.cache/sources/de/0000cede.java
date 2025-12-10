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
public final class FlowableBufferTimed<T, U extends Collection<? super T>> extends AbstractC0558I {

    /* renamed from: b */
    public final long f64145b;

    /* renamed from: c */
    public final long f64146c;

    /* renamed from: d */
    public final TimeUnit f64147d;

    /* renamed from: e */
    public final Scheduler f64148e;

    /* renamed from: f */
    public final Callable f64149f;

    /* renamed from: g */
    public final int f64150g;

    /* renamed from: h */
    public final boolean f64151h;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableBufferTimed$a */
    /* loaded from: classes5.dex */
    public static final class RunnableC10805a extends QueueDrainSubscriber implements Subscription, Runnable, Disposable {

        /* renamed from: c */
        public final Callable f64152c;

        /* renamed from: d */
        public final long f64153d;

        /* renamed from: e */
        public final TimeUnit f64154e;

        /* renamed from: f */
        public final int f64155f;

        /* renamed from: g */
        public final boolean f64156g;

        /* renamed from: h */
        public final Scheduler.Worker f64157h;

        /* renamed from: i */
        public Collection f64158i;

        /* renamed from: j */
        public Disposable f64159j;

        /* renamed from: k */
        public Subscription f64160k;

        /* renamed from: l */
        public long f64161l;

        /* renamed from: m */
        public long f64162m;

        public RunnableC10805a(Subscriber subscriber, Callable callable, long j, TimeUnit timeUnit, int i, boolean z, Scheduler.Worker worker) {
            super(subscriber, new MpscLinkedQueue());
            this.f64152c = callable;
            this.f64153d = j;
            this.f64154e = timeUnit;
            this.f64155f = i;
            this.f64156g = z;
            this.f64157h = worker;
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
                this.f64158i = null;
            }
            this.f64160k.cancel();
            this.f64157h.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64157h.isDisposed();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            Collection collection;
            synchronized (this) {
                collection = this.f64158i;
                this.f64158i = null;
            }
            if (collection != null) {
                this.queue.offer(collection);
                this.done = true;
                if (enter()) {
                    QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this, this);
                }
                this.f64157h.dispose();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            synchronized (this) {
                this.f64158i = null;
            }
            this.downstream.onError(th2);
            this.f64157h.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            synchronized (this) {
                try {
                    Collection collection = this.f64158i;
                    if (collection == null) {
                        return;
                    }
                    collection.add(obj);
                    if (collection.size() < this.f64155f) {
                        return;
                    }
                    this.f64158i = null;
                    this.f64161l++;
                    if (this.f64156g) {
                        this.f64159j.dispose();
                    }
                    fastPathOrderedEmitMax(collection, false, this);
                    try {
                        Collection collection2 = (Collection) ObjectHelper.requireNonNull(this.f64152c.call(), "The supplied buffer is null");
                        synchronized (this) {
                            this.f64158i = collection2;
                            this.f64162m++;
                        }
                        if (this.f64156g) {
                            Scheduler.Worker worker = this.f64157h;
                            long j = this.f64153d;
                            this.f64159j = worker.schedulePeriodically(this, j, j, this.f64154e);
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
            if (!SubscriptionHelper.validate(this.f64160k, subscription)) {
                return;
            }
            this.f64160k = subscription;
            try {
                this.f64158i = (Collection) ObjectHelper.requireNonNull(this.f64152c.call(), "The supplied buffer is null");
                this.downstream.onSubscribe(this);
                Scheduler.Worker worker = this.f64157h;
                long j = this.f64153d;
                this.f64159j = worker.schedulePeriodically(this, j, j, this.f64154e);
                subscription.request(Long.MAX_VALUE);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64157h.dispose();
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
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.f64152c.call(), "The supplied buffer is null");
                synchronized (this) {
                    Collection collection2 = this.f64158i;
                    if (collection2 != null && this.f64161l == this.f64162m) {
                        this.f64158i = collection;
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
    public static final class RunnableC10806b extends QueueDrainSubscriber implements Subscription, Runnable, Disposable {

        /* renamed from: c */
        public final Callable f64163c;

        /* renamed from: d */
        public final long f64164d;

        /* renamed from: e */
        public final TimeUnit f64165e;

        /* renamed from: f */
        public final Scheduler f64166f;

        /* renamed from: g */
        public Subscription f64167g;

        /* renamed from: h */
        public Collection f64168h;

        /* renamed from: i */
        public final AtomicReference f64169i;

        public RunnableC10806b(Subscriber subscriber, Callable callable, long j, TimeUnit timeUnit, Scheduler scheduler) {
            super(subscriber, new MpscLinkedQueue());
            this.f64169i = new AtomicReference();
            this.f64163c = callable;
            this.f64164d = j;
            this.f64165e = timeUnit;
            this.f64166f = scheduler;
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
            this.f64167g.cancel();
            DisposableHelper.dispose(this.f64169i);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64169i.get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            DisposableHelper.dispose(this.f64169i);
            synchronized (this) {
                try {
                    Collection collection = this.f64168h;
                    if (collection == null) {
                        return;
                    }
                    this.f64168h = null;
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
            DisposableHelper.dispose(this.f64169i);
            synchronized (this) {
                this.f64168h = null;
            }
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            synchronized (this) {
                try {
                    Collection collection = this.f64168h;
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
            if (SubscriptionHelper.validate(this.f64167g, subscription)) {
                this.f64167g = subscription;
                try {
                    this.f64168h = (Collection) ObjectHelper.requireNonNull(this.f64163c.call(), "The supplied buffer is null");
                    this.downstream.onSubscribe(this);
                    if (!this.cancelled) {
                        subscription.request(Long.MAX_VALUE);
                        Scheduler scheduler = this.f64166f;
                        long j = this.f64164d;
                        Disposable schedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(this, j, j, this.f64165e);
                        if (!AbstractC23094xo1.m479a(this.f64169i, null, schedulePeriodicallyDirect)) {
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
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.f64163c.call(), "The supplied buffer is null");
                synchronized (this) {
                    try {
                        Collection collection2 = this.f64168h;
                        if (collection2 == null) {
                            return;
                        }
                        this.f64168h = collection;
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
    public static final class RunnableC10807c extends QueueDrainSubscriber implements Subscription, Runnable {

        /* renamed from: c */
        public final Callable f64170c;

        /* renamed from: d */
        public final long f64171d;

        /* renamed from: e */
        public final long f64172e;

        /* renamed from: f */
        public final TimeUnit f64173f;

        /* renamed from: g */
        public final Scheduler.Worker f64174g;

        /* renamed from: h */
        public final List f64175h;

        /* renamed from: i */
        public Subscription f64176i;

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableBufferTimed$c$a */
        /* loaded from: classes5.dex */
        public final class RunnableC10808a implements Runnable {

            /* renamed from: a */
            public final Collection f64177a;

            public RunnableC10808a(Collection collection) {
                this.f64177a = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (RunnableC10807c.this) {
                    RunnableC10807c.this.f64175h.remove(this.f64177a);
                }
                RunnableC10807c runnableC10807c = RunnableC10807c.this;
                runnableC10807c.fastPathOrderedEmitMax(this.f64177a, false, runnableC10807c.f64174g);
            }
        }

        public RunnableC10807c(Subscriber subscriber, Callable callable, long j, long j2, TimeUnit timeUnit, Scheduler.Worker worker) {
            super(subscriber, new MpscLinkedQueue());
            this.f64170c = callable;
            this.f64171d = j;
            this.f64172e = j2;
            this.f64173f = timeUnit;
            this.f64174g = worker;
            this.f64175h = new LinkedList();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        /* renamed from: a */
        public boolean accept(Subscriber subscriber, Collection collection) {
            subscriber.onNext(collection);
            return true;
        }

        /* renamed from: c */
        public void m30393c() {
            synchronized (this) {
                this.f64175h.clear();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
            this.f64176i.cancel();
            this.f64174g.dispose();
            m30393c();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            ArrayList<Collection> arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f64175h);
                this.f64175h.clear();
            }
            for (Collection collection : arrayList) {
                this.queue.offer(collection);
            }
            this.done = true;
            if (enter()) {
                QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this.f64174g, this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.done = true;
            this.f64174g.dispose();
            m30393c();
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            synchronized (this) {
                try {
                    for (Collection collection : this.f64175h) {
                        collection.add(obj);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (!SubscriptionHelper.validate(this.f64176i, subscription)) {
                return;
            }
            this.f64176i = subscription;
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.f64170c.call(), "The supplied buffer is null");
                this.f64175h.add(collection);
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
                Scheduler.Worker worker = this.f64174g;
                long j = this.f64172e;
                worker.schedulePeriodically(this, j, j, this.f64173f);
                this.f64174g.schedule(new RunnableC10808a(collection), this.f64171d, this.f64173f);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64174g.dispose();
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
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.f64170c.call(), "The supplied buffer is null");
                synchronized (this) {
                    try {
                        if (this.cancelled) {
                            return;
                        }
                        this.f64175h.add(collection);
                        this.f64174g.schedule(new RunnableC10808a(collection), this.f64171d, this.f64173f);
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
        this.f64145b = j;
        this.f64146c = j2;
        this.f64147d = timeUnit;
        this.f64148e = scheduler;
        this.f64149f = callable;
        this.f64150g = i;
        this.f64151h = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        if (this.f64145b == this.f64146c && this.f64150g == Integer.MAX_VALUE) {
            this.source.subscribe((FlowableSubscriber<? super Object>) new RunnableC10806b(new SerializedSubscriber(subscriber), this.f64149f, this.f64145b, this.f64147d, this.f64148e));
            return;
        }
        Scheduler.Worker createWorker = this.f64148e.createWorker();
        if (this.f64145b == this.f64146c) {
            this.source.subscribe((FlowableSubscriber<? super Object>) new RunnableC10805a(new SerializedSubscriber(subscriber), this.f64149f, this.f64145b, this.f64147d, this.f64150g, this.f64151h, createWorker));
        } else {
            this.source.subscribe((FlowableSubscriber<? super Object>) new RunnableC10807c(new SerializedSubscriber(subscriber), this.f64149f, this.f64145b, this.f64146c, this.f64147d, createWorker));
        }
    }
}