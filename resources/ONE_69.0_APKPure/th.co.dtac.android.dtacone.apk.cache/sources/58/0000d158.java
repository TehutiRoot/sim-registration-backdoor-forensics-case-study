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
public final class ObservableBufferTimed<T, U extends Collection<? super T>> extends AbstractC11078a {

    /* renamed from: a */
    public final long f65127a;

    /* renamed from: b */
    public final long f65128b;

    /* renamed from: c */
    public final TimeUnit f65129c;

    /* renamed from: d */
    public final Scheduler f65130d;

    /* renamed from: e */
    public final Callable f65131e;

    /* renamed from: f */
    public final int f65132f;

    /* renamed from: g */
    public final boolean f65133g;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableBufferTimed$a */
    /* loaded from: classes5.dex */
    public static final class RunnableC10961a extends QueueDrainObserver implements Runnable, Disposable {

        /* renamed from: b */
        public final Callable f65134b;

        /* renamed from: c */
        public final long f65135c;

        /* renamed from: d */
        public final TimeUnit f65136d;

        /* renamed from: e */
        public final int f65137e;

        /* renamed from: f */
        public final boolean f65138f;

        /* renamed from: g */
        public final Scheduler.Worker f65139g;

        /* renamed from: h */
        public Collection f65140h;

        /* renamed from: i */
        public Disposable f65141i;

        /* renamed from: j */
        public Disposable f65142j;

        /* renamed from: k */
        public long f65143k;

        /* renamed from: l */
        public long f65144l;

