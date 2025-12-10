package com.google.firebase.perf.config;

/* loaded from: classes4.dex */
public final class ConfigurationConstants$FragmentSamplingRate extends AbstractC17229zw {

    /* renamed from: a */
    public static ConfigurationConstants$FragmentSamplingRate f56100a;

    public static synchronized ConfigurationConstants$FragmentSamplingRate getInstance() {
        ConfigurationConstants$FragmentSamplingRate configurationConstants$FragmentSamplingRate;
        synchronized (ConfigurationConstants$FragmentSamplingRate.class) {
            try {
                if (f56100a == null) {
                    f56100a = new ConfigurationConstants$FragmentSamplingRate();
                }
                configurationConstants$FragmentSamplingRate = f56100a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configurationConstants$FragmentSamplingRate;
    }

    @Override // p000.AbstractC17229zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    @Override // p000.AbstractC17229zw
    public String getMetadataFlag() {
        return "fragment_sampling_percentage";
    }

    @Override // p000.AbstractC17229zw
    public String getRemoteConfigFlag() {
        return "fpr_vc_fragment_sampling_rate";
    }

    @Override // p000.AbstractC17229zw
    public Double getDefault() {
        return Double.valueOf(0.0d);
    }
}
