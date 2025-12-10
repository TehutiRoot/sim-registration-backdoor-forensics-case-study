package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* loaded from: classes5.dex */
class setMinimumHeight implements setSelected.ThreeDS2Service {
    private final com.netcetera.threeds.sdk.api.transaction.challenge.events.CompletionEvent ThreeDS2ServiceInstance;
    private final setTag valueOf;

    public setMinimumHeight(setTag settag, com.netcetera.threeds.sdk.api.transaction.challenge.events.CompletionEvent completionEvent) {
        this.valueOf = settag;
        this.ThreeDS2ServiceInstance = completionEvent;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        this.valueOf.values(this.ThreeDS2ServiceInstance);
    }
}