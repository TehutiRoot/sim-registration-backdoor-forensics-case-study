package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;

/* loaded from: classes5.dex */
class doChallenge implements getSDKEphemeralPublicKey {
    public static final doChallenge ThreeDS2Service = new doChallenge();

    @Override // com.netcetera.threeds.sdk.infrastructure.getSDKEphemeralPublicKey
    public Object ThreeDS2Service() {
        try {
            return ((Class) get3DSServerTransactionID.ThreeDS2Service(2545 - TextUtils.lastIndexOf("", '0', 0), Color.argb(0, 0, 0, 0) + 66, (char) (31667 - (ViewConfiguration.getJumpTapTimeout() >> 16)))).getDeclaredConstructor(null).newInstance(null);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}