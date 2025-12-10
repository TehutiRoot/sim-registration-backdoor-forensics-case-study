package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class FutureObserver<T> extends CountDownLatch implements Observer<T>, Future<T>, Disposable {

    /* renamed from: a */
    public Object f63873a;

    /* renamed from: b */
    public Throwable f63874b;

    /* renamed from: c */
    public final AtomicReference f63875c;

    public FutureObserver() {
        super(1);
        this.f63875c = new AtomicReference();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        Disposable disposable;
        DisposableHelper disposableHelper;
        do {
            disposable = (Disposable) this.f63875c.get();
            if (disposable == this || disposable == (disposableHelper = DisposableHelper.DISPOSED)) {
                return false;
            }
        } while (!AbstractC17300An1.m69050a(this.f63875c, disposable, disposableHelper));
        if (disposable != null) {
            disposable.dispose();
        }
        countDown();
        return true;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            await();
        }
        if (!isCancelled()) {
            Throwable th2 = this.f63874b;
            if (th2 == null) {
                return (T) this.f63873a;
            }
            throw new ExecutionException(th2);
        }
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return DisposableHelper.isDisposed((Disposable) this.f63875c.get());
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        if (getCount() == 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        Disposable disposable;
        if (this.f63873a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            disposable = (Disposable) this.f63875c.get();
            if (disposable == this || disposable == DisposableHelper.DISPOSED) {
                return;
            }
        } while (!AbstractC17300An1.m69050a(this.f63875c, disposable, this));
        countDown();
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        Disposable disposable;
        if (this.f63874b == null) {
            this.f63874b = th2;
            do {
                disposable = (Disposable) this.f63875c.get();
                if (disposable == this || disposable == DisposableHelper.DISPOSED) {
                    RxJavaPlugins.onError(th2);
                    return;
                }
            } while (!AbstractC17300An1.m69050a(this.f63875c, disposable, this));
            countDown();
            return;
        }
        RxJavaPlugins.onError(th2);
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        if (this.f63873a != null) {
            ((Disposable) this.f63875c.get()).dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
            return;
        }
        this.f63873a = t;
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this.f63875c, disposable);
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            if (!await(j, timeUnit)) {
                throw new TimeoutException(ExceptionHelper.timeoutMessage(j, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th2 = this.f63874b;
            if (th2 == null) {
                return (T) this.f63873a;
            }
            throw new ExecutionException(th2);
        }
        throw new CancellationException();
    }
}
