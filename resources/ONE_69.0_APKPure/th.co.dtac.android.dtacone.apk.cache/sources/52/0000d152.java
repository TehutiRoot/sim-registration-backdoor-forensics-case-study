package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ObservableBufferBoundarySupplier<T, U extends Collection<? super T>, B> extends AbstractC11078a {

    /* renamed from: a */
    public final Callable f65110a;

    /* renamed from: b */
    public final Callable f65111b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier$a */
    /* loaded from: classes5.dex */
    public static final class C10957a extends DisposableObserver {

        /* renamed from: b */
        public final C10958b f65112b;

        /* renamed from: c */
        public boolean f65113c;

        public C10957a(C10958b c10958b) {
            this.f65112b = c10958b;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65113c) {
                return;
            }
            this.f65113c = true;
            this.f65112b.m30328c();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65113c) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65113c = true;
            this.f65112b.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65113c) {
                return;
            }
            this.f65113c = true;
            dispose();
            this.f65112b.m30328c();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier$b */
    /* loaded from: classes5.dex */
    public static final class C10958b extends QueueDrainObserver implements Observer, Disposable {

        /* renamed from: b */
        public final Callable f65114b;

        /* renamed from: c */
        public final Callable f65115c;

        /* renamed from: d */
        public Disposable f65116d;

        /* renamed from: e */
        public final AtomicReference f65117e;

        /* renamed from: f */
        public Collection f65118f;

        public C10958b(Observer observer, Callable callable, Callable callable2) {
            super(observer, new MpscLinkedQueue());
            this.f65117e = new AtomicReference();
            this.f65114b = callable;
            this.f65115c = callable2;
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        /* renamed from: a */
        public void accept(Observer observer, Collection collection) {
            this.downstream.onNext(collection);
        }

        /* renamed from: b */
        public void m30329b() {
            DisposableHelper.dispose(this.f65117e);
        }

        /* renamed from: c */
        public void m30328c() {
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.f65114b.call(), "The buffer supplied is null");
                try {
                    ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f65115c.call(), "The boundary ObservableSource supplied is null");
                    C10957a c10957a = new C10957a(this);
                    if (DisposableHelper.replace(this.f65117e, c10957a)) {
                        synchronized (this) {
                            try {
                                Collection collection2 = this.f65118f;
                                if (collection2 == null) {
                                    return;
                                }
                                this.f65118f = collection;
                                observableSource.subscribe(c10957a);
                                fastPathEmit(collection2, false, this);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    this.cancelled = true;
                    this.f65116d.dispose();
                    this.downstream.onError(th3);
                }
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                dispose();
                this.downstream.onError(th4);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.f65116d.dispose();
                m30329b();
                if (enter()) {
                    this.queue.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            synchronized (this) {
                try {
                    Collection collection = this.f65118f;
                    if (collection == null) {
                        return;
                    }
                    this.f65118f = null;
                    this.queue.offer(collection);
                    this.done = true;
                    if (enter()) {
                        QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            dispose();
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            synchronized (this) {
                try {
                    Collection collection = this.f65118f;
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
            if (DisposableHelper.validate(this.f65116d, disposable)) {
                this.f65116d = disposable;
                Observer<? super V> observer = this.downstream;
                try {
                    this.f65118f = (Collection) ObjectHelper.requireNonNull(this.f65114b.call(), "The buffer supplied is null");
                    try {
                        ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f65115c.call(), "The boundary ObservableSource supplied is null");
                        C10957a c10957a = new C10957a(this);
                        this.f65117e.set(c10957a);
                        observer.onSubscribe(this);
                        if (!this.cancelled) {
                            observableSource.subscribe(c10957a);
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.cancelled = true;
                        disposable.dispose();
                        EmptyDisposable.error(th2, observer);
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    this.cancelled = true;
                    disposable.dispose();
                    EmptyDisposable.error(th3, observer);
                }
            }
        }
    }

    public ObservableBufferBoundarySupplier(ObservableSource<T> observableSource, Callable<? extends ObservableSource<B>> callable, Callable<U> callable2) {
        super(observableSource);
        this.f65110a = callable;
        this.f65111b = callable2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        this.source.subscribe(new C10958b(new SerializedObserver(observer), this.f65111b, this.f65110a));
    }
}