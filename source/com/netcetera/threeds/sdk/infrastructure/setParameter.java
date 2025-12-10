package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setParameter implements setDarkTextColor.valueOf {
    private final setDarkTextColor.ThreeDS2Service ThreeDS2Service;
    private final setDarkTextColor valueOf;

    public setParameter(setDarkTextColor setdarktextcolor, setDarkTextColor.ThreeDS2Service threeDS2Service) {
        this.valueOf = setdarktextcolor;
        this.ThreeDS2Service = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.mastercardSchemeConfiguration(this.valueOf, this.ThreeDS2Service);
    }
}
