package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.SDKAlreadyInitializedException;

/* loaded from: classes5.dex */
class getRootCertificates implements getSDKEphemeralPublicKey {
    private final SDKAlreadyInitializedException.ThreeDS2Service ThreeDS2Service;

    public getRootCertificates(SDKAlreadyInitializedException.ThreeDS2Service threeDS2Service) {
        this.ThreeDS2Service = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getSDKEphemeralPublicKey
    public Object ThreeDS2Service() {
        setProgress paramValue;
        paramValue = SDKAlreadyInitializedException.getParamValue(this.ThreeDS2Service);
        return paramValue;
    }
}
