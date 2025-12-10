package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class onContextItemSelected implements setDarkTextColor.valueOf {
    private final setDarkTextColor.ThreeDS2Service ThreeDS2ServiceInstance;
    private final setDarkTextColor valueOf;

    public onContextItemSelected(setDarkTextColor setdarktextcolor, setDarkTextColor.ThreeDS2Service threeDS2Service) {
        this.valueOf = setdarktextcolor;
        this.ThreeDS2ServiceInstance = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.unionSchemeConfiguration(this.valueOf, this.ThreeDS2ServiceInstance);
    }
}