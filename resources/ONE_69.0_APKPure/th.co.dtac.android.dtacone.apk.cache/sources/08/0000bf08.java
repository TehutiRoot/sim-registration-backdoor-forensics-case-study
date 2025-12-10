package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setScreenReaderFocusable implements setDarkTextColor.valueOf {
    private final setDarkTextColor ThreeDS2Service;

    public setScreenReaderFocusable(setDarkTextColor setdarktextcolor) {
        this.ThreeDS2Service = setdarktextcolor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.get3DSServerTransactionID(this.ThreeDS2Service);
    }
}