package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.ConfigurationConstants$SessionsMemoryCaptureFrequencyForegroundMs */
/* loaded from: classes4.dex */
public final class C8570xbe24e5c8 extends AbstractC17229zw {

    /* renamed from: a */
    public static C8570xbe24e5c8 f56113a;

    public static synchronized C8570xbe24e5c8 getInstance() {
        C8570xbe24e5c8 c8570xbe24e5c8;
        synchronized (C8570xbe24e5c8.class) {
            try {
                if (f56113a == null) {
                    f56113a = new C8570xbe24e5c8();
                }
                c8570xbe24e5c8 = f56113a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c8570xbe24e5c8;
    }

    @Override // p000.AbstractC17229zw
    public String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    @Override // p000.AbstractC17229zw
    public String getMetadataFlag() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    @Override // p000.AbstractC17229zw
    public String getRemoteConfigFlag() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }

    @Override // p000.AbstractC17229zw
    public Long getDefault() {
        return 100L;
    }

    @Override // p000.AbstractC17229zw
    public Long getDefaultOnRcFetchFail() {
        return Long.valueOf(getDefault().longValue() * 3);
    }
}
