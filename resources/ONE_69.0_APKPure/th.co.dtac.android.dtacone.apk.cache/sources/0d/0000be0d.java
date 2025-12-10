package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class setCursorVisible {
    private static int valueOf = 0;
    private static int values = 1;
    private final String ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;

    public setCursorVisible(String str, String str2) {
        this.ThreeDS2ServiceInstance = str;
        this.ThreeDS2Service = str2;
    }

    public String ThreeDS2Service() {
        int i = (valueOf + 57) % 128;
        values = i;
        String str = this.ThreeDS2ServiceInstance;
        int i2 = i & 49;
        int i3 = (((i ^ 49) | i2) << 1) - ((i | 49) & (~i2));
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String ThreeDS2ServiceInstance() {
        String str;
        int i = values;
        int i2 = i + 9;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            str = this.ThreeDS2Service;
            int i3 = 13 / 0;
        } else {
            str = this.ThreeDS2Service;
        }
        valueOf = ((-2) - (~((i & 38) + (i | 38)))) % 128;
        return str;
    }
}