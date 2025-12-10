package com.google.firebase.perf.config;

/* loaded from: classes4.dex */
public final class ConfigurationConstants$CollectionDeactivated extends AbstractC17229zw {

    /* renamed from: a */
    public static ConfigurationConstants$CollectionDeactivated f56097a;

    public static synchronized ConfigurationConstants$CollectionDeactivated getInstance() {
        ConfigurationConstants$CollectionDeactivated configurationConstants$CollectionDeactivated;
        synchronized (ConfigurationConstants$CollectionDeactivated.class) {
            try {
                if (f56097a == null) {
                    f56097a = new ConfigurationConstants$CollectionDeactivated();
                }
                configurationConstants$CollectionDeactivated = f56097a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configurationConstants$CollectionDeactivated;
    }

    @Override // p000.AbstractC17229zw
    public String getMetadataFlag() {
        return "firebase_performance_collection_deactivated";
    }

    @Override // p000.AbstractC17229zw
    public Boolean getDefault() {
        return Boolean.FALSE;
    }
}
