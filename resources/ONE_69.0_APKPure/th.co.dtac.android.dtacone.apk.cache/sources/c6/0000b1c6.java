package com.google.firebase.perf.config;

/* loaded from: classes4.dex */
public final class ConfigurationConstants$TraceSamplingRate extends AbstractC17252zw {

    /* renamed from: a */
    public static ConfigurationConstants$TraceSamplingRate f56129a;

    public static synchronized ConfigurationConstants$TraceSamplingRate getInstance() {
        ConfigurationConstants$TraceSamplingRate configurationConstants$TraceSamplingRate;
        synchronized (ConfigurationConstants$TraceSamplingRate.class) {
            try {
                if (f56129a == null) {
                    f56129a = new ConfigurationConstants$TraceSamplingRate();
                }
                configurationConstants$TraceSamplingRate = f56129a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configurationConstants$TraceSamplingRate;
    }

    @Override // p000.AbstractC17252zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    @Override // p000.AbstractC17252zw
    public String getRemoteConfigFlag() {
        return "fpr_vc_trace_sampling_rate";
    }

    @Override // p000.AbstractC17252zw
    public Double getDefault() {
        return Double.valueOf(1.0d);
    }

    @Override // p000.AbstractC17252zw
    public Double getDefaultOnRcFetchFail() {
        return Double.valueOf(getDefault().doubleValue() / 1000.0d);
    }
}