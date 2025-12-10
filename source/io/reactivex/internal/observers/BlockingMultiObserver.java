package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes5.dex */
public final class BlockingMultiObserver<T> extends CountDownLatch implements SingleObserver<T>, CompletableObserver, MaybeObserver<T> {

    /* renamed from: a */
    public Object f63865a;

    /* renamed from: b */
    public Throwable f63866b;

    /* renamed from: c */
    public Disposable f63867c;

    /* renamed from: d */
    public volatile boolean f63868d;

    public BlockingMultiObserver() {
        super(1);
    }

    /* renamed from: a */
    public void m30076a() {
        this.f63868d = true;
        Disposable disposable = this.f63867c;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public boolean blockingAwait(long j, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                if (!await(j, timeUnit)) {
                    m30076a();
                    return false;
                }
            } catch (InterruptedException e) {
                m30076a();
                throw ExceptionHelper.wrapOrThrow(e);
            }
        }
        Throwable th2 = this.f63866b;
        if (th2 == null) {
            return true;
        }
        throw ExceptionHelper.wrapOrThrow(th2);
    }

    public T blockingGet() {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e) {
                m30076a();
                throw ExceptionHelper.wrapOrThrow(e);
            }
        }
        Throwable th2 = this.f63866b;
        if (th2 == null) {
            return (T) this.f63865a;
        }
        throw ExceptionHelper.wrapOrThrow(th2);
    }

    public Throwable blockingGetError() {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e) {
                m30076a();
                return e;
            }
        }
        return this.f63866b;
    }

    @Override // io.reactivex.CompletableObserver
    public void onComplete() {
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th2) {
        this.f63866b = th2;
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable) {
        this.f63867c = disposable;
        if (this.f63868d) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t) {
        this.f63865a = t;
        countDown();
    }

    public Throwable blockingGetError(long j, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                if (!await(j, timeUnit)) {
                    m30076a();
                    throw ExceptionHelper.wrapOrThrow(new TimeoutException(ExceptionHelper.timeoutMessage(j, timeUnit)));
                }
            } catch (InterruptedException e) {
                m30076a();
                throw ExceptionHelper.wrapOrThrow(e);
            }
        }
        return this.f63866b;
    }

    public T blockingGet(T t) {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e) {
                m30076a();
                throw ExceptionHelper.wrapOrThrow(e);
            }
        }
        Throwable th2 = this.f63866b;
        if (th2 == null) {
            T t2 = (T) this.f63865a;
            return t2 != null ? t2 : t;
        }
        throw ExceptionHelper.wrapOrThrow(th2);
    }
}
