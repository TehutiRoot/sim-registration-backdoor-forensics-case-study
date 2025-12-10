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
public final class FlowableWindowTimed<T> extends AbstractC0558I {

    /* renamed from: b */
    public final long f64721b;

    /* renamed from: c */
    public final long f64722c;

    /* renamed from: d */
    public final TimeUnit f64723d;

    /* renamed from: e */
    public final Scheduler f64724e;

    /* renamed from: f */
    public final long f64725f;

    /* renamed from: g */
    public final int f64726g;

    /* renamed from: h */
    public final boolean f64727h;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableWindowTimed$a */
    /* loaded from: classes5.dex */
    public static final class C10901a extends QueueDrainSubscriber implements Subscription {

        /* renamed from: c */
        public final long f64728c;

        /* renamed from: d */
        public final TimeUnit f64729d;

        /* renamed from: e */
        public final Scheduler f64730e;

        /* renamed from: f */
        public final int f64731f;

        /* renamed from: g */
        public final boolean f64732g;

        /* renamed from: h */
        public final long f64733h;

        /* renamed from: i */
        public final Scheduler.Worker f64734i;

        /* renamed from: j */
        public long f64735j;

        /* renamed from: k */
        public long f64736k;

        /* renamed from: l */
        public Subscription f64737l;

        /* renamed from: m */
        public UnicastProcessor f64738m;

        /* renamed from: n */
        public volatile boolean f64739n;

        /* renamed from: o */
        public final SequentialDisposable f64740o;

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableWindowTimed$a$a */
        /* loaded from: classes5.dex */
        public static final class RunnableC10902a implements Runnable {

            /* renamed from: a */
            public final long f64741a;

            /* renamed from: b */
            public final C10901a f64742b;

            public RunnableC10902a(long j, C10901a c10901a) {
                this.f64741a = j;
                this.f64742b = c10901a;
            }

            @Override // java.lang.Runnable
            public void run() {
                C10901a c10901a = this.f64742b;
                if (!((QueueDrainSubscriber) c10901a).cancelled) {
                    ((QueueDrainSubscriber) c10901a).queue.offer(this);
                } else {
                    c10901a.f64739n = true;
                    c10901a.dispose();
                }
                if (c10901a.enter()) {
                    c10901a.m30356c();
                }
            }
        }

