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

/* renamed from: Js1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17919Js1 {

    /* renamed from: a */
    public final ConfigResolver f3138a;

    /* renamed from: b */
    public final double f3139b;

    /* renamed from: c */
    public final double f3140c;

    /* renamed from: d */
    public C0690a f3141d;

    /* renamed from: e */
    public C0690a f3142e;

    /* renamed from: f */
    public boolean f3143f;

    /* renamed from: Js1$a */
    /* loaded from: classes4.dex */
    public static class C0690a {

        /* renamed from: k */
        public static final AndroidLogger f3144k = AndroidLogger.getInstance();

        /* renamed from: l */
        public static final long f3145l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a */
        public final Clock f3146a;

        /* renamed from: b */
        public final boolean f3147b;

        /* renamed from: c */
        public Timer f3148c;

        /* renamed from: d */
        public Rate f3149d;

        /* renamed from: e */
        public long f3150e;

        /* renamed from: f */
        public double f3151f;

        /* renamed from: g */
        public Rate f3152g;

        /* renamed from: h */
        public Rate f3153h;

        /* renamed from: i */
        public long f3154i;

        /* renamed from: j */
        public long f3155j;

        public C0690a(Rate rate, long j, Clock clock, ConfigResolver configResolver, String str, boolean z) {
            this.f3146a = clock;
            this.f3150e = j;
            this.f3149d = rate;
            this.f3151f = j;
            this.f3148c = clock.getTime();
            m67781g(configResolver, str, z);
            this.f3147b = z;
        }

        /* renamed from: c */
        public static long m67785c(ConfigResolver configResolver, String str) {
            if (str == ResourceType.TRACE) {
                return configResolver.getTraceEventCountBackground();
            }
            return configResolver.getNetworkEventCountBackground();
        }

        /* renamed from: d */
        public static long m67784d(ConfigResolver configResolver, String str) {
            if (str == ResourceType.TRACE) {
                return configResolver.getRateLimitSec();
            }
            return configResolver.getRateLimitSec();
        }

        /* renamed from: e */
        public static long m67783e(ConfigResolver configResolver, String str) {
            if (str == ResourceType.TRACE) {
                return configResolver.getTraceEventCountForeground();
            }
            return configResolver.getNetworkEventCountForeground();
        }

        /* renamed from: f */
        public static long m67782f(ConfigResolver configResolver, String str) {
            if (str == ResourceType.TRACE) {
                return configResolver.getRateLimitSec();
            }
            return configResolver.getRateLimitSec();
        }

        /* renamed from: a */
        public synchronized void m67787a(boolean z) {
            Rate rate;
            long j;
            try {
                if (z) {
                    rate = this.f3152g;
                } else {
                    rate = this.f3153h;
                }
                this.f3149d = rate;
                if (z) {
                    j = this.f3154i;
                } else {
                    j = this.f3155j;
                }
                this.f3150e = j;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* renamed from: b */
        public synchronized boolean m67786b(PerfMetric perfMetric) {
            try {
                Timer time = this.f3146a.getTime();
                double durationMicros = (this.f3148c.getDurationMicros(time) * this.f3149d.getTokensPerSeconds()) / f3145l;
                if (durationMicros > 0.0d) {
                    this.f3151f = Math.min(this.f3151f + durationMicros, this.f3150e);
                    this.f3148c = time;
                }
                double d = this.f3151f;
                if (d >= 1.0d) {
                    this.f3151f = d - 1.0d;
                    return true;
                }
                if (this.f3147b) {
                    f3144k.warn("Exceeded log rate limit, dropping the log.");
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* renamed from: g */
        public final void m67781g(ConfigResolver configResolver, String str, boolean z) {
            long m67782f = m67782f(configResolver, str);
            long m67783e = m67783e(configResolver, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Rate rate = new Rate(m67783e, m67782f, timeUnit);
            this.f3152g = rate;
            this.f3154i = m67783e;
            if (z) {
                f3144k.debug("Foreground %s logging rate:%f, burst capacity:%d", str, rate, Long.valueOf(m67783e));
            }
            long m67784d = m67784d(configResolver, str);
            long m67785c = m67785c(configResolver, str);
            Rate rate2 = new Rate(m67785c, m67784d, timeUnit);
            this.f3153h = rate2;
            this.f3155j = m67785c;
            if (z) {
                f3144k.debug("Background %s logging rate:%f, capacity:%d", str, rate2, Long.valueOf(m67785c));
            }
        }
    }

    public C17919Js1(Context context, Rate rate, long j) {
        this(rate, j, new Clock(), m67796b(), m67796b(), ConfigResolver.getInstance());
        this.f3143f = Utils.isDebugLoggingEnabled(context);
    }

    /* renamed from: b */
    public static double m67796b() {
        return new Random().nextDouble();
    }

    /* renamed from: a */
    public void m67797a(boolean z) {
        this.f3141d.m67787a(z);
        this.f3142e.m67787a(z);
    }

    /* renamed from: c */
    public final boolean m67795c(List list) {
        if (list.size() <= 0 || ((PerfSession) list.get(0)).getSessionVerbosityCount() <= 0 || ((PerfSession) list.get(0)).getSessionVerbosity(0) != SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m67794d() {
        if (this.f3140c < this.f3138a.getFragmentSamplingRate()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m67793e() {
        if (this.f3139b < this.f3138a.getNetworkRequestSamplingRate()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m67792f() {
        if (this.f3139b < this.f3138a.getTraceSamplingRate()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m67791g(PerfMetric perfMetric) {
        if (!m67788j(perfMetric)) {
            return false;
        }
        if (perfMetric.hasNetworkRequestMetric()) {
            return !this.f3142e.m67786b(perfMetric);
        }
        if (!perfMetric.hasTraceMetric()) {
            return true;
        }
        return !this.f3141d.m67786b(perfMetric);
    }

    /* renamed from: h */
    public boolean m67790h(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric() && !m67792f() && !m67795c(perfMetric.getTraceMetric().getPerfSessionsList())) {
            return false;
        }
        if (m67789i(perfMetric) && !m67794d() && !m67795c(perfMetric.getTraceMetric().getPerfSessionsList())) {
            return false;
        }
        if (perfMetric.hasNetworkRequestMetric() && !m67793e() && !m67795c(perfMetric.getNetworkRequestMetric().getPerfSessionsList())) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public boolean m67789i(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric() && perfMetric.getTraceMetric().getName().startsWith(Constants.SCREEN_TRACE_PREFIX) && perfMetric.getTraceMetric().containsCustomAttributes(Constants.ACTIVITY_ATTRIBUTE_KEY)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m67788j(PerfMetric perfMetric) {
        if ((perfMetric.hasTraceMetric() && ((perfMetric.getTraceMetric().getName().equals(Constants.TraceNames.FOREGROUND_TRACE_NAME.toString()) || perfMetric.getTraceMetric().getName().equals(Constants.TraceNames.BACKGROUND_TRACE_NAME.toString())) && perfMetric.getTraceMetric().getCountersCount() > 0)) || perfMetric.hasGaugeMetric()) {
            return false;
        }
        return true;
    }

    public C17919Js1(Rate rate, long j, Clock clock, double d, double d2, ConfigResolver configResolver) {
        this.f3141d = null;
        this.f3142e = null;
        boolean z = false;
        this.f3143f = false;
        Utils.checkArgument(0.0d <= d && d < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d2 && d2 < 1.0d) {
            z = true;
        }
        Utils.checkArgument(z, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.f3139b = d;
        this.f3140c = d2;
        this.f3138a = configResolver;
        this.f3141d = new C0690a(rate, j, clock, configResolver, ResourceType.TRACE, this.f3143f);
        this.f3142e = new C0690a(rate, j, clock, configResolver, "Network", this.f3143f);
    }
}