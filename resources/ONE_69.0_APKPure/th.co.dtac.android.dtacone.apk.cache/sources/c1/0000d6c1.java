package p000;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.p016v1.TraceMetric;
import com.google.firebase.perf.util.Constants;
import java.util.Map;

/* renamed from: j20  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C20540j20 extends PerfMetricValidator {

    /* renamed from: b */
    public static final AndroidLogger f67203b = AndroidLogger.getInstance();

    /* renamed from: a */
    public final TraceMetric f67204a;

    public C20540j20(TraceMetric traceMetric) {
        this.f67204a = traceMetric;
    }

    /* renamed from: b */
    public final boolean m29636b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            try {
                PerfMetricValidator.validateAttribute((String) entry.getKey(), (String) entry.getValue());
            } catch (IllegalArgumentException e) {
                f67203b.warn(e.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m29635c(TraceMetric traceMetric) {
        return m29634d(traceMetric, 0);
    }

    /* renamed from: d */
    public final boolean m29634d(TraceMetric traceMetric, int i) {
        if (traceMetric == null) {
            return false;
        }
        if (i > 1) {
            f67203b.warn("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry<String, Long> entry : traceMetric.getCountersMap().entrySet()) {
            if (!m29631g(entry.getKey())) {
                AndroidLogger androidLogger = f67203b;
                androidLogger.warn("invalid CounterId:" + entry.getKey());
                return false;
            } else if (!m29630h(entry.getValue())) {
                AndroidLogger androidLogger2 = f67203b;
                androidLogger2.warn("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        for (TraceMetric traceMetric2 : traceMetric.getSubtracesList()) {
            if (!m29634d(traceMetric2, i + 1)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m29633e(TraceMetric traceMetric) {
        if (traceMetric.getCountersCount() > 0) {
            return true;
        }
        for (TraceMetric traceMetric2 : traceMetric.getSubtracesList()) {
            if (traceMetric2.getCountersCount() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m29632f(TraceMetric traceMetric) {
        return traceMetric.getName().startsWith(Constants.SCREEN_TRACE_PREFIX);
    }

    /* renamed from: g */
    public final boolean m29631g(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            f67203b.warn("counterId is empty");
            return false;
        } else if (trim.length() > 100) {
            f67203b.warn("counterId exceeded max length 100");
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: h */
    public final boolean m29630h(Long l) {
        if (l != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m29629i(TraceMetric traceMetric) {
        Long l = traceMetric.getCountersMap().get(Constants.CounterNames.FRAMES_TOTAL.toString());
        if (l != null && l.compareTo((Long) 0L) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.perf.metrics.validator.PerfMetricValidator
    public boolean isValidPerfMetric() {
        if (!m29628j(this.f67204a, 0)) {
            AndroidLogger androidLogger = f67203b;
            androidLogger.warn("Invalid Trace:" + this.f67204a.getName());
            return false;
        } else if (m29633e(this.f67204a) && !m29635c(this.f67204a)) {
            AndroidLogger androidLogger2 = f67203b;
            androidLogger2.warn("Invalid Counters for Trace:" + this.f67204a.getName());
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: j */
    public final boolean m29628j(TraceMetric traceMetric, int i) {
        if (traceMetric == null) {
            f67203b.warn("TraceMetric is null");
            return false;
        } else if (i > 1) {
            f67203b.warn("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else if (!m29626l(traceMetric.getName())) {
            AndroidLogger androidLogger = f67203b;
            androidLogger.warn("invalid TraceId:" + traceMetric.getName());
            return false;
        } else if (!m29627k(traceMetric)) {
            AndroidLogger androidLogger2 = f67203b;
            androidLogger2.warn("invalid TraceDuration:" + traceMetric.getDurationUs());
            return false;
        } else if (!traceMetric.hasClientStartTimeUs()) {
            f67203b.warn("clientStartTimeUs is null.");
            return false;
        } else if (m29632f(traceMetric) && !m29629i(traceMetric)) {
            AndroidLogger androidLogger3 = f67203b;
            androidLogger3.warn("non-positive totalFrames in screen trace " + traceMetric.getName());
            return false;
        } else {
            for (TraceMetric traceMetric2 : traceMetric.getSubtracesList()) {
                if (!m29628j(traceMetric2, i + 1)) {
                    return false;
                }
            }
            if (!m29636b(traceMetric.getCustomAttributesMap())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: k */
    public final boolean m29627k(TraceMetric traceMetric) {
        if (traceMetric != null && traceMetric.getDurationUs() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m29626l(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty() || trim.length() > 100) {
            return false;
        }
        return true;
    }
}