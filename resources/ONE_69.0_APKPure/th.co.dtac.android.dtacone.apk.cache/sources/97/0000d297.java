package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ObservableWindowBoundarySelector<T, B, V> extends AbstractC11078a {

    /* renamed from: a */
    public final ObservableSource f65706a;

    /* renamed from: b */
    public final Function f65707b;

    /* renamed from: c */
    public final int f65708c;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$a */
    /* loaded from: classes5.dex */
    public static final class C11063a extends DisposableObserver {

        /* renamed from: b */
        public final C11065c f65709b;

        /* renamed from: c */
        public final UnicastSubject f65710c;

        /* renamed from: d */
        public boolean f65711d;

        public C11063a(C11065c c11065c, UnicastSubject unicastSubject) {
            this.f65709b = c11065c;
            this.f65710c = unicastSubject;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65711d) {
                return;
            }
            this.f65711d = true;
            this.f65709b.m30288a(this);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65711d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65711d = true;
            this.f65709b.m30285d(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            dispose();
            onComplete();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$b */
    /* loaded from: classes5.dex */
    public static final class C11064b extends DisposableObserver {

        /* renamed from: b */
        public final C11065c f65712b;

        public C11064b(C11065c c11065c) {
            this.f65712b = c11065c;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65712b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65712b.m30285d(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65712b.m30284f(obj);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$c */
    /* loaded from: classes5.dex */
    public static final class C11065c extends QueueDrainObserver implements Disposable {

        /* renamed from: b */
        public final ObservableSource f65713b;

        /* renamed from: c */
        public final Function f65714c;

        /* renamed from: d */
        public final int f65715d;

        /* renamed from: e */
        public final CompositeDisposable f65716e;

        /* renamed from: f */
        public Disposable f65717f;

        /* renamed from: g */
        public final AtomicReference f65718g;

        /* renamed from: h */
        public final List f65719h;

        /* renamed from: i */
        public final AtomicLong f65720i;

        /* renamed from: j */
        public final AtomicBoolean f65721j;

        public C11065c(Observer observer, ObservableSource observableSource, Function function, int i) {
            super(observer, new MpscLinkedQueue());
            this.f65718g = new AtomicReference();
            AtomicLong atomicLong = new AtomicLong();
            this.f65720i = atomicLong;
            this.f65721j = new AtomicBoolean();
            this.f65713b = observableSource;
            this.f65714c = function;
            this.f65715d = i;
            this.f65716e = new CompositeDisposable();
            this.f65719h = new ArrayList();
            atomicLong.lazySet(1L);
        }

        /* renamed from: a */
        public void m30288a(C11063a c11063a) {
            this.f65716e.delete(c11063a);
            this.queue.offer(new C11066d(c11063a.f65710c, null));
            if (enter()) {
                m30286c();
            }
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public void accept(Observer observer, Object obj) {
        }

        /* renamed from: b */
        public void m30287b() {
            this.f65716e.dispose();
            DisposableHelper.dispose(this.f65718g);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public void m30286c() {
            boolean z;
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            List<UnicastSubject> list = this.f65719h;
            int i = 1;
            while (true) {
                boolean z2 = this.done;
                Object poll = mpscLinkedQueue.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2 && z) {
                    m30287b();
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
                    list.clear();
                    return;
                } else if (z) {
                    i = leave(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (poll instanceof C11066d) {
                    C11066d c11066d = (C11066d) poll;
                    UnicastSubject unicastSubject3 = c11066d.f65722a;
                    if (unicastSubject3 != null) {
                        if (list.remove(unicastSubject3)) {
                            c11066d.f65722a.onComplete();
                            if (this.f65720i.decrementAndGet() == 0) {
                                m30287b();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f65721j.get()) {
                        UnicastSubject create = UnicastSubject.create(this.f65715d);
                        list.add(create);
                        observer.onNext(create);
                        try {
                            ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f65714c.apply(c11066d.f65723b), "The ObservableSource supplied is null");
                            C11063a c11063a = new C11063a(this, create);
                            if (this.f65716e.add(c11063a)) {
                                this.f65720i.getAndIncrement();
                                observableSource.subscribe(c11063a);
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            this.f65721j.set(true);
                            observer.onError(th3);
                        }
                    }
                } else {
                    for (UnicastSubject unicastSubject4 : list) {
                        unicastSubject4.onNext(NotificationLite.getValue(poll));
                    }
                }
            }
        }

        /* renamed from: d */
        public void m30285d(Throwable th2) {
            this.f65717f.dispose();
            this.f65716e.dispose();
            onError(th2);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.f65721j.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.f65718g);
                if (this.f65720i.decrementAndGet() == 0) {
                    this.f65717f.dispose();
                }
            }
        }

        /* renamed from: f */
        public void m30284f(Object obj) {
            this.queue.offer(new C11066d(null, obj));
            if (enter()) {
                m30286c();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65721j.get();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            if (enter()) {
                m30286c();
            }
            if (this.f65720i.decrementAndGet() == 0) {
                this.f65716e.dispose();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.error = th2;
            this.done = true;
            if (enter()) {
                m30286c();
            }
            if (this.f65720i.decrementAndGet() == 0) {
                this.f65716e.dispose();
            }
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (fastEnter()) {
                for (UnicastSubject unicastSubject : this.f65719h) {
                    unicastSubject.onNext(obj);
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
            m30286c();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65717f, disposable)) {
                this.f65717f = disposable;
                this.downstream.onSubscribe(this);
                if (this.f65721j.get()) {
                    return;
                }
                C11064b c11064b = new C11064b(this);
                if (AbstractC23094xo1.m479a(this.f65718g, null, c11064b)) {
                    this.f65713b.subscribe(c11064b);
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$d */
    /* loaded from: classes5.dex */
    public static final class C11066d {

        /* renamed from: a */
        public final UnicastSubject f65722a;

        /* renamed from: b */
        public final Object f65723b;

        public C11066d(UnicastSubject unicastSubject, Object obj) {
            this.f65722a = unicastSubject;
            this.f65723b = obj;
        }
    }

    public ObservableWindowBoundarySelector(ObservableSource<T> observableSource, ObservableSource<B> observableSource2, Function<? super B, ? extends ObservableSource<V>> function, int i) {
        super(observableSource);
        this.f65706a = observableSource2;
        this.f65707b = function;
        this.f65708c = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        this.source.subscribe(new C11065c(new SerializedObserver(observer), this.f65706a, this.f65707b, this.f65708c));
    }
}