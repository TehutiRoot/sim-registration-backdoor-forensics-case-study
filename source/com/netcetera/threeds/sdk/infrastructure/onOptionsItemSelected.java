package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class onOptionsItemSelected implements setDarkTextColor.valueOf {
    private final setDarkTextColor ThreeDS2Service;
    private final setDarkTextColor.ThreeDS2Service valueOf;

    public onOptionsItemSelected(setDarkTextColor setdarktextcolor, setDarkTextColor.ThreeDS2Service threeDS2Service) {
        this.ThreeDS2Service = setdarktextcolor;
        this.valueOf = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.getSchemeName(this.ThreeDS2Service, this.valueOf);
    }
}
