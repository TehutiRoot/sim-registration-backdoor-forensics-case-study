package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* loaded from: classes5.dex */
public class setCompoundDrawablesRelativeWithIntrinsicBounds implements setSelected.valueOf {
    private final com.netcetera.threeds.sdk.api.ThreeDS2Service ThreeDS2ServiceInstance;

    public setCompoundDrawablesRelativeWithIntrinsicBounds(com.netcetera.threeds.sdk.api.ThreeDS2Service threeDS2Service) {
        this.ThreeDS2ServiceInstance = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.valueOf
    public Object ThreeDS2ServiceInstance() {
        return this.ThreeDS2ServiceInstance.getSDKVersion();
    }
}
