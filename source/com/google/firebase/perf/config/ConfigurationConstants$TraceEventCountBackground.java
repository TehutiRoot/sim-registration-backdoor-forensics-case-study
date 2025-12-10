package com.google.firebase.perf.config;

/* loaded from: classes4.dex */
public final class ConfigurationConstants$TraceEventCountBackground extends AbstractC17229zw {

    /* renamed from: a */
    public static ConfigurationConstants$TraceEventCountBackground f56115a;

    public static synchronized ConfigurationConstants$TraceEventCountBackground getInstance() {
        ConfigurationConstants$TraceEventCountBackground configurationConstants$TraceEventCountBackground;
        synchronized (ConfigurationConstants$TraceEventCountBackground.class) {
            try {
                if (f56115a == null) {
                    f56115a = new ConfigurationConstants$TraceEventCountBackground();
                }
                configurationConstants$TraceEventCountBackground = f56115a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configurationConstants$TraceEventCountBackground;
    }

    @Override // p000.AbstractC17229zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    @Override // p000.AbstractC17229zw
    public String getRemoteConfigFlag() {
        return "fpr_rl_trace_event_count_bg";
    }

    @Override // p000.AbstractC17229zw
    public Long getDefault() {
        return 30L;
    }
}
