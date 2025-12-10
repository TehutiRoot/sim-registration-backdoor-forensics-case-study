package com.google.firebase.perf.config;

/* loaded from: classes4.dex */
public final class ConfigurationConstants$ExperimentTTID extends AbstractC17252zw {

    /* renamed from: a */
    public static ConfigurationConstants$ExperimentTTID f56111a;

    public static synchronized ConfigurationConstants$ExperimentTTID getInstance() {
        ConfigurationConstants$ExperimentTTID configurationConstants$ExperimentTTID;
        synchronized (ConfigurationConstants$ExperimentTTID.class) {
            try {
                if (f56111a == null) {
                    f56111a = new ConfigurationConstants$ExperimentTTID();
                }
                configurationConstants$ExperimentTTID = f56111a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configurationConstants$ExperimentTTID;
    }

    @Override // p000.AbstractC17252zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // p000.AbstractC17252zw
    public String getMetadataFlag() {
        return "experiment_app_start_ttid";
    }

    @Override // p000.AbstractC17252zw
    public String getRemoteConfigFlag() {
        return "fpr_experiment_app_start_ttid";
    }

    @Override // p000.AbstractC17252zw
    public Boolean getDefault() {
        return Boolean.FALSE;
    }
}