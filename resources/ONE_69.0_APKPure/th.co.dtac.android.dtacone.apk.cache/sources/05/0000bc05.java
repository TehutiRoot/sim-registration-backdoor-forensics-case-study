package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class getKeyInfoConverter implements setDarkTextColor.valueOf {
    private final setDarkTextColor valueOf;

    public getKeyInfoConverter(setDarkTextColor setdarktextcolor) {
        this.valueOf = setdarktextcolor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.ConfigParameters(this.valueOf);
    }
}