package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class ObservableSequenceEqual<T> extends Observable<Boolean> {

    /* renamed from: a */
    public final ObservableSource f65496a;

    /* renamed from: b */
    public final ObservableSource f65497b;

    /* renamed from: c */
    public final BiPredicate f65498c;

    /* renamed from: d */
    public final int f65499d;

    /* loaded from: classes5.dex */
    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = -6178010334400373240L;
        volatile boolean cancelled;
        final BiPredicate<? super T, ? super T> comparer;
        final Observer<? super Boolean> downstream;
        final ObservableSource<? extends T> first;
        final C11053a[] observers;
        final ArrayCompositeDisposable resources;
        final ObservableSource<? extends T> second;

        /* renamed from: v1 */
        T f65500v1;

        /* renamed from: v2 */
        T f65501v2;

        public EqualCoordinator(Observer<? super Boolean> observer, int i, ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate) {
            this.downstream = observer;
            this.first = observableSource;
            this.second = observableSource2;
            this.comparer = biPredicate;
            this.observers = r3;
            C11053a[] c11053aArr = {new C11053a(this, 0, i), new C11053a(this, 1, i)};
            this.resources = new ArrayCompositeDisposable(2);
        }

        public void cancel(SpscLinkedArrayQueue<T> spscLinkedArrayQueue, SpscLinkedArrayQueue<T> spscLinkedArrayQueue2) {
            this.cancelled = true;
            spscLinkedArrayQueue.clear();
            spscLinkedArrayQueue2.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.resources.dispose();
                if (getAndIncrement() == 0) {
                    C11053a[] c11053aArr = this.observers;
                    c11053aArr[0].f65503b.clear();
                    c11053aArr[1].f65503b.clear();
                }
            }
        }

        public void drain() {
            boolean z;
            boolean z2;
            Throwable th2;
            Throwable th3;
            if (getAndIncrement() != 0) {
                return;
            }
            C11053a[] c11053aArr = this.observers;
            C11053a c11053a = c11053aArr[0];
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = c11053a.f65503b;
            C11053a c11053a2 = c11053aArr[1];
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = c11053a2.f65503b;
            int i = 1;
            while (!this.cancelled) {
                boolean z3 = c11053a.f65505d;
                if (z3 && (th3 = c11053a.f65506e) != null) {
                    cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                    this.downstream.onError(th3);
                    return;
                }
                boolean z4 = c11053a2.f65505d;
                if (z4 && (th2 = c11053a2.f65506e) != null) {
                    cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                    this.downstream.onError(th2);
                    return;
                }
                if (this.f65500v1 == null) {
                    this.f65500v1 = spscLinkedArrayQueue.poll();
                }
                if (this.f65500v1 == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f65501v2 == null) {
                    this.f65501v2 = spscLinkedArrayQueue2.poll();
                }
                T t = this.f65501v2;
                if (t == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z3 && z4 && z && z2) {
                    this.downstream.onNext(Boolean.TRUE);
                    this.downstream.onComplete();
                    return;
                } else if (z3 && z4 && z != z2) {
                    cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                    this.downstream.onNext(Boolean.FALSE);
                    this.downstream.onComplete();
                    return;
                } else {
                    if (!z && !z2) {
                        try {
                            if (!this.comparer.test((T) this.f65500v1, t)) {
                                cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                                this.downstream.onNext(Boolean.FALSE);
                                this.downstream.onComplete();
                                return;
                            }
                            this.f65500v1 = null;
                            this.f65501v2 = null;
                        } catch (Throwable th4) {
                            Exceptions.throwIfFatal(th4);
                            cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                            this.downstream.onError(th4);
                            return;
                        }
                    }
                    if (z || z2) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
            }
            spscLinkedArrayQueue.clear();
            spscLinkedArrayQueue2.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        public boolean setDisposable(Disposable disposable, int i) {
            return this.resources.setResource(i, disposable);
        }

        public void subscribe() {
            C11053a[] c11053aArr = this.observers;
            this.first.subscribe(c11053aArr[0]);
            this.second.subscribe(c11053aArr[1]);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSequenceEqual$a */
    /* loaded from: classes5.dex */
    public static final class C11053a implements Observer {

        /* renamed from: a */
        public final EqualCoordinator f65502a;

        /* renamed from: b */
        public final SpscLinkedArrayQueue f65503b;

        /* renamed from: c */
        public final int f65504c;

        /* renamed from: d */
        public volatile boolean f65505d;

        /* renamed from: e */
        public Throwable f65506e;

        public C11053a(EqualCoordinator equalCoordinator, int i, int i2) {
            this.f65502a = equalCoordinator;
            this.f65504c = i;
            this.f65503b = new SpscLinkedArrayQueue(i2);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65505d = true;
            this.f65502a.drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65506e = th2;
            this.f65505d = true;
            this.f65502a.drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65503b.offer(obj);
            this.f65502a.drain();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f65502a.setDisposable(disposable, this.f65504c);
        }
    }

    public ObservableSequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate, int i) {
        this.f65496a = observableSource;
        this.f65497b = observableSource2;
        this.f65498c = biPredicate;
        this.f65499d = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Boolean> observer) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(observer, this.f65499d, this.f65496a, this.f65497b, this.f65498c);
        observer.onSubscribe(equalCoordinator);
        equalCoordinator.subscribe();
    }
}
