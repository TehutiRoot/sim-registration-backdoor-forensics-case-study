package com.google.firebase.perf.config;

/* loaded from: classes4.dex */
public final class ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs extends AbstractC17229zw {

    /* renamed from: a */
    public static ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs f56110a;

    public static synchronized ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs getInstance() {
        ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs configurationConstants$SessionsCpuCaptureFrequencyForegroundMs;
        synchronized (ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs.class) {
            try {
                if (f56110a == null) {
                    f56110a = new ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs();
                }
                configurationConstants$SessionsCpuCaptureFrequencyForegroundMs = f56110a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configurationConstants$SessionsCpuCaptureFrequencyForegroundMs;
    }

    @Override // p000.AbstractC17229zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    @Override // p000.AbstractC17229zw
    public String getMetadataFlag() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    @Override // p000.AbstractC17229zw
    public String getRemoteConfigFlag() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }

    @Override // p000.AbstractC17229zw
    public Long getDefault() {
        return 100L;
    }

    @Override // p000.AbstractC17229zw
    public Long getDefaultOnRcFetchFail() {
        return Long.valueOf(getDefault().longValue() * 3);
    }
}
