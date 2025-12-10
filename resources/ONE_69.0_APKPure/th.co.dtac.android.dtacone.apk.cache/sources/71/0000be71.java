package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setImportantForContentCapture implements setDarkTextColor.valueOf {
    private final setDarkTextColor.ThreeDS2Service get;
    private final setDarkTextColor valueOf;

    public setImportantForContentCapture(setDarkTextColor setdarktextcolor, setDarkTextColor.ThreeDS2Service threeDS2Service) {
        this.valueOf = setdarktextcolor;
        this.get = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.newSchemeConfiguration(this.valueOf, this.get);
    }
}