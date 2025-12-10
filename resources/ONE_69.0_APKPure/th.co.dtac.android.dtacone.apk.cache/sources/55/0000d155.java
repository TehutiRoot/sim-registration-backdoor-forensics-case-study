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
import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class ObservableBufferExactBoundary<T, U extends Collection<? super T>, B> extends AbstractC11078a {

    /* renamed from: a */
    public final ObservableSource f65119a;

    /* renamed from: b */
    public final Callable f65120b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableBufferExactBoundary$a */
    /* loaded from: classes5.dex */
    public static final class C10959a extends DisposableObserver {

        /* renamed from: b */
        public final C10960b f65121b;

        public C10959a(C10960b c10960b) {
            this.f65121b = c10960b;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65121b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65121b.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65121b.m30326b();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableBufferExactBoundary$b */
    /* loaded from: classes5.dex */
    public static final class C10960b extends QueueDrainObserver implements Observer, Disposable {

        /* renamed from: b */
        public final Callable f65122b;

        /* renamed from: c */
        public final ObservableSource f65123c;

        /* renamed from: d */
        public Disposable f65124d;

        /* renamed from: e */
        public Disposable f65125e;

        /* renamed from: f */
        public Collection f65126f;

        public C10960b(Observer observer, Callable callable, ObservableSource observableSource) {
            super(observer, new MpscLinkedQueue());
            this.f65122b = callable;
            this.f65123c = observableSource;
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        /* renamed from: a */
        public void accept(Observer observer, Collection collection) {
            this.downstream.onNext(collection);
        }

        /* renamed from: b */
        public void m30326b() {
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.f65122b.call(), "The buffer supplied is null");
                synchronized (this) {
                    try {
                        Collection collection2 = this.f65126f;
                        if (collection2 == null) {
                            return;
                        }
                        this.f65126f = collection;
                        fastPathEmit(collection2, false, this);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                dispose();
                this.downstream.onError(th3);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.f65125e.dispose();
                this.f65124d.dispose();
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
                    Collection collection = this.f65126f;
                    if (collection == null) {
                        return;
                    }
                    this.f65126f = null;
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
                    Collection collection = this.f65126f;
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
            if (DisposableHelper.validate(this.f65124d, disposable)) {
                this.f65124d = disposable;
                try {
                    this.f65126f = (Collection) ObjectHelper.requireNonNull(this.f65122b.call(), "The buffer supplied is null");
                    C10959a c10959a = new C10959a(this);
                    this.f65125e = c10959a;
                    this.downstream.onSubscribe(this);
                    if (!this.cancelled) {
                        this.f65123c.subscribe(c10959a);
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.cancelled = true;
                    disposable.dispose();
                    EmptyDisposable.error(th2, this.downstream);
                }
            }
        }
    }

    public ObservableBufferExactBoundary(ObservableSource<T> observableSource, ObservableSource<B> observableSource2, Callable<U> callable) {
        super(observableSource);
        this.f65119a = observableSource2;
        this.f65120b = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        this.source.subscribe(new C10960b(new SerializedObserver(observer), this.f65120b, this.f65119a));
    }
}