package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.SDKAlreadyInitializedException;

/* loaded from: classes5.dex */
class getId implements getSDKEphemeralPublicKey {
    private final SDKAlreadyInitializedException.ThreeDS2Service get;

    public getId(SDKAlreadyInitializedException.ThreeDS2Service threeDS2Service) {
        this.get = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getSDKEphemeralPublicKey
    public Object ThreeDS2Service() {
        getValue build;
        build = SDKAlreadyInitializedException.build(this.get);
        return build;
    }
}