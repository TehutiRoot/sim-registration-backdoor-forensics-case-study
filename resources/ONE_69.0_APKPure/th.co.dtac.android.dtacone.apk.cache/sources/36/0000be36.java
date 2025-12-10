package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setFocusedByDefault implements setDarkTextColor.ThreeDS2Service {
    public static final setFocusedByDefault ThreeDS2Service = new setFocusedByDefault();

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.ThreeDS2Service
    public getHeadingTextColor values(Object obj) {
        return getHeadingTextColor.valueOf(((Boolean) obj).booleanValue());
    }
}