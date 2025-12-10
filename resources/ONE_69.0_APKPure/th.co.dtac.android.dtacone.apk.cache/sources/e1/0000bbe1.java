package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class getButtonText implements setDarkTextColor.valueOf {
    private final setDarkTextColor ThreeDS2ServiceInstance;

    public getButtonText(setDarkTextColor setdarktextcolor) {
        this.ThreeDS2ServiceInstance = setdarktextcolor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.timedout(this.ThreeDS2ServiceInstance);
    }
}