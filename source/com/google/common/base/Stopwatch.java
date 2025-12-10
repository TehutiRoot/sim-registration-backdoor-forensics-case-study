package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.concurrent.TimeUnit;
import org.apache.commons.cli.HelpFormatter;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class Stopwatch {

    /* renamed from: a */
    public final Ticker f52792a;

    /* renamed from: b */
    public boolean f52793b;

    /* renamed from: c */
    public long f52794c;

    /* renamed from: d */
    public long f52795d;

    /* renamed from: com.google.common.base.Stopwatch$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C7451a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52796a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f52796a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52796a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52796a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52796a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52796a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f52796a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f52796a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public Stopwatch() {
        this.f52792a = Ticker.systemTicker();
    }

    /* renamed from: a */
    public static String m41278a(TimeUnit timeUnit) {
        switch (C7451a.f52796a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return OperatorName.CLOSE_AND_STROKE;
            case 5:
                return "min";
            case 6:
                return OperatorName.CLOSE_PATH;
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: b */
    public static TimeUnit m41277b(long j) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        if (timeUnit7.convert(j, timeUnit2) > 0) {
            return timeUnit7;
        }
        return timeUnit2;
    }

    public static Stopwatch createStarted() {
        return new Stopwatch().start();
    }

    public static Stopwatch createUnstarted() {
        return new Stopwatch();
    }

    /* renamed from: c */
    public final long m41276c() {
        if (this.f52793b) {
            return (this.f52792a.read() - this.f52795d) + this.f52794c;
        }
        return this.f52794c;
    }

    public long elapsed(TimeUnit timeUnit) {
        return timeUnit.convert(m41276c(), TimeUnit.NANOSECONDS);
    }

    public boolean isRunning() {
        return this.f52793b;
    }

    @CanIgnoreReturnValue
    public Stopwatch reset() {
        this.f52794c = 0L;
        this.f52793b = false;
        return this;
    }

    @CanIgnoreReturnValue
    public Stopwatch start() {
        Preconditions.checkState(!this.f52793b, "This stopwatch is already running.");
        this.f52793b = true;
        this.f52795d = this.f52792a.read();
        return this;
    }

    @CanIgnoreReturnValue
    public Stopwatch stop() {
        long read = this.f52792a.read();
        Preconditions.checkState(this.f52793b, "This stopwatch is already stopped.");
        this.f52793b = false;
        this.f52794c += read - this.f52795d;
        return this;
    }

    public String toString() {
        long m41276c = m41276c();
        TimeUnit m41277b = m41277b(m41276c);
        double convert = m41276c / TimeUnit.NANOSECONDS.convert(1L, m41277b);
        return AbstractC7455a.m41255c(convert) + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + m41278a(m41277b);
    }

    public static Stopwatch createStarted(Ticker ticker) {
        return new Stopwatch(ticker).start();
    }

    public static Stopwatch createUnstarted(Ticker ticker) {
        return new Stopwatch(ticker);
    }

    public Stopwatch(Ticker ticker) {
        this.f52792a = (Ticker) Preconditions.checkNotNull(ticker, "ticker");
    }
}
