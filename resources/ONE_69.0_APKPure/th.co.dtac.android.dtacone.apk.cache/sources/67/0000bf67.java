package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setVerticalScrollBarEnabled implements setDarkTextColor.valueOf {
    private final setDarkTextColor ThreeDS2Service;
    private final setDarkTextColor.ThreeDS2Service get;

    public setVerticalScrollBarEnabled(setDarkTextColor setdarktextcolor, setDarkTextColor.ThreeDS2Service threeDS2Service) {
        this.ThreeDS2Service = setdarktextcolor;
        this.get = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.jcbConfiguration(this.ThreeDS2Service, this.get);
    }
}