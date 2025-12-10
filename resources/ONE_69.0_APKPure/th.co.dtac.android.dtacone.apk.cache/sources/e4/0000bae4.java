package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.SDKAlreadyInitializedException;

/* loaded from: classes5.dex */
class SDKInfo implements getSDKEphemeralPublicKey {
    private final SDKAlreadyInitializedException.ThreeDS2Service ThreeDS2ServiceInstance;

    public SDKInfo(SDKAlreadyInitializedException.ThreeDS2Service threeDS2Service) {
        this.ThreeDS2ServiceInstance = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getSDKEphemeralPublicKey
    public Object ThreeDS2Service() {
        setMin addParam;
        addParam = SDKAlreadyInitializedException.addParam(this.ThreeDS2ServiceInstance);
        return addParam;
    }
}