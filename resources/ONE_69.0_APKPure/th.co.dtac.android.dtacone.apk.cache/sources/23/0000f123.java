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
    public final FutureCallback f73844a;

    /* renamed from: b */
    public volatile boolean f73845b;

    /* renamed from: c */
    public volatile boolean f73846c;

    /* renamed from: d */
    public volatile Object f73847d;

    /* renamed from: e */
    public volatile Exception f73848e;

    public BasicFuture(FutureCallback<T> futureCallback) {
        this.f73844a = futureCallback;
    }

    /* renamed from: a */
    public final Object m24988a() {
        if (this.f73848e == null) {
            if (!this.f73846c) {
                return this.f73847d;
            }
            throw new CancellationException();
        }
        throw new ExecutionException(this.f73848e);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (this.f73845b) {
                    return false;
                }
                this.f73845b = true;
                this.f73846c = true;
                notifyAll();
                FutureCallback futureCallback = this.f73844a;
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
                if (this.f73845b) {
                    return false;
                }
                this.f73845b = true;
                this.f73847d = t;
                notifyAll();
                FutureCallback futureCallback = this.f73844a;
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
                if (this.f73845b) {
                    return false;
                }
                this.f73845b = true;
                this.f73848e = exc;
                notifyAll();
                FutureCallback futureCallback = this.f73844a;
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
        while (!this.f73845b) {
            try {
                wait();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (T) m24988a();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f73846c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f73845b;
    }

    @Override // java.util.concurrent.Future
    public synchronized T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        Args.notNull(timeUnit, "Time unit");
        long millis = timeUnit.toMillis(j);
        int i = (millis > 0L ? 1 : (millis == 0L ? 0 : -1));
        long currentTimeMillis = i <= 0 ? 0L : System.currentTimeMillis();
        if (this.f73845b) {
            return (T) m24988a();
        } else if (i <= 0) {
            throw new TimeoutException();
        } else {
            long j2 = millis;
            while (true) {
                wait(j2);
                if (this.f73845b) {
                    return (T) m24988a();
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