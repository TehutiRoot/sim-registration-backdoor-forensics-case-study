package io.reactivex.internal.operators.mixed;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Notification;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

@Experimental
/* loaded from: classes5.dex */
public final class MaterializeSingleObserver<T> implements SingleObserver<T>, MaybeObserver<T>, CompletableObserver, Disposable {

    /* renamed from: a */
    public final SingleObserver f64946a;

    /* renamed from: b */
    public Disposable f64947b;

    public MaterializeSingleObserver(SingleObserver<? super Notification<T>> singleObserver) {
        this.f64946a = singleObserver;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.f64947b.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f64947b.isDisposed();
    }

    @Override // io.reactivex.MaybeObserver
    public void onComplete() {
        this.f64946a.onSuccess(Notification.createOnComplete());
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th2) {
        this.f64946a.onSuccess(Notification.createOnError(th2));
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.f64947b, disposable)) {
            this.f64947b = disposable;
            this.f64946a.onSubscribe(this);
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t) {
        this.f64946a.onSuccess(Notification.createOnNext(t));
    }
}
