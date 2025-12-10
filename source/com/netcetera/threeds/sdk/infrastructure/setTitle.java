package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setTitleMargin;

/* loaded from: classes5.dex */
public class setTitle implements setTitleMargin.ThreeDS2ServiceInstance {
    private static int get = 1;
    private static int values;
    private final String ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final String valueOf;

    public setTitle(String str, String str2, String str3) {
        this.ThreeDS2Service = str;
        this.valueOf = str2;
        this.ThreeDS2ServiceInstance = str3;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTitleMargin.ThreeDS2ServiceInstance
    public String getSDKInfo() {
        int i = get;
        int i2 = (((i ^ 111) - (~(-(-((i & 111) << 1))))) - 1) % 128;
        values = i2;
        String str = this.ThreeDS2Service;
        int i3 = i2 ^ 41;
        int i4 = -(-((i2 & 41) << 1));
        get = ((i3 & i4) + (i4 | i3)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTitleMargin.ThreeDS2ServiceInstance
    public String getWarnings() {
        int i = get + 125;
        values = i % 128;
        if (i % 2 == 0) {
            return this.valueOf;
        }
        throw null;
    }
}
