package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EndConsumerHelper;

/* loaded from: classes5.dex */
public abstract class DefaultObserver<T> implements Observer<T> {

    /* renamed from: a */
    public Disposable f66133a;

    public final void cancel() {
        Disposable disposable = this.f66133a;
        this.f66133a = DisposableHelper.DISPOSED;
        disposable.dispose();
    }

    public void onStart() {
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(@NonNull Disposable disposable) {
        if (EndConsumerHelper.validate(this.f66133a, disposable, getClass())) {
            this.f66133a = disposable;
            onStart();
        }
    }
}
