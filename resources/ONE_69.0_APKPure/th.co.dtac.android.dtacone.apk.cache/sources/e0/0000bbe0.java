package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class getButtonCustomization implements setDarkTextColor.valueOf {
    private final setDarkTextColor values;

    public getButtonCustomization(setDarkTextColor setdarktextcolor) {
        this.values = setdarktextcolor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.getMessageVersion(this.values);
    }
}