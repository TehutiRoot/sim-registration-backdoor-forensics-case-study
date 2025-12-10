package com.netcetera.threeds.sdk.infrastructure;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;

/* loaded from: classes5.dex */
class getExpiryDate implements getSDKEphemeralPublicKey {
    public static final getExpiryDate ThreeDS2Service = new getExpiryDate();

    @Override // com.netcetera.threeds.sdk.infrastructure.getSDKEphemeralPublicKey
    public Object ThreeDS2Service() {
        try {
            return ((Class) setEmptyView.ThreeDS2ServiceInstance((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf("", "", 0) + 873, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 67)).getDeclaredConstructor(null).newInstance(null);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}