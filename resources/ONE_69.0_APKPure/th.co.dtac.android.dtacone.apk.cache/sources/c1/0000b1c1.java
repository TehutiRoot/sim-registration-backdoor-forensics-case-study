package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.ConfigurationConstants$SessionsMemoryCaptureFrequencyBackgroundMs */
/* loaded from: classes4.dex */
public final class C8558xa42982f3 extends AbstractC17252zw {

    /* renamed from: a */
    public static C8558xa42982f3 f56124a;

    public static synchronized C8558xa42982f3 getInstance() {
        C8558xa42982f3 c8558xa42982f3;
        synchronized (C8558xa42982f3.class) {
            try {
                if (f56124a == null) {
                    f56124a = new C8558xa42982f3();
                }
                c8558xa42982f3 = f56124a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c8558xa42982f3;
    }

    @Override // p000.AbstractC17252zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    @Override // p000.AbstractC17252zw
    public String getMetadataFlag() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    @Override // p000.AbstractC17252zw
    public String getRemoteConfigFlag() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    @Override // p000.AbstractC17252zw
    public Long getDefault() {
        return 0L;
    }
}