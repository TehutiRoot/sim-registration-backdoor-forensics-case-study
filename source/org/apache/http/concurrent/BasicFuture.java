package org.apache.http.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.util.Args;

/* loaded from: classes6.dex */
public class BasicFuture<T> implements Future<T>, Cancellable {

    /* renamed from: a */
    public final FutureCallback f73760a;

    /* renamed from: b */
    public volatile boolean f73761b;

    /* renamed from: c */
    public volatile boolean f73762c;

    /* renamed from: d */
    public volatile Object f73763d;

    /* renamed from: e */
    public volatile Exception f73764e;

    public BasicFuture(FutureCallback<T> futureCallback) {
        this.f73760a = futureCallback;
    }

    /* renamed from: a */
    public final Object m24798a() {
        if (this.f73764e == null) {
            if (!this.f73762c) {
                return this.f73763d;
            }
            throw new CancellationException();
        }
        throw new ExecutionException(this.f73764e);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (this.f73761b) {
                    return false;
                }
                this.f73761b = true;
                this.f73762c = true;
                notifyAll();
                FutureCallback futureCallback = this.f73760a;
                if (futureCallback != null) {
                    futureCallback.cancelled();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean completed(T t) {
        synchronized (this) {
            try {
                if (this.f73761b) {
                    return false;
                }
                this.f73761b = true;
                this.f73763d = t;
                notifyAll();
                FutureCallback futureCallback = this.f73760a;
                if (futureCallback != null) {
                    futureCallback.completed(t);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean failed(Exception exc) {
        synchronized (this) {
            try {
                if (this.f73761b) {
                    return false;
                }
                this.f73761b = true;
                this.f73764e = exc;
                notifyAll();
                FutureCallback futureCallback = this.f73760a;
                if (futureCallback != null) {
                    futureCallback.failed(exc);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public synchronized T get() throws InterruptedException, ExecutionException {
        while (!this.f73761b) {
            try {
                wait();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (T) m24798a();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f73762c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f73761b;
    }

    @Override // java.util.concurrent.Future
    public synchronized T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        Args.notNull(timeUnit, "Time unit");
        long millis = timeUnit.toMillis(j);
        int i = (millis > 0L ? 1 : (millis == 0L ? 0 : -1));
        long currentTimeMillis = i <= 0 ? 0L : System.currentTimeMillis();
        if (this.f73761b) {
            return (T) m24798a();
        } else if (i <= 0) {
            throw new TimeoutException();
        } else {
            long j2 = millis;
            while (true) {
                wait(j2);
                if (this.f73761b) {
                    return (T) m24798a();
                }
                j2 = millis - (System.currentTimeMillis() - currentTimeMillis);
                if (j2 <= 0) {
                    throw new TimeoutException();
                }
            }
        }
    }

    @Override // org.apache.http.concurrent.Cancellable
    public boolean cancel() {
        return cancel(true);
    }
}
