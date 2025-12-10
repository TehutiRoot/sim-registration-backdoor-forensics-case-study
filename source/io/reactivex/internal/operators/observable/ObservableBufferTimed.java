package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ObservableBufferTimed<T, U extends Collection<? super T>> extends AbstractC11091a {

    /* renamed from: a */
    public final long f65064a;

    /* renamed from: b */
    public final long f65065b;

    /* renamed from: c */
    public final TimeUnit f65066c;

    /* renamed from: d */
    public final Scheduler f65067d;

    /* renamed from: e */
    public final Callable f65068e;

    /* renamed from: f */
    public final int f65069f;

    /* renamed from: g */
    public final boolean f65070g;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableBufferTimed$a */
    /* loaded from: classes5.dex */
    public static final class RunnableC10974a extends QueueDrainObserver implements Runnable, Disposable {

        /* renamed from: b */
        public final Callable f65071b;

        /* renamed from: c */
        public final long f65072c;

        /* renamed from: d */
        public final TimeUnit f65073d;

        /* renamed from: e */
        public final int f65074e;

        /* renamed from: f */
        public final boolean f65075f;

        /* renamed from: g */
        public final Scheduler.Worker f65076g;

        /* renamed from: h */
        public Collection f65077h;

        /* renamed from: i */
        public Disposable f65078i;

        /* renamed from: j */
        public Disposable f65079j;

        /* renamed from: k */
        public long f65080k;

        /* renamed from: l */
        public long f65081l;

        public RunnableC10974a(Observer observer, Callable callable, long j, TimeUnit timeUnit, int i, boolean z, Scheduler.Worker worker) {
            super(observer, new MpscLinkedQueue());
            this.f65071b = callable;
            this.f65072c = j;
            this.f65073d = timeUnit;
            this.f65074e = i;
            this.f65075f = z;
            this.f65076g = worker;
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        /* renamed from: a */
        public void accept(Observer observer, Collection collection) {
            observer.onNext(collection);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.f65079j.dispose();
                this.f65076g.dispose();
                synchronized (this) {
                    this.f65077h = null;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            Collection collection;
            this.f65076g.dispose();
            synchronized (this) {
                collection = this.f65077h;
                this.f65077h = null;
            }
            if (collection != null) {
                this.queue.offer(collection);
                this.done = true;
                if (enter()) {
                    QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this, this);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            synchronized (this) {
                this.f65077h = null;
            }
            this.downstream.onError(th2);
            this.f65076g.dispose();
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            synchronized (this) {
                try {
                    Collection collection = this.f65077h;
                    if (collection == null) {
                        return;
                    }
                    collection.add(obj);
                    if (collection.size() < this.f65074e) {
                        return;
                    }
                    this.f65077h = null;
                    this.f65080k++;
                    if (this.f65075f) {
                        this.f65078i.dispose();
                    }
                    fastPathOrderedEmit(collection, false, this);
                    try {
                        Collection collection2 = (Collection) ObjectHelper.requireNonNull(this.f65071b.call(), "The buffer supplied is null");
                        synchronized (this) {
                            this.f65077h = collection2;
                            this.f65081l++;
                        }
                        if (this.f65075f) {
                            Scheduler.Worker worker = this.f65076g;
                            long j = this.f65072c;
                            this.f65078i = worker.schedulePeriodically(this, j, j, this.f65073d);
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.downstream.onError(th2);
                        dispose();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65079j, disposable)) {
                this.f65079j = disposable;
                try {
                    this.f65077h = (Collection) ObjectHelper.requireNonNull(this.f65071b.call(), "The buffer supplied is null");
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker = this.f65076g;
                    long j = this.f65072c;
                    this.f65078i = worker.schedulePeriodically(this, j, j, this.f65073d);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    disposable.dispose();
                    EmptyDisposable.error(th2, this.downstream);
                    this.f65076g.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.f65071b.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    Collection collection2 = this.f65077h;
                    if (collection2 != null && this.f65080k == this.f65081l) {
                        this.f65077h = collection;
                        fastPathOrderedEmit(collection2, false, this);
                    }
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                dispose();
                this.downstream.onError(th2);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableBufferTimed$b */
    /* loaded from: classes5.dex */
    public static final class RunnableC10975b extends QueueDrainObserver implements Runnable, Disposable {

        /* renamed from: b */
        public final Callable f65082b;

        /* renamed from: c */
        public final long f65083c;

        /* renamed from: d */
        public final TimeUnit f65084d;

        /* renamed from: e */
        public final Scheduler f65085e;

        /* renamed from: f */
        public Disposable f65086f;

        /* renamed from: g */
        public Collection f65087g;

        /* renamed from: h */
        public final AtomicReference f65088h;

        public RunnableC10975b(Observer observer, Callable callable, long j, TimeUnit timeUnit, Scheduler scheduler) {
            super(observer, new MpscLinkedQueue());
            this.f65088h = new AtomicReference();
            this.f65082b = callable;
            this.f65083c = j;
            this.f65084d = timeUnit;
            this.f65085e = scheduler;
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        /* renamed from: a */
        public void accept(Observer observer, Collection collection) {
            this.downstream.onNext(collection);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.f65088h);
            this.f65086f.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f65088h.get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            Collection collection;
            synchronized (this) {
                collection = this.f65087g;
                this.f65087g = null;
            }
            if (collection != null) {
                this.queue.offer(collection);
                this.done = true;
                if (enter()) {
                    QueueDrainHelper.drainLoop(this.queue, this.downstream, false, null, this);
                }
            }
            DisposableHelper.dispose(this.f65088h);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            synchronized (this) {
                this.f65087g = null;
            }
            this.downstream.onError(th2);
            DisposableHelper.dispose(this.f65088h);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            synchronized (this) {
                try {
                    Collection collection = this.f65087g;
                    if (collection == null) {
                        return;
                    }
                    collection.add(obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65086f, disposable)) {
                this.f65086f = disposable;
                try {
                    this.f65087g = (Collection) ObjectHelper.requireNonNull(this.f65082b.call(), "The buffer supplied is null");
                    this.downstream.onSubscribe(this);
                    if (!this.cancelled) {
                        Scheduler scheduler = this.f65085e;
                        long j = this.f65083c;
                        Disposable schedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(this, j, j, this.f65084d);
                        if (!AbstractC17300An1.m69050a(this.f65088h, null, schedulePeriodicallyDirect)) {
                            schedulePeriodicallyDirect.dispose();
                        }
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    dispose();
                    EmptyDisposable.error(th2, this.downstream);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Collection collection;
            try {
                Collection collection2 = (Collection) ObjectHelper.requireNonNull(this.f65082b.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    try {
                        collection = this.f65087g;
                        if (collection != null) {
                            this.f65087g = collection2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (collection == null) {
                    DisposableHelper.dispose(this.f65088h);
                } else {
                    fastPathEmit(collection, false, this);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(th3);
                dispose();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableBufferTimed$c */
    /* loaded from: classes5.dex */
    public static final class RunnableC10976c extends QueueDrainObserver implements Runnable, Disposable {

        /* renamed from: b */
        public final Callable f65089b;

        /* renamed from: c */
        public final long f65090c;

        /* renamed from: d */
        public final long f65091d;

        /* renamed from: e */
        public final TimeUnit f65092e;

        /* renamed from: f */
        public final Scheduler.Worker f65093f;

        /* renamed from: g */
        public final List f65094g;

        /* renamed from: h */
        public Disposable f65095h;

        /* renamed from: io.reactivex.internal.operators.observable.ObservableBufferTimed$c$a */
        /* loaded from: classes5.dex */
        public final class RunnableC10977a implements Runnable {

            /* renamed from: a */
            public final Collection f65096a;

            public RunnableC10977a(Collection collection) {
                this.f65096a = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (RunnableC10976c.this) {
                    RunnableC10976c.this.f65094g.remove(this.f65096a);
                }
                RunnableC10976c runnableC10976c = RunnableC10976c.this;
                runnableC10976c.fastPathOrderedEmit(this.f65096a, false, runnableC10976c.f65093f);
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.ObservableBufferTimed$c$b */
        /* loaded from: classes5.dex */
        public final class RunnableC10978b implements Runnable {

            /* renamed from: a */
            public final Collection f65098a;

            public RunnableC10978b(Collection collection) {
                this.f65098a = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (RunnableC10976c.this) {
                    RunnableC10976c.this.f65094g.remove(this.f65098a);
                }
                RunnableC10976c runnableC10976c = RunnableC10976c.this;
                runnableC10976c.fastPathOrderedEmit(this.f65098a, false, runnableC10976c.f65093f);
            }
        }

        public RunnableC10976c(Observer observer, Callable callable, long j, long j2, TimeUnit timeUnit, Scheduler.Worker worker) {
            super(observer, new MpscLinkedQueue());
            this.f65089b = callable;
            this.f65090c = j;
            this.f65091d = j2;
            this.f65092e = timeUnit;
            this.f65093f = worker;
            this.f65094g = new LinkedList();
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        /* renamed from: a */
        public void accept(Observer observer, Collection collection) {
            observer.onNext(collection);
        }

        /* renamed from: d */
        public void m29980d() {
            synchronized (this) {
                this.f65094g.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                m29980d();
                this.f65095h.dispose();
                this.f65093f.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            ArrayList<Collection> arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f65094g);
                this.f65094g.clear();
            }
            for (Collection collection : arrayList) {
                this.queue.offer(collection);
            }
            this.done = true;
            if (enter()) {
                QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this.f65093f, this);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.done = true;
            m29980d();
            this.downstream.onError(th2);
            this.f65093f.dispose();
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            synchronized (this) {
                try {
                    for (Collection collection : this.f65094g) {
                        collection.add(obj);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65095h, disposable)) {
                this.f65095h = disposable;
                try {
                    Collection collection = (Collection) ObjectHelper.requireNonNull(this.f65089b.call(), "The buffer supplied is null");
                    this.f65094g.add(collection);
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker = this.f65093f;
                    long j = this.f65091d;
                    worker.schedulePeriodically(this, j, j, this.f65092e);
                    this.f65093f.schedule(new RunnableC10978b(collection), this.f65090c, this.f65092e);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    disposable.dispose();
                    EmptyDisposable.error(th2, this.downstream);
                    this.f65093f.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                return;
            }
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.f65089b.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    try {
                        if (this.cancelled) {
                            return;
                        }
                        this.f65094g.add(collection);
                        this.f65093f.schedule(new RunnableC10977a(collection), this.f65090c, this.f65092e);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(th3);
                dispose();
            }
        }
    }

    public ObservableBufferTimed(ObservableSource<T> observableSource, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, Callable<U> callable, int i, boolean z) {
        super(observableSource);
        this.f65064a = j;
        this.f65065b = j2;
        this.f65066c = timeUnit;
        this.f65067d = scheduler;
        this.f65068e = callable;
        this.f65069f = i;
        this.f65070g = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        if (this.f65064a == this.f65065b && this.f65069f == Integer.MAX_VALUE) {
            this.source.subscribe(new RunnableC10975b(new SerializedObserver(observer), this.f65068e, this.f65064a, this.f65066c, this.f65067d));
            return;
        }
        Scheduler.Worker createWorker = this.f65067d.createWorker();
        if (this.f65064a == this.f65065b) {
            this.source.subscribe(new RunnableC10974a(new SerializedObserver(observer), this.f65068e, this.f65064a, this.f65066c, this.f65069f, this.f65070g, createWorker));
        } else {
            this.source.subscribe(new RunnableC10976c(new SerializedObserver(observer), this.f65068e, this.f65064a, this.f65065b, this.f65066c, createWorker));
        }
    }
}
