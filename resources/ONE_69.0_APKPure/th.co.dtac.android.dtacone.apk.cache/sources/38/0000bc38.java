package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class getToolbarCustomization implements setDarkTextColor.valueOf {
    private final setDarkTextColor.ThreeDS2Service valueOf;
    private final setDarkTextColor values;

    public getToolbarCustomization(setDarkTextColor setdarktextcolor, setDarkTextColor.ThreeDS2Service threeDS2Service) {
        this.values = setdarktextcolor;
        this.valueOf = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.values(this.values, this.valueOf);
    }
}