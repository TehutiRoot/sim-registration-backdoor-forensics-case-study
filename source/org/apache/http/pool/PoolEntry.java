package org.apache.http.pool;

import java.util.concurrent.TimeUnit;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: classes6.dex */
public abstract class PoolEntry<T, C> {

    /* renamed from: a */
    public final String f74588a;

    /* renamed from: b */
    public final Object f74589b;

    /* renamed from: c */
    public final Object f74590c;

    /* renamed from: d */
    public final long f74591d;

    /* renamed from: e */
    public final long f74592e;

    /* renamed from: f */
    public long f74593f;

    /* renamed from: g */
    public long f74594g;

    /* renamed from: h */
    public volatile Object f74595h;

    public PoolEntry(String str, T t, C c, long j, TimeUnit timeUnit) {
        Args.notNull(t, "Route");
        Args.notNull(c, "Connection");
        Args.notNull(timeUnit, "Time unit");
        this.f74588a = str;
        this.f74589b = t;
        this.f74590c = c;
        long currentTimeMillis = System.currentTimeMillis();
        this.f74591d = currentTimeMillis;
        this.f74593f = currentTimeMillis;
        if (j > 0) {
            long millis = currentTimeMillis + timeUnit.toMillis(j);
            this.f74592e = millis > 0 ? millis : Long.MAX_VALUE;
        } else {
            this.f74592e = Long.MAX_VALUE;
        }
        this.f74594g = this.f74592e;
    }

    public abstract void close();

    public C getConnection() {
        return (C) this.f74590c;
    }

    public long getCreated() {
        return this.f74591d;
    }

    public synchronized long getExpiry() {
        return this.f74594g;
    }

    public String getId() {
        return this.f74588a;
    }

    public T getRoute() {
        return (T) this.f74589b;
    }

    public Object getState() {
        return this.f74595h;
    }

    public synchronized long getUpdated() {
        return this.f74593f;
    }

    @Deprecated
    public long getValidUnit() {
        return this.f74592e;
    }

    public long getValidityDeadline() {
        return this.f74592e;
    }

    public abstract boolean isClosed();

    public synchronized boolean isExpired(long j) {
        boolean z;
        if (j >= this.f74594g) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public void setState(Object obj) {
        this.f74595h = obj;
    }

    public String toString() {
        return "[id:" + this.f74588a + "][route:" + this.f74589b + "][state:" + this.f74595h + "]";
    }

    public synchronized void updateExpiry(long j, TimeUnit timeUnit) {
        long j2;
        try {
            Args.notNull(timeUnit, "Time unit");
            long currentTimeMillis = System.currentTimeMillis();
            this.f74593f = currentTimeMillis;
            if (j > 0) {
                j2 = currentTimeMillis + timeUnit.toMillis(j);
            } else {
                j2 = Long.MAX_VALUE;
            }
            this.f74594g = Math.min(j2, this.f74592e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public PoolEntry(String str, T t, C c) {
        this(str, t, c, 0L, TimeUnit.MILLISECONDS);
    }
}
