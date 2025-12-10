package com.google.firebase.perf.config;

import com.google.firebase.perf.util.Constants;

/* loaded from: classes4.dex */
public final class ConfigurationConstants$CollectionEnabled extends AbstractC17252zw {

    /* renamed from: a */
    public static ConfigurationConstants$CollectionEnabled f56110a;

    public static synchronized ConfigurationConstants$CollectionEnabled getInstance() {
        ConfigurationConstants$CollectionEnabled configurationConstants$CollectionEnabled;
        synchronized (ConfigurationConstants$CollectionEnabled.class) {
            try {
                if (f56110a == null) {
                    f56110a = new ConfigurationConstants$CollectionEnabled();
                }
                configurationConstants$CollectionEnabled = f56110a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configurationConstants$CollectionEnabled;
    }

    @Override // p000.AbstractC17252zw
    public String getDeviceCacheFlag() {
        return Constants.ENABLE_DISABLE;
    }

    @Override // p000.AbstractC17252zw
    public String getMetadataFlag() {
        return "firebase_performance_collection_enabled";
    }

    @Override // p000.AbstractC17252zw
    public Boolean getDefault() {
        return Boolean.TRUE;
    }
}