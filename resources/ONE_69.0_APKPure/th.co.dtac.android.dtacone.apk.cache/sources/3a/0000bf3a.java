package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* loaded from: classes5.dex */
class setTextAlignment implements setSelected.ThreeDS2Service {
    private final com.netcetera.threeds.sdk.api.transaction.challenge.events.ProtocolErrorEvent ThreeDS2Service;
    private final setTag get;

    public setTextAlignment(setTag settag, com.netcetera.threeds.sdk.api.transaction.challenge.events.ProtocolErrorEvent protocolErrorEvent) {
        this.get = settag;
        this.ThreeDS2Service = protocolErrorEvent;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        this.get.values(this.ThreeDS2Service);
    }
}