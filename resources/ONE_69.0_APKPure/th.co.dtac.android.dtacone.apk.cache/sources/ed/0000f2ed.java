package org.apache.http.pool;

import java.util.concurrent.TimeUnit;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: classes6.dex */
public abstract class PoolEntry<T, C> {

    /* renamed from: a */
    public final String f74672a;

    /* renamed from: b */
    public final Object f74673b;

    /* renamed from: c */
    public final Object f74674c;

    /* renamed from: d */
    public final long f74675d;

    /* renamed from: e */
    public final long f74676e;

    /* renamed from: f */
    public long f74677f;

    /* renamed from: g */
    public long f74678g;

    /* renamed from: h */
    public volatile Object f74679h;

    public PoolEntry(String str, T t, C c, long j, TimeUnit timeUnit) {
        Args.notNull(t, "Route");
        Args.notNull(c, "Connection");
        Args.notNull(timeUnit, "Time unit");
        this.f74672a = str;
        this.f74673b = t;
        this.f74674c = c;
        long currentTimeMillis = System.currentTimeMillis();
        this.f74675d = currentTimeMillis;
        this.f74677f = currentTimeMillis;
        if (j > 0) {
            long millis = currentTimeMillis + timeUnit.toMillis(j);
            this.f74676e = millis > 0 ? millis : Long.MAX_VALUE;
        } else {
            this.f74676e = Long.MAX_VALUE;
        }
        this.f74678g = this.f74676e;
    }

    public abstract void close();

    public C getConnection() {
        return (C) this.f74674c;
    }

    public long getCreated() {
        return this.f74675d;
    }

    public synchronized long getExpiry() {
        return this.f74678g;
    }

    public String getId() {
        return this.f74672a;
    }

    public T getRoute() {
        return (T) this.f74673b;
    }

    public Object getState() {
        return this.f74679h;
    }

    public synchronized long getUpdated() {
        return this.f74677f;
    }

    @Deprecated
    public long getValidUnit() {
        return this.f74676e;
    }

    public long getValidityDeadline() {
        return this.f74676e;
    }

    public abstract boolean isClosed();

    public synchronized boolean isExpired(long j) {
        boolean z;
        if (j >= this.f74678g) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public void setState(Object obj) {
        this.f74679h = obj;
    }

    public String toString() {
        return "[id:" + this.f74672a + "][route:" + this.f74673b + "][state:" + this.f74679h + "]";
    }

    public synchronized void updateExpiry(long j, TimeUnit timeUnit) {
        long j2;
        try {
            Args.notNull(timeUnit, "Time unit");
            long currentTimeMillis = System.currentTimeMillis();
            this.f74677f = currentTimeMillis;
            if (j > 0) {
                j2 = currentTimeMillis + timeUnit.toMillis(j);
            } else {
                j2 = Long.MAX_VALUE;
            }
            this.f74678g = Math.min(j2, this.f74676e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public PoolEntry(String str, T t, C c) {
        this(str, t, c, 0L, TimeUnit.MILLISECONDS);
    }
}