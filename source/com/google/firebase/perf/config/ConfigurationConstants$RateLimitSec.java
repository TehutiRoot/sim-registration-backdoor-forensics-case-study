package com.google.firebase.perf.config;

/* loaded from: classes4.dex */
public final class ConfigurationConstants$RateLimitSec extends AbstractC17229zw {

    /* renamed from: a */
    public static ConfigurationConstants$RateLimitSec f56106a;

    public static synchronized ConfigurationConstants$RateLimitSec getInstance() {
        ConfigurationConstants$RateLimitSec configurationConstants$RateLimitSec;
        synchronized (ConfigurationConstants$RateLimitSec.class) {
            try {
                if (f56106a == null) {
                    f56106a = new ConfigurationConstants$RateLimitSec();
                }
                configurationConstants$RateLimitSec = f56106a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configurationConstants$RateLimitSec;
    }

    @Override // p000.AbstractC17229zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    @Override // p000.AbstractC17229zw
    public String getRemoteConfigFlag() {
        return "fpr_rl_time_limit_sec";
    }

    @Override // p000.AbstractC17229zw
    public Long getDefault() {
        return 600L;
    }
}
