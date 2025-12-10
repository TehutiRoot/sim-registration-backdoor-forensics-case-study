package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setTitleMargin;

/* loaded from: classes5.dex */
public class setSubtitle implements setTitleMargin, setTitleMargin.ThreeDS2Service, setTitleMargin.ThreeDS2ServiceInstance {
    private static int ThreeDS2Service = 1;
    private static int valueOf;
    private final setTitleMargin.ThreeDS2ServiceInstance ThreeDS2ServiceInstance;
    private final setTitleMargin.ThreeDS2Service values;

    public setSubtitle(setTitleMargin.ThreeDS2Service threeDS2Service, setTitleMargin.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        this.values = threeDS2Service;
        this.ThreeDS2ServiceInstance = threeDS2ServiceInstance;
    }

    public static setTitleMargin ThreeDS2ServiceInstance(String str, String str2, String str3) {
        setSubtitle setsubtitle = new setSubtitle(new setTitleTextAppearance(str, str2, str3), null);
        int i = valueOf;
        int i2 = i ^ 15;
        ThreeDS2Service = (((((i & 15) | i2) << 1) - (~(-i2))) - 1) % 128;
        return setsubtitle;
    }

    public static setTitleMargin get(String str, String str2, String str3) {
        setSubtitle setsubtitle = new setSubtitle(null, new setTitle(str, str2, str3));
        int i = valueOf;
        int i2 = i ^ 65;
        int i3 = (i & 65) << 1;
        ThreeDS2Service = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        return setsubtitle;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTitleMargin.ThreeDS2Service
    public String ThreeDS2Service() {
        int i = ThreeDS2Service;
        int i2 = i & 69;
        valueOf = (((i | 69) & (~i2)) + (i2 << 1)) % 128;
        String ThreeDS2Service2 = this.values.ThreeDS2Service();
        ThreeDS2Service = (valueOf + 39) % 128;
        return ThreeDS2Service2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTitleMargin.ThreeDS2ServiceInstance
    public String getSDKInfo() {
        int i = ThreeDS2Service;
        valueOf = ((i ^ 71) + ((i & 71) << 1)) % 128;
        String sDKInfo = this.ThreeDS2ServiceInstance.getSDKInfo();
        int i2 = valueOf;
        ThreeDS2Service = (((i2 | 27) << 1) - (i2 ^ 27)) % 128;
        return sDKInfo;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTitleMargin.ThreeDS2ServiceInstance
    public String getWarnings() {
        int i = valueOf;
        int i2 = (i & 57) + (i | 57);
        ThreeDS2Service = i2 % 128;
        int i3 = i2 % 2;
        setTitleMargin.ThreeDS2ServiceInstance threeDS2ServiceInstance = this.ThreeDS2ServiceInstance;
        if (i3 != 0) {
            return threeDS2ServiceInstance.getWarnings();
        }
        threeDS2ServiceInstance.getWarnings();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTitleMargin
    public setTitleMargin.ThreeDS2Service valueOf() {
        valueOf = (ThreeDS2Service + 35) % 128;
        return this;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTitleMargin.ThreeDS2Service
    public String values() {
        int i = ThreeDS2Service;
        int i2 = (i ^ 109) + ((i & 109) << 1);
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        setTitleMargin.ThreeDS2Service threeDS2Service = this.values;
        if (i3 == 0) {
            return threeDS2Service.values();
        }
        threeDS2Service.values();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTitleMargin.ThreeDS2Service
    public String ThreeDS2ServiceInstance() {
        int i = ThreeDS2Service;
        int i2 = i & 99;
        int i3 = -(-(i | 99));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        valueOf = i4 % 128;
        int i5 = i4 % 2;
        setTitleMargin.ThreeDS2Service threeDS2Service = this.values;
        if (i5 != 0) {
            threeDS2Service.ThreeDS2ServiceInstance();
            throw null;
        }
        String ThreeDS2ServiceInstance = threeDS2Service.ThreeDS2ServiceInstance();
        int i6 = valueOf;
        ThreeDS2Service = ((i6 ^ 59) + ((i6 & 59) << 1)) % 128;
        return ThreeDS2ServiceInstance;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTitleMargin
    public setTitleMargin.ThreeDS2ServiceInstance get() {
        int i = valueOf;
        int i2 = (i ^ 26) + ((i & 26) << 1);
        int i3 = ((~i2) + (i2 << 1)) % 128;
        ThreeDS2Service = i3;
        int i4 = i3 & 51;
        int i5 = -(-((i3 ^ 51) | i4));
        valueOf = ((i4 & i5) + (i5 | i4)) % 128;
        return this;
    }
}
