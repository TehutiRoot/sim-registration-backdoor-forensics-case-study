package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setHovered implements setDarkTextColor.ThreeDS2Service {
    public static final setHovered ThreeDS2Service = new setHovered();

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.ThreeDS2Service
    public getHeadingTextColor values(Object obj) {
        return getHeadingTextColor.get(((Boolean) obj).booleanValue());
    }
}
