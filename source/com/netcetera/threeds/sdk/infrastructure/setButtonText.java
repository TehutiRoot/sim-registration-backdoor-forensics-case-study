package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setButtonText implements setDarkTextColor.valueOf {
    private final setDarkTextColor.ThreeDS2Service get;
    private final setDarkTextColor values;

    public setButtonText(setDarkTextColor setdarktextcolor, setDarkTextColor.ThreeDS2Service threeDS2Service) {
        this.values = setdarktextcolor;
        this.get = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.visaSchemeConfiguration(this.values, this.get);
    }
}
