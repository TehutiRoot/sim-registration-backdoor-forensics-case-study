package com.google.firebase.perf.config;

/* loaded from: classes4.dex */
public final class ConfigurationConstants$NetworkEventCountForeground extends AbstractC17252zw {

    /* renamed from: a */
    public static ConfigurationConstants$NetworkEventCountForeground f56116a;

    public static synchronized ConfigurationConstants$NetworkEventCountForeground getInstance() {
        ConfigurationConstants$NetworkEventCountForeground configurationConstants$NetworkEventCountForeground;
        synchronized (ConfigurationConstants$NetworkEventCountForeground.class) {
            try {
                if (f56116a == null) {
                    f56116a = new ConfigurationConstants$NetworkEventCountForeground();
                }
                configurationConstants$NetworkEventCountForeground = f56116a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configurationConstants$NetworkEventCountForeground;
    }

    @Override // p000.AbstractC17252zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    @Override // p000.AbstractC17252zw
    public String getRemoteConfigFlag() {
        return "fpr_rl_network_event_count_fg";
    }

    @Override // p000.AbstractC17252zw
    public Long getDefault() {
        return 700L;
    }
}