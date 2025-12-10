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
public final class ObservableWindowTimed<T> extends AbstractC11091a {

    /* renamed from: a */
    public final long f65665a;

    /* renamed from: b */
    public final long f65666b;

    /* renamed from: c */
    public final TimeUnit f65667c;

    /* renamed from: d */
    public final Scheduler f65668d;

    /* renamed from: e */
    public final long f65669e;

    /* renamed from: f */
    public final int f65670f;

    /* renamed from: g */
    public final boolean f65671g;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowTimed$a */
    /* loaded from: classes5.dex */
    public static final class C11081a extends QueueDrainObserver implements Disposable {

        /* renamed from: b */
        public final long f65672b;

        /* renamed from: c */
        public final TimeUnit f65673c;

        /* renamed from: d */
        public final Scheduler f65674d;

        /* renamed from: e */
        public final int f65675e;

        /* renamed from: f */
        public final boolean f65676f;

        /* renamed from: g */
        public final long f65677g;

        /* renamed from: h */
        public final Scheduler.Worker f65678h;

        /* renamed from: i */
        public long f65679i;

        /* renamed from: j */
        public long f65680j;

        /* renamed from: k */
        public Disposable f65681k;

        /* renamed from: l */
        public UnicastSubject f65682l;

        /* renamed from: m */
        public volatile boolean f65683m;

        /* renamed from: n */
        public final AtomicReference f65684n;

        /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowTimed$a$a */
        /* loaded from: classes5.dex */
        public static final class RunnableC11082a implements Runnable {

            /* renamed from: a */
            public final long f65685a;

            /* renamed from: b */
            public final C11081a f65686b;

            public RunnableC11082a(long j, C11081a c11081a) {
                this.f65685a = j;
                this.f65686b = c11081a;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11081a c11081a = this.f65686b;
                if (!((QueueDrainObserver) c11081a).cancelled) {
                    ((QueueDrainObserver) c11081a).queue.offer(this);
                } else {
                    c11081a.f65683m = true;
                    c11081a.m29941c();
                }
                if (c11081a.enter()) {
                    c11081a.m29940d();
                }
            }
        }

        public C11081a(Observer observer, long j, TimeUnit timeUnit, Scheduler scheduler, int i, long j2, boolean z) {
            super(observer, new MpscLinkedQueue());
            this.f65684n = new AtomicReference();
            this.f65672b = j;
            this.f65673c = timeUnit;
            this.f65674d = scheduler;
            this.f65675e = i;
            this.f65677g = j2;
            this.f65676f = z;
            if (z) {
                this.f65678h = scheduler.createWorker();
            } else {
                this.f65678h = null;
            }
        }

