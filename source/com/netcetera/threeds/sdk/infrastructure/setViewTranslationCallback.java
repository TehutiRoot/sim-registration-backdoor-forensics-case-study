package com.netcetera.threeds.sdk.infrastructure;

import java.util.Date;
import java.util.List;

/* loaded from: classes5.dex */
public class setViewTranslationCallback implements com.netcetera.threeds.sdk.api.info.SDKInfo {
    private static int ThreeDS2ServiceInstance = 1;
    private static int get;
    private final Date ThreeDS2Service;
    private final List<com.netcetera.threeds.sdk.api.info.SchemeInfo> values;

    public setViewTranslationCallback(List<com.netcetera.threeds.sdk.api.info.SchemeInfo> list, Date date) {
        this.values = list;
        this.ThreeDS2Service = date;
    }

    @Override // com.netcetera.threeds.sdk.api.info.SDKInfo
    public Date getLicenseExpiryDate() {
        int i = ThreeDS2ServiceInstance + 65;
        get = i % 128;
        if (i % 2 == 0) {
            return this.ThreeDS2Service;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.api.info.SDKInfo
    public List<com.netcetera.threeds.sdk.api.info.SchemeInfo> getSchemeConfigurations() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i ^ 79;
        int i3 = (i & 79) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        get = i4 % 128;
        int i5 = i4 % 2;
        List<com.netcetera.threeds.sdk.api.info.SchemeInfo> list = this.values;
        if (i5 != 0) {
            int i6 = 9 / 0;
        }
        return list;
    }
}
