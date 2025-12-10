package com.google.firebase.perf.config;

/* loaded from: classes4.dex */
public final class ConfigurationConstants$SessionsSamplingRate extends AbstractC17252zw {

    /* renamed from: a */
    public static ConfigurationConstants$SessionsSamplingRate f56126a;

    public static synchronized ConfigurationConstants$SessionsSamplingRate getInstance() {
        ConfigurationConstants$SessionsSamplingRate configurationConstants$SessionsSamplingRate;
        synchronized (ConfigurationConstants$SessionsSamplingRate.class) {
            try {
                if (f56126a == null) {
                    f56126a = new ConfigurationConstants$SessionsSamplingRate();
                }
                configurationConstants$SessionsSamplingRate = f56126a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configurationConstants$SessionsSamplingRate;
    }

    @Override // p000.AbstractC17252zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    @Override // p000.AbstractC17252zw
    public String getMetadataFlag() {
        return "sessions_sampling_percentage";
    }

    @Override // p000.AbstractC17252zw
    public String getRemoteConfigFlag() {
        return "fpr_vc_session_sampling_rate";
    }

    @Override // p000.AbstractC17252zw
    public Double getDefault() {
        return Double.valueOf(0.01d);
    }

    @Override // p000.AbstractC17252zw
    public Double getDefaultOnRcFetchFail() {
        return Double.valueOf(getDefault().doubleValue() / 1000.0d);
    }
}