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
    public final Ticker f52804a;

    /* renamed from: b */
    public boolean f52805b;

    /* renamed from: c */
    public long f52806c;

    /* renamed from: d */
    public long f52807d;

    /* renamed from: com.google.common.base.Stopwatch$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C7440a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52808a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f52808a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52808a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52808a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52808a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52808a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f52808a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f52808a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public Stopwatch() {
        this.f52804a = Ticker.systemTicker();
    }

    /* renamed from: a */
    public static String m41265a(TimeUnit timeUnit) {
        switch (C7440a.f52808a[timeUnit.ordinal()]) {
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
    public static TimeUnit m41264b(long j) {
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
    public final long m41263c() {
        if (this.f52805b) {
            return (this.f52804a.read() - this.f52807d) + this.f52806c;
        }
        return this.f52806c;
    }

    public long elapsed(TimeUnit timeUnit) {
        return timeUnit.convert(m41263c(), TimeUnit.NANOSECONDS);
    }

    public boolean isRunning() {
        return this.f52805b;
    }

    @CanIgnoreReturnValue
    public Stopwatch reset() {
        this.f52806c = 0L;
        this.f52805b = false;
        return this;
    }

    @CanIgnoreReturnValue
    public Stopwatch start() {
        Preconditions.checkState(!this.f52805b, "This stopwatch is already running.");
        this.f52805b = true;
        this.f52807d = this.f52804a.read();
        return this;
    }

    @CanIgnoreReturnValue
    public Stopwatch stop() {
        long read = this.f52804a.read();
        Preconditions.checkState(this.f52805b, "This stopwatch is already stopped.");
        this.f52805b = false;
        this.f52806c += read - this.f52807d;
        return this;
    }

    public String toString() {
        long m41263c = m41263c();
        TimeUnit m41264b = m41264b(m41263c);
        double convert = m41263c / TimeUnit.NANOSECONDS.convert(1L, m41264b);
        return AbstractC7444a.m41242c(convert) + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + m41265a(m41264b);
    }

    public static Stopwatch createStarted(Ticker ticker) {
        return new Stopwatch(ticker).start();
    }

    public static Stopwatch createUnstarted(Ticker ticker) {
        return new Stopwatch(ticker);
    }

    public Stopwatch(Ticker ticker) {
        this.f52804a = (Ticker) Preconditions.checkNotNull(ticker, "ticker");
    }
}