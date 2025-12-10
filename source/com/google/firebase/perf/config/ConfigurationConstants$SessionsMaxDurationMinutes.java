package com.google.firebase.perf.config;

/* loaded from: classes4.dex */
public final class ConfigurationConstants$SessionsMaxDurationMinutes extends AbstractC17229zw {

    /* renamed from: a */
    public static ConfigurationConstants$SessionsMaxDurationMinutes f56111a;

    public static synchronized ConfigurationConstants$SessionsMaxDurationMinutes getInstance() {
        ConfigurationConstants$SessionsMaxDurationMinutes configurationConstants$SessionsMaxDurationMinutes;
        synchronized (ConfigurationConstants$SessionsMaxDurationMinutes.class) {
            try {
                if (f56111a == null) {
                    f56111a = new ConfigurationConstants$SessionsMaxDurationMinutes();
                }
                configurationConstants$SessionsMaxDurationMinutes = f56111a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configurationConstants$SessionsMaxDurationMinutes;
    }

    @Override // p000.AbstractC17229zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    @Override // p000.AbstractC17229zw
    public String getMetadataFlag() {
        return "sessions_max_length_minutes";
    }

    @Override // p000.AbstractC17229zw
    public String getRemoteConfigFlag() {
        return "fpr_session_max_duration_min";
    }

    @Override // p000.AbstractC17229zw
    public Long getDefault() {
        return 240L;
    }
}