        public RunnableC10961a(Observer observer, Callable callable, long j, TimeUnit timeUnit, int i, boolean z, Scheduler.Worker worker) {
            super(observer, new MpscLinkedQueue());
            this.f65134b = callable;
            this.f65135c = j;
            this.f65136d = timeUnit;
            this.f65137e = i;
            this.f65138f = z;
            this.f65139g = worker;
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
                this.f65142j.dispose();
                this.f65139g.dispose();
                synchronized (this) {
                    this.f65140h = null;
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
            this.f65139g.dispose();
            synchronized (this) {
                collection = this.f65140h;
                this.f65140h = null;
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
                this.f65140h = null;
            }
            this.downstream.onError(th2);
            this.f65139g.dispose();
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            synchronized (this) {
                try {
                    Collection collection = this.f65140h;
                    if (collection == null) {
                        return;
                    }
                    collection.add(obj);
                    if (collection.size() < this.f65137e) {
                        return;
                    }
                    this.f65140h = null;
                    this.f65143k++;
                    if (this.f65138f) {
                        this.f65141i.dispose();
                    }
                    fastPathOrderedEmit(collection, false, this);
                    try {
                        Collection collection2 = (Collection) ObjectHelper.requireNonNull(this.f65134b.call(), "The buffer supplied is null");
                        synchronized (this) {
                            this.f65140h = collection2;
                            this.f65144l++;
                        }
                        if (this.f65138f) {
                            Scheduler.Worker worker = this.f65139g;
                            long j = this.f65135c;
                            this.f65141i = worker.schedulePeriodically(this, j, j, this.f65136d);
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
            if (DisposableHelper.validate(this.f65142j, disposable)) {
                this.f65142j = disposable;
                try {
                    this.f65140h = (Collection) ObjectHelper.requireNonNull(this.f65134b.call(), "The buffer supplied is null");
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker = this.f65139g;
                    long j = this.f65135c;
                    this.f65141i = worker.schedulePeriodically(this, j, j, this.f65136d);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    disposable.dispose();
                    EmptyDisposable.error(th2, this.downstream);
                    this.f65139g.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.f65134b.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    Collection collection2 = this.f65140h;
                    if (collection2 != null && this.f65143k == this.f65144l) {
                        this.f65140h = collection;
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
    public static final class RunnableC10962b extends QueueDrainObserver implements Runnable, Disposable {

        /* renamed from: b */
        public final Callable f65145b;

        /* renamed from: c */
        public final long f65146c;

        /* renamed from: d */
        public final TimeUnit f65147d;

        /* renamed from: e */
        public final Scheduler f65148e;

        /* renamed from: f */
        public Disposable f65149f;

        /* renamed from: g */
        public Collection f65150g;

        /* renamed from: h */
        public final AtomicReference f65151h;

        public RunnableC10962b(Observer observer, Callable callable, long j, TimeUnit timeUnit, Scheduler scheduler) {
            super(observer, new MpscLinkedQueue());
            this.f65151h = new AtomicReference();
            this.f65145b = callable;
            this.f65146c = j;
            this.f65147d = timeUnit;
            this.f65148e = scheduler;
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        /* renamed from: a */
        public void accept(Observer observer, Collection collection) {
            this.downstream.onNext(collection);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.f65151h);
            this.f65149f.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f65151h.get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            Collection collection;
            synchronized (this) {
                collection = this.f65150g;
                this.f65150g = null;
            }
            if (collection != null) {
                this.queue.offer(collection);
                this.done = true;
                if (enter()) {
                    QueueDrainHelper.drainLoop(this.queue, this.downstream, false, null, this);
                }
            }
            DisposableHelper.dispose(this.f65151h);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            synchronized (this) {
                this.f65150g = null;
            }
            this.downstream.onError(th2);
            DisposableHelper.dispose(this.f65151h);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            synchronized (this) {
                try {
                    Collection collection = this.f65150g;
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
            if (DisposableHelper.validate(this.f65149f, disposable)) {
                this.f65149f = disposable;
                try {
                    this.f65150g = (Collection) ObjectHelper.requireNonNull(this.f65145b.call(), "The buffer supplied is null");
                    this.downstream.onSubscribe(this);
                    if (!this.cancelled) {
                        Scheduler scheduler = this.f65148e;
                        long j = this.f65146c;
                        Disposable schedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(this, j, j, this.f65147d);
                        if (!AbstractC23094xo1.m479a(this.f65151h, null, schedulePeriodicallyDirect)) {
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
                Collection collection2 = (Collection) ObjectHelper.requireNonNull(this.f65145b.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    try {
                        collection = this.f65150g;
                        if (collection != null) {
                            this.f65150g = collection2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (collection == null) {
                    DisposableHelper.dispose(this.f65151h);
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
    public static final class RunnableC10963c extends QueueDrainObserver implements Runnable, Disposable {

        /* renamed from: b */
        public final Callable f65152b;

        /* renamed from: c */
        public final long f65153c;

        /* renamed from: d */
        public final long f65154d;

        /* renamed from: e */
        public final TimeUnit f65155e;

        /* renamed from: f */
        public final Scheduler.Worker f65156f;

        /* renamed from: g */
        public final List f65157g;

        /* renamed from: h */
        public Disposable f65158h;

        /* renamed from: io.reactivex.internal.operators.observable.ObservableBufferTimed$c$a */
        /* loaded from: classes5.dex */
        public final class RunnableC10964a implements Runnable {

            /* renamed from: a */
            public final Collection f65159a;

            public RunnableC10964a(Collection collection) {
                this.f65159a = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (RunnableC10963c.this) {
                    RunnableC10963c.this.f65157g.remove(this.f65159a);
                }
                RunnableC10963c runnableC10963c = RunnableC10963c.this;
                runnableC10963c.fastPathOrderedEmit(this.f65159a, false, runnableC10963c.f65156f);
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.ObservableBufferTimed$c$b */
        /* loaded from: classes5.dex */
        public final class RunnableC10965b implements Runnable {

            /* renamed from: a */
            public final Collection f65161a;

            public RunnableC10965b(Collection collection) {
                this.f65161a = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (RunnableC10963c.this) {
                    RunnableC10963c.this.f65157g.remove(this.f65161a);
                }
                RunnableC10963c runnableC10963c = RunnableC10963c.this;
                runnableC10963c.fastPathOrderedEmit(this.f65161a, false, runnableC10963c.f65156f);
            }
        }

        public RunnableC10963c(Observer observer, Callable callable, long j, long j2, TimeUnit timeUnit, Scheduler.Worker worker) {
            super(observer, new MpscLinkedQueue());
            this.f65152b = callable;
            this.f65153c = j;
            this.f65154d = j2;
            this.f65155e = timeUnit;
            this.f65156f = worker;
            this.f65157g = new LinkedList();
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        /* renamed from: a */
        public void accept(Observer observer, Collection collection) {
            observer.onNext(collection);
        }

        /* renamed from: d */
        public void m30320d() {
            synchronized (this) {
                this.f65157g.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                m30320d();
                this.f65158h.dispose();
                this.f65156f.dispose();
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
                arrayList = new ArrayList(this.f65157g);
                this.f65157g.clear();
            }
            for (Collection collection : arrayList) {
                this.queue.offer(collection);
            }
            this.done = true;
            if (enter()) {
                QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this.f65156f, this);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.done = true;
            m30320d();
            this.downstream.onError(th2);
            this.f65156f.dispose();
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            synchronized (this) {
                try {
                    for (Collection collection : this.f65157g) {
                        collection.add(obj);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65158h, disposable)) {
                this.f65158h = disposable;
                try {
                    Collection collection = (Collection) ObjectHelper.requireNonNull(this.f65152b.call(), "The buffer supplied is null");
                    this.f65157g.add(collection);
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker = this.f65156f;
                    long j = this.f65154d;
                    worker.schedulePeriodically(this, j, j, this.f65155e);
                    this.f65156f.schedule(new RunnableC10965b(collection), this.f65153c, this.f65155e);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    disposable.dispose();
                    EmptyDisposable.error(th2, this.downstream);
                    this.f65156f.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                return;
            }
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.f65152b.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    try {
                        if (this.cancelled) {
                            return;
                        }
                        this.f65157g.add(collection);
                        this.f65156f.schedule(new RunnableC10964a(collection), this.f65153c, this.f65155e);
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
        this.f65127a = j;
        this.f65128b = j2;
        this.f65129c = timeUnit;
        this.f65130d = scheduler;
        this.f65131e = callable;
        this.f65132f = i;
        this.f65133g = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        if (this.f65127a == this.f65128b && this.f65132f == Integer.MAX_VALUE) {
            this.source.subscribe(new RunnableC10962b(new SerializedObserver(observer), this.f65131e, this.f65127a, this.f65129c, this.f65130d));
            return;
        }
        Scheduler.Worker createWorker = this.f65130d.createWorker();
        if (this.f65127a == this.f65128b) {
            this.source.subscribe(new RunnableC10961a(new SerializedObserver(observer), this.f65131e, this.f65127a, this.f65129c, this.f65132f, this.f65133g, createWorker));
        } else {
            this.source.subscribe(new RunnableC10963c(new SerializedObserver(observer), this.f65131e, this.f65127a, this.f65128b, this.f65129c, createWorker));
        }
    }
}