package com.google.firebase.perf.config;

import com.google.firebase.perf.util.Constants;

/* loaded from: classes4.dex */
public final class ConfigurationConstants$CollectionEnabled extends AbstractC17229zw {

    /* renamed from: a */
    public static ConfigurationConstants$CollectionEnabled f56098a;

    public static synchronized ConfigurationConstants$CollectionEnabled getInstance() {
        ConfigurationConstants$CollectionEnabled configurationConstants$CollectionEnabled;
        synchronized (ConfigurationConstants$CollectionEnabled.class) {
            try {
                if (f56098a == null) {
                    f56098a = new ConfigurationConstants$CollectionEnabled();
                }
                configurationConstants$CollectionEnabled = f56098a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configurationConstants$CollectionEnabled;
    }

    @Override // p000.AbstractC17229zw
    public String getDeviceCacheFlag() {
        return Constants.ENABLE_DISABLE;
    }

    @Override // p000.AbstractC17229zw
    public String getMetadataFlag() {
        return "firebase_performance_collection_enabled";
    }

    @Override // p000.AbstractC17229zw
    public Boolean getDefault() {
        return Boolean.TRUE;
    }
}
