package com.google.firebase.perf.config;

/* loaded from: classes4.dex */
public final class ConfigurationConstants$SdkEnabled extends AbstractC17252zw {

    /* renamed from: a */
    public static ConfigurationConstants$SdkEnabled f56120a;

    public static synchronized ConfigurationConstants$SdkEnabled getInstance() {
        ConfigurationConstants$SdkEnabled configurationConstants$SdkEnabled;
        synchronized (ConfigurationConstants$SdkEnabled.class) {
            try {
                if (f56120a == null) {
                    f56120a = new ConfigurationConstants$SdkEnabled();
                }
                configurationConstants$SdkEnabled = f56120a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configurationConstants$SdkEnabled;
    }

    @Override // p000.AbstractC17252zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    @Override // p000.AbstractC17252zw
    public String getRemoteConfigFlag() {
        return "fpr_enabled";
    }

    @Override // p000.AbstractC17252zw
    public Boolean getDefault() {
        return Boolean.TRUE;
    }
}