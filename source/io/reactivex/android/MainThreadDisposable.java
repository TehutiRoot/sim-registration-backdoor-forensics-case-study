package io.reactivex.android;

import android.os.Looper;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public abstract class MainThreadDisposable implements Disposable {

    /* renamed from: a */
    public final AtomicBoolean f63809a = new AtomicBoolean();

    /* renamed from: io.reactivex.android.MainThreadDisposable$a */
    /* loaded from: classes5.dex */
    public class RunnableC10744a implements Runnable {
        public RunnableC10744a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainThreadDisposable.this.onDispose();
        }
    }

    public static void verifyMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName());
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.f63809a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                onDispose();
            } else {
                AndroidSchedulers.mainThread().scheduleDirect(new RunnableC10744a());
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f63809a.get();
    }

    public abstract void onDispose();
}
