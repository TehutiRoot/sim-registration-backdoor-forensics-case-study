package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.SDKAlreadyInitializedException;

/* loaded from: classes5.dex */
class getErrorCode implements getSDKEphemeralPublicKey {
    private final SDKAlreadyInitializedException.ThreeDS2Service ThreeDS2Service;

    public getErrorCode(SDKAlreadyInitializedException.ThreeDS2Service threeDS2Service) {
        this.ThreeDS2Service = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getSDKEphemeralPublicKey
    public Object ThreeDS2Service() {
        setBaselineAlignedChildIndex mastercardSchemeConfiguration;
        mastercardSchemeConfiguration = SDKAlreadyInitializedException.mastercardSchemeConfiguration(this.ThreeDS2Service);
        return mastercardSchemeConfiguration;
    }
}