package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableWindowBoundarySelector<T, B, V> extends AbstractC0558I {

    /* renamed from: b */
    public final Publisher f64699b;

    /* renamed from: c */
    public final Function f64700c;

    /* renamed from: d */
    public final int f64701d;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$a */
    /* loaded from: classes5.dex */
    public static final class C10896a extends DisposableSubscriber {

        /* renamed from: b */
        public final C10898c f64702b;

        /* renamed from: c */
        public final UnicastProcessor f64703c;

        /* renamed from: d */
        public boolean f64704d;

        public C10896a(C10898c c10898c, UnicastProcessor unicastProcessor) {
            this.f64702b = c10898c;
            this.f64703c = unicastProcessor;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64704d) {
                return;
            }
            this.f64704d = true;
            this.f64702b.m30362a(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64704d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64704d = true;
            this.f64702b.m30360c(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            cancel();
            onComplete();
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$b */
    /* loaded from: classes5.dex */
    public static final class C10897b extends DisposableSubscriber {

        /* renamed from: b */
        public final C10898c f64705b;

        public C10897b(C10898c c10898c) {
            this.f64705b = c10898c;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64705b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64705b.m30360c(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64705b.m30359d(obj);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$c */
    /* loaded from: classes5.dex */
    public static final class C10898c extends QueueDrainSubscriber implements Subscription {

        /* renamed from: c */
        public final Publisher f64706c;

        /* renamed from: d */
        public final Function f64707d;

        /* renamed from: e */
        public final int f64708e;

        /* renamed from: f */
        public final CompositeDisposable f64709f;

        /* renamed from: g */
        public Subscription f64710g;

        /* renamed from: h */
        public final AtomicReference f64711h;

        /* renamed from: i */
        public final List f64712i;

        /* renamed from: j */
        public final AtomicLong f64713j;

        /* renamed from: k */
        public final AtomicBoolean f64714k;

        public C10898c(Subscriber subscriber, Publisher publisher, Function function, int i) {
            super(subscriber, new MpscLinkedQueue());
            this.f64711h = new AtomicReference();
            AtomicLong atomicLong = new AtomicLong();
            this.f64713j = atomicLong;
            this.f64714k = new AtomicBoolean();
            this.f64706c = publisher;
            this.f64707d = function;
            this.f64708e = i;
            this.f64709f = new CompositeDisposable();
            this.f64712i = new ArrayList();
            atomicLong.lazySet(1L);
        }

        /* renamed from: a */
        public void m30362a(C10896a c10896a) {
            this.f64709f.delete(c10896a);
            this.queue.offer(new C10899d(c10896a.f64703c, null));
            if (enter()) {
                m30361b();
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public boolean accept(Subscriber subscriber, Object obj) {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public void m30361b() {
            boolean z;
            SimpleQueue simpleQueue = this.queue;
            Subscriber<? super V> subscriber = this.downstream;
            List<UnicastProcessor> list = this.f64712i;
            int i = 1;
            while (true) {
                boolean z2 = this.done;
                Object poll = simpleQueue.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2 && z) {
                    dispose();
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        for (UnicastProcessor unicastProcessor : list) {
                            unicastProcessor.onError(th2);
                        }
                    } else {
                        for (UnicastProcessor unicastProcessor2 : list) {
                            unicastProcessor2.onComplete();
                        }
                    }
                    list.clear();
                    return;
                } else if (z) {
                    i = leave(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (poll instanceof C10899d) {
                    C10899d c10899d = (C10899d) poll;
                    UnicastProcessor unicastProcessor3 = c10899d.f64715a;
                    if (unicastProcessor3 != null) {
                        if (list.remove(unicastProcessor3)) {
                            c10899d.f64715a.onComplete();
                            if (this.f64713j.decrementAndGet() == 0) {
                                dispose();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f64714k.get()) {
                        UnicastProcessor create = UnicastProcessor.create(this.f64708e);
                        long requested = requested();
                        if (requested != 0) {
                            list.add(create);
                            subscriber.onNext(create);
                            if (requested != Long.MAX_VALUE) {
                                produced(1L);
                            }
                            try {
                                Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.f64707d.apply(c10899d.f64716b), "The publisher supplied is null");
                                C10896a c10896a = new C10896a(this, create);
                                if (this.f64709f.add(c10896a)) {
                                    this.f64713j.getAndIncrement();
                                    publisher.subscribe(c10896a);
                                }
                            } catch (Throwable th3) {
                                cancel();
                                subscriber.onError(th3);
                            }
                        } else {
                            cancel();
                            subscriber.onError(new MissingBackpressureException("Could not deliver new window due to lack of requests"));
                        }
                    }
                } else {
                    for (UnicastProcessor unicastProcessor4 : list) {
                        unicastProcessor4.onNext(NotificationLite.getValue(poll));
                    }
                }
            }
        }

        /* renamed from: c */
        public void m30360c(Throwable th2) {
            this.f64710g.cancel();
            this.f64709f.dispose();
            DisposableHelper.dispose(this.f64711h);
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f64714k.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.f64711h);
                if (this.f64713j.decrementAndGet() == 0) {
                    this.f64710g.cancel();
                }
            }
        }

        /* renamed from: d */
        public void m30359d(Object obj) {
            this.queue.offer(new C10899d(null, obj));
            if (enter()) {
                m30361b();
            }
        }

        public void dispose() {
            this.f64709f.dispose();
            DisposableHelper.dispose(this.f64711h);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            if (enter()) {
                m30361b();
            }
            if (this.f64713j.decrementAndGet() == 0) {
                this.f64709f.dispose();
            }
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.error = th2;
            this.done = true;
            if (enter()) {
                m30361b();
            }
            if (this.f64713j.decrementAndGet() == 0) {
                this.f64709f.dispose();
            }
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.done) {
                return;
            }
            if (fastEnter()) {
                for (UnicastProcessor unicastProcessor : this.f64712i) {
                    unicastProcessor.onNext(obj);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(NotificationLite.next(obj));
                if (!enter()) {
                    return;
                }
            }
            m30361b();
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64710g, subscription)) {
                this.f64710g = subscription;
                this.downstream.onSubscribe(this);
                if (this.f64714k.get()) {
                    return;
                }
                C10897b c10897b = new C10897b(this);
                if (AbstractC23094xo1.m479a(this.f64711h, null, c10897b)) {
                    subscription.request(Long.MAX_VALUE);
                    this.f64706c.subscribe(c10897b);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            requested(j);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$d */
    /* loaded from: classes5.dex */
    public static final class C10899d {

        /* renamed from: a */
        public final UnicastProcessor f64715a;

        /* renamed from: b */
        public final Object f64716b;

        public C10899d(UnicastProcessor unicastProcessor, Object obj) {
            this.f64715a = unicastProcessor;
            this.f64716b = obj;
        }
    }

    public FlowableWindowBoundarySelector(Flowable<T> flowable, Publisher<B> publisher, Function<? super B, ? extends Publisher<V>> function, int i) {
        super(flowable);
        this.f64699b = publisher;
        this.f64700c = function;
        this.f64701d = i;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Flowable<T>> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10898c(new SerializedSubscriber(subscriber), this.f64699b, this.f64700c, this.f64701d));
    }
}