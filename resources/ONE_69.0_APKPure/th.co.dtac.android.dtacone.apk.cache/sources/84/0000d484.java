package io.reactivex.subjects;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class CompletableSubject extends Completable implements CompletableObserver {

    /* renamed from: d */
    public static final CompletableDisposable[] f66476d = new CompletableDisposable[0];

    /* renamed from: e */
    public static final CompletableDisposable[] f66477e = new CompletableDisposable[0];

    /* renamed from: c */
    public Throwable f66480c;

    /* renamed from: b */
    public final AtomicBoolean f66479b = new AtomicBoolean();

    /* renamed from: a */
    public final AtomicReference f66478a = new AtomicReference(f66476d);

    /* loaded from: classes5.dex */
    public static final class CompletableDisposable extends AtomicReference<CompletableSubject> implements Disposable {
        private static final long serialVersionUID = -7650903191002190468L;
        final CompletableObserver downstream;

        public CompletableDisposable(CompletableObserver completableObserver, CompletableSubject completableSubject) {
            this.downstream = completableObserver;
            lazySet(completableSubject);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            CompletableSubject andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m30121f(this);
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
    public static CompletableSubject create() {
        return new CompletableSubject();
    }

    /* renamed from: e */
    public boolean m30122e(CompletableDisposable completableDisposable) {
        CompletableDisposable[] completableDisposableArr;
        CompletableDisposable[] completableDisposableArr2;
        do {
            completableDisposableArr = (CompletableDisposable[]) this.f66478a.get();
            if (completableDisposableArr == f66477e) {
                return false;
            }
            int length = completableDisposableArr.length;
            completableDisposableArr2 = new CompletableDisposable[length + 1];
            System.arraycopy(completableDisposableArr, 0, completableDisposableArr2, 0, length);
            completableDisposableArr2[length] = completableDisposable;
        } while (!AbstractC23094xo1.m479a(this.f66478a, completableDisposableArr, completableDisposableArr2));
        return true;
    }

    /* renamed from: f */
    public void m30121f(CompletableDisposable completableDisposable) {
        CompletableDisposable[] completableDisposableArr;
        CompletableDisposable[] completableDisposableArr2;
        do {
            completableDisposableArr = (CompletableDisposable[]) this.f66478a.get();
            int length = completableDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i < length) {
                    if (completableDisposableArr[i] == completableDisposable) {
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
                completableDisposableArr2 = f66476d;
            } else {
                CompletableDisposable[] completableDisposableArr3 = new CompletableDisposable[length - 1];
                System.arraycopy(completableDisposableArr, 0, completableDisposableArr3, 0, i);
                System.arraycopy(completableDisposableArr, i + 1, completableDisposableArr3, i, (length - i) - 1);
                completableDisposableArr2 = completableDisposableArr3;
            }
        } while (!AbstractC23094xo1.m479a(this.f66478a, completableDisposableArr, completableDisposableArr2));
    }

    @Nullable
    public Throwable getThrowable() {
        if (this.f66478a.get() == f66477e) {
            return this.f66480c;
        }
        return null;
    }

    public boolean hasComplete() {
        if (this.f66478a.get() == f66477e && this.f66480c == null) {
            return true;
        }
        return false;
    }

    public boolean hasObservers() {
        if (((CompletableDisposable[]) this.f66478a.get()).length != 0) {
            return true;
        }
        return false;
    }

    public boolean hasThrowable() {
        if (this.f66478a.get() == f66477e && this.f66480c != null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.CompletableObserver
    public void onComplete() {
        if (this.f66479b.compareAndSet(false, true)) {
            for (CompletableDisposable completableDisposable : (CompletableDisposable[]) this.f66478a.getAndSet(f66477e)) {
                completableDisposable.downstream.onComplete();
            }
        }
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f66479b.compareAndSet(false, true)) {
            this.f66480c = th2;
            for (CompletableDisposable completableDisposable : (CompletableDisposable[]) this.f66478a.getAndSet(f66477e)) {
                completableDisposable.downstream.onError(th2);
            }
            return;
        }
        RxJavaPlugins.onError(th2);
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        if (this.f66478a.get() == f66477e) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        CompletableDisposable completableDisposable = new CompletableDisposable(completableObserver, this);
        completableObserver.onSubscribe(completableDisposable);
        if (m30122e(completableDisposable)) {
            if (completableDisposable.isDisposed()) {
                m30121f(completableDisposable);
                return;
            }
            return;
        }
        Throwable th2 = this.f66480c;
        if (th2 != null) {
            completableObserver.onError(th2);
        } else {
            completableObserver.onComplete();
        }
    }
}