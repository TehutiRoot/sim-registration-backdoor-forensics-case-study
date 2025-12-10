package com.netcetera.threeds.sdk;

import com.netcetera.threeds.sdk.api.ThreeDS2Service;
import com.netcetera.threeds.sdk.infrastructure.AuthenticationRequestParameters;
import com.netcetera.threeds.sdk.infrastructure.getSDKTransactionID;

/* loaded from: classes5.dex */
public final class ThreeDS2ServiceInstance {
    private static int ThreeDS2Service = 1;
    private static int valueOf;

    static {
        AuthenticationRequestParameters.ThreeDS2Service(new getSDKTransactionID());
        int i = ThreeDS2Service;
        int i2 = i ^ 93;
        int i3 = (i & 93) << 1;
        valueOf = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
    }

    public static ThreeDS2Service get() {
        valueOf = (ThreeDS2Service + 95) % 128;
        ThreeDS2Service threeDS2Service = (ThreeDS2Service) AuthenticationRequestParameters.valueOf(ThreeDS2Service.class);
        int i = ThreeDS2Service + 63;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return threeDS2Service;
        }
        throw null;
    }
}
