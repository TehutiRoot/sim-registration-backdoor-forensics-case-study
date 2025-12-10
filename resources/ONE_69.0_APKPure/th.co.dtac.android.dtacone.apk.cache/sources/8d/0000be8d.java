package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setLayerPaint implements setDarkTextColor.valueOf {
    private final setDarkTextColor ThreeDS2Service;
    private final setDarkTextColor.ThreeDS2Service values;

    public setLayerPaint(setDarkTextColor setdarktextcolor, setDarkTextColor.ThreeDS2Service threeDS2Service) {
        this.ThreeDS2Service = setdarktextcolor;
        this.values = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.ConfigParameters(this.ThreeDS2Service, this.values);
    }
}