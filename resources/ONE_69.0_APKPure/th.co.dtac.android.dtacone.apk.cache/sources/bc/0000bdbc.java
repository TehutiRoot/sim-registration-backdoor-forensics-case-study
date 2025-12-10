package com.netcetera.threeds.sdk.infrastructure;

import android.os.Process;
import android.view.KeyEvent;
import android.view.ViewConfiguration;

/* loaded from: classes5.dex */
class set3DSServerTransactionID implements getSDKEphemeralPublicKey {
    public static final set3DSServerTransactionID get = new set3DSServerTransactionID();

    @Override // com.netcetera.threeds.sdk.infrastructure.getSDKEphemeralPublicKey
    public Object ThreeDS2Service() {
        try {
            return ((Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance(ViewConfiguration.getEdgeSlop() >> 16, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 59 - KeyEvent.normalizeMetaState(0))).getMethod("values", null).invoke(null, null);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}