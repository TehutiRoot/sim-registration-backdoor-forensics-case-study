package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class addKeyInfoConverter implements setDarkTextColor.valueOf {
    private final setDarkTextColor valueOf;
    private final setDarkTextColor.ThreeDS2Service values;

    public addKeyInfoConverter(setDarkTextColor setdarktextcolor, setDarkTextColor.ThreeDS2Service threeDS2Service) {
        this.valueOf = setdarktextcolor;
        this.values = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.removeParam(this.valueOf, this.values);
    }
}