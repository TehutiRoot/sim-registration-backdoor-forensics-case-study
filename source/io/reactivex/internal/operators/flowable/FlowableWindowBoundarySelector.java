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
public final class FlowableWindowBoundarySelector<T, B, V> extends AbstractC0567I {

    /* renamed from: b */
    public final Publisher f64636b;

    /* renamed from: c */
    public final Function f64637c;

    /* renamed from: d */
    public final int f64638d;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$a */
    /* loaded from: classes5.dex */
    public static final class C10909a extends DisposableSubscriber {

        /* renamed from: b */
        public final C10911c f64639b;

        /* renamed from: c */
        public final UnicastProcessor f64640c;

        /* renamed from: d */
        public boolean f64641d;

        public C10909a(C10911c c10911c, UnicastProcessor unicastProcessor) {
            this.f64639b = c10911c;
            this.f64640c = unicastProcessor;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f64641d) {
                return;
            }
            this.f64641d = true;
            this.f64639b.m30022a(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64641d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f64641d = true;
            this.f64639b.m30020c(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            cancel();
            onComplete();
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$b */
    /* loaded from: classes5.dex */
    public static final class C10910b extends DisposableSubscriber {

        /* renamed from: b */
        public final C10911c f64642b;

        public C10910b(C10911c c10911c) {
            this.f64642b = c10911c;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64642b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64642b.m30020c(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64642b.m30019d(obj);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector$c */
    /* loaded from: classes5.dex */
    public static final class C10911c extends QueueDrainSubscriber implements Subscription {

        /* renamed from: c */
        public final Publisher f64643c;

        /* renamed from: d */
        public final Function f64644d;

        /* renamed from: e */
        public final int f64645e;

        /* renamed from: f */
        public final CompositeDisposable f64646f;

        /* renamed from: g */
        public Subscription f64647g;

        /* renamed from: h */
        public final AtomicReference f64648h;

        /* renamed from: i */
        public final List f64649i;

        /* renamed from: j */
        public final AtomicLong f64650j;

        /* renamed from: k */
        public final AtomicBoolean f64651k;

        public C10911c(Subscriber subscriber, Publisher publisher, Function function, int i) {
            super(subscriber, new MpscLinkedQueue());
            this.f64648h = new AtomicReference();
            AtomicLong atomicLong = new AtomicLong();
            this.f64650j = atomicLong;
            this.f64651k = new AtomicBoolean();
            this.f64643c = publisher;
            this.f64644d = function;
            this.f64645e = i;
            this.f64646f = new CompositeDisposable();
            this.f64649i = new ArrayList();
            atomicLong.lazySet(1L);
        }

        /* renamed from: a */
        public void m30022a(C10909a c10909a) {
            this.f64646f.delete(c10909a);
            this.queue.offer(new C10912d(c10909a.f64640c, null));
            if (enter()) {
                m30021b();
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public boolean accept(Subscriber subscriber, Object obj) {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public void m30021b() {
            boolean z;
            SimpleQueue simpleQueue = this.queue;
            Subscriber<? super V> subscriber = this.downstream;
            List<UnicastProcessor> list = this.f64649i;
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
                } else if (poll instanceof C10912d) {
                    C10912d c10912d = (C10912d) poll;
                    UnicastProcessor unicastProcessor3 = c10912d.f64652a;
                    if (unicastProcessor3 != null) {
                        if (list.remove(unicastProcessor3)) {
                            c10912d.f64652a.onComplete();
                            if (this.f64650j.decrementAndGet() == 0) {
                                dispose();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f64651k.get()) {
                        UnicastProcessor create = UnicastProcessor.create(this.f64645e);
                        long requested = requested();
                        if (requested != 0) {
                            list.add(create);
                            subscriber.onNext(create);
                            if (requested != Long.MAX_VALUE) {
                                produced(1L);
                            }
                            try {
                                Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.f64644d.apply(c10912d.f64653b), "The publisher supplied is null");
                                C10909a c10909a = new C10909a(this, create);
                                if (this.f64646f.add(c10909a)) {
                                    this.f64650j.getAndIncrement();
                                    publisher.subscribe(c10909a);
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
        public void m30020c(Throwable th2) {
            this.f64647g.cancel();
            this.f64646f.dispose();
            DisposableHelper.dispose(this.f64648h);
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f64651k.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.f64648h);
                if (this.f64650j.decrementAndGet() == 0) {
                    this.f64647g.cancel();
                }
            }
        }

        /* renamed from: d */
        public void m30019d(Object obj) {
            this.queue.offer(new C10912d(null, obj));
            if (enter()) {
                m30021b();
            }
        }

        public void dispose() {
            this.f64646f.dispose();
            DisposableHelper.dispose(this.f64648h);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            if (enter()) {
                m30021b();
            }
            if (this.f64650j.decrementAndGet() == 0) {
                this.f64646f.dispose();
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
                m30021b();
            }
            if (this.f64650j.decrementAndGet() == 0) {
                this.f64646f.dispose();
            }
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.done) {
                return;
            }
            if (fastEnter()) {
                for (UnicastProcessor unicastProcessor : this.f64649i) {
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
            m30021b();
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64647g, subscription)) {
                this.f64647g = subscription;
                this.downstream.onSubscribe(this);
                if (this.f64651k.get()) {
                    return;
                }
                C10910b c10910b = new C10910b(this);
                if (AbstractC17300An1.m69050a(this.f64648h, null, c10910b)) {
                    subscription.request(Long.MAX_VALUE);
                    this.f64643c.subscribe(c10910b);
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
    public static final class C10912d {

        /* renamed from: a */
        public final UnicastProcessor f64652a;

        /* renamed from: b */
        public final Object f64653b;

        public C10912d(UnicastProcessor unicastProcessor, Object obj) {
            this.f64652a = unicastProcessor;
            this.f64653b = obj;
        }
    }

    public FlowableWindowBoundarySelector(Flowable<T> flowable, Publisher<B> publisher, Function<? super B, ? extends Publisher<V>> function, int i) {
        super(flowable);
        this.f64636b = publisher;
        this.f64637c = function;
        this.f64638d = i;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Flowable<T>> subscriber) {
        this.source.subscribe((FlowableSubscriber<? super Object>) new C10911c(new SerializedSubscriber(subscriber), this.f64636b, this.f64637c, this.f64638d));
    }
}
