package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.subjects.UnicastSubject;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ObservableWindowTimed<T> extends AbstractC11078a {

    /* renamed from: a */
    public final long f65728a;

    /* renamed from: b */
    public final long f65729b;

    /* renamed from: c */
    public final TimeUnit f65730c;

    /* renamed from: d */
    public final Scheduler f65731d;

    /* renamed from: e */
    public final long f65732e;

    /* renamed from: f */
    public final int f65733f;

    /* renamed from: g */
    public final boolean f65734g;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowTimed$a */
    /* loaded from: classes5.dex */
    public static final class C11068a extends QueueDrainObserver implements Disposable {

        /* renamed from: b */
        public final long f65735b;

        /* renamed from: c */
        public final TimeUnit f65736c;

        /* renamed from: d */
        public final Scheduler f65737d;

        /* renamed from: e */
        public final int f65738e;

        /* renamed from: f */
        public final boolean f65739f;

        /* renamed from: g */
        public final long f65740g;

        /* renamed from: h */
        public final Scheduler.Worker f65741h;

        /* renamed from: i */
        public long f65742i;

        /* renamed from: j */
        public long f65743j;

        /* renamed from: k */
        public Disposable f65744k;

        /* renamed from: l */
        public UnicastSubject f65745l;

        /* renamed from: m */
        public volatile boolean f65746m;

        /* renamed from: n */
        public final AtomicReference f65747n;

        /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowTimed$a$a */
        /* loaded from: classes5.dex */
        public static final class RunnableC11069a implements Runnable {

            /* renamed from: a */
            public final long f65748a;

            /* renamed from: b */
            public final C11068a f65749b;

            public RunnableC11069a(long j, C11068a c11068a) {
                this.f65748a = j;
                this.f65749b = c11068a;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11068a c11068a = this.f65749b;
                if (!((QueueDrainObserver) c11068a).cancelled) {
                    ((QueueDrainObserver) c11068a).queue.offer(this);
                } else {
                    c11068a.f65746m = true;
                    c11068a.m30281c();
                }
                if (c11068a.enter()) {
                    c11068a.m30280d();
                }
            }
        }

        public C11068a(Observer observer, long j, TimeUnit timeUnit, Scheduler scheduler, int i, long j2, boolean z) {
            super(observer, new MpscLinkedQueue());
            this.f65747n = new AtomicReference();
            this.f65735b = j;
            this.f65736c = timeUnit;
            this.f65737d = scheduler;
            this.f65738e = i;
            this.f65740g = j2;
            this.f65739f = z;
            if (z) {
                this.f65741h = scheduler.createWorker();
            } else {
                this.f65741h = null;
            }
        }

        /* renamed from: c */
        public void m30281c() {
            DisposableHelper.dispose(this.f65747n);
            Scheduler.Worker worker = this.f65741h;
            if (worker != null) {
                worker.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public void m30280d() {
            boolean z;
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            UnicastSubject unicastSubject = this.f65745l;
            int i = 1;
            while (!this.f65746m) {
                boolean z2 = this.done;
                Object poll = mpscLinkedQueue.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z3 = poll instanceof RunnableC11069a;
                if (z2 && (z || z3)) {
                    this.f65745l = null;
                    mpscLinkedQueue.clear();
                    m30281c();
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        unicastSubject.onError(th2);
                        return;
                    } else {
                        unicastSubject.onComplete();
                        return;
                    }
                } else if (z) {
                    i = leave(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    RunnableC11069a runnableC11069a = (RunnableC11069a) poll;
                    if (this.f65739f || this.f65743j == runnableC11069a.f65748a) {
                        unicastSubject.onComplete();
                        this.f65742i = 0L;
                        unicastSubject = UnicastSubject.create(this.f65738e);
                        this.f65745l = unicastSubject;
                        observer.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(poll));
                    long j = this.f65742i + 1;
                    if (j >= this.f65740g) {
                        this.f65743j++;
                        this.f65742i = 0L;
                        unicastSubject.onComplete();
                        unicastSubject = UnicastSubject.create(this.f65738e);
                        this.f65745l = unicastSubject;
                        this.downstream.onNext(unicastSubject);
                        if (this.f65739f) {
                            Disposable disposable = (Disposable) this.f65747n.get();
                            disposable.dispose();
                            Scheduler.Worker worker = this.f65741h;
                            RunnableC11069a runnableC11069a2 = new RunnableC11069a(this.f65743j, this);
                            long j2 = this.f65735b;
                            Disposable schedulePeriodically = worker.schedulePeriodically(runnableC11069a2, j2, j2, this.f65736c);
                            if (!AbstractC23094xo1.m479a(this.f65747n, disposable, schedulePeriodically)) {
                                schedulePeriodically.dispose();
                            }
                        }
                    } else {
                        this.f65742i = j;
                    }
                }
            }
            this.f65744k.dispose();
            mpscLinkedQueue.clear();
            m30281c();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (enter()) {
                m30280d();
            }
            this.downstream.onComplete();
            m30281c();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                m30280d();
            }
            this.downstream.onError(th2);
            m30281c();
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65746m) {
                return;
            }
            if (fastEnter()) {
                UnicastSubject unicastSubject = this.f65745l;
                unicastSubject.onNext(obj);
                long j = this.f65742i + 1;
                if (j >= this.f65740g) {
                    this.f65743j++;
                    this.f65742i = 0L;
                    unicastSubject.onComplete();
                    UnicastSubject create = UnicastSubject.create(this.f65738e);
                    this.f65745l = create;
                    this.downstream.onNext(create);
                    if (this.f65739f) {
                        ((Disposable) this.f65747n.get()).dispose();
                        Scheduler.Worker worker = this.f65741h;
                        RunnableC11069a runnableC11069a = new RunnableC11069a(this.f65743j, this);
                        long j2 = this.f65735b;
                        DisposableHelper.replace(this.f65747n, worker.schedulePeriodically(runnableC11069a, j2, j2, this.f65736c));
                    }
                } else {
                    this.f65742i = j;
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
            m30280d();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            Disposable schedulePeriodicallyDirect;
            if (DisposableHelper.validate(this.f65744k, disposable)) {
                this.f65744k = disposable;
                Observer<? super V> observer = this.downstream;
                observer.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastSubject create = UnicastSubject.create(this.f65738e);
                this.f65745l = create;
                observer.onNext(create);
                RunnableC11069a runnableC11069a = new RunnableC11069a(this.f65743j, this);
                if (this.f65739f) {
                    Scheduler.Worker worker = this.f65741h;
                    long j = this.f65735b;
                    schedulePeriodicallyDirect = worker.schedulePeriodically(runnableC11069a, j, j, this.f65736c);
                } else {
                    Scheduler scheduler = this.f65737d;
                    long j2 = this.f65735b;
                    schedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(runnableC11069a, j2, j2, this.f65736c);
                }
                DisposableHelper.replace(this.f65747n, schedulePeriodicallyDirect);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowTimed$b */
    /* loaded from: classes5.dex */
    public static final class RunnableC11070b extends QueueDrainObserver implements Observer, Disposable, Runnable {

        /* renamed from: j */
        public static final Object f65750j = new Object();

        /* renamed from: b */
        public final long f65751b;

        /* renamed from: c */
        public final TimeUnit f65752c;

        /* renamed from: d */
        public final Scheduler f65753d;

        /* renamed from: e */
        public final int f65754e;

        /* renamed from: f */
        public Disposable f65755f;

        /* renamed from: g */
        public UnicastSubject f65756g;

        /* renamed from: h */
        public final AtomicReference f65757h;

        /* renamed from: i */
        public volatile boolean f65758i;

        public RunnableC11070b(Observer observer, long j, TimeUnit timeUnit, Scheduler scheduler, int i) {
            super(observer, new MpscLinkedQueue());
            this.f65757h = new AtomicReference();
            this.f65751b = j;
            this.f65752c = timeUnit;
            this.f65753d = scheduler;
            this.f65754e = i;
        }

        /* renamed from: a */
        public void m30279a() {
            DisposableHelper.dispose(this.f65757h);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
            r2.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
            r7.f65756g = null;
            r0.clear();
            m30279a();
            r0 = r7.error;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
            if (r0 == null) goto L13;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m30278b() {
            /*
                r7 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r7.queue
                io.reactivex.internal.queue.MpscLinkedQueue r0 = (io.reactivex.internal.queue.MpscLinkedQueue) r0
                io.reactivex.Observer<? super V> r1 = r7.downstream
                io.reactivex.subjects.UnicastSubject r2 = r7.f65756g
                r3 = 1
            L9:
                boolean r4 = r7.f65758i
                boolean r5 = r7.done
                java.lang.Object r6 = r0.poll()
                if (r5 == 0) goto L2e
                if (r6 == 0) goto L19
                java.lang.Object r5 = io.reactivex.internal.operators.observable.ObservableWindowTimed.RunnableC11070b.f65750j
                if (r6 != r5) goto L2e
            L19:
                r1 = 0
                r7.f65756g = r1
                r0.clear()
                r7.m30279a()
                java.lang.Throwable r0 = r7.error
                if (r0 == 0) goto L2a
                r2.onError(r0)
                goto L2d
            L2a:
                r2.onComplete()
            L2d:
                return
            L2e:
                if (r6 != 0) goto L38
                int r3 = -r3
                int r3 = r7.leave(r3)
                if (r3 != 0) goto L9
                return
            L38:
                java.lang.Object r5 = io.reactivex.internal.operators.observable.ObservableWindowTimed.RunnableC11070b.f65750j
                if (r6 != r5) goto L53
                r2.onComplete()
                if (r4 != 0) goto L4d
                int r2 = r7.f65754e
                io.reactivex.subjects.UnicastSubject r2 = io.reactivex.subjects.UnicastSubject.create(r2)
                r7.f65756g = r2
                r1.onNext(r2)
                goto L9
            L4d:
                io.reactivex.disposables.Disposable r4 = r7.f65755f
                r4.dispose()
                goto L9
            L53:
                java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.getValue(r6)
                r2.onNext(r4)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableWindowTimed.RunnableC11070b.m30278b():void");
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (enter()) {
                m30278b();
            }
            m30279a();
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                m30278b();
            }
            m30279a();
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65758i) {
                return;
            }
            if (fastEnter()) {
                this.f65756g.onNext(obj);
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(NotificationLite.next(obj));
                if (!enter()) {
                    return;
                }
            }
            m30278b();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65755f, disposable)) {
                this.f65755f = disposable;
                this.f65756g = UnicastSubject.create(this.f65754e);
                Observer<? super V> observer = this.downstream;
                observer.onSubscribe(this);
                observer.onNext(this.f65756g);
                if (!this.cancelled) {
                    Scheduler scheduler = this.f65753d;
                    long j = this.f65751b;
                    DisposableHelper.replace(this.f65757h, scheduler.schedulePeriodicallyDirect(this, j, j, this.f65752c));
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                this.f65758i = true;
                m30279a();
            }
            this.queue.offer(f65750j);
            if (enter()) {
                m30278b();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowTimed$c */
    /* loaded from: classes5.dex */
    public static final class RunnableC11071c extends QueueDrainObserver implements Disposable, Runnable {

        /* renamed from: b */
        public final long f65759b;

        /* renamed from: c */
        public final long f65760c;

        /* renamed from: d */
        public final TimeUnit f65761d;

        /* renamed from: e */
        public final Scheduler.Worker f65762e;

        /* renamed from: f */
        public final int f65763f;

        /* renamed from: g */
        public final List f65764g;

        /* renamed from: h */
        public Disposable f65765h;

        /* renamed from: i */
        public volatile boolean f65766i;

        /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowTimed$c$a */
        /* loaded from: classes5.dex */
        public final class RunnableC11072a implements Runnable {

            /* renamed from: a */
            public final UnicastSubject f65767a;

            public RunnableC11072a(UnicastSubject unicastSubject) {
                this.f65767a = unicastSubject;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC11071c.this.m30277a(this.f65767a);
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowTimed$c$b */
        /* loaded from: classes5.dex */
        public static final class C11073b {

            /* renamed from: a */
            public final UnicastSubject f65769a;

            /* renamed from: b */
            public final boolean f65770b;

            public C11073b(UnicastSubject unicastSubject, boolean z) {
                this.f65769a = unicastSubject;
                this.f65770b = z;
            }
        }

        public RunnableC11071c(Observer observer, long j, long j2, TimeUnit timeUnit, Scheduler.Worker worker, int i) {
            super(observer, new MpscLinkedQueue());
            this.f65759b = j;
            this.f65760c = j2;
            this.f65761d = timeUnit;
            this.f65762e = worker;
            this.f65763f = i;
            this.f65764g = new LinkedList();
        }

        /* renamed from: a */
        public void m30277a(UnicastSubject unicastSubject) {
            this.queue.offer(new C11073b(unicastSubject, false));
            if (enter()) {
                m30275c();
            }
        }

        /* renamed from: b */
        public void m30276b() {
            this.f65762e.dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public void m30275c() {
            boolean z;
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            List<UnicastSubject> list = this.f65764g;
            int i = 1;
            while (!this.f65766i) {
                boolean z2 = this.done;
                Object poll = mpscLinkedQueue.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z3 = poll instanceof C11073b;
                if (z2 && (z || z3)) {
                    mpscLinkedQueue.clear();
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        for (UnicastSubject unicastSubject : list) {
                            unicastSubject.onError(th2);
                        }
                    } else {
                        for (UnicastSubject unicastSubject2 : list) {
                            unicastSubject2.onComplete();
                        }
                    }
                    m30276b();
                    list.clear();
                    return;
                } else if (z) {
                    i = leave(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    C11073b c11073b = (C11073b) poll;
                    if (c11073b.f65770b) {
                        if (!this.cancelled) {
                            UnicastSubject create = UnicastSubject.create(this.f65763f);
                            list.add(create);
                            observer.onNext(create);
                            this.f65762e.schedule(new RunnableC11072a(create), this.f65759b, this.f65761d);
                        }
                    } else {
                        list.remove(c11073b.f65769a);
                        c11073b.f65769a.onComplete();
                        if (list.isEmpty() && this.cancelled) {
                            this.f65766i = true;
                        }
                    }
                } else {
                    for (UnicastSubject unicastSubject3 : list) {
                        unicastSubject3.onNext(poll);
                    }
                }
            }
            this.f65765h.dispose();
            m30276b();
            mpscLinkedQueue.clear();
            list.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (enter()) {
                m30275c();
            }
            this.downstream.onComplete();
            m30276b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                m30275c();
            }
            this.downstream.onError(th2);
            m30276b();
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (fastEnter()) {
                for (UnicastSubject unicastSubject : this.f65764g) {
                    unicastSubject.onNext(obj);
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
            m30275c();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65765h, disposable)) {
                this.f65765h = disposable;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastSubject create = UnicastSubject.create(this.f65763f);
                this.f65764g.add(create);
                this.downstream.onNext(create);
                this.f65762e.schedule(new RunnableC11072a(create), this.f65759b, this.f65761d);
                Scheduler.Worker worker = this.f65762e;
                long j = this.f65760c;
                worker.schedulePeriodically(this, j, j, this.f65761d);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            C11073b c11073b = new C11073b(UnicastSubject.create(this.f65763f), true);
            if (!this.cancelled) {
                this.queue.offer(c11073b);
            }
            if (enter()) {
                m30275c();
            }
        }
    }

    public ObservableWindowTimed(ObservableSource<T> observableSource, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, long j3, int i, boolean z) {
        super(observableSource);
        this.f65728a = j;
        this.f65729b = j2;
        this.f65730c = timeUnit;
        this.f65731d = scheduler;
        this.f65732e = j3;
        this.f65733f = i;
        this.f65734g = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        long j = this.f65728a;
        long j2 = this.f65729b;
        if (j == j2) {
            long j3 = this.f65732e;
            if (j3 == Long.MAX_VALUE) {
                this.source.subscribe(new RunnableC11070b(serializedObserver, this.f65728a, this.f65730c, this.f65731d, this.f65733f));
                return;
            } else {
                this.source.subscribe(new C11068a(serializedObserver, j, this.f65730c, this.f65731d, this.f65733f, j3, this.f65734g));
                return;
            }
        }
        this.source.subscribe(new RunnableC11071c(serializedObserver, j, j2, this.f65730c, this.f65731d.createWorker(), this.f65733f));
    }
}