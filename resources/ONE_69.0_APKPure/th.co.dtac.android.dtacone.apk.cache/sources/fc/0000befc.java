package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setRenderEffect implements setDarkTextColor.valueOf {
    private final setDarkTextColor get;
    private final setDarkTextColor.ThreeDS2Service values;

    public setRenderEffect(setDarkTextColor setdarktextcolor, setDarkTextColor.ThreeDS2Service threeDS2Service) {
        this.get = setdarktextcolor;
        this.values = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.ThreeDS2ServiceInstance(this.get, this.values);
    }
}