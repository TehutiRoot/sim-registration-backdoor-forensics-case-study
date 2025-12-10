package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.SDKAlreadyInitializedException;

/* loaded from: classes5.dex */
class Warning implements getSDKEphemeralPublicKey {
    private final SDKAlreadyInitializedException.ThreeDS2Service valueOf;

    public Warning(SDKAlreadyInitializedException.ThreeDS2Service threeDS2Service) {
        this.valueOf = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getSDKEphemeralPublicKey
    public Object ThreeDS2Service() {
        setProgressTintBlendMode ConfigParameters;
        ConfigParameters = SDKAlreadyInitializedException.ConfigParameters(this.valueOf);
        return ConfigParameters;
    }
}