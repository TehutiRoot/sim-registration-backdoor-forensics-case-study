package com.google.firebase.perf.config;

/* loaded from: classes4.dex */
public final class ConfigurationConstants$SdkEnabled extends AbstractC17229zw {

    /* renamed from: a */
    public static ConfigurationConstants$SdkEnabled f56108a;

    public static synchronized ConfigurationConstants$SdkEnabled getInstance() {
        ConfigurationConstants$SdkEnabled configurationConstants$SdkEnabled;
        synchronized (ConfigurationConstants$SdkEnabled.class) {
            try {
                if (f56108a == null) {
                    f56108a = new ConfigurationConstants$SdkEnabled();
                }
                configurationConstants$SdkEnabled = f56108a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configurationConstants$SdkEnabled;
    }

    @Override // p000.AbstractC17229zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    @Override // p000.AbstractC17229zw
    public String getRemoteConfigFlag() {
        return "fpr_enabled";
    }

    @Override // p000.AbstractC17229zw
    public Boolean getDefault() {
        return Boolean.TRUE;
    }
}
