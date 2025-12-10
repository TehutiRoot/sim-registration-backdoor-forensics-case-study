package com.google.firebase.perf.config;

import com.google.firebase.perf.BuildConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ConfigurationConstants$LogSourceName extends AbstractC17229zw {

    /* renamed from: a */
    public static ConfigurationConstants$LogSourceName f56101a;

    /* renamed from: b */
    public static final Map f56102b = Collections.unmodifiableMap(new HashMap<Long, String>() { // from class: com.google.firebase.perf.config.ConfigurationConstants$LogSourceName.1
        {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    });

    public static synchronized ConfigurationConstants$LogSourceName getInstance() {
        ConfigurationConstants$LogSourceName configurationConstants$LogSourceName;
        synchronized (ConfigurationConstants$LogSourceName.class) {
            try {
                if (f56101a == null) {
                    f56101a = new ConfigurationConstants$LogSourceName();
                }
                configurationConstants$LogSourceName = f56101a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configurationConstants$LogSourceName;
    }

    public static String getLogSourceName(long j) {
        return (String) f56102b.get(Long.valueOf(j));
    }

    public static boolean isLogSourceKnown(long j) {
        return f56102b.containsKey(Long.valueOf(j));
    }

    @Override // p000.AbstractC17229zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.LogSourceName";
    }

    @Override // p000.AbstractC17229zw
    public String getRemoteConfigFlag() {
        return "fpr_log_source";
    }

    @Override // p000.AbstractC17229zw
    public String getDefault() {
        return BuildConfig.TRANSPORT_LOG_SRC;
    }
}
