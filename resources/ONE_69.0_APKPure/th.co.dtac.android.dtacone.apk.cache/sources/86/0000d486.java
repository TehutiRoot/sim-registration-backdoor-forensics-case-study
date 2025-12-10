package io.reactivex.subjects;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class MaybeSubject<T> extends Maybe<T> implements MaybeObserver<T> {

    /* renamed from: e */
    public static final MaybeDisposable[] f66481e = new MaybeDisposable[0];

    /* renamed from: f */
    public static final MaybeDisposable[] f66482f = new MaybeDisposable[0];

    /* renamed from: c */
    public Object f66485c;

    /* renamed from: d */
    public Throwable f66486d;

    /* renamed from: b */
    public final AtomicBoolean f66484b = new AtomicBoolean();

    /* renamed from: a */
    public final AtomicReference f66483a = new AtomicReference(f66481e);

    /* loaded from: classes5.dex */
    public static final class MaybeDisposable<T> extends AtomicReference<MaybeSubject<T>> implements Disposable {
        private static final long serialVersionUID = -7650903191002190468L;
        final MaybeObserver<? super T> downstream;

        public MaybeDisposable(MaybeObserver<? super T> maybeObserver, MaybeSubject<T> maybeSubject) {
            this.downstream = maybeObserver;
            lazySet(maybeSubject);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            MaybeSubject<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m30119b(this);
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
    public static <T> MaybeSubject<T> create() {
        return new MaybeSubject<>();
    }

    /* renamed from: a */
    public boolean m30120a(MaybeDisposable maybeDisposable) {
        MaybeDisposable[] maybeDisposableArr;
        MaybeDisposable[] maybeDisposableArr2;
        do {
            maybeDisposableArr = (MaybeDisposable[]) this.f66483a.get();
            if (maybeDisposableArr == f66482f) {
                return false;
            }
            int length = maybeDisposableArr.length;
            maybeDisposableArr2 = new MaybeDisposable[length + 1];
            System.arraycopy(maybeDisposableArr, 0, maybeDisposableArr2, 0, length);
            maybeDisposableArr2[length] = maybeDisposable;
        } while (!AbstractC23094xo1.m479a(this.f66483a, maybeDisposableArr, maybeDisposableArr2));
        return true;
    }

    /* renamed from: b */
    public void m30119b(MaybeDisposable maybeDisposable) {
        MaybeDisposable[] maybeDisposableArr;
        MaybeDisposable[] maybeDisposableArr2;
        do {
            maybeDisposableArr = (MaybeDisposable[]) this.f66483a.get();
            int length = maybeDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i < length) {
                    if (maybeDisposableArr[i] == maybeDisposable) {
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
                maybeDisposableArr2 = f66481e;
            } else {
                MaybeDisposable[] maybeDisposableArr3 = new MaybeDisposable[length - 1];
                System.arraycopy(maybeDisposableArr, 0, maybeDisposableArr3, 0, i);
                System.arraycopy(maybeDisposableArr, i + 1, maybeDisposableArr3, i, (length - i) - 1);
                maybeDisposableArr2 = maybeDisposableArr3;
            }
        } while (!AbstractC23094xo1.m479a(this.f66483a, maybeDisposableArr, maybeDisposableArr2));
    }

    @Nullable
    public Throwable getThrowable() {
        if (this.f66483a.get() == f66482f) {
            return this.f66486d;
        }
        return null;
    }

    @Nullable
    public T getValue() {
        if (this.f66483a.get() == f66482f) {
            return (T) this.f66485c;
        }
        return null;
    }

    public boolean hasComplete() {
        if (this.f66483a.get() == f66482f && this.f66485c == null && this.f66486d == null) {
            return true;
        }
        return false;
    }

    public boolean hasObservers() {
        if (((MaybeDisposable[]) this.f66483a.get()).length != 0) {
            return true;
        }
        return false;
    }

    public boolean hasThrowable() {
        if (this.f66483a.get() == f66482f && this.f66486d != null) {
            return true;
        }
        return false;
    }

    public boolean hasValue() {
        if (this.f66483a.get() == f66482f && this.f66485c != null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.MaybeObserver
    public void onComplete() {
        if (this.f66484b.compareAndSet(false, true)) {
            for (MaybeDisposable maybeDisposable : (MaybeDisposable[]) this.f66483a.getAndSet(f66482f)) {
                maybeDisposable.downstream.onComplete();
            }
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f66484b.compareAndSet(false, true)) {
            this.f66486d = th2;
            for (MaybeDisposable maybeDisposable : (MaybeDisposable[]) this.f66483a.getAndSet(f66482f)) {
                maybeDisposable.downstream.onError(th2);
            }
            return;
        }
        RxJavaPlugins.onError(th2);
    }

    @Override // io.reactivex.MaybeObserver
    public void onSubscribe(Disposable disposable) {
        if (this.f66483a.get() == f66482f) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T t) {
        ObjectHelper.requireNonNull(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f66484b.compareAndSet(false, true)) {
            this.f66485c = t;
            for (MaybeDisposable maybeDisposable : (MaybeDisposable[]) this.f66483a.getAndSet(f66482f)) {
                maybeDisposable.downstream.onSuccess(t);
            }
        }
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        MaybeDisposable maybeDisposable = new MaybeDisposable(maybeObserver, this);
        maybeObserver.onSubscribe(maybeDisposable);
        if (m30120a(maybeDisposable)) {
            if (maybeDisposable.isDisposed()) {
                m30119b(maybeDisposable);
                return;
            }
            return;
        }
        Throwable th2 = this.f66486d;
        if (th2 != null) {
            maybeObserver.onError(th2);
            return;
        }
        Object obj = (Object) this.f66485c;
        if (obj == 0) {
            maybeObserver.onComplete();
        } else {
            maybeObserver.onSuccess(obj);
        }
    }
}