package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.ConfigurationConstants$SessionsMemoryCaptureFrequencyForegroundMs */
/* loaded from: classes4.dex */
public final class C8559xbe24e5c8 extends AbstractC17252zw {

    /* renamed from: a */
    public static C8559xbe24e5c8 f56125a;

    public static synchronized C8559xbe24e5c8 getInstance() {
        C8559xbe24e5c8 c8559xbe24e5c8;
        synchronized (C8559xbe24e5c8.class) {
            try {
                if (f56125a == null) {
                    f56125a = new C8559xbe24e5c8();
                }
                c8559xbe24e5c8 = f56125a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c8559xbe24e5c8;
    }

    @Override // p000.AbstractC17252zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    @Override // p000.AbstractC17252zw
    public String getMetadataFlag() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    @Override // p000.AbstractC17252zw
    public String getRemoteConfigFlag() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }

    @Override // p000.AbstractC17252zw
    public Long getDefault() {
        return 100L;
    }

    @Override // p000.AbstractC17252zw
    public Long getDefaultOnRcFetchFail() {
        return Long.valueOf(getDefault().longValue() * 3);
    }
}