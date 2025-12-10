package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class logo {
    private static int getSDKInfo = 0;
    private static int getWarnings = 1;
    private final String ThreeDS2Service;
    private final int ThreeDS2ServiceInstance;
    private final String cleanup;
    private final String get;
    private final String getSDKVersion;
    private final String initialize;
    private final int valueOf;
    private final String values;

    public logo(int i, int i2) {
        this.valueOf = i;
        this.ThreeDS2ServiceInstance = i2;
        this.get = null;
        this.values = null;
        this.ThreeDS2Service = null;
        this.getSDKVersion = null;
        this.initialize = null;
        this.cleanup = null;
    }

    public int get() {
        getSDKInfo = (getWarnings + 25) % 128;
        return this.ThreeDS2ServiceInstance;
    }

    public logo(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.valueOf = i;
        this.ThreeDS2ServiceInstance = i2;
        this.get = str;
        this.values = str2;
        this.ThreeDS2Service = str3;
        this.getSDKVersion = str4;
        this.initialize = str5;
        this.cleanup = str6;
    }
}