        public C10901a(Subscriber subscriber, long j, TimeUnit timeUnit, Scheduler scheduler, int i, long j2, boolean z) {
            super(subscriber, new MpscLinkedQueue());
            this.f64740o = new SequentialDisposable();
            this.f64728c = j;
            this.f64729d = timeUnit;
            this.f64730e = scheduler;
            this.f64731f = i;
            this.f64733h = j2;
            this.f64732g = z;
            if (z) {
                this.f64734i = scheduler.createWorker();
            } else {
                this.f64734i = null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
            if (r17.f64736k == r7.f64741a) goto L31;
         */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m30356c() {
            /*
                Method dump skipped, instructions count: 288
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableWindowTimed.C10901a.m30356c():void");
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
        }

        public void dispose() {
            DisposableHelper.dispose(this.f64740o);
            Scheduler.Worker worker = this.f64734i;
            if (worker != null) {
                worker.dispose();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            if (enter()) {
                m30356c();
            }
            this.downstream.onComplete();
            dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                m30356c();
            }
            this.downstream.onError(th2);
            dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64739n) {
                return;
            }
            if (fastEnter()) {
                UnicastProcessor unicastProcessor = this.f64738m;
                unicastProcessor.onNext(obj);
                long j = this.f64735j + 1;
                if (j >= this.f64733h) {
                    this.f64736k++;
                    this.f64735j = 0L;
                    unicastProcessor.onComplete();
                    long requested = requested();
                    if (requested != 0) {
                        UnicastProcessor create = UnicastProcessor.create(this.f64731f);
                        this.f64738m = create;
                        this.downstream.onNext(create);
                        if (requested != Long.MAX_VALUE) {
                            produced(1L);
                        }
                        if (this.f64732g) {
                            this.f64740o.get().dispose();
                            Scheduler.Worker worker = this.f64734i;
                            RunnableC10902a runnableC10902a = new RunnableC10902a(this.f64736k, this);
                            long j2 = this.f64728c;
                            this.f64740o.replace(worker.schedulePeriodically(runnableC10902a, j2, j2, this.f64729d));
                        }
                    } else {
                        this.f64738m = null;
                        this.f64737l.cancel();
                        this.downstream.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                        dispose();
                        return;
                    }
                } else {
                    this.f64735j = j;
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
            m30356c();
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            Disposable schedulePeriodicallyDirect;
            if (SubscriptionHelper.validate(this.f64737l, subscription)) {
                this.f64737l = subscription;
                Subscriber<? super V> subscriber = this.downstream;
                subscriber.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastProcessor create = UnicastProcessor.create(this.f64731f);
                this.f64738m = create;
                long requested = requested();
                if (requested != 0) {
                    subscriber.onNext(create);
                    if (requested != Long.MAX_VALUE) {
                        produced(1L);
                    }
                    RunnableC10902a runnableC10902a = new RunnableC10902a(this.f64736k, this);
                    if (this.f64732g) {
                        Scheduler.Worker worker = this.f64734i;
                        long j = this.f64728c;
                        schedulePeriodicallyDirect = worker.schedulePeriodically(runnableC10902a, j, j, this.f64729d);
                    } else {
                        Scheduler scheduler = this.f64730e;
                        long j2 = this.f64728c;
                        schedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(runnableC10902a, j2, j2, this.f64729d);
                    }
                    if (this.f64740o.replace(schedulePeriodicallyDirect)) {
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
    public static final class RunnableC10903b extends QueueDrainSubscriber implements FlowableSubscriber, Subscription, Runnable {

        /* renamed from: k */
        public static final Object f64743k = new Object();

        /* renamed from: c */
        public final long f64744c;

        /* renamed from: d */
        public final TimeUnit f64745d;

        /* renamed from: e */
        public final Scheduler f64746e;

        /* renamed from: f */
        public final int f64747f;

        /* renamed from: g */
        public Subscription f64748g;

        /* renamed from: h */
        public UnicastProcessor f64749h;

        /* renamed from: i */
        public final SequentialDisposable f64750i;

        /* renamed from: j */
        public volatile boolean f64751j;

        public RunnableC10903b(Subscriber subscriber, long j, TimeUnit timeUnit, Scheduler scheduler, int i) {
            super(subscriber, new MpscLinkedQueue());
            this.f64750i = new SequentialDisposable();
            this.f64744c = j;
            this.f64745d = timeUnit;
            this.f64746e = scheduler;
            this.f64747f = i;
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
            r10.f64749h = null;
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
        public void m30355a() {
            /*
                r10 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r10.queue
                org.reactivestreams.Subscriber<? super V> r1 = r10.downstream
                io.reactivex.processors.UnicastProcessor r2 = r10.f64749h
                r3 = 1
            L7:
                boolean r4 = r10.f64751j
                boolean r5 = r10.done
                java.lang.Object r6 = r0.poll()
                r7 = 0
                if (r5 == 0) goto L2c
                if (r6 == 0) goto L18
                java.lang.Object r5 = io.reactivex.internal.operators.flowable.FlowableWindowTimed.RunnableC10903b.f64743k
                if (r6 != r5) goto L2c
            L18:
                r10.f64749h = r7
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
                java.lang.Object r5 = io.reactivex.internal.operators.flowable.FlowableWindowTimed.RunnableC10903b.f64743k
                if (r6 != r5) goto L83
                r2.onComplete()
                if (r4 != 0) goto L7d
                int r2 = r10.f64747f
                io.reactivex.processors.UnicastProcessor r2 = io.reactivex.processors.UnicastProcessor.create(r2)
                r10.f64749h = r2
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
                r10.f64749h = r7
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r10.queue
                r0.clear()
                org.reactivestreams.Subscription r0 = r10.f64748g
                r0.cancel()
                r10.dispose()
                io.reactivex.exceptions.MissingBackpressureException r0 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r2 = "Could not deliver first window due to lack of requests."
                r0.<init>(r2)
                r1.onError(r0)
                return
            L7d:
                org.reactivestreams.Subscription r4 = r10.f64748g
                r4.cancel()
                goto L7
            L83:
                java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.getValue(r6)
                r2.onNext(r4)
                goto L7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableWindowTimed.RunnableC10903b.m30355a():void");
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
        }

        public void dispose() {
            DisposableHelper.dispose(this.f64750i);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            if (enter()) {
                m30355a();
            }
            this.downstream.onComplete();
            dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                m30355a();
            }
            this.downstream.onError(th2);
            dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f64751j) {
                return;
            }
            if (fastEnter()) {
                this.f64749h.onNext(obj);
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(NotificationLite.next(obj));
                if (!enter()) {
                    return;
                }
            }
            m30355a();
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64748g, subscription)) {
                this.f64748g = subscription;
                this.f64749h = UnicastProcessor.create(this.f64747f);
                Subscriber<? super V> subscriber = this.downstream;
                subscriber.onSubscribe(this);
                long requested = requested();
                if (requested != 0) {
                    subscriber.onNext(this.f64749h);
                    if (requested != Long.MAX_VALUE) {
                        produced(1L);
                    }
                    if (!this.cancelled) {
                        SequentialDisposable sequentialDisposable = this.f64750i;
                        Scheduler scheduler = this.f64746e;
                        long j = this.f64744c;
                        if (sequentialDisposable.replace(scheduler.schedulePeriodicallyDirect(this, j, j, this.f64745d))) {
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
                this.f64751j = true;
                dispose();
            }
            this.queue.offer(f64743k);
            if (enter()) {
                m30355a();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableWindowTimed$c */
    /* loaded from: classes5.dex */
    public static final class RunnableC10904c extends QueueDrainSubscriber implements Subscription, Runnable {

        /* renamed from: c */
        public final long f64752c;

        /* renamed from: d */
        public final long f64753d;

        /* renamed from: e */
        public final TimeUnit f64754e;

        /* renamed from: f */
        public final Scheduler.Worker f64755f;

        /* renamed from: g */
        public final int f64756g;

        /* renamed from: h */
        public final List f64757h;

        /* renamed from: i */
        public Subscription f64758i;

        /* renamed from: j */
        public volatile boolean f64759j;

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableWindowTimed$c$a */
        /* loaded from: classes5.dex */
        public final class RunnableC10905a implements Runnable {

            /* renamed from: a */
            public final UnicastProcessor f64760a;

            public RunnableC10905a(UnicastProcessor unicastProcessor) {
                this.f64760a = unicastProcessor;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC10904c.this.m30354a(this.f64760a);
            }
        }

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableWindowTimed$c$b */
        /* loaded from: classes5.dex */
        public static final class C10906b {

            /* renamed from: a */
            public final UnicastProcessor f64762a;

            /* renamed from: b */
            public final boolean f64763b;

            public C10906b(UnicastProcessor unicastProcessor, boolean z) {
                this.f64762a = unicastProcessor;
                this.f64763b = z;
            }
        }

        public RunnableC10904c(Subscriber subscriber, long j, long j2, TimeUnit timeUnit, Scheduler.Worker worker, int i) {
            super(subscriber, new MpscLinkedQueue());
            this.f64752c = j;
            this.f64753d = j2;
            this.f64754e = timeUnit;
            this.f64755f = worker;
            this.f64756g = i;
            this.f64757h = new LinkedList();
        }

        /* renamed from: a */
        public void m30354a(UnicastProcessor unicastProcessor) {
            this.queue.offer(new C10906b(unicastProcessor, false));
            if (enter()) {
                m30353b();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public void m30353b() {
            boolean z;
            SimpleQueue simpleQueue = this.queue;
            Subscriber<? super V> subscriber = this.downstream;
            List<UnicastProcessor> list = this.f64757h;
            int i = 1;
            while (!this.f64759j) {
                boolean z2 = this.done;
                Object poll = simpleQueue.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z3 = poll instanceof C10906b;
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
                    C10906b c10906b = (C10906b) poll;
                    if (c10906b.f64763b) {
                        if (!this.cancelled) {
                            long requested = requested();
                            if (requested != 0) {
                                UnicastProcessor create = UnicastProcessor.create(this.f64756g);
                                list.add(create);
                                subscriber.onNext(create);
                                if (requested != Long.MAX_VALUE) {
                                    produced(1L);
                                }
                                this.f64755f.schedule(new RunnableC10905a(create), this.f64752c, this.f64754e);
                            } else {
                                subscriber.onError(new MissingBackpressureException("Can't emit window due to lack of requests"));
                            }
                        }
                    } else {
                        list.remove(c10906b.f64762a);
                        c10906b.f64762a.onComplete();
                        if (list.isEmpty() && this.cancelled) {
                            this.f64759j = true;
                        }
                    }
                } else {
                    for (UnicastProcessor unicastProcessor3 : list) {
                        unicastProcessor3.onNext(poll);
                    }
                }
            }
            this.f64758i.cancel();
            dispose();
            simpleQueue.clear();
            list.clear();
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
        }

        public void dispose() {
            this.f64755f.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            if (enter()) {
                m30353b();
            }
            this.downstream.onComplete();
            dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                m30353b();
            }
            this.downstream.onError(th2);
            dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (fastEnter()) {
                for (UnicastProcessor unicastProcessor : this.f64757h) {
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
            m30353b();
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64758i, subscription)) {
                this.f64758i = subscription;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                long requested = requested();
                if (requested != 0) {
                    UnicastProcessor create = UnicastProcessor.create(this.f64756g);
                    this.f64757h.add(create);
                    this.downstream.onNext(create);
                    if (requested != Long.MAX_VALUE) {
                        produced(1L);
                    }
                    this.f64755f.schedule(new RunnableC10905a(create), this.f64752c, this.f64754e);
                    Scheduler.Worker worker = this.f64755f;
                    long j = this.f64753d;
                    worker.schedulePeriodically(this, j, j, this.f64754e);
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
            C10906b c10906b = new C10906b(UnicastProcessor.create(this.f64756g), true);
            if (!this.cancelled) {
                this.queue.offer(c10906b);
            }
            if (enter()) {
                m30353b();
            }
        }
    }

    public FlowableWindowTimed(Flowable<T> flowable, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, long j3, int i, boolean z) {
        super(flowable);
        this.f64721b = j;
        this.f64722c = j2;
        this.f64723d = timeUnit;
        this.f64724e = scheduler;
        this.f64725f = j3;
        this.f64726g = i;
        this.f64727h = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Flowable<T>> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        long j = this.f64721b;
        long j2 = this.f64722c;
        if (j == j2) {
            long j3 = this.f64725f;
            if (j3 == Long.MAX_VALUE) {
                this.source.subscribe((FlowableSubscriber<? super Object>) new RunnableC10903b(serializedSubscriber, this.f64721b, this.f64723d, this.f64724e, this.f64726g));
                return;
            } else {
                this.source.subscribe((FlowableSubscriber<? super Object>) new C10901a(serializedSubscriber, j, this.f64723d, this.f64724e, this.f64726g, j3, this.f64727h));
                return;
            }
        }
        this.source.subscribe((FlowableSubscriber<? super Object>) new RunnableC10904c(serializedSubscriber, j, j2, this.f64723d, this.f64724e.createWorker(), this.f64726g));
    }
}