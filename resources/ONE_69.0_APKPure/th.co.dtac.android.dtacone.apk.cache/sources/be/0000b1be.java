package com.google.firebase.perf.config;

/* loaded from: classes4.dex */
public final class ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs extends AbstractC17252zw {

    /* renamed from: a */
    public static ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs f56121a;

    public static synchronized ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs getInstance() {
        ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs configurationConstants$SessionsCpuCaptureFrequencyBackgroundMs;
        synchronized (ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs.class) {
            try {
                if (f56121a == null) {
                    f56121a = new ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs();
                }
                configurationConstants$SessionsCpuCaptureFrequencyBackgroundMs = f56121a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configurationConstants$SessionsCpuCaptureFrequencyBackgroundMs;
    }

    @Override // p000.AbstractC17252zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    @Override // p000.AbstractC17252zw
    public String getMetadataFlag() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    @Override // p000.AbstractC17252zw
    public String getRemoteConfigFlag() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    @Override // p000.AbstractC17252zw
    public Long getDefault() {
        return 0L;
    }
}