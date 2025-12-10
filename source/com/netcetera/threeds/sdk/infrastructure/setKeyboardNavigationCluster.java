package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setKeyboardNavigationCluster implements setDarkTextColor.valueOf {
    private final Locale ThreeDS2ServiceInstance;

    public setKeyboardNavigationCluster(Locale locale) {
        this.ThreeDS2ServiceInstance = locale;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.valueOf
    public getHeadingTextColor values() {
        return setDarkTextColor.values(this.ThreeDS2ServiceInstance);
    }
}
