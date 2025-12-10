package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class ObservableSequenceEqualSingle<T> extends Single<Boolean> implements FuseToObservable<Boolean> {

    /* renamed from: a */
    public final ObservableSource f65507a;

    /* renamed from: b */
    public final ObservableSource f65508b;

    /* renamed from: c */
    public final BiPredicate f65509c;

    /* renamed from: d */
    public final int f65510d;

    /* loaded from: classes5.dex */
    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = -6178010334400373240L;
        volatile boolean cancelled;
        final BiPredicate<? super T, ? super T> comparer;
        final SingleObserver<? super Boolean> downstream;
        final ObservableSource<? extends T> first;
        final C11054a[] observers;
        final ArrayCompositeDisposable resources;
        final ObservableSource<? extends T> second;

        /* renamed from: v1 */
        T f65511v1;

        /* renamed from: v2 */
        T f65512v2;

        public EqualCoordinator(SingleObserver<? super Boolean> singleObserver, int i, ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate) {
            this.downstream = singleObserver;
            this.first = observableSource;
            this.second = observableSource2;
            this.comparer = biPredicate;
            this.observers = r3;
            C11054a[] c11054aArr = {new C11054a(this, 0, i), new C11054a(this, 1, i)};
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
                    C11054a[] c11054aArr = this.observers;
                    c11054aArr[0].f65514b.clear();
                    c11054aArr[1].f65514b.clear();
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
            C11054a[] c11054aArr = this.observers;
            C11054a c11054a = c11054aArr[0];
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = c11054a.f65514b;
            C11054a c11054a2 = c11054aArr[1];
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = c11054a2.f65514b;
            int i = 1;
            while (!this.cancelled) {
                boolean z3 = c11054a.f65516d;
                if (z3 && (th3 = c11054a.f65517e) != null) {
                    cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                    this.downstream.onError(th3);
                    return;
                }
                boolean z4 = c11054a2.f65516d;
                if (z4 && (th2 = c11054a2.f65517e) != null) {
                    cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                    this.downstream.onError(th2);
                    return;
                }
                if (this.f65511v1 == null) {
                    this.f65511v1 = spscLinkedArrayQueue.poll();
                }
                if (this.f65511v1 == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f65512v2 == null) {
                    this.f65512v2 = spscLinkedArrayQueue2.poll();
                }
                T t = this.f65512v2;
                if (t == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z3 && z4 && z && z2) {
                    this.downstream.onSuccess(Boolean.TRUE);
                    return;
                } else if (z3 && z4 && z != z2) {
                    cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                    this.downstream.onSuccess(Boolean.FALSE);
                    return;
                } else {
                    if (!z && !z2) {
                        try {
                            if (!this.comparer.test((T) this.f65511v1, t)) {
                                cancel(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                                this.downstream.onSuccess(Boolean.FALSE);
                                return;
                            }
                            this.f65511v1 = null;
                            this.f65512v2 = null;
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
            C11054a[] c11054aArr = this.observers;
            this.first.subscribe(c11054aArr[0]);
            this.second.subscribe(c11054aArr[1]);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$a */
    /* loaded from: classes5.dex */
    public static final class C11054a implements Observer {

        /* renamed from: a */
        public final EqualCoordinator f65513a;

        /* renamed from: b */
        public final SpscLinkedArrayQueue f65514b;

        /* renamed from: c */
        public final int f65515c;

        /* renamed from: d */
        public volatile boolean f65516d;

        /* renamed from: e */
        public Throwable f65517e;

        public C11054a(EqualCoordinator equalCoordinator, int i, int i2) {
            this.f65513a = equalCoordinator;
            this.f65515c = i;
            this.f65514b = new SpscLinkedArrayQueue(i2);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65516d = true;
            this.f65513a.drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65517e = th2;
            this.f65516d = true;
            this.f65513a.drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65514b.offer(obj);
            this.f65513a.drain();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f65513a.setDisposable(disposable, this.f65515c);
        }
    }

    public ObservableSequenceEqualSingle(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate, int i) {
        this.f65507a = observableSource;
        this.f65508b = observableSource2;
        this.f65509c = biPredicate;
        this.f65510d = i;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<Boolean> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableSequenceEqual(this.f65507a, this.f65508b, this.f65509c, this.f65510d));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(singleObserver, this.f65510d, this.f65507a, this.f65508b, this.f65509c);
        singleObserver.onSubscribe(equalCoordinator);
        equalCoordinator.subscribe();
    }
}
