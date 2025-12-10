package com.google.firebase.perf.config;

/* loaded from: classes4.dex */
public final class ConfigurationConstants$SdkDisabledVersions extends AbstractC17229zw {

    /* renamed from: a */
    public static ConfigurationConstants$SdkDisabledVersions f56107a;

    public static synchronized ConfigurationConstants$SdkDisabledVersions getInstance() {
        ConfigurationConstants$SdkDisabledVersions configurationConstants$SdkDisabledVersions;
        synchronized (ConfigurationConstants$SdkDisabledVersions.class) {
            try {
                if (f56107a == null) {
                    f56107a = new ConfigurationConstants$SdkDisabledVersions();
                }
                configurationConstants$SdkDisabledVersions = f56107a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configurationConstants$SdkDisabledVersions;
    }

    @Override // p000.AbstractC17229zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    @Override // p000.AbstractC17229zw
    public String getRemoteConfigFlag() {
        return "fpr_disabled_android_versions";
    }

    @Override // p000.AbstractC17229zw
    public String getDefault() {
        return "";
    }
}
