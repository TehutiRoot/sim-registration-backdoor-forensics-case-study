package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.ConfigurationConstants$SessionsMemoryCaptureFrequencyBackgroundMs */
/* loaded from: classes4.dex */
public final class C8569xa42982f3 extends AbstractC17229zw {

    /* renamed from: a */
    public static C8569xa42982f3 f56112a;

    public static synchronized C8569xa42982f3 getInstance() {
        C8569xa42982f3 c8569xa42982f3;
        synchronized (C8569xa42982f3.class) {
            try {
                if (f56112a == null) {
                    f56112a = new C8569xa42982f3();
                }
                c8569xa42982f3 = f56112a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c8569xa42982f3;
    }

    @Override // p000.AbstractC17229zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    @Override // p000.AbstractC17229zw
    public String getMetadataFlag() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    @Override // p000.AbstractC17229zw
    public String getRemoteConfigFlag() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    @Override // p000.AbstractC17229zw
    public Long getDefault() {
        return 0L;
    }
}
