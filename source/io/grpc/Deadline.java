package io.grpc;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class Deadline implements Comparable<Deadline> {

    /* renamed from: d */
    public static final C10520b f63158d = new C10520b();

    /* renamed from: e */
    public static final long f63159e;

    /* renamed from: f */
    public static final long f63160f;

    /* renamed from: g */
    public static final long f63161g;

    /* renamed from: a */
    public final Ticker f63162a;

    /* renamed from: b */
    public final long f63163b;

    /* renamed from: c */
    public volatile boolean f63164c;

    /* loaded from: classes5.dex */
    public static abstract class Ticker {
        public abstract long nanoTime();
    }

    /* renamed from: io.grpc.Deadline$b */
    /* loaded from: classes5.dex */
    public static class C10520b extends Ticker {
        public C10520b() {
        }

        @Override // io.grpc.Deadline.Ticker
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f63159e = nanos;
        f63160f = -nanos;
        f63161g = TimeUnit.SECONDS.toNanos(1L);
    }

    public Deadline(Ticker ticker, long j, boolean z) {
        this(ticker, ticker.nanoTime(), j, z);
    }

    /* renamed from: a */
    public static Object m30438a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static Deadline after(long j, TimeUnit timeUnit) {
        return after(j, timeUnit, f63158d);
    }

    public static Ticker getSystemTicker() {
        return f63158d;
    }

    /* renamed from: b */
    public final void m30437b(Deadline deadline) {
        if (this.f63162a == deadline.f63162a) {
            return;
        }
        throw new AssertionError("Tickers (" + this.f63162a + " and " + deadline.f63162a + ") don't match. Custom Ticker should only be used in tests!");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Deadline)) {
            return false;
        }
        Deadline deadline = (Deadline) obj;
        Ticker ticker = this.f63162a;
        if (ticker != null ? ticker != deadline.f63162a : deadline.f63162a != null) {
            return false;
        }
        if (this.f63163b == deadline.f63163b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.asList(this.f63162a, Long.valueOf(this.f63163b)).hashCode();
    }

    public boolean isBefore(Deadline deadline) {
        m30437b(deadline);
        if (this.f63163b - deadline.f63163b < 0) {
            return true;
        }
        return false;
    }

    public boolean isExpired() {
        if (!this.f63164c) {
            if (this.f63163b - this.f63162a.nanoTime() <= 0) {
                this.f63164c = true;
            } else {
                return false;
            }
        }
        return true;
    }

    public Deadline minimum(Deadline deadline) {
        m30437b(deadline);
        if (isBefore(deadline)) {
            return this;
        }
        return deadline;
    }

    public Deadline offset(long j, TimeUnit timeUnit) {
        if (j == 0) {
            return this;
        }
        return new Deadline(this.f63162a, this.f63163b, timeUnit.toNanos(j), isExpired());
    }

    public ScheduledFuture<?> runOnExpiration(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        m30438a(runnable, "task");
        m30438a(scheduledExecutorService, "scheduler");
        return scheduledExecutorService.schedule(runnable, this.f63163b - this.f63162a.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public long timeRemaining(TimeUnit timeUnit) {
        long nanoTime = this.f63162a.nanoTime();
        if (!this.f63164c && this.f63163b - nanoTime <= 0) {
            this.f63164c = true;
        }
        return timeUnit.convert(this.f63163b - nanoTime, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long timeRemaining = timeRemaining(TimeUnit.NANOSECONDS);
        long abs = Math.abs(timeRemaining);
        long j = f63161g;
        long j2 = abs / j;
        long abs2 = Math.abs(timeRemaining) % j;
        StringBuilder sb = new StringBuilder();
        if (timeRemaining < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb.append("s from now");
        if (this.f63162a != f63158d) {
            sb.append(" (ticker=" + this.f63162a + ")");
        }
        return sb.toString();
    }

    public Deadline(Ticker ticker, long j, long j2, boolean z) {
        this.f63162a = ticker;
        long min = Math.min(f63159e, Math.max(f63160f, j2));
        this.f63163b = j + min;
        this.f63164c = z && min <= 0;
    }

    public static Deadline after(long j, TimeUnit timeUnit, Ticker ticker) {
        m30438a(timeUnit, "units");
        return new Deadline(ticker, timeUnit.toNanos(j), true);
    }

    @Override // java.lang.Comparable
    public int compareTo(Deadline deadline) {
        m30437b(deadline);
        int i = ((this.f63163b - deadline.f63163b) > 0L ? 1 : ((this.f63163b - deadline.f63163b) == 0L ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }
}
