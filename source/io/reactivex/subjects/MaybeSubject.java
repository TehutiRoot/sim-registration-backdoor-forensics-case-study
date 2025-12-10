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
    public static final MaybeDisposable[] f66418e = new MaybeDisposable[0];

    /* renamed from: f */
    public static final MaybeDisposable[] f66419f = new MaybeDisposable[0];

    /* renamed from: c */
    public Object f66422c;

    /* renamed from: d */
    public Throwable f66423d;

    /* renamed from: b */
    public final AtomicBoolean f66421b = new AtomicBoolean();

    /* renamed from: a */
    public final AtomicReference f66420a = new AtomicReference(f66418e);

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
                andSet.m29779b(this);
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
    public boolean m29780a(MaybeDisposable maybeDisposable) {
        MaybeDisposable[] maybeDisposableArr;
        MaybeDisposable[] maybeDisposableArr2;
        do {
            maybeDisposableArr = (MaybeDisposable[]) this.f66420a.get();
            if (maybeDisposableArr == f66419f) {
                return false;
            }
            int length = maybeDisposableArr.length;
            maybeDisposableArr2 = new MaybeDisposable[length + 1];
            System.arraycopy(maybeDisposableArr, 0, maybeDisposableArr2, 0, length);
            maybeDisposableArr2[length] = maybeDisposable;
        } while (!AbstractC17300An1.m69050a(this.f66420a, maybeDisposableArr, maybeDisposableArr2));
        return true;
    }

    /* renamed from: b */
    public void m29779b(MaybeDisposable maybeDisposable) {
        MaybeDisposable[] maybeDisposableArr;
        MaybeDisposable[] maybeDisposableArr2;
        do {
            maybeDisposableArr = (MaybeDisposable[]) this.f66420a.get();
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
                maybeDisposableArr2 = f66418e;
            } else {
                MaybeDisposable[] maybeDisposableArr3 = new MaybeDisposable[length - 1];
                System.arraycopy(maybeDisposableArr, 0, maybeDisposableArr3, 0, i);
                System.arraycopy(maybeDisposableArr, i + 1, maybeDisposableArr3, i, (length - i) - 1);
                maybeDisposableArr2 = maybeDisposableArr3;
            }
        } while (!AbstractC17300An1.m69050a(this.f66420a, maybeDisposableArr, maybeDisposableArr2));
    }

    @Nullable
    public Throwable getThrowable() {
        if (this.f66420a.get() == f66419f) {
            return this.f66423d;
        }
        return null;
    }

    @Nullable
    public T getValue() {
        if (this.f66420a.get() == f66419f) {
            return (T) this.f66422c;
        }
        return null;
    }

    public boolean hasComplete() {
        if (this.f66420a.get() == f66419f && this.f66422c == null && this.f66423d == null) {
            return true;
        }
        return false;
    }

    public boolean hasObservers() {
        if (((MaybeDisposable[]) this.f66420a.get()).length != 0) {
            return true;
        }
        return false;
    }

    public boolean hasThrowable() {
        if (this.f66420a.get() == f66419f && this.f66423d != null) {
            return true;
        }
        return false;
    }

    public boolean hasValue() {
        if (this.f66420a.get() == f66419f && this.f66422c != null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.MaybeObserver
    public void onComplete() {
        if (this.f66421b.compareAndSet(false, true)) {
            for (MaybeDisposable maybeDisposable : (MaybeDisposable[]) this.f66420a.getAndSet(f66419f)) {
                maybeDisposable.downstream.onComplete();
            }
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f66421b.compareAndSet(false, true)) {
            this.f66423d = th2;
            for (MaybeDisposable maybeDisposable : (MaybeDisposable[]) this.f66420a.getAndSet(f66419f)) {
                maybeDisposable.downstream.onError(th2);
            }
            return;
        }
        RxJavaPlugins.onError(th2);
    }

    @Override // io.reactivex.MaybeObserver
    public void onSubscribe(Disposable disposable) {
        if (this.f66420a.get() == f66419f) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T t) {
        ObjectHelper.requireNonNull(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f66421b.compareAndSet(false, true)) {
            this.f66422c = t;
            for (MaybeDisposable maybeDisposable : (MaybeDisposable[]) this.f66420a.getAndSet(f66419f)) {
                maybeDisposable.downstream.onSuccess(t);
            }
        }
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        MaybeDisposable maybeDisposable = new MaybeDisposable(maybeObserver, this);
        maybeObserver.onSubscribe(maybeDisposable);
        if (m29780a(maybeDisposable)) {
            if (maybeDisposable.isDisposed()) {
                m29779b(maybeDisposable);
                return;
            }
            return;
        }
        Throwable th2 = this.f66423d;
        if (th2 != null) {
            maybeObserver.onError(th2);
            return;
        }
        Object obj = (Object) this.f66422c;
        if (obj == 0) {
            maybeObserver.onComplete();
        } else {
            maybeObserver.onSuccess(obj);
        }
    }
}
