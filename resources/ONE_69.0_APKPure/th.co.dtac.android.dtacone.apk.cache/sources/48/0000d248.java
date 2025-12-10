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
    public final ObservableSource f65559a;

    /* renamed from: b */
    public final ObservableSource f65560b;

    /* renamed from: c */
    public final BiPredicate f65561c;

    /* renamed from: d */
    public final int f65562d;

    /* loaded from: classes5.dex */
    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = -6178010334400373240L;
        volatile boolean cancelled;
        final BiPredicate<? super T, ? super T> comparer;
        final Observer<? super Boolean> downstream;
        final ObservableSource<? extends T> first;
        final C11040a[] observers;
        final ArrayCompositeDisposable resources;
        final ObservableSource<? extends T> second;

        /* renamed from: v1 */
        T f65563v1;

        /* renamed from: v2 */
        T f65564v2;

        public EqualCoordinator(Observer<? super Boolean> observer, int i, ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate) {
            this.downstream = observer;
            this.first = observableSource;
            this.second = observableSource2;
            this.comparer = biPredicate;
            this.observers = r3;
            C11040a[] c11040aArr = {new C11040a(this, 0, i), new C11040a(this, 1, i)};
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
                    C11040a[] c11040aArr = this.observers;
                    c11040aArr[0].f65566b.clear();
                    c11040aArr[1].f65566b.clear();
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
            C11040a[] c11040aArr = this.observers;
            C11040a c11040a = c11040aArr[0];
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = c11040a.f65566b;
            C11040a c11040a2 = c11040aArr[1];
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = c11040a2.f65566b;
            int i = 1;
            while (!this.cancelled) {
                boolean z3 = c11040a.f65568d;
                if (z3 && (th3 = c11040a.f65569e) != null) {
                    cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                    this.downstream.onError(th3);
                    return;
                }
                boolean z4 = c11040a2.f65568d;
                if (z4 && (th2 = c11040a2.f65569e) != null) {
                    cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                    this.downstream.onError(th2);
                    return;
                }
                if (this.f65563v1 == null) {
                    this.f65563v1 = spscLinkedArrayQueue.poll();
                }
                if (this.f65563v1 == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f65564v2 == null) {
                    this.f65564v2 = spscLinkedArrayQueue2.poll();
                }
                T t = this.f65564v2;
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
                            if (!this.comparer.test((T) this.f65563v1, t)) {
                                cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                                this.downstream.onNext(Boolean.FALSE);
                                this.downstream.onComplete();
                                return;
                            }
                            this.f65563v1 = null;
                            this.f65564v2 = null;
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
            C11040a[] c11040aArr = this.observers;
            this.first.subscribe(c11040aArr[0]);
            this.second.subscribe(c11040aArr[1]);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSequenceEqual$a */
    /* loaded from: classes5.dex */
    public static final class C11040a implements Observer {

        /* renamed from: a */
        public final EqualCoordinator f65565a;

        /* renamed from: b */
        public final SpscLinkedArrayQueue f65566b;

        /* renamed from: c */
        public final int f65567c;

        /* renamed from: d */
        public volatile boolean f65568d;

        /* renamed from: e */
        public Throwable f65569e;

        public C11040a(EqualCoordinator equalCoordinator, int i, int i2) {
            this.f65565a = equalCoordinator;
            this.f65567c = i;
            this.f65566b = new SpscLinkedArrayQueue(i2);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65568d = true;
            this.f65565a.drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65569e = th2;
            this.f65568d = true;
            this.f65565a.drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65566b.offer(obj);
            this.f65565a.drain();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f65565a.setDisposable(disposable, this.f65567c);
        }
    }

    public ObservableSequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate, int i) {
        this.f65559a = observableSource;
        this.f65560b = observableSource2;
        this.f65561c = biPredicate;
        this.f65562d = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Boolean> observer) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(observer, this.f65562d, this.f65559a, this.f65560b, this.f65561c);
        observer.onSubscribe(equalCoordinator);
        equalCoordinator.subscribe();
    }
}