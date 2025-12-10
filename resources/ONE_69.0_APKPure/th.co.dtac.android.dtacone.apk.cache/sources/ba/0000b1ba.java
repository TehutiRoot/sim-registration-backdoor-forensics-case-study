package com.google.firebase.perf.config;

/* loaded from: classes4.dex */
public final class ConfigurationConstants$NetworkRequestSamplingRate extends AbstractC17252zw {

    /* renamed from: a */
    public static ConfigurationConstants$NetworkRequestSamplingRate f56117a;

    public static synchronized ConfigurationConstants$NetworkRequestSamplingRate getInstance() {
        ConfigurationConstants$NetworkRequestSamplingRate configurationConstants$NetworkRequestSamplingRate;
        synchronized (ConfigurationConstants$NetworkRequestSamplingRate.class) {
            try {
                if (f56117a == null) {
                    f56117a = new ConfigurationConstants$NetworkRequestSamplingRate();
                }
                configurationConstants$NetworkRequestSamplingRate = f56117a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configurationConstants$NetworkRequestSamplingRate;
    }

    @Override // p000.AbstractC17252zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    @Override // p000.AbstractC17252zw
    public String getRemoteConfigFlag() {
        return "fpr_vc_network_request_sampling_rate";
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