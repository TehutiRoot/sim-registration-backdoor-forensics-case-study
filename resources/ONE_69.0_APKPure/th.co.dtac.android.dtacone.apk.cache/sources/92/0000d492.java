package io.reactivex.subjects;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class SingleSubject<T> extends Single<T> implements SingleObserver<T> {

    /* renamed from: e */
    public static final SingleDisposable[] f66497e = new SingleDisposable[0];

    /* renamed from: f */
    public static final SingleDisposable[] f66498f = new SingleDisposable[0];

    /* renamed from: c */
    public Object f66501c;

    /* renamed from: d */
    public Throwable f66502d;

    /* renamed from: b */
    public final AtomicBoolean f66500b = new AtomicBoolean();

    /* renamed from: a */
    public final AtomicReference f66499a = new AtomicReference(f66497e);

    /* loaded from: classes5.dex */
    public static final class SingleDisposable<T> extends AtomicReference<SingleSubject<T>> implements Disposable {
        private static final long serialVersionUID = -7650903191002190468L;
        final SingleObserver<? super T> downstream;

        public SingleDisposable(SingleObserver<? super T> singleObserver, SingleSubject<T> singleSubject) {
            this.downstream = singleObserver;
            lazySet(singleSubject);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SingleSubject<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m30112d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (get() == null) {
                return true;
            }
            return false;
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> SingleSubject<T> create() {
        return new SingleSubject<>();
    }

    /* renamed from: c */
    public boolean m30113c(SingleDisposable singleDisposable) {
        SingleDisposable[] singleDisposableArr;
        SingleDisposable[] singleDisposableArr2;
        do {
            singleDisposableArr = (SingleDisposable[]) this.f66499a.get();
            if (singleDisposableArr == f66498f) {
                return false;
            }
            int length = singleDisposableArr.length;
            singleDisposableArr2 = new SingleDisposable[length + 1];
            System.arraycopy(singleDisposableArr, 0, singleDisposableArr2, 0, length);
            singleDisposableArr2[length] = singleDisposable;
        } while (!AbstractC23094xo1.m479a(this.f66499a, singleDisposableArr, singleDisposableArr2));
        return true;
    }

    /* renamed from: d */
    public void m30112d(SingleDisposable singleDisposable) {
        SingleDisposable[] singleDisposableArr;
        SingleDisposable[] singleDisposableArr2;
        do {
            singleDisposableArr = (SingleDisposable[]) this.f66499a.get();
            int length = singleDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i < length) {
                    if (singleDisposableArr[i] == singleDisposable) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                singleDisposableArr2 = f66497e;
            } else {
                SingleDisposable[] singleDisposableArr3 = new SingleDisposable[length - 1];
                System.arraycopy(singleDisposableArr, 0, singleDisposableArr3, 0, i);
                System.arraycopy(singleDisposableArr, i + 1, singleDisposableArr3, i, (length - i) - 1);
                singleDisposableArr2 = singleDisposableArr3;
            }
        } while (!AbstractC23094xo1.m479a(this.f66499a, singleDisposableArr, singleDisposableArr2));
    }

    @Nullable
    public Throwable getThrowable() {
        if (this.f66499a.get() == f66498f) {
            return this.f66502d;
        }
        return null;
    }

    @Nullable
    public T getValue() {
        if (this.f66499a.get() == f66498f) {
            return (T) this.f66501c;
        }
        return null;
    }

    public boolean hasObservers() {
        if (((SingleDisposable[]) this.f66499a.get()).length != 0) {
            return true;
        }
        return false;
    }

    public boolean hasThrowable() {
        if (this.f66499a.get() == f66498f && this.f66502d != null) {
            return true;
        }
        return false;
    }

    public boolean hasValue() {
        if (this.f66499a.get() == f66498f && this.f66501c != null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.SingleObserver
    public void onError(@NonNull Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f66500b.compareAndSet(false, true)) {
            this.f66502d = th2;
            for (SingleDisposable singleDisposable : (SingleDisposable[]) this.f66499a.getAndSet(f66498f)) {
                singleDisposable.downstream.onError(th2);
            }
            return;
        }
        RxJavaPlugins.onError(th2);
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(@NonNull Disposable disposable) {
        if (this.f66499a.get() == f66498f) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(@NonNull T t) {
        ObjectHelper.requireNonNull(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f66500b.compareAndSet(false, true)) {
            this.f66501c = t;
            for (SingleDisposable singleDisposable : (SingleDisposable[]) this.f66499a.getAndSet(f66498f)) {
                singleDisposable.downstream.onSuccess(t);
            }
        }
    }

    @Override // io.reactivex.Single
    public void subscribeActual(@NonNull SingleObserver<? super T> singleObserver) {
        SingleDisposable singleDisposable = new SingleDisposable(singleObserver, this);
        singleObserver.onSubscribe(singleDisposable);
        if (m30113c(singleDisposable)) {
            if (singleDisposable.isDisposed()) {
                m30112d(singleDisposable);
                return;
            }
            return;
        }
        Throwable th2 = this.f66502d;
        if (th2 != null) {
            singleObserver.onError(th2);
        } else {
            singleObserver.onSuccess((Object) this.f66501c);
        }
    }
}