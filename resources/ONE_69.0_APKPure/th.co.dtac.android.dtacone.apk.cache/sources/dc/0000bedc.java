package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* loaded from: classes5.dex */
class setOverScrollMode implements setSelected.ThreeDS2Service {
    private final setTag ThreeDS2Service;

    public setOverScrollMode(setTag settag) {
        this.ThreeDS2Service = settag;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        this.ThreeDS2Service.get();
    }
}