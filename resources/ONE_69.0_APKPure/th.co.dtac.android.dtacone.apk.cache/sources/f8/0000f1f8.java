package org.apache.http.impl.client;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public final class FutureRequestExecutionMetrics {

    /* renamed from: a */
    public final AtomicLong f74168a = new AtomicLong();

    /* renamed from: b */
    public final AtomicLong f74169b = new AtomicLong();

    /* renamed from: c */
    public final C12582a f74170c = new C12582a();

    /* renamed from: d */
    public final C12582a f74171d = new C12582a();

    /* renamed from: e */
    public final C12582a f74172e = new C12582a();

    /* renamed from: f */
    public final C12582a f74173f = new C12582a();

    /* renamed from: org.apache.http.impl.client.FutureRequestExecutionMetrics$a */
    /* loaded from: classes6.dex */
    public static class C12582a {

        /* renamed from: a */
        public final AtomicLong f74174a = new AtomicLong(0);

        /* renamed from: b */
        public final AtomicLong f74175b = new AtomicLong(0);

        /* renamed from: a */
        public long m24855a() {
            long j = this.f74174a.get();
            if (j <= 0) {
                return 0L;
            }
            return this.f74175b.get() / j;
        }

        /* renamed from: b */
        public long m24854b() {
            return this.f74174a.get();
        }

        /* renamed from: c */
        public void m24853c(long j) {
            this.f74174a.incrementAndGet();
            this.f74175b.addAndGet(System.currentTimeMillis() - j);
        }

        public String toString() {
            return "[count=" + m24854b() + ", averageDuration=" + m24855a() + "]";
        }
    }

    /* renamed from: a */
    public AtomicLong m24861a() {
        return this.f74168a;
    }

    /* renamed from: b */
    public C12582a m24860b() {
        return this.f74171d;
    }

    /* renamed from: c */
    public C12582a m24859c() {
        return this.f74172e;
    }

    /* renamed from: d */
    public AtomicLong m24858d() {
        return this.f74169b;
    }

    /* renamed from: e */
    public C12582a m24857e() {
        return this.f74170c;
    }

    /* renamed from: f */
    public C12582a m24856f() {
        return this.f74173f;
    }

    public long getActiveConnectionCount() {
        return this.f74168a.get();
    }

    public long getFailedConnectionAverageDuration() {
        return this.f74171d.m24855a();
    }

    public long getFailedConnectionCount() {
        return this.f74171d.m24854b();
    }

    public long getRequestAverageDuration() {
        return this.f74172e.m24855a();
    }

    public long getRequestCount() {
        return this.f74172e.m24854b();
    }

    public long getScheduledConnectionCount() {
        return this.f74169b.get();
    }

    public long getSuccessfulConnectionAverageDuration() {
        return this.f74170c.m24855a();
    }

    public long getSuccessfulConnectionCount() {
        return this.f74170c.m24854b();
    }

    public long getTaskAverageDuration() {
        return this.f74173f.m24855a();
    }

    public long getTaskCount() {
        return this.f74173f.m24854b();
    }

    public String toString() {
        return "[activeConnections=" + this.f74168a + ", scheduledConnections=" + this.f74169b + ", successfulConnections=" + this.f74170c + ", failedConnections=" + this.f74171d + ", requests=" + this.f74172e + ", tasks=" + this.f74173f + "]";
    }
}