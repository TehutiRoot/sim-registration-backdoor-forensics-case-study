package com.netcetera.threeds.sdk.infrastructure;

import java.util.List;

/* loaded from: classes5.dex */
public class setOverscrollFooter {
    private static int getSDKVersion = 1;
    private static int getWarnings;
    private final List<String> ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final String cleanup;
    private final String get;
    private final String initialize;
    private final List<String> valueOf;
    private final String values;

    public setOverscrollFooter(String str, List<String> list, String str2, String str3, List<String> list2, String str4, String str5) {
        this.values = str;
        this.ThreeDS2Service = list;
        this.ThreeDS2ServiceInstance = str2;
        this.get = str3;
        this.valueOf = list2;
        this.initialize = str4;
        this.cleanup = str5;
    }

    public String ThreeDS2Service() {
        int i = getWarnings;
        String str = this.values;
        int i2 = (i & 69) + (i | 69);
        getSDKVersion = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public List<String> ThreeDS2ServiceInstance() {
        int i = getWarnings;
        List<String> list = this.ThreeDS2Service;
        int i2 = i + 87;
        getSDKVersion = i2 % 128;
        if (i2 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public String get() {
        int i = getSDKVersion;
        int i2 = i & 57;
        int i3 = -(-((i ^ 57) | i2));
        int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        getWarnings = i4;
        String str = this.ThreeDS2ServiceInstance;
        int i5 = (i4 ^ 26) + ((i4 & 26) << 1);
        getSDKVersion = ((~i5) + (i5 << 1)) % 128;
        return str;
    }

    public String getSDKInfo() {
        int i = getWarnings;
        int i2 = i & 47;
        int i3 = (i2 + ((i ^ 47) | i2)) % 128;
        getSDKVersion = i3;
        String str = this.initialize;
        int i4 = i3 ^ 87;
        int i5 = -(-((i3 & 87) << 1));
        getWarnings = ((i4 & i5) + (i5 | i4)) % 128;
        return str;
    }

    public String getSDKVersion() {
        int i = getSDKVersion;
        String str = this.cleanup;
        int i2 = i & 69;
        getWarnings = (i2 + ((i ^ 69) | i2)) % 128;
        return str;
    }

    public String valueOf() {
        int i = getSDKVersion;
        String str = this.get;
        int i2 = i + 120;
        getWarnings = ((~i2) + (i2 << 1)) % 128;
        return str;
    }

    public List<String> values() {
        int i = getSDKVersion;
        int i2 = ((i | 54) << 1) - (i ^ 54);
        int i3 = (~i2) + (i2 << 1);
        getWarnings = i3 % 128;
        if (i3 % 2 == 0) {
            return this.valueOf;
        }
        throw null;
    }
}
