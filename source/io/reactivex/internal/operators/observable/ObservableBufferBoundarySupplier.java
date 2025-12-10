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
public final class ObservableBufferBoundarySupplier<T, U extends Collection<? super T>, B> extends AbstractC11091a {

    /* renamed from: a */
    public final Callable f65047a;

    /* renamed from: b */
    public final Callable f65048b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier$a */
    /* loaded from: classes5.dex */
    public static final class C10970a extends DisposableObserver {

        /* renamed from: b */
        public final C10971b f65049b;

        /* renamed from: c */
        public boolean f65050c;

        public C10970a(C10971b c10971b) {
            this.f65049b = c10971b;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65050c) {
                return;
            }
            this.f65050c = true;
            this.f65049b.m29988c();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65050c) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65050c = true;
            this.f65049b.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65050c) {
                return;
            }
            this.f65050c = true;
            dispose();
            this.f65049b.m29988c();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier$b */
    /* loaded from: classes5.dex */
    public static final class C10971b extends QueueDrainObserver implements Observer, Disposable {

        /* renamed from: b */
        public final Callable f65051b;

        /* renamed from: c */
        public final Callable f65052c;

        /* renamed from: d */
        public Disposable f65053d;

        /* renamed from: e */
        public final AtomicReference f65054e;

        /* renamed from: f */
        public Collection f65055f;

        public C10971b(Observer observer, Callable callable, Callable callable2) {
            super(observer, new MpscLinkedQueue());
            this.f65054e = new AtomicReference();
            this.f65051b = callable;
            this.f65052c = callable2;
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        /* renamed from: a */
        public void accept(Observer observer, Collection collection) {
            this.downstream.onNext(collection);
        }

        /* renamed from: b */
        public void m29989b() {
            DisposableHelper.dispose(this.f65054e);
        }

        /* renamed from: c */
        public void m29988c() {
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.f65051b.call(), "The buffer supplied is null");
                try {
                    ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f65052c.call(), "The boundary ObservableSource supplied is null");
                    C10970a c10970a = new C10970a(this);
                    if (DisposableHelper.replace(this.f65054e, c10970a)) {
                        synchronized (this) {
                            try {
                                Collection collection2 = this.f65055f;
                                if (collection2 == null) {
                                    return;
                                }
                                this.f65055f = collection;
                                observableSource.subscribe(c10970a);
                                fastPathEmit(collection2, false, this);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    this.cancelled = true;
                    this.f65053d.dispose();
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
                this.f65053d.dispose();
                m29989b();
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
                    Collection collection = this.f65055f;
                    if (collection == null) {
                        return;
                    }
                    this.f65055f = null;
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
                    Collection collection = this.f65055f;
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
            if (DisposableHelper.validate(this.f65053d, disposable)) {
                this.f65053d = disposable;
                Observer<? super V> observer = this.downstream;
                try {
                    this.f65055f = (Collection) ObjectHelper.requireNonNull(this.f65051b.call(), "The buffer supplied is null");
                    try {
                        ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f65052c.call(), "The boundary ObservableSource supplied is null");
                        C10970a c10970a = new C10970a(this);
                        this.f65054e.set(c10970a);
                        observer.onSubscribe(this);
                        if (!this.cancelled) {
                            observableSource.subscribe(c10970a);
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
        this.f65047a = callable;
        this.f65048b = callable2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        this.source.subscribe(new C10971b(new SerializedObserver(observer), this.f65048b, this.f65047a));
    }
}
