package com.google.firebase.perf.metrics.validator;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.p016v1.PerfMetric;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class PerfMetricValidator {
    /* renamed from: a */
    public static List m38226a(PerfMetric perfMetric, Context context) {
        ArrayList arrayList = new ArrayList();
        if (perfMetric.hasTraceMetric()) {
            arrayList.add(new C19797f20(perfMetric.getTraceMetric()));
        }
        if (perfMetric.hasNetworkRequestMetric()) {
            arrayList.add(new C19281c20(perfMetric.getNetworkRequestMetric(), context));
        }
        if (perfMetric.hasApplicationInfo()) {
            arrayList.add(new FirebasePerfApplicationInfoValidator(perfMetric.getApplicationInfo()));
        }
        if (perfMetric.hasGaugeMetric()) {
            arrayList.add(new C19109b20(perfMetric.getGaugeMetric()));
        }
        return arrayList;
    }

    public static boolean isValid(@NonNull PerfMetric perfMetric, @NonNull Context context) {
        List<PerfMetricValidator> m38226a = m38226a(perfMetric, context);
        if (m38226a.isEmpty()) {
            AndroidLogger.getInstance().debug("No validators found for PerfMetric.");
            return false;
        }
        for (PerfMetricValidator perfMetricValidator : m38226a) {
            if (!perfMetricValidator.isValidPerfMetric()) {
                return false;
            }
        }
        return true;
    }

    public static void validateAttribute(@NonNull String str, @NonNull String str2) {
        if (str != null && str.length() != 0) {
            if (str2 != null && str2.length() != 0) {
                if (str.length() <= 40) {
                    if (str2.length() <= 100) {
                        if (str.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
                            return;
                        }
                        throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
                    }
                    throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", 100));
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", 40));
            }
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        }
        throw new IllegalArgumentException("Attribute key must not be null or empty");
    }

    @Nullable
    public static String validateMetricName(@Nullable String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (Constants.CounterNames counterNames : Constants.CounterNames.values()) {
            if (counterNames.toString().equals(str)) {
                return null;
            }
        }
        return "Metric name must not start with '_'";
    }

    @Nullable
    public static String validateTraceName(@Nullable String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (Constants.TraceNames traceNames : Constants.TraceNames.values()) {
            if (traceNames.toString().equals(str)) {
                return null;
            }
        }
        if (str.startsWith(Constants.SCREEN_TRACE_PREFIX)) {
            return null;
        }
        return "Trace name must not start with '_'";
    }

    public abstract boolean isValidPerfMetric();
}
