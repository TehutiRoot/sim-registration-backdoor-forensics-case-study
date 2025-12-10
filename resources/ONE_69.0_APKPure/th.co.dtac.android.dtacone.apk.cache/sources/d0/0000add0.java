package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.util.concurrent.AbstractC8304h;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

@Beta
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public abstract class RateLimiter {

    /* renamed from: a */
    public final AbstractC8255a f54393a;

    /* renamed from: b */
    public volatile Object f54394b;

    /* renamed from: com.google.common.util.concurrent.RateLimiter$a */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8255a {

        /* renamed from: com.google.common.util.concurrent.RateLimiter$a$a */
        /* loaded from: classes4.dex */
        public class C8256a extends AbstractC8255a {

            /* renamed from: a */
            public final Stopwatch f54395a = Stopwatch.createStarted();

            @Override // com.google.common.util.concurrent.RateLimiter.AbstractC8255a
            /* renamed from: b */
            public long mo39446b() {
                return this.f54395a.elapsed(TimeUnit.MICROSECONDS);
            }

            @Override // com.google.common.util.concurrent.RateLimiter.AbstractC8255a
            /* renamed from: c */
            public void mo39445c(long j) {
                if (j > 0) {
                    Uninterruptibles.sleepUninterruptibly(j, TimeUnit.MICROSECONDS);
                }
            }
        }

        /* renamed from: a */
        public static AbstractC8255a m39447a() {
            return new C8256a();
        }

        /* renamed from: b */
        public abstract long mo39446b();

        /* renamed from: c */
        public abstract void mo39445c(long j);
    }

    public RateLimiter(AbstractC8255a abstractC8255a) {
        this.f54393a = (AbstractC8255a) Preconditions.checkNotNull(abstractC8255a);
    }

    /* renamed from: b */
    public static void m39453b(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Requested permits (%s) must be positive", i);
    }

    /* renamed from: c */
    public static RateLimiter m39452c(double d, long j, TimeUnit timeUnit, double d2, AbstractC8255a abstractC8255a) {
        AbstractC8304h.C8307c c8307c = new AbstractC8304h.C8307c(abstractC8255a, j, timeUnit, d2);
        c8307c.setRate(d);
        return c8307c;
    }

    public static RateLimiter create(double d) {
        return m39451d(d, AbstractC8255a.m39447a());
    }

    /* renamed from: d */
    public static RateLimiter m39451d(double d, AbstractC8255a abstractC8255a) {
        AbstractC8304h.C8306b c8306b = new AbstractC8304h.C8306b(abstractC8255a, 1.0d);
        c8306b.setRate(d);
        return c8306b;
    }

    /* renamed from: a */
    public final boolean m39454a(long j, long j2) {
        if (mo39341h(j) - j2 <= j) {
            return true;
        }
        return false;
    }

    @CanIgnoreReturnValue
    public double acquire() {
        return acquire(1);
    }

    /* renamed from: e */
    public abstract double mo39343e();

    /* renamed from: f */
    public abstract void mo39342f(double d, long j);

    /* renamed from: g */
    public final Object m39450g() {
        Object obj = this.f54394b;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.f54394b;
                    if (obj == null) {
                        obj = new Object();
                        this.f54394b = obj;
                    }
                } finally {
                }
            }
        }
        return obj;
    }

    public final double getRate() {
        double mo39343e;
        synchronized (m39450g()) {
            mo39343e = mo39343e();
        }
        return mo39343e;
    }

    /* renamed from: h */
    public abstract long mo39341h(long j);

    /* renamed from: i */
    public final long m39449i(int i) {
        long m39448j;
        m39453b(i);
        synchronized (m39450g()) {
            m39448j = m39448j(i, this.f54393a.mo39446b());
        }
        return m39448j;
    }

    /* renamed from: j */
    public final long m39448j(int i, long j) {
        return Math.max(mo39340k(i, j) - j, 0L);
    }

    /* renamed from: k */
    public abstract long mo39340k(int i, long j);

    public final void setRate(double d) {
        boolean z;
        if (d > 0.0d) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "rate must be positive");
        synchronized (m39450g()) {
            mo39342f(d, this.f54393a.mo39446b());
        }
    }

    public String toString() {
        return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(getRate()));
    }

    public boolean tryAcquire(long j, TimeUnit timeUnit) {
        return tryAcquire(1, j, timeUnit);
    }

    public static RateLimiter create(double d, long j, TimeUnit timeUnit) {
        Preconditions.checkArgument(j >= 0, "warmupPeriod must not be negative: %s", j);
        return m39452c(d, j, timeUnit, 3.0d, AbstractC8255a.m39447a());
    }

    @CanIgnoreReturnValue
    public double acquire(int i) {
        long m39449i = m39449i(i);
        this.f54393a.mo39445c(m39449i);
        return (m39449i * 1.0d) / TimeUnit.SECONDS.toMicros(1L);
    }

    public boolean tryAcquire(int i) {
        return tryAcquire(i, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire() {
        return tryAcquire(1, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire(int i, long j, TimeUnit timeUnit) {
        long max = Math.max(timeUnit.toMicros(j), 0L);
        m39453b(i);
        synchronized (m39450g()) {
            try {
                long mo39446b = this.f54393a.mo39446b();
                if (m39454a(mo39446b, max)) {
                    this.f54393a.mo39445c(m39448j(i, mo39446b));
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}