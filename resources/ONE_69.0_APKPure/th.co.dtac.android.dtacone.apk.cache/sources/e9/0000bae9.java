package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.SDKAlreadyInitializedException;

/* loaded from: classes5.dex */
class SchemeInfo implements getSDKEphemeralPublicKey {
    private final SDKAlreadyInitializedException.ThreeDS2Service ThreeDS2ServiceInstance;

    public SchemeInfo(SDKAlreadyInitializedException.ThreeDS2Service threeDS2Service) {
        this.ThreeDS2ServiceInstance = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getSDKEphemeralPublicKey
    public Object ThreeDS2Service() {
        setScrollingCacheEnabled dinersSchemeConfiguration$7c822f2c;
        dinersSchemeConfiguration$7c822f2c = SDKAlreadyInitializedException.dinersSchemeConfiguration$7c822f2c(this.ThreeDS2ServiceInstance);
        return dinersSchemeConfiguration$7c822f2c;
    }
}