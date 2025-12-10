package com.netcetera.threeds.sdk.infrastructure;

import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;

/* loaded from: classes5.dex */
class getProgressView implements getSDKEphemeralPublicKey {
    public static final getProgressView valueOf = new getProgressView();

    @Override // com.netcetera.threeds.sdk.infrastructure.getSDKEphemeralPublicKey
    public Object ThreeDS2Service() {
        try {
            return ((Class) get3DSServerTransactionID.ThreeDS2Service(3018 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 60, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1))).getDeclaredConstructor(null).newInstance(null);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}