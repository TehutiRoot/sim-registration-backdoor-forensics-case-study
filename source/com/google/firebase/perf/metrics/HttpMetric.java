package com.google.firebase.perf.metrics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.perf.FirebasePerformanceAttributable;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class HttpMetric implements FirebasePerformanceAttributable {

    /* renamed from: f */
    public static final AndroidLogger f56180f = AndroidLogger.getInstance();

    /* renamed from: a */
    public final NetworkRequestMetricBuilder f56181a;

    /* renamed from: b */
    public final Timer f56182b;

    /* renamed from: c */
    public final Map f56183c;

    /* renamed from: d */
    public boolean f56184d;

    /* renamed from: e */
    public boolean f56185e;

    public HttpMetric(String str, String str2, TransportManager transportManager, Timer timer) {
        this.f56184d = false;
        this.f56185e = false;
        this.f56183c = new ConcurrentHashMap();
        this.f56182b = timer;
        NetworkRequestMetricBuilder httpMethod = NetworkRequestMetricBuilder.builder(transportManager).setUrl(str).setHttpMethod(str2);
        this.f56181a = httpMethod;
        httpMethod.setManualNetworkRequestMetric();
        if (ConfigResolver.getInstance().isPerformanceMonitoringEnabled()) {
            return;
        }
        f56180f.info("HttpMetric feature is disabled. URL %s", str);
        this.f56185e = true;
    }

    /* renamed from: a */
    private void m38247a(String str, String str2) {
        if (!this.f56184d) {
            if (!this.f56183c.containsKey(str) && this.f56183c.size() >= 5) {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
            }
            PerfMetricValidator.validateAttribute(str, str2);
            return;
        }
        throw new IllegalArgumentException("HttpMetric has been logged already so unable to modify attributes");
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    @Nullable
    public String getAttribute(@NonNull String str) {
        return (String) this.f56183c.get(str);
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    @NonNull
    public Map<String, String> getAttributes() {
        return new HashMap(this.f56183c);
    }

    public void markRequestComplete() {
        this.f56181a.setTimeToRequestCompletedMicros(this.f56182b.getDurationMicros());
    }

    public void markResponseStart() {
        this.f56181a.setTimeToResponseInitiatedMicros(this.f56182b.getDurationMicros());
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        boolean z = true;
        try {
            str = str.trim();
            str2 = str2.trim();
            m38247a(str, str2);
            f56180f.debug("Setting attribute '%s' to %s on network request '%s'", str, str2, this.f56181a.getUrl());
        } catch (Exception e) {
            f56180f.error("Cannot set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
            z = false;
        }
        if (z) {
            this.f56183c.put(str, str2);
        }
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    public void removeAttribute(@NonNull String str) {
        if (this.f56184d) {
            f56180f.error("Can't remove a attribute from a HttpMetric that's stopped.");
        } else {
            this.f56183c.remove(str);
        }
    }

    public void setHttpResponseCode(int i) {
        this.f56181a.setHttpResponseCode(i);
    }

    public void setRequestPayloadSize(long j) {
        this.f56181a.setRequestPayloadBytes(j);
    }

    public void setResponseContentType(@Nullable String str) {
        this.f56181a.setResponseContentType(str);
    }

    public void setResponsePayloadSize(long j) {
        this.f56181a.setResponsePayloadBytes(j);
    }

    public void start() {
        this.f56182b.reset();
        this.f56181a.setRequestStartTimeMicros(this.f56182b.getMicros());
    }

    public void stop() {
        if (this.f56185e) {
            return;
        }
        this.f56181a.setTimeToResponseCompletedMicros(this.f56182b.getDurationMicros()).setCustomAttributes(this.f56183c).build();
        this.f56184d = true;
    }

    public HttpMetric(URL url, String str, TransportManager transportManager, Timer timer) {
        this(url.toString(), str, transportManager, timer);
    }
}
