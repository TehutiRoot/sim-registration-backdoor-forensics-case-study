package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.SDKAlreadyInitializedException;

/* loaded from: classes5.dex */
class getMessage implements getSDKEphemeralPublicKey {
    private final SDKAlreadyInitializedException.ThreeDS2Service ThreeDS2ServiceInstance;

    public getMessage(SDKAlreadyInitializedException.ThreeDS2Service threeDS2Service) {
        this.ThreeDS2ServiceInstance = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getSDKEphemeralPublicKey
    public Object ThreeDS2Service() {
        setTextColor restrictedParameters;
        restrictedParameters = SDKAlreadyInitializedException.restrictedParameters(this.ThreeDS2ServiceInstance);
        return restrictedParameters;
    }
}
