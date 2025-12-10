package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setDarkBorderColor implements setDarkTextColor.valueOf {
    private final setDarkTextColor.ThreeDS2Service ThreeDS2ServiceInstance;
    private final setDarkTextColor get;

    public setDarkBorderColor(setDarkTextColor setdarktextcolor, setDarkTextColor.ThreeDS2Service threeDS2Service) {
        this.get = setdarktextcolor;
        this.ThreeDS2ServiceInstance = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.getSDKInfo(this.get, this.ThreeDS2ServiceInstance);
    }
}