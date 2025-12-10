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
public final class ObservableWindowBoundarySelector<T, B, V> extends AbstractC11091a {

    /* renamed from: a */
    public final ObservableSource f65643a;

    /* renamed from: b */
    public final Function f65644b;

    /* renamed from: c */
    public final int f65645c;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$a */
    /* loaded from: classes5.dex */
    public static final class C11076a extends DisposableObserver {

        /* renamed from: b */
        public final C11078c f65646b;

        /* renamed from: c */
        public final UnicastSubject f65647c;

        /* renamed from: d */
        public boolean f65648d;

        public C11076a(C11078c c11078c, UnicastSubject unicastSubject) {
            this.f65646b = c11078c;
            this.f65647c = unicastSubject;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65648d) {
                return;
            }
            this.f65648d = true;
            this.f65646b.m29948a(this);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65648d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65648d = true;
            this.f65646b.m29945d(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            dispose();
            onComplete();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$b */
    /* loaded from: classes5.dex */
    public static final class C11077b extends DisposableObserver {

        /* renamed from: b */
        public final C11078c f65649b;

        public C11077b(C11078c c11078c) {
            this.f65649b = c11078c;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65649b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65649b.m29945d(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65649b.m29944f(obj);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$c */
    /* loaded from: classes5.dex */
    public static final class C11078c extends QueueDrainObserver implements Disposable {

        /* renamed from: b */
        public final ObservableSource f65650b;

        /* renamed from: c */
        public final Function f65651c;

        /* renamed from: d */
        public final int f65652d;

        /* renamed from: e */
        public final CompositeDisposable f65653e;

        /* renamed from: f */
        public Disposable f65654f;

        /* renamed from: g */
        public final AtomicReference f65655g;

        /* renamed from: h */
        public final List f65656h;

        /* renamed from: i */
        public final AtomicLong f65657i;

        /* renamed from: j */
        public final AtomicBoolean f65658j;

        public C11078c(Observer observer, ObservableSource observableSource, Function function, int i) {
            super(observer, new MpscLinkedQueue());
            this.f65655g = new AtomicReference();
            AtomicLong atomicLong = new AtomicLong();
            this.f65657i = atomicLong;
            this.f65658j = new AtomicBoolean();
            this.f65650b = observableSource;
            this.f65651c = function;
            this.f65652d = i;
            this.f65653e = new CompositeDisposable();
            this.f65656h = new ArrayList();
            atomicLong.lazySet(1L);
        }

        /* renamed from: a */
        public void m29948a(C11076a c11076a) {
            this.f65653e.delete(c11076a);
            this.queue.offer(new C11079d(c11076a.f65647c, null));
            if (enter()) {
                m29946c();
            }
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public void accept(Observer observer, Object obj) {
        }

        /* renamed from: b */
        public void m29947b() {
            this.f65653e.dispose();
            DisposableHelper.dispose(this.f65655g);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public void m29946c() {
            boolean z;
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            List<UnicastSubject> list = this.f65656h;
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
                    m29947b();
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
                } else if (poll instanceof C11079d) {
                    C11079d c11079d = (C11079d) poll;
                    UnicastSubject unicastSubject3 = c11079d.f65659a;
                    if (unicastSubject3 != null) {
                        if (list.remove(unicastSubject3)) {
                            c11079d.f65659a.onComplete();
                            if (this.f65657i.decrementAndGet() == 0) {
                                m29947b();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f65658j.get()) {
                        UnicastSubject create = UnicastSubject.create(this.f65652d);
                        list.add(create);
                        observer.onNext(create);
                        try {
                            ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f65651c.apply(c11079d.f65660b), "The ObservableSource supplied is null");
                            C11076a c11076a = new C11076a(this, create);
                            if (this.f65653e.add(c11076a)) {
                                this.f65657i.getAndIncrement();
                                observableSource.subscribe(c11076a);
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            this.f65658j.set(true);
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
        public void m29945d(Throwable th2) {
            this.f65654f.dispose();
            this.f65653e.dispose();
            onError(th2);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.f65658j.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.f65655g);
                if (this.f65657i.decrementAndGet() == 0) {
                    this.f65654f.dispose();
                }
            }
        }

        /* renamed from: f */
        public void m29944f(Object obj) {
            this.queue.offer(new C11079d(null, obj));
            if (enter()) {
                m29946c();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65658j.get();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            if (enter()) {
                m29946c();
            }
            if (this.f65657i.decrementAndGet() == 0) {
                this.f65653e.dispose();
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
                m29946c();
            }
            if (this.f65657i.decrementAndGet() == 0) {
                this.f65653e.dispose();
            }
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (fastEnter()) {
                for (UnicastSubject unicastSubject : this.f65656h) {
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
            m29946c();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65654f, disposable)) {
                this.f65654f = disposable;
                this.downstream.onSubscribe(this);
                if (this.f65658j.get()) {
                    return;
                }
                C11077b c11077b = new C11077b(this);
                if (AbstractC17300An1.m69050a(this.f65655g, null, c11077b)) {
                    this.f65650b.subscribe(c11077b);
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector$d */
    /* loaded from: classes5.dex */
    public static final class C11079d {

        /* renamed from: a */
        public final UnicastSubject f65659a;

        /* renamed from: b */
        public final Object f65660b;

        public C11079d(UnicastSubject unicastSubject, Object obj) {
            this.f65659a = unicastSubject;
            this.f65660b = obj;
        }
    }

    public ObservableWindowBoundarySelector(ObservableSource<T> observableSource, ObservableSource<B> observableSource2, Function<? super B, ? extends ObservableSource<V>> function, int i) {
        super(observableSource);
        this.f65643a = observableSource2;
        this.f65644b = function;
        this.f65645c = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        this.source.subscribe(new C11078c(new SerializedObserver(observer), this.f65643a, this.f65644b, this.f65645c));
    }
}
