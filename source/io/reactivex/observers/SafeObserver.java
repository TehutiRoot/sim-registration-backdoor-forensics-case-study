package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class SafeObserver<T> implements Observer<T>, Disposable {

    /* renamed from: a */
    public final Observer f66146a;

    /* renamed from: b */
    public Disposable f66147b;

    /* renamed from: c */
    public boolean f66148c;

    public SafeObserver(@NonNull Observer<? super T> observer) {
        this.f66146a = observer;
    }

    /* renamed from: a */
    public void m29880a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f66146a.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.f66146a.onError(nullPointerException);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(new CompositeException(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            RxJavaPlugins.onError(new CompositeException(nullPointerException, th3));
        }
    }

    /* renamed from: b */
    public void m29879b() {
        this.f66148c = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f66146a.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.f66146a.onError(nullPointerException);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(new CompositeException(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            RxJavaPlugins.onError(new CompositeException(nullPointerException, th3));
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.f66147b.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f66147b.isDisposed();
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.f66148c) {
            return;
        }
        this.f66148c = true;
        if (this.f66147b == null) {
            m29880a();
            return;
        }
        try {
            this.f66146a.onComplete();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(@NonNull Throwable th2) {
        if (this.f66148c) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f66148c = true;
        if (this.f66147b == null) {
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                this.f66146a.onSubscribe(EmptyDisposable.INSTANCE);
                try {
                    this.f66146a.onError(new CompositeException(th2, nullPointerException));
                    return;
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    RxJavaPlugins.onError(new CompositeException(th2, nullPointerException, th3));
                    return;
                }
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(new CompositeException(th2, nullPointerException, th4));
                return;
            }
        }
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        try {
            this.f66146a.onError(th2);
        } catch (Throwable th5) {
            Exceptions.throwIfFatal(th5);
            RxJavaPlugins.onError(new CompositeException(th2, th5));
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(@NonNull T t) {
        if (this.f66148c) {
            return;
        }
        if (this.f66147b == null) {
            m29879b();
        } else if (t == null) {
            NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f66147b.dispose();
                onError(nullPointerException);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                onError(new CompositeException(nullPointerException, th2));
            }
        } else {
            try {
                this.f66146a.onNext(t);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                try {
                    this.f66147b.dispose();
                    onError(th3);
                } catch (Throwable th4) {
                    Exceptions.throwIfFatal(th4);
                    onError(new CompositeException(th3, th4));
                }
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(@NonNull Disposable disposable) {
        if (DisposableHelper.validate(this.f66147b, disposable)) {
            this.f66147b = disposable;
            try {
                this.f66146a.onSubscribe(this);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f66148c = true;
                try {
                    disposable.dispose();
                    RxJavaPlugins.onError(th2);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    RxJavaPlugins.onError(new CompositeException(th2, th3));
                }
            }
        }
    }
}
