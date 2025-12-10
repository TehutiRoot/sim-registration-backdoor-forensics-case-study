package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.util.concurrent.AbstractC8315h;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

@Beta
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public abstract class RateLimiter {

    /* renamed from: a */
    public final AbstractC8266a f54381a;

    /* renamed from: b */
    public volatile Object f54382b;

    /* renamed from: com.google.common.util.concurrent.RateLimiter$a */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8266a {

        /* renamed from: com.google.common.util.concurrent.RateLimiter$a$a */
        /* loaded from: classes4.dex */
        public class C8267a extends AbstractC8266a {

            /* renamed from: a */
            public final Stopwatch f54383a = Stopwatch.createStarted();

            @Override // com.google.common.util.concurrent.RateLimiter.AbstractC8266a
            /* renamed from: b */
            public long mo39454b() {
                return this.f54383a.elapsed(TimeUnit.MICROSECONDS);
            }

            @Override // com.google.common.util.concurrent.RateLimiter.AbstractC8266a
            /* renamed from: c */
            public void mo39453c(long j) {
                if (j > 0) {
                    Uninterruptibles.sleepUninterruptibly(j, TimeUnit.MICROSECONDS);
                }
            }
        }

        /* renamed from: a */
        public static AbstractC8266a m39455a() {
            return new C8267a();
        }

        /* renamed from: b */
        public abstract long mo39454b();

        /* renamed from: c */
        public abstract void mo39453c(long j);
    }

    public RateLimiter(AbstractC8266a abstractC8266a) {
        this.f54381a = (AbstractC8266a) Preconditions.checkNotNull(abstractC8266a);
    }

    /* renamed from: b */
    public static void m39461b(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Requested permits (%s) must be positive", i);
    }

    /* renamed from: c */
    public static RateLimiter m39460c(double d, long j, TimeUnit timeUnit, double d2, AbstractC8266a abstractC8266a) {
        AbstractC8315h.C8318c c8318c = new AbstractC8315h.C8318c(abstractC8266a, j, timeUnit, d2);
        c8318c.setRate(d);
        return c8318c;
    }

    public static RateLimiter create(double d) {
        return m39459d(d, AbstractC8266a.m39455a());
    }

    /* renamed from: d */
    public static RateLimiter m39459d(double d, AbstractC8266a abstractC8266a) {
        AbstractC8315h.C8317b c8317b = new AbstractC8315h.C8317b(abstractC8266a, 1.0d);
        c8317b.setRate(d);
        return c8317b;
    }

    /* renamed from: a */
    public final boolean m39462a(long j, long j2) {
        if (mo39349h(j) - j2 <= j) {
            return true;
        }
        return false;
    }

    @CanIgnoreReturnValue
    public double acquire() {
        return acquire(1);
    }

    /* renamed from: e */
    public abstract double mo39351e();

    /* renamed from: f */
    public abstract void mo39350f(double d, long j);

    /* renamed from: g */
    public final Object m39458g() {
        Object obj = this.f54382b;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.f54382b;
                    if (obj == null) {
                        obj = new Object();
                        this.f54382b = obj;
                    }
                } finally {
                }
            }
        }
        return obj;
    }

    public final double getRate() {
        double mo39351e;
        synchronized (m39458g()) {
            mo39351e = mo39351e();
        }
        return mo39351e;
    }

    /* renamed from: h */
    public abstract long mo39349h(long j);

    /* renamed from: i */
    public final long m39457i(int i) {
        long m39456j;
        m39461b(i);
        synchronized (m39458g()) {
            m39456j = m39456j(i, this.f54381a.mo39454b());
        }
        return m39456j;
    }

    /* renamed from: j */
    public final long m39456j(int i, long j) {
        return Math.max(mo39348k(i, j) - j, 0L);
    }

    /* renamed from: k */
    public abstract long mo39348k(int i, long j);

    public final void setRate(double d) {
        boolean z;
        if (d > 0.0d) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "rate must be positive");
        synchronized (m39458g()) {
            mo39350f(d, this.f54381a.mo39454b());
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
        return m39460c(d, j, timeUnit, 3.0d, AbstractC8266a.m39455a());
    }

    @CanIgnoreReturnValue
    public double acquire(int i) {
        long m39457i = m39457i(i);
        this.f54381a.mo39453c(m39457i);
        return (m39457i * 1.0d) / TimeUnit.SECONDS.toMicros(1L);
    }

    public boolean tryAcquire(int i) {
        return tryAcquire(i, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire() {
        return tryAcquire(1, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire(int i, long j, TimeUnit timeUnit) {
        long max = Math.max(timeUnit.toMicros(j), 0L);
        m39461b(i);
        synchronized (m39458g()) {
            try {
                long mo39454b = this.f54381a.mo39454b();
                if (m39462a(mo39454b, max)) {
                    this.f54381a.mo39453c(m39456j(i, mo39454b));
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
