package com.google.firebase.perf;

import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.logging.AndroidLogger;

/* loaded from: classes4.dex */
public final class FirebasePerformanceInitializer implements AppStateMonitor.AppColdStartCallback {

    /* renamed from: a */
    public static final AndroidLogger f56054a = AndroidLogger.getInstance();

    @Override // com.google.firebase.perf.application.AppStateMonitor.AppColdStartCallback
    public void onAppColdStart() {
        try {
            FirebasePerformance.getInstance();
        } catch (IllegalStateException e) {
            f56054a.warn("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e);
        }
    }
}
