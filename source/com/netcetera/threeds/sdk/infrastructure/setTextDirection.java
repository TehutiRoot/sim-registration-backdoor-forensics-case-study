package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* loaded from: classes5.dex */
class setTextDirection implements setSelected.ThreeDS2Service {
    private final setTag get;

    public setTextDirection(setTag settag) {
        this.get = settag;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        this.get.values();
    }
}
