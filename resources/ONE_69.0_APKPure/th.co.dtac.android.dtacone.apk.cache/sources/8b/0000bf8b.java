package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class unregisterForContextMenu implements setDarkTextColor.valueOf {
    private final setDarkTextColor valueOf;

    public unregisterForContextMenu(setDarkTextColor setdarktextcolor) {
        this.valueOf = setdarktextcolor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.cbConfiguration(this.valueOf);
    }
}