package io.grpc;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class Deadline implements Comparable<Deadline> {

    /* renamed from: d */
    public static final C10507b f63221d = new C10507b();

    /* renamed from: e */
    public static final long f63222e;

    /* renamed from: f */
    public static final long f63223f;

    /* renamed from: g */
    public static final long f63224g;

    /* renamed from: a */
    public final Ticker f63225a;

    /* renamed from: b */
    public final long f63226b;

    /* renamed from: c */
    public volatile boolean f63227c;

    /* loaded from: classes5.dex */
    public static abstract class Ticker {
        public abstract long nanoTime();
    }

    /* renamed from: io.grpc.Deadline$b */
    /* loaded from: classes5.dex */
    public static class C10507b extends Ticker {
        public C10507b() {
        }

        @Override // io.grpc.Deadline.Ticker
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f63222e = nanos;
        f63223f = -nanos;
        f63224g = TimeUnit.SECONDS.toNanos(1L);
    }

    public Deadline(Ticker ticker, long j, boolean z) {
        this(ticker, ticker.nanoTime(), j, z);
    }

    /* renamed from: a */
    public static Object m30778a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static Deadline after(long j, TimeUnit timeUnit) {
        return after(j, timeUnit, f63221d);
    }

    public static Ticker getSystemTicker() {
        return f63221d;
    }

    /* renamed from: b */
    public final void m30777b(Deadline deadline) {
        if (this.f63225a == deadline.f63225a) {
            return;
        }
        throw new AssertionError("Tickers (" + this.f63225a + " and " + deadline.f63225a + ") don't match. Custom Ticker should only be used in tests!");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Deadline)) {
            return false;
        }
        Deadline deadline = (Deadline) obj;
        Ticker ticker = this.f63225a;
        if (ticker != null ? ticker != deadline.f63225a : deadline.f63225a != null) {
            return false;
        }
        if (this.f63226b == deadline.f63226b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.asList(this.f63225a, Long.valueOf(this.f63226b)).hashCode();
    }

    public boolean isBefore(Deadline deadline) {
        m30777b(deadline);
        if (this.f63226b - deadline.f63226b < 0) {
            return true;
        }
        return false;
    }

    public boolean isExpired() {
        if (!this.f63227c) {
            if (this.f63226b - this.f63225a.nanoTime() <= 0) {
                this.f63227c = true;
            } else {
                return false;
            }
        }
        return true;
    }

    public Deadline minimum(Deadline deadline) {
        m30777b(deadline);
        if (isBefore(deadline)) {
            return this;
        }
        return deadline;
    }

    public Deadline offset(long j, TimeUnit timeUnit) {
        if (j == 0) {
            return this;
        }
        return new Deadline(this.f63225a, this.f63226b, timeUnit.toNanos(j), isExpired());
    }

    public ScheduledFuture<?> runOnExpiration(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        m30778a(runnable, "task");
        m30778a(scheduledExecutorService, "scheduler");
        return scheduledExecutorService.schedule(runnable, this.f63226b - this.f63225a.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public long timeRemaining(TimeUnit timeUnit) {
        long nanoTime = this.f63225a.nanoTime();
        if (!this.f63227c && this.f63226b - nanoTime <= 0) {
            this.f63227c = true;
        }
        return timeUnit.convert(this.f63226b - nanoTime, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long timeRemaining = timeRemaining(TimeUnit.NANOSECONDS);
        long abs = Math.abs(timeRemaining);
        long j = f63224g;
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
        if (this.f63225a != f63221d) {
            sb.append(" (ticker=" + this.f63225a + ")");
        }
        return sb.toString();
    }

    public Deadline(Ticker ticker, long j, long j2, boolean z) {
        this.f63225a = ticker;
        long min = Math.min(f63222e, Math.max(f63223f, j2));
        this.f63226b = j + min;
        this.f63227c = z && min <= 0;
    }

    public static Deadline after(long j, TimeUnit timeUnit, Ticker ticker) {
        m30778a(timeUnit, "units");
        return new Deadline(ticker, timeUnit.toNanos(j), true);
    }

    @Override // java.lang.Comparable
    public int compareTo(Deadline deadline) {
        m30777b(deadline);
        int i = ((this.f63226b - deadline.f63226b) > 0L ? 1 : ((this.f63226b - deadline.f63226b) == 0L ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }
}