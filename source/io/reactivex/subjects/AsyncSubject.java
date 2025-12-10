package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class AsyncSubject<T> extends Subject<T> {

    /* renamed from: d */
    public static final AsyncDisposable[] f66390d = new AsyncDisposable[0];

    /* renamed from: e */
    public static final AsyncDisposable[] f66391e = new AsyncDisposable[0];

    /* renamed from: a */
    public final AtomicReference f66392a = new AtomicReference(f66390d);

    /* renamed from: b */
    public Throwable f66393b;

    /* renamed from: c */
    public Object f66394c;

    /* loaded from: classes5.dex */
    public static final class AsyncDisposable<T> extends DeferredScalarDisposable<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final AsyncSubject<T> parent;

        public AsyncDisposable(Observer<? super T> observer, AsyncSubject<T> asyncSubject) {
            super(observer);
            this.parent = asyncSubject;
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
        public void dispose() {
            if (super.tryDispose()) {
                this.parent.m29790e(this);
            }
        }

        public void onComplete() {
            if (!isDisposed()) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th2) {
            if (isDisposed()) {
                RxJavaPlugins.onError(th2);
            } else {
                this.downstream.onError(th2);
            }
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> AsyncSubject<T> create() {
        return new AsyncSubject<>();
    }

    /* renamed from: d */
    public boolean m29791d(AsyncDisposable asyncDisposable) {
        AsyncDisposable[] asyncDisposableArr;
        AsyncDisposable[] asyncDisposableArr2;
        do {
            asyncDisposableArr = (AsyncDisposable[]) this.f66392a.get();
            if (asyncDisposableArr == f66391e) {
                return false;
            }
            int length = asyncDisposableArr.length;
            asyncDisposableArr2 = new AsyncDisposable[length + 1];
            System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr2, 0, length);
            asyncDisposableArr2[length] = asyncDisposable;
        } while (!AbstractC17300An1.m69050a(this.f66392a, asyncDisposableArr, asyncDisposableArr2));
        return true;
    }

    /* renamed from: e */
    public void m29790e(AsyncDisposable asyncDisposable) {
        AsyncDisposable[] asyncDisposableArr;
        AsyncDisposable[] asyncDisposableArr2;
        do {
            asyncDisposableArr = (AsyncDisposable[]) this.f66392a.get();
            int length = asyncDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i < length) {
                    if (asyncDisposableArr[i] == asyncDisposable) {
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
                asyncDisposableArr2 = f66390d;
            } else {
                AsyncDisposable[] asyncDisposableArr3 = new AsyncDisposable[length - 1];
                System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr3, 0, i);
                System.arraycopy(asyncDisposableArr, i + 1, asyncDisposableArr3, i, (length - i) - 1);
                asyncDisposableArr2 = asyncDisposableArr3;
            }
        } while (!AbstractC17300An1.m69050a(this.f66392a, asyncDisposableArr, asyncDisposableArr2));
    }

    @Override // io.reactivex.subjects.Subject
    public Throwable getThrowable() {
        if (this.f66392a.get() == f66391e) {
            return this.f66393b;
        }
        return null;
    }

    @Nullable
    public T getValue() {
        if (this.f66392a.get() == f66391e) {
            return (T) this.f66394c;
        }
        return null;
    }

    @Deprecated
    public Object[] getValues() {
        T value = getValue();
        return value != null ? new Object[]{value} : new Object[0];
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        if (this.f66392a.get() == f66391e && this.f66393b == null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        if (((AsyncDisposable[]) this.f66392a.get()).length != 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        if (this.f66392a.get() == f66391e && this.f66393b != null) {
            return true;
        }
        return false;
    }

    public boolean hasValue() {
        if (this.f66392a.get() == f66391e && this.f66394c != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observer
    public void onComplete() {
        Object obj = this.f66392a.get();
        Object obj2 = f66391e;
        if (obj == obj2) {
            return;
        }
        Object obj3 = this.f66394c;
        AsyncDisposable[] asyncDisposableArr = (AsyncDisposable[]) this.f66392a.getAndSet(obj2);
        int i = 0;
        if (obj3 == null) {
            int length = asyncDisposableArr.length;
            while (i < length) {
                asyncDisposableArr[i].onComplete();
                i++;
            }
            return;
        }
        int length2 = asyncDisposableArr.length;
        while (i < length2) {
            asyncDisposableArr[i].complete(obj3);
            i++;
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.f66392a.get();
        Object obj2 = f66391e;
        if (obj == obj2) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f66394c = null;
        this.f66393b = th2;
        for (AsyncDisposable asyncDisposable : (AsyncDisposable[]) this.f66392a.getAndSet(obj2)) {
            asyncDisposable.onError(th2);
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f66392a.get() == f66391e) {
            return;
        }
        this.f66394c = t;
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.f66392a.get() == f66391e) {
            disposable.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        AsyncDisposable asyncDisposable = new AsyncDisposable(observer, this);
        observer.onSubscribe(asyncDisposable);
        if (m29791d(asyncDisposable)) {
            if (asyncDisposable.isDisposed()) {
                m29790e(asyncDisposable);
                return;
            }
            return;
        }
        Throwable th2 = this.f66393b;
        if (th2 != null) {
            observer.onError(th2);
            return;
        }
        Object obj = this.f66394c;
        if (obj != null) {
            asyncDisposable.complete(obj);
        } else {
            asyncDisposable.onComplete();
        }
    }

    @Deprecated
    public T[] getValues(T[] tArr) {
        T value = getValue();
        if (value == null) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 1);
        }
        tArr[0] = value;
        if (tArr.length != 1) {
            tArr[1] = null;
        }
        return tArr;
    }
}
