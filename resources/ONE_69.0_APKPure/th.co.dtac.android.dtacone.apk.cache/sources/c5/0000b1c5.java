package com.google.firebase.perf.config;

/* loaded from: classes4.dex */
public final class ConfigurationConstants$TraceEventCountForeground extends AbstractC17252zw {

    /* renamed from: a */
    public static ConfigurationConstants$TraceEventCountForeground f56128a;

    public static synchronized ConfigurationConstants$TraceEventCountForeground getInstance() {
        ConfigurationConstants$TraceEventCountForeground configurationConstants$TraceEventCountForeground;
        synchronized (ConfigurationConstants$TraceEventCountForeground.class) {
            try {
                if (f56128a == null) {
                    f56128a = new ConfigurationConstants$TraceEventCountForeground();
                }
                configurationConstants$TraceEventCountForeground = f56128a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configurationConstants$TraceEventCountForeground;
    }

    @Override // p000.AbstractC17252zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    @Override // p000.AbstractC17252zw
    public String getRemoteConfigFlag() {
        return "fpr_rl_trace_event_count_fg";
    }

    @Override // p000.AbstractC17252zw
    public Long getDefault() {
        return 300L;
    }
}