package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class getBorderWidth implements setDarkTextColor.valueOf {
    private final setDarkTextColor get;

    public getBorderWidth(setDarkTextColor setdarktextcolor) {
        this.get = setdarktextcolor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.SchemeConfiguration(this.get);
    }
}