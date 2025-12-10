package p000;

import android.content.Context;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.resource.ResourceType;
import com.google.firebase.perf.p016v1.PerfMetric;
import com.google.firebase.perf.p016v1.PerfSession;
import com.google.firebase.perf.p016v1.SessionVerbosity;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Rate;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: Mr1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18076Mr1 {

    /* renamed from: a */
    public final ConfigResolver f3919a;

    /* renamed from: b */
    public final double f3920b;

    /* renamed from: c */
    public final double f3921c;

    /* renamed from: d */
    public C0904a f3922d;

    /* renamed from: e */
    public C0904a f3923e;

    /* renamed from: f */
    public boolean f3924f;

    /* renamed from: Mr1$a */
    /* loaded from: classes4.dex */
    public static class C0904a {

        /* renamed from: k */
        public static final AndroidLogger f3925k = AndroidLogger.getInstance();

        /* renamed from: l */
        public static final long f3926l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a */
        public final Clock f3927a;

        /* renamed from: b */
        public final boolean f3928b;

        /* renamed from: c */
        public Timer f3929c;

        /* renamed from: d */
        public Rate f3930d;

        /* renamed from: e */
        public long f3931e;

        /* renamed from: f */
        public double f3932f;

        /* renamed from: g */
        public Rate f3933g;

        /* renamed from: h */
        public Rate f3934h;

        /* renamed from: i */
        public long f3935i;

        /* renamed from: j */
        public long f3936j;

        public C0904a(Rate rate, long j, Clock clock, ConfigResolver configResolver, String str, boolean z) {
            this.f3927a = clock;
            this.f3931e = j;
            this.f3930d = rate;
            this.f3932f = j;
            this.f3929c = clock.getTime();
            m67265g(configResolver, str, z);
            this.f3928b = z;
        }

        /* renamed from: c */
        public static long m67269c(ConfigResolver configResolver, String str) {
            if (str == ResourceType.TRACE) {
                return configResolver.getTraceEventCountBackground();
            }
            return configResolver.getNetworkEventCountBackground();
        }

        /* renamed from: d */
        public static long m67268d(ConfigResolver configResolver, String str) {
            if (str == ResourceType.TRACE) {
                return configResolver.getRateLimitSec();
            }
            return configResolver.getRateLimitSec();
        }

        /* renamed from: e */
        public static long m67267e(ConfigResolver configResolver, String str) {
            if (str == ResourceType.TRACE) {
                return configResolver.getTraceEventCountForeground();
            }
            return configResolver.getNetworkEventCountForeground();
        }

        /* renamed from: f */
        public static long m67266f(ConfigResolver configResolver, String str) {
            if (str == ResourceType.TRACE) {
                return configResolver.getRateLimitSec();
            }
            return configResolver.getRateLimitSec();
        }

        /* renamed from: a */
        public synchronized void m67271a(boolean z) {
            Rate rate;
            long j;
            try {
                if (z) {
                    rate = this.f3933g;
                } else {
                    rate = this.f3934h;
                }
                this.f3930d = rate;
                if (z) {
                    j = this.f3935i;
                } else {
                    j = this.f3936j;
                }
                this.f3931e = j;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* renamed from: b */
        public synchronized boolean m67270b(PerfMetric perfMetric) {
            try {
                Timer time = this.f3927a.getTime();
                double durationMicros = (this.f3929c.getDurationMicros(time) * this.f3930d.getTokensPerSeconds()) / f3926l;
                if (durationMicros > 0.0d) {
                    this.f3932f = Math.min(this.f3932f + durationMicros, this.f3931e);
                    this.f3929c = time;
                }
                double d = this.f3932f;
                if (d >= 1.0d) {
                    this.f3932f = d - 1.0d;
                    return true;
                }
                if (this.f3928b) {
                    f3925k.warn("Exceeded log rate limit, dropping the log.");
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* renamed from: g */
        public final void m67265g(ConfigResolver configResolver, String str, boolean z) {
            long m67266f = m67266f(configResolver, str);
            long m67267e = m67267e(configResolver, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Rate rate = new Rate(m67267e, m67266f, timeUnit);
            this.f3933g = rate;
            this.f3935i = m67267e;
            if (z) {
                f3925k.debug("Foreground %s logging rate:%f, burst capacity:%d", str, rate, Long.valueOf(m67267e));
            }
            long m67268d = m67268d(configResolver, str);
            long m67269c = m67269c(configResolver, str);
            Rate rate2 = new Rate(m67269c, m67268d, timeUnit);
            this.f3934h = rate2;
            this.f3936j = m67269c;
            if (z) {
                f3925k.debug("Background %s logging rate:%f, capacity:%d", str, rate2, Long.valueOf(m67269c));
            }
        }
    }

    public C18076Mr1(Context context, Rate rate, long j) {
        this(rate, j, new Clock(), m67280b(), m67280b(), ConfigResolver.getInstance());
        this.f3924f = Utils.isDebugLoggingEnabled(context);
    }

    /* renamed from: b */
    public static double m67280b() {
        return new Random().nextDouble();
    }

    /* renamed from: a */
    public void m67281a(boolean z) {
        this.f3922d.m67271a(z);
        this.f3923e.m67271a(z);
    }

    /* renamed from: c */
    public final boolean m67279c(List list) {
        if (list.size() <= 0 || ((PerfSession) list.get(0)).getSessionVerbosityCount() <= 0 || ((PerfSession) list.get(0)).getSessionVerbosity(0) != SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m67278d() {
        if (this.f3921c < this.f3919a.getFragmentSamplingRate()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m67277e() {
        if (this.f3920b < this.f3919a.getNetworkRequestSamplingRate()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m67276f() {
        if (this.f3920b < this.f3919a.getTraceSamplingRate()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m67275g(PerfMetric perfMetric) {
        if (!m67272j(perfMetric)) {
            return false;
        }
        if (perfMetric.hasNetworkRequestMetric()) {
            return !this.f3923e.m67270b(perfMetric);
        }
        if (!perfMetric.hasTraceMetric()) {
            return true;
        }
        return !this.f3922d.m67270b(perfMetric);
    }

    /* renamed from: h */
    public boolean m67274h(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric() && !m67276f() && !m67279c(perfMetric.getTraceMetric().getPerfSessionsList())) {
            return false;
        }
        if (m67273i(perfMetric) && !m67278d() && !m67279c(perfMetric.getTraceMetric().getPerfSessionsList())) {
            return false;
        }
        if (perfMetric.hasNetworkRequestMetric() && !m67277e() && !m67279c(perfMetric.getNetworkRequestMetric().getPerfSessionsList())) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public boolean m67273i(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric() && perfMetric.getTraceMetric().getName().startsWith(Constants.SCREEN_TRACE_PREFIX) && perfMetric.getTraceMetric().containsCustomAttributes(Constants.ACTIVITY_ATTRIBUTE_KEY)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m67272j(PerfMetric perfMetric) {
        if ((perfMetric.hasTraceMetric() && ((perfMetric.getTraceMetric().getName().equals(Constants.TraceNames.FOREGROUND_TRACE_NAME.toString()) || perfMetric.getTraceMetric().getName().equals(Constants.TraceNames.BACKGROUND_TRACE_NAME.toString())) && perfMetric.getTraceMetric().getCountersCount() > 0)) || perfMetric.hasGaugeMetric()) {
            return false;
        }
        return true;
    }

    public C18076Mr1(Rate rate, long j, Clock clock, double d, double d2, ConfigResolver configResolver) {
        this.f3922d = null;
        this.f3923e = null;
        boolean z = false;
        this.f3924f = false;
        Utils.checkArgument(0.0d <= d && d < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d2 && d2 < 1.0d) {
            z = true;
        }
        Utils.checkArgument(z, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.f3920b = d;
        this.f3921c = d2;
        this.f3919a = configResolver;
        this.f3922d = new C0904a(rate, j, clock, configResolver, ResourceType.TRACE, this.f3924f);
        this.f3923e = new C0904a(rate, j, clock, configResolver, "Network", this.f3924f);
    }
}
