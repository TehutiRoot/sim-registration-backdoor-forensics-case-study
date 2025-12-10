package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setDuplicateParentStateEnabled implements setDarkTextColor.valueOf {
    private final setDarkTextColor ThreeDS2ServiceInstance;
    private final setDarkTextColor.ThreeDS2Service values;

    public setDuplicateParentStateEnabled(setDarkTextColor setdarktextcolor, setDarkTextColor.ThreeDS2Service threeDS2Service) {
        this.ThreeDS2ServiceInstance = setdarktextcolor;
        this.values = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.getSDKVersion(this.ThreeDS2ServiceInstance, this.values);
    }
}