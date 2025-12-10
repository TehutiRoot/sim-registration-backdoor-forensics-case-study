package org.apache.http.impl.client;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public final class FutureRequestExecutionMetrics {

    /* renamed from: a */
    public final AtomicLong f74084a = new AtomicLong();

    /* renamed from: b */
    public final AtomicLong f74085b = new AtomicLong();

    /* renamed from: c */
    public final C12582a f74086c = new C12582a();

    /* renamed from: d */
    public final C12582a f74087d = new C12582a();

    /* renamed from: e */
    public final C12582a f74088e = new C12582a();

    /* renamed from: f */
    public final C12582a f74089f = new C12582a();

    /* renamed from: org.apache.http.impl.client.FutureRequestExecutionMetrics$a */
    /* loaded from: classes6.dex */
    public static class C12582a {

        /* renamed from: a */
        public final AtomicLong f74090a = new AtomicLong(0);

        /* renamed from: b */
        public final AtomicLong f74091b = new AtomicLong(0);

        /* renamed from: a */
        public long m24665a() {
            long j = this.f74090a.get();
            if (j <= 0) {
                return 0L;
            }
            return this.f74091b.get() / j;
        }

        /* renamed from: b */
        public long m24664b() {
            return this.f74090a.get();
        }

        /* renamed from: c */
        public void m24663c(long j) {
            this.f74090a.incrementAndGet();
            this.f74091b.addAndGet(System.currentTimeMillis() - j);
        }

        public String toString() {
            return "[count=" + m24664b() + ", averageDuration=" + m24665a() + "]";
        }
    }

    /* renamed from: a */
    public AtomicLong m24671a() {
        return this.f74084a;
    }

    /* renamed from: b */
    public C12582a m24670b() {
        return this.f74087d;
    }

    /* renamed from: c */
    public C12582a m24669c() {
        return this.f74088e;
    }

    /* renamed from: d */
    public AtomicLong m24668d() {
        return this.f74085b;
    }

    /* renamed from: e */
    public C12582a m24667e() {
        return this.f74086c;
    }

    /* renamed from: f */
    public C12582a m24666f() {
        return this.f74089f;
    }

    public long getActiveConnectionCount() {
        return this.f74084a.get();
    }

    public long getFailedConnectionAverageDuration() {
        return this.f74087d.m24665a();
    }

    public long getFailedConnectionCount() {
        return this.f74087d.m24664b();
    }

    public long getRequestAverageDuration() {
        return this.f74088e.m24665a();
    }

    public long getRequestCount() {
        return this.f74088e.m24664b();
    }

    public long getScheduledConnectionCount() {
        return this.f74085b.get();
    }

    public long getSuccessfulConnectionAverageDuration() {
        return this.f74086c.m24665a();
    }

    public long getSuccessfulConnectionCount() {
        return this.f74086c.m24664b();
    }

    public long getTaskAverageDuration() {
        return this.f74089f.m24665a();
    }

    public long getTaskCount() {
        return this.f74089f.m24664b();
    }

    public String toString() {
        return "[activeConnections=" + this.f74084a + ", scheduledConnections=" + this.f74085b + ", successfulConnections=" + this.f74086c + ", failedConnections=" + this.f74087d + ", requests=" + this.f74088e + ", tasks=" + this.f74089f + "]";
    }
}
