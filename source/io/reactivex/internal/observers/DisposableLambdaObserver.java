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
    public final Observer f63869a;

    /* renamed from: b */
    public final Consumer f63870b;

    /* renamed from: c */
    public final Action f63871c;

    /* renamed from: d */
    public Disposable f63872d;

    public DisposableLambdaObserver(Observer<? super T> observer, Consumer<? super Disposable> consumer, Action action) {
        this.f63869a = observer;
        this.f63870b = consumer;
        this.f63871c = action;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        Disposable disposable = this.f63872d;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable != disposableHelper) {
            this.f63872d = disposableHelper;
            try {
                this.f63871c.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            disposable.dispose();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f63872d.isDisposed();
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        Disposable disposable = this.f63872d;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable != disposableHelper) {
            this.f63872d = disposableHelper;
            this.f63869a.onComplete();
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        Disposable disposable = this.f63872d;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (disposable != disposableHelper) {
            this.f63872d = disposableHelper;
            this.f63869a.onError(th2);
            return;
        }
        RxJavaPlugins.onError(th2);
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        this.f63869a.onNext(t);
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        try {
            this.f63870b.accept(disposable);
            if (DisposableHelper.validate(this.f63872d, disposable)) {
                this.f63872d = disposable;
                this.f63869a.onSubscribe(this);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            disposable.dispose();
            this.f63872d = DisposableHelper.DISPOSED;
            EmptyDisposable.error(th2, this.f63869a);
        }
    }
}
