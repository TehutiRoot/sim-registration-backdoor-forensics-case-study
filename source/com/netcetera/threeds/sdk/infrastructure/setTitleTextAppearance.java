package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setTitleMargin;

/* loaded from: classes5.dex */
public class setTitleTextAppearance implements setTitleMargin.ThreeDS2Service {
    private static int ThreeDS2ServiceInstance = 0;
    private static int valueOf = 1;
    private final String ThreeDS2Service;
    private final String get;
    private final String values;

    public setTitleTextAppearance(String str, String str2, String str3) {
        this.ThreeDS2Service = str;
        this.values = str2;
        this.get = str3;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTitleMargin.ThreeDS2Service
    public String ThreeDS2Service() {
        int i = valueOf;
        int i2 = (i & 107) + (i | 107);
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 == 0) {
            String str = this.ThreeDS2Service;
            int i3 = (((i ^ 99) | (i & 99)) << 1) - (((~i) & 99) | (i & (-100)));
            ThreeDS2ServiceInstance = i3 % 128;
            if (i3 % 2 == 0) {
                return str;
            }
            throw null;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTitleMargin.ThreeDS2Service
    public String ThreeDS2ServiceInstance() {
        int i = valueOf;
        int i2 = (i & (-46)) | ((~i) & 45);
        int i3 = (i & 45) << 1;
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        ThreeDS2ServiceInstance = i4;
        String str = this.get;
        valueOf = (i4 + 9) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTitleMargin.ThreeDS2Service
    public String values() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 49;
        int i3 = ((i2 - (~(-(-((i ^ 49) | i2))))) - 1) % 128;
        valueOf = i3;
        String str = this.values;
        ThreeDS2ServiceInstance = ((i3 & 17) + (i3 | 17)) % 128;
        return str;
    }
}
