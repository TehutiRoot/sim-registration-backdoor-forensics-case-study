package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setIsHandwritingDelegate implements setDarkTextColor.valueOf {
    private final setDarkTextColor ThreeDS2ServiceInstance;

    public setIsHandwritingDelegate(setDarkTextColor setdarktextcolor) {
        this.ThreeDS2ServiceInstance = setdarktextcolor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.visaSchemeConfiguration(this.ThreeDS2ServiceInstance);
    }
}