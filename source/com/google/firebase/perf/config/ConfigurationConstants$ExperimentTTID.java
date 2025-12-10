package com.google.firebase.perf.config;

/* loaded from: classes4.dex */
public final class ConfigurationConstants$ExperimentTTID extends AbstractC17229zw {

    /* renamed from: a */
    public static ConfigurationConstants$ExperimentTTID f56099a;

    public static synchronized ConfigurationConstants$ExperimentTTID getInstance() {
        ConfigurationConstants$ExperimentTTID configurationConstants$ExperimentTTID;
        synchronized (ConfigurationConstants$ExperimentTTID.class) {
            try {
                if (f56099a == null) {
                    f56099a = new ConfigurationConstants$ExperimentTTID();
                }
                configurationConstants$ExperimentTTID = f56099a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configurationConstants$ExperimentTTID;
    }

    @Override // p000.AbstractC17229zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // p000.AbstractC17229zw
    public String getMetadataFlag() {
        return "experiment_app_start_ttid";
    }

    @Override // p000.AbstractC17229zw
    public String getRemoteConfigFlag() {
        return "fpr_experiment_app_start_ttid";
    }

    @Override // p000.AbstractC17229zw
    public Boolean getDefault() {
        return Boolean.FALSE;
    }
}
