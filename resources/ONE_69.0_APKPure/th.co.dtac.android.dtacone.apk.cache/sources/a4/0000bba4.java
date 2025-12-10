package com.netcetera.threeds.sdk.infrastructure;

import java.util.List;

/* loaded from: classes5.dex */
public class encryptionPublicKey {
    private static int getSDKInfo = 0;
    private static int getWarnings = 1;
    private final int ThreeDS2ServiceInstance;
    private final List<String> get;
    private final int valueOf;
    private final List<String> values;

    public encryptionPublicKey(int i, int i2, List<String> list, List<String> list2) {
        this.valueOf = i;
        this.ThreeDS2ServiceInstance = i2;
        this.values = list;
        this.get = list2;
    }

    public List<String> ThreeDS2Service() {
        int i = (getSDKInfo + 67) % 128;
        getWarnings = i;
        List<String> list = this.get;
        int i2 = i + 97;
        getSDKInfo = i2 % 128;
        if (i2 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public int get() {
        getSDKInfo = (getWarnings + 99) % 128;
        return this.ThreeDS2ServiceInstance;
    }

    public List<String> values() {
        int i = getWarnings;
        List<String> list = this.values;
        getSDKInfo = (i + 25) % 128;
        return list;
    }
}