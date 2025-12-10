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
public final class ObservableBufferExactBoundary<T, U extends Collection<? super T>, B> extends AbstractC11091a {

    /* renamed from: a */
    public final ObservableSource f65056a;

    /* renamed from: b */
    public final Callable f65057b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableBufferExactBoundary$a */
    /* loaded from: classes5.dex */
    public static final class C10972a extends DisposableObserver {

        /* renamed from: b */
        public final C10973b f65058b;

        public C10972a(C10973b c10973b) {
            this.f65058b = c10973b;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65058b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65058b.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65058b.m29986b();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableBufferExactBoundary$b */
    /* loaded from: classes5.dex */
    public static final class C10973b extends QueueDrainObserver implements Observer, Disposable {

        /* renamed from: b */
        public final Callable f65059b;

        /* renamed from: c */
        public final ObservableSource f65060c;

        /* renamed from: d */
        public Disposable f65061d;

        /* renamed from: e */
        public Disposable f65062e;

        /* renamed from: f */
        public Collection f65063f;

        public C10973b(Observer observer, Callable callable, ObservableSource observableSource) {
            super(observer, new MpscLinkedQueue());
            this.f65059b = callable;
            this.f65060c = observableSource;
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        /* renamed from: a */
        public void accept(Observer observer, Collection collection) {
            this.downstream.onNext(collection);
        }

        /* renamed from: b */
        public void m29986b() {
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.f65059b.call(), "The buffer supplied is null");
                synchronized (this) {
                    try {
                        Collection collection2 = this.f65063f;
                        if (collection2 == null) {
                            return;
                        }
                        this.f65063f = collection;
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
                this.f65062e.dispose();
                this.f65061d.dispose();
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
                    Collection collection = this.f65063f;
                    if (collection == null) {
                        return;
                    }
                    this.f65063f = null;
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
                    Collection collection = this.f65063f;
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
            if (DisposableHelper.validate(this.f65061d, disposable)) {
                this.f65061d = disposable;
                try {
                    this.f65063f = (Collection) ObjectHelper.requireNonNull(this.f65059b.call(), "The buffer supplied is null");
                    C10972a c10972a = new C10972a(this);
                    this.f65062e = c10972a;
                    this.downstream.onSubscribe(this);
                    if (!this.cancelled) {
                        this.f65060c.subscribe(c10972a);
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
        this.f65056a = observableSource2;
        this.f65057b = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        this.source.subscribe(new C10973b(new SerializedObserver(observer), this.f65057b, this.f65056a));
    }
}
