package io.reactivex.disposables;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class SerialDisposable implements Disposable {

    /* renamed from: a */
    public final AtomicReference f63881a;

    public SerialDisposable() {
        this.f63881a = new AtomicReference();
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this.f63881a);
    }

    @Nullable
    public Disposable get() {
        Disposable disposable = (Disposable) this.f63881a.get();
        if (disposable == DisposableHelper.DISPOSED) {
            return Disposables.disposed();
        }
        return disposable;
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) this.f63881a.get());
    }

    public boolean replace(@Nullable Disposable disposable) {
        return DisposableHelper.replace(this.f63881a, disposable);
    }

    public boolean set(@Nullable Disposable disposable) {
        return DisposableHelper.set(this.f63881a, disposable);
    }

    public SerialDisposable(@Nullable Disposable disposable) {
        this.f63881a = new AtomicReference(disposable);
    }
}