package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* loaded from: classes5.dex */
class setOnSystemUiVisibilityChangeListener implements setSelected.ThreeDS2Service {
    private final com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent ThreeDS2ServiceInstance;
    private final setTag get;

    public setOnSystemUiVisibilityChangeListener(setTag settag, com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent runtimeErrorEvent) {
        this.get = settag;
        this.ThreeDS2ServiceInstance = runtimeErrorEvent;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        this.get.values(this.ThreeDS2ServiceInstance);
    }
}