package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class addAlgorithm implements setDarkTextColor.valueOf {
    private final setDarkTextColor valueOf;
    private final setDarkTextColor.ThreeDS2Service values;

    public addAlgorithm(setDarkTextColor setdarktextcolor, setDarkTextColor.ThreeDS2Service threeDS2Service) {
        this.valueOf = setdarktextcolor;
        this.values = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.valueOf(this.valueOf, this.values);
    }
}
