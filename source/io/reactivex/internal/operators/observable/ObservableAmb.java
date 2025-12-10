package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ObservableAmb<T> extends Observable<T> {

    /* renamed from: a */
    public final ObservableSource[] f65015a;

    /* renamed from: b */
    public final Iterable f65016b;

    /* loaded from: classes5.dex */
    public static final class AmbInnerObserver<T> extends AtomicReference<Disposable> implements Observer<T> {
        private static final long serialVersionUID = -1185974347409665484L;
        final Observer<? super T> downstream;
        final int index;
        final C10966a parent;
        boolean won;

        public AmbInnerObserver(C10966a c10966a, int i, Observer<? super T> observer) {
            this.parent = c10966a;
            this.index = i;
            this.downstream = observer;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.won) {
                this.downstream.onComplete();
            } else if (this.parent.m29992b(this.index)) {
                this.won = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.won) {
                this.downstream.onError(th2);
            } else if (this.parent.m29992b(this.index)) {
                this.won = true;
                this.downstream.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.won) {
                this.downstream.onNext(t);
            } else if (this.parent.m29992b(this.index)) {
                this.won = true;
                this.downstream.onNext(t);
            } else {
                get().dispose();
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableAmb$a */
    /* loaded from: classes5.dex */
    public static final class C10966a implements Disposable {

        /* renamed from: a */
        public final Observer f65017a;

        /* renamed from: b */
        public final AmbInnerObserver[] f65018b;

        /* renamed from: c */
        public final AtomicInteger f65019c = new AtomicInteger();

        public C10966a(Observer observer, int i) {
            this.f65017a = observer;
            this.f65018b = new AmbInnerObserver[i];
        }

        /* renamed from: a */
        public void m29993a(ObservableSource[] observableSourceArr) {
            AmbInnerObserver[] ambInnerObserverArr = this.f65018b;
            int length = ambInnerObserverArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                ambInnerObserverArr[i] = new AmbInnerObserver(this, i2, this.f65017a);
                i = i2;
            }
            this.f65019c.lazySet(0);
            this.f65017a.onSubscribe(this);
            for (int i3 = 0; i3 < length && this.f65019c.get() == 0; i3++) {
                observableSourceArr[i3].subscribe(ambInnerObserverArr[i3]);
            }
        }

        /* renamed from: b */
        public boolean m29992b(int i) {
            int i2 = this.f65019c.get();
            int i3 = 0;
            if (i2 == 0) {
                if (!this.f65019c.compareAndSet(0, i)) {
                    return false;
                }
                AmbInnerObserver[] ambInnerObserverArr = this.f65018b;
                int length = ambInnerObserverArr.length;
                while (i3 < length) {
                    int i4 = i3 + 1;
                    if (i4 != i) {
                        ambInnerObserverArr[i3].dispose();
                    }
                    i3 = i4;
                }
                return true;
            } else if (i2 == i) {
                return true;
            } else {
                return false;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.f65019c.get() != -1) {
                this.f65019c.lazySet(-1);
                for (AmbInnerObserver ambInnerObserver : this.f65018b) {
                    ambInnerObserver.dispose();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f65019c.get() == -1) {
                return true;
            }
            return false;
        }
    }

    public ObservableAmb(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable) {
        this.f65015a = observableSourceArr;
        this.f65016b = iterable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        int length;
        ObservableSource[] observableSourceArr = this.f65015a;
        if (observableSourceArr == null) {
            observableSourceArr = new Observable[8];
            try {
                length = 0;
                for (ObservableSource observableSource : this.f65016b) {
                    if (observableSource == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), observer);
                        return;
                    }
                    if (length == observableSourceArr.length) {
                        ObservableSource[] observableSourceArr2 = new ObservableSource[(length >> 2) + length];
                        System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, length);
                        observableSourceArr = observableSourceArr2;
                    }
                    int i = length + 1;
                    observableSourceArr[length] = observableSource;
                    length = i;
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptyDisposable.error(th2, observer);
                return;
            }
        } else {
            length = observableSourceArr.length;
        }
        if (length == 0) {
            EmptyDisposable.complete(observer);
        } else if (length == 1) {
            observableSourceArr[0].subscribe(observer);
        } else {
            new C10966a(observer, length).m29993a(observableSourceArr);
        }
    }
}
