package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setTextBoxCustomization implements setDarkTextColor.valueOf {
    private final setDarkTextColor valueOf;

    public setTextBoxCustomization(setDarkTextColor setdarktextcolor) {
        this.valueOf = setdarktextcolor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.unionSchemeConfiguration(this.valueOf);
    }
}