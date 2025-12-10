package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class logoDark {
    private static int ThreeDS2ServiceInstance = 1;
    private static int get;
    private final int ThreeDS2Service;
    private final int valueOf;
    private final String values;

    public logoDark(int i, int i2, String str) {
        this.valueOf = i;
        this.ThreeDS2Service = i2;
        this.values = str;
    }

    public int values() {
        int i = get;
        ThreeDS2ServiceInstance = ((i & 103) + (i | 103)) % 128;
        return this.ThreeDS2Service;
    }
}
