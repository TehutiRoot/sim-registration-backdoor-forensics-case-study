package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setLabelCustomization implements setDarkTextColor.valueOf {
    private final setDarkTextColor get;
    private final setDarkTextColor.ThreeDS2Service valueOf;

    public setLabelCustomization(setDarkTextColor setdarktextcolor, setDarkTextColor.ThreeDS2Service threeDS2Service) {
        this.get = setdarktextcolor;
        this.valueOf = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.createTransaction(this.get, this.valueOf);
    }
}