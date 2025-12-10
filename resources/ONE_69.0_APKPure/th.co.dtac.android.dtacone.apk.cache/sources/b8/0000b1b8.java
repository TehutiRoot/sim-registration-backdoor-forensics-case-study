package com.google.firebase.perf.config;

/* loaded from: classes4.dex */
public final class ConfigurationConstants$NetworkEventCountBackground extends AbstractC17252zw {

    /* renamed from: a */
    public static ConfigurationConstants$NetworkEventCountBackground f56115a;

    public static synchronized ConfigurationConstants$NetworkEventCountBackground getInstance() {
        ConfigurationConstants$NetworkEventCountBackground configurationConstants$NetworkEventCountBackground;
        synchronized (ConfigurationConstants$NetworkEventCountBackground.class) {
            try {
                if (f56115a == null) {
                    f56115a = new ConfigurationConstants$NetworkEventCountBackground();
                }
                configurationConstants$NetworkEventCountBackground = f56115a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configurationConstants$NetworkEventCountBackground;
    }

    @Override // p000.AbstractC17252zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    @Override // p000.AbstractC17252zw
    public String getRemoteConfigFlag() {
        return "fpr_rl_network_event_count_bg";
    }

    @Override // p000.AbstractC17252zw
    public Long getDefault() {
        return 70L;
    }
}