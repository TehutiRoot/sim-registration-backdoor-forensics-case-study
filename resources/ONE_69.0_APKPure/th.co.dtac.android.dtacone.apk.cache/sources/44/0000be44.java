package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setHandwritingDelegatorCallback implements setDarkTextColor.valueOf {
    private final setDarkTextColor ThreeDS2ServiceInstance;

    public setHandwritingDelegatorCallback(setDarkTextColor setdarktextcolor) {
        this.ThreeDS2ServiceInstance = setdarktextcolor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.Warning(this.ThreeDS2ServiceInstance);
    }
}