        /* renamed from: c */
        public void m29941c() {
            DisposableHelper.dispose(this.f65684n);
            Scheduler.Worker worker = this.f65678h;
            if (worker != null) {
                worker.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public void m29940d() {
            boolean z;
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            UnicastSubject unicastSubject = this.f65682l;
            int i = 1;
            while (!this.f65683m) {
                boolean z2 = this.done;
                Object poll = mpscLinkedQueue.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z3 = poll instanceof RunnableC11082a;
                if (z2 && (z || z3)) {
                    this.f65682l = null;
                    mpscLinkedQueue.clear();
                    m29941c();
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
                    RunnableC11082a runnableC11082a = (RunnableC11082a) poll;
                    if (this.f65676f || this.f65680j == runnableC11082a.f65685a) {
                        unicastSubject.onComplete();
                        this.f65679i = 0L;
                        unicastSubject = UnicastSubject.create(this.f65675e);
                        this.f65682l = unicastSubject;
                        observer.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(poll));
                    long j = this.f65679i + 1;
                    if (j >= this.f65677g) {
                        this.f65680j++;
                        this.f65679i = 0L;
                        unicastSubject.onComplete();
                        unicastSubject = UnicastSubject.create(this.f65675e);
                        this.f65682l = unicastSubject;
                        this.downstream.onNext(unicastSubject);
                        if (this.f65676f) {
                            Disposable disposable = (Disposable) this.f65684n.get();
                            disposable.dispose();
                            Scheduler.Worker worker = this.f65678h;
                            RunnableC11082a runnableC11082a2 = new RunnableC11082a(this.f65680j, this);
                            long j2 = this.f65672b;
                            Disposable schedulePeriodically = worker.schedulePeriodically(runnableC11082a2, j2, j2, this.f65673c);
                            if (!AbstractC17300An1.m69050a(this.f65684n, disposable, schedulePeriodically)) {
                                schedulePeriodically.dispose();
                            }
                        }
                    } else {
                        this.f65679i = j;
                    }
                }
            }
            this.f65681k.dispose();
            mpscLinkedQueue.clear();
            m29941c();
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
                m29940d();
            }
            this.downstream.onComplete();
            m29941c();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                m29940d();
            }
            this.downstream.onError(th2);
            m29941c();
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65683m) {
                return;
            }
            if (fastEnter()) {
                UnicastSubject unicastSubject = this.f65682l;
                unicastSubject.onNext(obj);
                long j = this.f65679i + 1;
                if (j >= this.f65677g) {
                    this.f65680j++;
                    this.f65679i = 0L;
                    unicastSubject.onComplete();
                    UnicastSubject create = UnicastSubject.create(this.f65675e);
                    this.f65682l = create;
                    this.downstream.onNext(create);
                    if (this.f65676f) {
                        ((Disposable) this.f65684n.get()).dispose();
                        Scheduler.Worker worker = this.f65678h;
                        RunnableC11082a runnableC11082a = new RunnableC11082a(this.f65680j, this);
                        long j2 = this.f65672b;
                        DisposableHelper.replace(this.f65684n, worker.schedulePeriodically(runnableC11082a, j2, j2, this.f65673c));
                    }
                } else {
                    this.f65679i = j;
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
            m29940d();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            Disposable schedulePeriodicallyDirect;
            if (DisposableHelper.validate(this.f65681k, disposable)) {
                this.f65681k = disposable;
                Observer<? super V> observer = this.downstream;
                observer.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastSubject create = UnicastSubject.create(this.f65675e);
                this.f65682l = create;
                observer.onNext(create);
                RunnableC11082a runnableC11082a = new RunnableC11082a(this.f65680j, this);
                if (this.f65676f) {
                    Scheduler.Worker worker = this.f65678h;
                    long j = this.f65672b;
                    schedulePeriodicallyDirect = worker.schedulePeriodically(runnableC11082a, j, j, this.f65673c);
                } else {
                    Scheduler scheduler = this.f65674d;
                    long j2 = this.f65672b;
                    schedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(runnableC11082a, j2, j2, this.f65673c);
                }
                DisposableHelper.replace(this.f65684n, schedulePeriodicallyDirect);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowTimed$b */
    /* loaded from: classes5.dex */
    public static final class RunnableC11083b extends QueueDrainObserver implements Observer, Disposable, Runnable {

        /* renamed from: j */
        public static final Object f65687j = new Object();

        /* renamed from: b */
        public final long f65688b;

        /* renamed from: c */
        public final TimeUnit f65689c;

        /* renamed from: d */
        public final Scheduler f65690d;

        /* renamed from: e */
        public final int f65691e;

        /* renamed from: f */
        public Disposable f65692f;

        /* renamed from: g */
        public UnicastSubject f65693g;

        /* renamed from: h */
        public final AtomicReference f65694h;

        /* renamed from: i */
        public volatile boolean f65695i;

        public RunnableC11083b(Observer observer, long j, TimeUnit timeUnit, Scheduler scheduler, int i) {
            super(observer, new MpscLinkedQueue());
            this.f65694h = new AtomicReference();
            this.f65688b = j;
            this.f65689c = timeUnit;
            this.f65690d = scheduler;
            this.f65691e = i;
        }

        /* renamed from: a */
        public void m29939a() {
            DisposableHelper.dispose(this.f65694h);
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
            r7.f65693g = null;
            r0.clear();
            m29939a();
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
        public void m29938b() {
            /*
                r7 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r7.queue
                io.reactivex.internal.queue.MpscLinkedQueue r0 = (io.reactivex.internal.queue.MpscLinkedQueue) r0
                io.reactivex.Observer<? super V> r1 = r7.downstream
                io.reactivex.subjects.UnicastSubject r2 = r7.f65693g
                r3 = 1
            L9:
                boolean r4 = r7.f65695i
                boolean r5 = r7.done
                java.lang.Object r6 = r0.poll()
                if (r5 == 0) goto L2e
                if (r6 == 0) goto L19
                java.lang.Object r5 = io.reactivex.internal.operators.observable.ObservableWindowTimed.RunnableC11083b.f65687j
                if (r6 != r5) goto L2e
            L19:
                r1 = 0
                r7.f65693g = r1
                r0.clear()
                r7.m29939a()
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
                java.lang.Object r5 = io.reactivex.internal.operators.observable.ObservableWindowTimed.RunnableC11083b.f65687j
                if (r6 != r5) goto L53
                r2.onComplete()
                if (r4 != 0) goto L4d
                int r2 = r7.f65691e
                io.reactivex.subjects.UnicastSubject r2 = io.reactivex.subjects.UnicastSubject.create(r2)
                r7.f65693g = r2
                r1.onNext(r2)
                goto L9
            L4d:
                io.reactivex.disposables.Disposable r4 = r7.f65692f
                r4.dispose()
                goto L9
            L53:
                java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.getValue(r6)
                r2.onNext(r4)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableWindowTimed.RunnableC11083b.m29938b():void");
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
                m29938b();
            }
            m29939a();
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                m29938b();
            }
            m29939a();
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65695i) {
                return;
            }
            if (fastEnter()) {
                this.f65693g.onNext(obj);
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(NotificationLite.next(obj));
                if (!enter()) {
                    return;
                }
            }
            m29938b();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65692f, disposable)) {
                this.f65692f = disposable;
                this.f65693g = UnicastSubject.create(this.f65691e);
                Observer<? super V> observer = this.downstream;
                observer.onSubscribe(this);
                observer.onNext(this.f65693g);
                if (!this.cancelled) {
                    Scheduler scheduler = this.f65690d;
                    long j = this.f65688b;
                    DisposableHelper.replace(this.f65694h, scheduler.schedulePeriodicallyDirect(this, j, j, this.f65689c));
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                this.f65695i = true;
                m29939a();
            }
            this.queue.offer(f65687j);
            if (enter()) {
                m29938b();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowTimed$c */
    /* loaded from: classes5.dex */
    public static final class RunnableC11084c extends QueueDrainObserver implements Disposable, Runnable {

        /* renamed from: b */
        public final long f65696b;

        /* renamed from: c */
        public final long f65697c;

        /* renamed from: d */
        public final TimeUnit f65698d;

        /* renamed from: e */
        public final Scheduler.Worker f65699e;

        /* renamed from: f */
        public final int f65700f;

        /* renamed from: g */
        public final List f65701g;

        /* renamed from: h */
        public Disposable f65702h;

        /* renamed from: i */
        public volatile boolean f65703i;

        /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowTimed$c$a */
        /* loaded from: classes5.dex */
        public final class RunnableC11085a implements Runnable {

            /* renamed from: a */
            public final UnicastSubject f65704a;

            public RunnableC11085a(UnicastSubject unicastSubject) {
                this.f65704a = unicastSubject;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC11084c.this.m29937a(this.f65704a);
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowTimed$c$b */
        /* loaded from: classes5.dex */
        public static final class C11086b {

            /* renamed from: a */
            public final UnicastSubject f65706a;

            /* renamed from: b */
            public final boolean f65707b;

            public C11086b(UnicastSubject unicastSubject, boolean z) {
                this.f65706a = unicastSubject;
                this.f65707b = z;
            }
        }

        public RunnableC11084c(Observer observer, long j, long j2, TimeUnit timeUnit, Scheduler.Worker worker, int i) {
            super(observer, new MpscLinkedQueue());
            this.f65696b = j;
            this.f65697c = j2;
            this.f65698d = timeUnit;
            this.f65699e = worker;
            this.f65700f = i;
            this.f65701g = new LinkedList();
        }

        /* renamed from: a */
        public void m29937a(UnicastSubject unicastSubject) {
            this.queue.offer(new C11086b(unicastSubject, false));
            if (enter()) {
                m29935c();
            }
        }

        /* renamed from: b */
        public void m29936b() {
            this.f65699e.dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public void m29935c() {
            boolean z;
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            List<UnicastSubject> list = this.f65701g;
            int i = 1;
            while (!this.f65703i) {
                boolean z2 = this.done;
                Object poll = mpscLinkedQueue.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z3 = poll instanceof C11086b;
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
                    m29936b();
                    list.clear();
                    return;
                } else if (z) {
                    i = leave(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    C11086b c11086b = (C11086b) poll;
                    if (c11086b.f65707b) {
                        if (!this.cancelled) {
                            UnicastSubject create = UnicastSubject.create(this.f65700f);
                            list.add(create);
                            observer.onNext(create);
                            this.f65699e.schedule(new RunnableC11085a(create), this.f65696b, this.f65698d);
                        }
                    } else {
                        list.remove(c11086b.f65706a);
                        c11086b.f65706a.onComplete();
                        if (list.isEmpty() && this.cancelled) {
                            this.f65703i = true;
                        }
                    }
                } else {
                    for (UnicastSubject unicastSubject3 : list) {
                        unicastSubject3.onNext(poll);
                    }
                }
            }
            this.f65702h.dispose();
            m29936b();
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
                m29935c();
            }
            this.downstream.onComplete();
            m29936b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                m29935c();
            }
            this.downstream.onError(th2);
            m29936b();
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (fastEnter()) {
                for (UnicastSubject unicastSubject : this.f65701g) {
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
            m29935c();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65702h, disposable)) {
                this.f65702h = disposable;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastSubject create = UnicastSubject.create(this.f65700f);
                this.f65701g.add(create);
                this.downstream.onNext(create);
                this.f65699e.schedule(new RunnableC11085a(create), this.f65696b, this.f65698d);
                Scheduler.Worker worker = this.f65699e;
                long j = this.f65697c;
                worker.schedulePeriodically(this, j, j, this.f65698d);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            C11086b c11086b = new C11086b(UnicastSubject.create(this.f65700f), true);
            if (!this.cancelled) {
                this.queue.offer(c11086b);
            }
            if (enter()) {
                m29935c();
            }
        }
    }

    public ObservableWindowTimed(ObservableSource<T> observableSource, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, long j3, int i, boolean z) {
        super(observableSource);
        this.f65665a = j;
        this.f65666b = j2;
        this.f65667c = timeUnit;
        this.f65668d = scheduler;
        this.f65669e = j3;
        this.f65670f = i;
        this.f65671g = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        long j = this.f65665a;
        long j2 = this.f65666b;
        if (j == j2) {
            long j3 = this.f65669e;
            if (j3 == Long.MAX_VALUE) {
                this.source.subscribe(new RunnableC11083b(serializedObserver, this.f65665a, this.f65667c, this.f65668d, this.f65670f));
                return;
            } else {
                this.source.subscribe(new C11081a(serializedObserver, j, this.f65667c, this.f65668d, this.f65670f, j3, this.f65671g));
                return;
            }
        }
        this.source.subscribe(new RunnableC11084c(serializedObserver, j, j2, this.f65667c, this.f65668d.createWorker(), this.f65670f));
    }
}
