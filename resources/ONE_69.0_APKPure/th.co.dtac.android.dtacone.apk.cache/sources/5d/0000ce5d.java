package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class DisposableLambdaObserver<T> implements Observer<T>, Disposable {

    /* renamed from: a */
    public final Observer f63932a;

    /* renamed from: b */
    public final Consumer f63933b;

    /* renamed from: c */
    public final Action f63934c;

    /* renamed from: d */
    public Disposable f63935d;

    public DisposableLambdaObserver(Observer<? super T> observer, Consumer<? super Disposable> consumer, Action action) {
        this.f63932a = observer;
        this.f63933b = consumer;
        this.f63934c = action;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        Disposable disposable = this.f63935d;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable != disposableHelper) {
            this.f63935d = disposableHelper;
            try {
                this.f63934c.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            disposable.dispose();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f63935d.isDisposed();
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        Disposable disposable = this.f63935d;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable != disposableHelper) {
            this.f63935d = disposableHelper;
            this.f63932a.onComplete();
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        Disposable disposable = this.f63935d;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable != disposableHelper) {
            this.f63935d = disposableHelper;
            this.f63932a.onError(th2);
            return;
        }
        RxJavaPlugins.onError(th2);
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        this.f63932a.onNext(t);
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        try {
            this.f63933b.accept(disposable);
            if (DisposableHelper.validate(this.f63935d, disposable)) {
                this.f63935d = disposable;
                this.f63932a.onSubscribe(this);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            disposable.dispose();
            this.f63935d = DisposableHelper.DISPOSED;
            EmptyDisposable.error(th2, this.f63932a);
        }
    }
}