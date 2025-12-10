package p000;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.p016v1.TraceMetric;
import com.google.firebase.perf.util.Constants;
import java.util.Map;

/* renamed from: f20  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19797f20 extends PerfMetricValidator {

    /* renamed from: b */
    public static final AndroidLogger f61697b = AndroidLogger.getInstance();

    /* renamed from: a */
    public final TraceMetric f61698a;

    public C19797f20(TraceMetric traceMetric) {
        this.f61698a = traceMetric;
    }

    /* renamed from: b */
    public final boolean m31373b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            try {
                PerfMetricValidator.validateAttribute((String) entry.getKey(), (String) entry.getValue());
            } catch (IllegalArgumentException e) {
                f61697b.warn(e.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m31372c(TraceMetric traceMetric) {
        return m31371d(traceMetric, 0);
    }

    /* renamed from: d */
    public final boolean m31371d(TraceMetric traceMetric, int i) {
        if (traceMetric == null) {
            return false;
        }
        if (i > 1) {
            f61697b.warn("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry<String, Long> entry : traceMetric.getCountersMap().entrySet()) {
            if (!m31368g(entry.getKey())) {
                AndroidLogger androidLogger = f61697b;
                androidLogger.warn("invalid CounterId:" + entry.getKey());
                return false;
            } else if (!m31367h(entry.getValue())) {
                AndroidLogger androidLogger2 = f61697b;
                androidLogger2.warn("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        for (TraceMetric traceMetric2 : traceMetric.getSubtracesList()) {
            if (!m31371d(traceMetric2, i + 1)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m31370e(TraceMetric traceMetric) {
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
    public final boolean m31369f(TraceMetric traceMetric) {
        return traceMetric.getName().startsWith(Constants.SCREEN_TRACE_PREFIX);
    }

    /* renamed from: g */
    public final boolean m31368g(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            f61697b.warn("counterId is empty");
            return false;
        } else if (trim.length() > 100) {
            f61697b.warn("counterId exceeded max length 100");
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: h */
    public final boolean m31367h(Long l) {
        if (l != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m31366i(TraceMetric traceMetric) {
        Long l = traceMetric.getCountersMap().get(Constants.CounterNames.FRAMES_TOTAL.toString());
        if (l != null && l.compareTo((Long) 0L) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.perf.metrics.validator.PerfMetricValidator
    public boolean isValidPerfMetric() {
        if (!m31365j(this.f61698a, 0)) {
            AndroidLogger androidLogger = f61697b;
            androidLogger.warn("Invalid Trace:" + this.f61698a.getName());
            return false;
        } else if (m31370e(this.f61698a) && !m31372c(this.f61698a)) {
            AndroidLogger androidLogger2 = f61697b;
            androidLogger2.warn("Invalid Counters for Trace:" + this.f61698a.getName());
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: j */
    public final boolean m31365j(TraceMetric traceMetric, int i) {
        if (traceMetric == null) {
            f61697b.warn("TraceMetric is null");
            return false;
        } else if (i > 1) {
            f61697b.warn("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else if (!m31363l(traceMetric.getName())) {
            AndroidLogger androidLogger = f61697b;
            androidLogger.warn("invalid TraceId:" + traceMetric.getName());
            return false;
        } else if (!m31364k(traceMetric)) {
            AndroidLogger androidLogger2 = f61697b;
            androidLogger2.warn("invalid TraceDuration:" + traceMetric.getDurationUs());
            return false;
        } else if (!traceMetric.hasClientStartTimeUs()) {
            f61697b.warn("clientStartTimeUs is null.");
            return false;
        } else if (m31369f(traceMetric) && !m31366i(traceMetric)) {
            AndroidLogger androidLogger3 = f61697b;
            androidLogger3.warn("non-positive totalFrames in screen trace " + traceMetric.getName());
            return false;
        } else {
            for (TraceMetric traceMetric2 : traceMetric.getSubtracesList()) {
                if (!m31365j(traceMetric2, i + 1)) {
                    return false;
                }
            }
            if (!m31373b(traceMetric.getCustomAttributesMap())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: k */
    public final boolean m31364k(TraceMetric traceMetric) {
        if (traceMetric != null && traceMetric.getDurationUs() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m31363l(String str) {
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
