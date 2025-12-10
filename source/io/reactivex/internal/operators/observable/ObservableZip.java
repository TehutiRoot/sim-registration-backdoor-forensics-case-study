package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ObservableZip<T, R> extends Observable<R> {

    /* renamed from: a */
    public final ObservableSource[] f65716a;

    /* renamed from: b */
    public final Iterable f65717b;

    /* renamed from: c */
    public final Function f65718c;

    /* renamed from: d */
    public final int f65719d;

    /* renamed from: e */
    public final boolean f65720e;

    /* loaded from: classes5.dex */
    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 2983708048395377667L;
        volatile boolean cancelled;
        final boolean delayError;
        final Observer<? super R> downstream;
        final C11089a[] observers;
        final T[] row;
        final Function<? super Object[], ? extends R> zipper;

        public ZipCoordinator(Observer<? super R> observer, Function<? super Object[], ? extends R> function, int i, boolean z) {
            this.downstream = observer;
            this.zipper = function;
            this.observers = new C11089a[i];
            this.row = (T[]) new Object[i];
            this.delayError = z;
        }

        public void cancel() {
            clear();
            cancelSources();
        }

        public void cancelSources() {
            for (C11089a c11089a : this.observers) {
                c11089a.m29934a();
            }
        }

        public boolean checkTerminated(boolean z, boolean z2, Observer<? super R> observer, boolean z3, C11089a c11089a) {
            if (this.cancelled) {
                cancel();
                return true;
            } else if (z) {
                if (z3) {
                    if (z2) {
                        Throwable th2 = c11089a.f65724d;
                        this.cancelled = true;
                        cancel();
                        if (th2 != null) {
                            observer.onError(th2);
                        } else {
                            observer.onComplete();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable th3 = c11089a.f65724d;
                if (th3 != null) {
                    this.cancelled = true;
                    cancel();
                    observer.onError(th3);
                    return true;
                } else if (z2) {
                    this.cancelled = true;
                    cancel();
                    observer.onComplete();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        public void clear() {
            for (C11089a c11089a : this.observers) {
                c11089a.f65722b.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelSources();
                if (getAndIncrement() == 0) {
                    clear();
                }
            }
        }

        public void drain() {
            Throwable th2;
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            C11089a[] c11089aArr = this.observers;
            Observer<? super R> observer = this.downstream;
            T[] tArr = this.row;
            boolean z2 = this.delayError;
            int i = 1;
            while (true) {
                int i2 = 0;
                int i3 = 0;
                for (C11089a c11089a : c11089aArr) {
                    if (tArr[i3] == null) {
                        boolean z3 = c11089a.f65723c;
                        Object poll = c11089a.f65722b.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (checkTerminated(z3, z, observer, z2, c11089a)) {
                            return;
                        }
                        if (!z) {
                            tArr[i3] = poll;
                        } else {
                            i2++;
                        }
                    } else if (c11089a.f65723c && !z2 && (th2 = c11089a.f65724d) != null) {
                        this.cancelled = true;
                        cancel();
                        observer.onError(th2);
                        return;
                    }
                    i3++;
                }
                if (i2 != 0) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    try {
                        observer.onNext((Object) ObjectHelper.requireNonNull(this.zipper.apply(tArr.clone()), "The zipper returned a null value"));
                        Arrays.fill(tArr, (Object) null);
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        cancel();
                        observer.onError(th3);
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        public void subscribe(ObservableSource<? extends T>[] observableSourceArr, int i) {
            C11089a[] c11089aArr = this.observers;
            int length = c11089aArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                c11089aArr[i2] = new C11089a(this, i);
            }
            lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i3 = 0; i3 < length && !this.cancelled; i3++) {
                observableSourceArr[i3].subscribe(c11089aArr[i3]);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableZip$a */
    /* loaded from: classes5.dex */
    public static final class C11089a implements Observer {

        /* renamed from: a */
        public final ZipCoordinator f65721a;

        /* renamed from: b */
        public final SpscLinkedArrayQueue f65722b;

        /* renamed from: c */
        public volatile boolean f65723c;

        /* renamed from: d */
        public Throwable f65724d;

        /* renamed from: e */
        public final AtomicReference f65725e = new AtomicReference();

        public C11089a(ZipCoordinator zipCoordinator, int i) {
            this.f65721a = zipCoordinator;
            this.f65722b = new SpscLinkedArrayQueue(i);
        }

        /* renamed from: a */
        public void m29934a() {
            DisposableHelper.dispose(this.f65725e);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65723c = true;
            this.f65721a.drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65724d = th2;
            this.f65723c = true;
            this.f65721a.drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65722b.offer(obj);
            this.f65721a.drain();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f65725e, disposable);
        }
    }

    public ObservableZip(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.f65716a = observableSourceArr;
        this.f65717b = iterable;
        this.f65718c = function;
        this.f65719d = i;
        this.f65720e = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        int length;
        ObservableSource<? extends T>[] observableSourceArr = this.f65716a;
        if (observableSourceArr == null) {
            observableSourceArr = new Observable[8];
            length = 0;
            for (ObservableSource<? extends T> observableSource : this.f65717b) {
                if (length == observableSourceArr.length) {
                    ObservableSource<? extends T>[] observableSourceArr2 = new ObservableSource[(length >> 2) + length];
                    System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, length);
                    observableSourceArr = observableSourceArr2;
                }
                observableSourceArr[length] = observableSource;
                length++;
            }
        } else {
            length = observableSourceArr.length;
        }
        if (length == 0) {
            EmptyDisposable.complete(observer);
        } else {
            new ZipCoordinator(observer, this.f65718c, length, this.f65720e).subscribe(observableSourceArr, this.f65719d);
        }
    }
}
