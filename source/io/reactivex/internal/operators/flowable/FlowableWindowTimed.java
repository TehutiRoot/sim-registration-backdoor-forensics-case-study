package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableWindowTimed<T> extends AbstractC0567I {

    /* renamed from: b */
    public final long f64658b;

    /* renamed from: c */
    public final long f64659c;

    /* renamed from: d */
    public final TimeUnit f64660d;

    /* renamed from: e */
    public final Scheduler f64661e;

    /* renamed from: f */
    public final long f64662f;

    /* renamed from: g */
    public final int f64663g;

    /* renamed from: h */
    public final boolean f64664h;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableWindowTimed$a */
    /* loaded from: classes5.dex */
    public static final class C10914a extends QueueDrainSubscriber implements Subscription {

        /* renamed from: c */
        public final long f64665c;

        /* renamed from: d */
        public final TimeUnit f64666d;

        /* renamed from: e */
        public final Scheduler f64667e;

        /* renamed from: f */
        public final int f64668f;

        /* renamed from: g */
        public final boolean f64669g;

        /* renamed from: h */
        public final long f64670h;

        /* renamed from: i */
        public final Scheduler.Worker f64671i;

        /* renamed from: j */
        public long f64672j;

        /* renamed from: k */
        public long f64673k;

        /* renamed from: l */
        public Subscription f64674l;

        /* renamed from: m */
        public UnicastProcessor f64675m;

        /* renamed from: n */
        public volatile boolean f64676n;

        /* renamed from: o */
        public final SequentialDisposable f64677o;

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableWindowTimed$a$a */
        /* loaded from: classes5.dex */
        public static final class RunnableC10915a implements Runnable {

            /* renamed from: a */
            public final long f64678a;

            /* renamed from: b */
            public final C10914a f64679b;

            public RunnableC10915a(long j, C10914a c10914a) {
                this.f64678a = j;
                this.f64679b = c10914a;
            }

            @Override // java.lang.Runnable
            public void run() {
                C10914a c10914a = this.f64679b;
                if (!((QueueDrainSubscriber) c10914a).cancelled) {
                    ((QueueDrainSubscriber) c10914a).queue.offer(this);
                } else {
                    c10914a.f64676n = true;
                    c10914a.dispose();
                }
                if (c10914a.enter()) {
                    c10914a.m30016c();
                }
            }
        }

        public C10914a(Subscriber subscriber, long j, TimeUnit timeUnit, Scheduler scheduler, int i, long j2, boolean z) {
            super(subscriber, new MpscLinkedQueue());
            this.f64677o = new SequentialDisposable();
            this.f64665c = j;
            this.f64666d = timeUnit;
            this.f64667e = scheduler;
            this.f64668f = i;
            this.f64670h = j2;
            this.f64669g = z;
            if (z) {
                this.f64671i = scheduler.createWorker();
            } else {
                this.f64671i = null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
            if (r17.f64673k == r7.f64678a) goto L31;
         */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m30016c() {
            /*
                Method dump skipped, instructions count: 288
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableWindowTimed.C10914a.m30016c():void");
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
        }

        public void dispose() {
            DisposableHelper.dispose(this.f64677o);
            Scheduler.Worker worker = this.f64671i;
            if (worker != null) {
                worker.dispose();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            if (enter()) {
                m30016c();
            }
            this.downstream.onComplete();
            dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                m30016c();
            }
            this.downstream.onError(th2);
            dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64676n) {
                return;
            }
            if (fastEnter()) {
                UnicastProcessor unicastProcessor = this.f64675m;
                unicastProcessor.onNext(obj);
                long j = this.f64672j + 1;
                if (j >= this.f64670h) {
                    this.f64673k++;
                    this.f64672j = 0L;
                    unicastProcessor.onComplete();
                    long requested = requested();
                    if (requested != 0) {
                        UnicastProcessor create = UnicastProcessor.create(this.f64668f);
                        this.f64675m = create;
                        this.downstream.onNext(create);
                        if (requested != Long.MAX_VALUE) {
                            produced(1L);
                        }
                        if (this.f64669g) {
                            this.f64677o.get().dispose();
                            Scheduler.Worker worker = this.f64671i;
                            RunnableC10915a runnableC10915a = new RunnableC10915a(this.f64673k, this);
                            long j2 = this.f64665c;
                            this.f64677o.replace(worker.schedulePeriodically(runnableC10915a, j2, j2, this.f64666d));
                        }
                    } else {
                        this.f64675m = null;
                        this.f64674l.cancel();
                        this.downstream.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                        dispose();
                        return;
                    }
                } else {
                    this.f64672j = j;
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
            m30016c();
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            Disposable schedulePeriodicallyDirect;
            if (SubscriptionHelper.validate(this.f64674l, subscription)) {
                this.f64674l = subscription;
                Subscriber<? super V> subscriber = this.downstream;
                subscriber.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastProcessor create = UnicastProcessor.create(this.f64668f);
                this.f64675m = create;
                long requested = requested();
                if (requested != 0) {
                    subscriber.onNext(create);
                    if (requested != Long.MAX_VALUE) {
                        produced(1L);
                    }
                    RunnableC10915a runnableC10915a = new RunnableC10915a(this.f64673k, this);
                    if (this.f64669g) {
                        Scheduler.Worker worker = this.f64671i;
                        long j = this.f64665c;
                        schedulePeriodicallyDirect = worker.schedulePeriodically(runnableC10915a, j, j, this.f64666d);
                    } else {
                        Scheduler scheduler = this.f64667e;
                        long j2 = this.f64665c;
                        schedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(runnableC10915a, j2, j2, this.f64666d);
                    }
                    if (this.f64677o.replace(schedulePeriodicallyDirect)) {
                        subscription.request(Long.MAX_VALUE);
                        return;
                    }
                    return;
                }
                this.cancelled = true;
                subscription.cancel();
                subscriber.onError(new MissingBackpressureException("Could not deliver initial window due to lack of requests."));
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            requested(j);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableWindowTimed$b */
    /* loaded from: classes5.dex */
    public static final class RunnableC10916b extends QueueDrainSubscriber implements FlowableSubscriber, Subscription, Runnable {

        /* renamed from: k */
        public static final Object f64680k = new Object();

        /* renamed from: c */
        public final long f64681c;

        /* renamed from: d */
        public final TimeUnit f64682d;

        /* renamed from: e */
        public final Scheduler f64683e;

        /* renamed from: f */
        public final int f64684f;

        /* renamed from: g */
        public Subscription f64685g;

        /* renamed from: h */
        public UnicastProcessor f64686h;

        /* renamed from: i */
        public final SequentialDisposable f64687i;

        /* renamed from: j */
        public volatile boolean f64688j;

        public RunnableC10916b(Subscriber subscriber, long j, TimeUnit timeUnit, Scheduler scheduler, int i) {
            super(subscriber, new MpscLinkedQueue());
            this.f64687i = new SequentialDisposable();
            this.f64681c = j;
            this.f64682d = timeUnit;
            this.f64683e = scheduler;
            this.f64684f = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
            r2.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            r10.f64686h = null;
            r0.clear();
            dispose();
            r0 = r10.error;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
            if (r0 == null) goto L13;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m30015a() {
            /*
                r10 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r10.queue
                org.reactivestreams.Subscriber<? super V> r1 = r10.downstream
                io.reactivex.processors.UnicastProcessor r2 = r10.f64686h
                r3 = 1
            L7:
                boolean r4 = r10.f64688j
                boolean r5 = r10.done
                java.lang.Object r6 = r0.poll()
                r7 = 0
                if (r5 == 0) goto L2c
                if (r6 == 0) goto L18
                java.lang.Object r5 = io.reactivex.internal.operators.flowable.FlowableWindowTimed.RunnableC10916b.f64680k
                if (r6 != r5) goto L2c
            L18:
                r10.f64686h = r7
                r0.clear()
                r10.dispose()
                java.lang.Throwable r0 = r10.error
                if (r0 == 0) goto L28
                r2.onError(r0)
                goto L2b
            L28:
                r2.onComplete()
            L2b:
                return
            L2c:
                if (r6 != 0) goto L36
                int r3 = -r3
                int r3 = r10.leave(r3)
                if (r3 != 0) goto L7
                return
            L36:
                java.lang.Object r5 = io.reactivex.internal.operators.flowable.FlowableWindowTimed.RunnableC10916b.f64680k
                if (r6 != r5) goto L83
                r2.onComplete()
                if (r4 != 0) goto L7d
                int r2 = r10.f64684f
                io.reactivex.processors.UnicastProcessor r2 = io.reactivex.processors.UnicastProcessor.create(r2)
                r10.f64686h = r2
                long r4 = r10.requested()
                r8 = 0
                int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r6 == 0) goto L63
                r1.onNext(r2)
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 == 0) goto L7
                r4 = 1
                r10.produced(r4)
                goto L7
            L63:
                r10.f64686h = r7
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r10.queue
                r0.clear()
                org.reactivestreams.Subscription r0 = r10.f64685g
                r0.cancel()
                r10.dispose()
                io.reactivex.exceptions.MissingBackpressureException r0 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r2 = "Could not deliver first window due to lack of requests."
                r0.<init>(r2)
                r1.onError(r0)
                return
            L7d:
                org.reactivestreams.Subscription r4 = r10.f64685g
                r4.cancel()
                goto L7
            L83:
                java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.getValue(r6)
                r2.onNext(r4)
                goto L7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableWindowTimed.RunnableC10916b.m30015a():void");
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
        }

        public void dispose() {
            DisposableHelper.dispose(this.f64687i);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            if (enter()) {
                m30015a();
            }
            this.downstream.onComplete();
            dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                m30015a();
            }
            this.downstream.onError(th2);
            dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64688j) {
                return;
            }
            if (fastEnter()) {
                this.f64686h.onNext(obj);
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(NotificationLite.next(obj));
                if (!enter()) {
                    return;
                }
            }
            m30015a();
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64685g, subscription)) {
                this.f64685g = subscription;
                this.f64686h = UnicastProcessor.create(this.f64684f);
                Subscriber<? super V> subscriber = this.downstream;
                subscriber.onSubscribe(this);
                long requested = requested();
                if (requested != 0) {
                    subscriber.onNext(this.f64686h);
                    if (requested != Long.MAX_VALUE) {
                        produced(1L);
                    }
                    if (!this.cancelled) {
                        SequentialDisposable sequentialDisposable = this.f64687i;
                        Scheduler scheduler = this.f64683e;
                        long j = this.f64681c;
                        if (sequentialDisposable.replace(scheduler.schedulePeriodicallyDirect(this, j, j, this.f64682d))) {
                            subscription.request(Long.MAX_VALUE);
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.cancelled = true;
                subscription.cancel();
                subscriber.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            requested(j);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                this.f64688j = true;
                dispose();
            }
            this.queue.offer(f64680k);
            if (enter()) {
                m30015a();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableWindowTimed$c */
    /* loaded from: classes5.dex */
    public static final class RunnableC10917c extends QueueDrainSubscriber implements Subscription, Runnable {

        /* renamed from: c */
        public final long f64689c;

        /* renamed from: d */
        public final long f64690d;

        /* renamed from: e */
        public final TimeUnit f64691e;

        /* renamed from: f */
        public final Scheduler.Worker f64692f;

        /* renamed from: g */
        public final int f64693g;

        /* renamed from: h */
        public final List f64694h;

        /* renamed from: i */
        public Subscription f64695i;

        /* renamed from: j */
        public volatile boolean f64696j;

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableWindowTimed$c$a */
        /* loaded from: classes5.dex */
        public final class RunnableC10918a implements Runnable {

            /* renamed from: a */
            public final UnicastProcessor f64697a;

            public RunnableC10918a(UnicastProcessor unicastProcessor) {
                this.f64697a = unicastProcessor;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC10917c.this.m30014a(this.f64697a);
            }
        }

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableWindowTimed$c$b */
        /* loaded from: classes5.dex */
        public static final class C10919b {

            /* renamed from: a */
            public final UnicastProcessor f64699a;

            /* renamed from: b */
            public final boolean f64700b;

            public C10919b(UnicastProcessor unicastProcessor, boolean z) {
                this.f64699a = unicastProcessor;
                this.f64700b = z;
            }
        }

        public RunnableC10917c(Subscriber subscriber, long j, long j2, TimeUnit timeUnit, Scheduler.Worker worker, int i) {
            super(subscriber, new MpscLinkedQueue());
            this.f64689c = j;
            this.f64690d = j2;
            this.f64691e = timeUnit;
            this.f64692f = worker;
            this.f64693g = i;
            this.f64694h = new LinkedList();
        }

        /* renamed from: a */
        public void m30014a(UnicastProcessor unicastProcessor) {
            this.queue.offer(new C10919b(unicastProcessor, false));
            if (enter()) {
                m30013b();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public void m30013b() {
            boolean z;
            SimpleQueue simpleQueue = this.queue;
            Subscriber<? super V> subscriber = this.downstream;
            List<UnicastProcessor> list = this.f64694h;
            int i = 1;
            while (!this.f64696j) {
                boolean z2 = this.done;
                Object poll = simpleQueue.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z3 = poll instanceof C10919b;
                if (z2 && (z || z3)) {
                    simpleQueue.clear();
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
                    dispose();
                    return;
                } else if (z) {
                    i = leave(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    C10919b c10919b = (C10919b) poll;
                    if (c10919b.f64700b) {
                        if (!this.cancelled) {
                            long requested = requested();
                            if (requested != 0) {
                                UnicastProcessor create = UnicastProcessor.create(this.f64693g);
                                list.add(create);
                                subscriber.onNext(create);
                                if (requested != Long.MAX_VALUE) {
                                    produced(1L);
                                }
                                this.f64692f.schedule(new RunnableC10918a(create), this.f64689c, this.f64691e);
                            } else {
                                subscriber.onError(new MissingBackpressureException("Can't emit window due to lack of requests"));
                            }
                        }
                    } else {
                        list.remove(c10919b.f64699a);
                        c10919b.f64699a.onComplete();
                        if (list.isEmpty() && this.cancelled) {
                            this.f64696j = true;
                        }
                    }
                } else {
                    for (UnicastProcessor unicastProcessor3 : list) {
                        unicastProcessor3.onNext(poll);
                    }
                }
            }
            this.f64695i.cancel();
            dispose();
            simpleQueue.clear();
            list.clear();
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
        }

        public void dispose() {
            this.f64692f.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            if (enter()) {
                m30013b();
            }
            this.downstream.onComplete();
            dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                m30013b();
            }
            this.downstream.onError(th2);
            dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (fastEnter()) {
                for (UnicastProcessor unicastProcessor : this.f64694h) {
                    unicastProcessor.onNext(obj);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(obj);
                if (!enter()) {
                    return;
                }
            }
            m30013b();
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64695i, subscription)) {
                this.f64695i = subscription;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                long requested = requested();
                if (requested != 0) {
                    UnicastProcessor create = UnicastProcessor.create(this.f64693g);
                    this.f64694h.add(create);
                    this.downstream.onNext(create);
                    if (requested != Long.MAX_VALUE) {
                        produced(1L);
                    }
                    this.f64692f.schedule(new RunnableC10918a(create), this.f64689c, this.f64691e);
                    Scheduler.Worker worker = this.f64692f;
                    long j = this.f64690d;
                    worker.schedulePeriodically(this, j, j, this.f64691e);
                    subscription.request(Long.MAX_VALUE);
                    return;
                }
                subscription.cancel();
                this.downstream.onError(new MissingBackpressureException("Could not emit the first window due to lack of requests"));
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            requested(j);
        }

        @Override // java.lang.Runnable
        public void run() {
            C10919b c10919b = new C10919b(UnicastProcessor.create(this.f64693g), true);
            if (!this.cancelled) {
                this.queue.offer(c10919b);
            }
            if (enter()) {
                m30013b();
            }
        }
    }

    public FlowableWindowTimed(Flowable<T> flowable, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, long j3, int i, boolean z) {
        super(flowable);
        this.f64658b = j;
        this.f64659c = j2;
        this.f64660d = timeUnit;
        this.f64661e = scheduler;
        this.f64662f = j3;
        this.f64663g = i;
        this.f64664h = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Flowable<T>> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        long j = this.f64658b;
        long j2 = this.f64659c;
        if (j == j2) {
            long j3 = this.f64662f;
            if (j3 == Long.MAX_VALUE) {
                this.source.subscribe((FlowableSubscriber<? super Object>) new RunnableC10916b(serializedSubscriber, this.f64658b, this.f64660d, this.f64661e, this.f64663g));
                return;
            } else {
                this.source.subscribe((FlowableSubscriber<? super Object>) new C10914a(serializedSubscriber, j, this.f64660d, this.f64661e, this.f64663g, j3, this.f64664h));
                return;
            }
        }
        this.source.subscribe((FlowableSubscriber<? super Object>) new RunnableC10917c(serializedSubscriber, j, j2, this.f64660d, this.f64661e.createWorker(), this.f64663g));
    }
}
