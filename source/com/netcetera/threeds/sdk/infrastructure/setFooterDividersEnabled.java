package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class setFooterDividersEnabled {
    private static int ThreeDS2Service = 0;
    private static int values = 1;
    private final String ThreeDS2ServiceInstance;
    private final Boolean valueOf;

    public setFooterDividersEnabled(String str, Boolean bool) {
        this.ThreeDS2ServiceInstance = str;
        this.valueOf = bool;
    }

    public static setFooterDividersEnabled ThreeDS2Service() {
        setFooterDividersEnabled setfooterdividersenabled = new setFooterDividersEnabled("", Boolean.TRUE);
        int i = values;
        int i2 = ((((i ^ 25) | (i & 25)) << 1) - (~(-(((~i) & 25) | (i & (-26)))))) - 1;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            return setfooterdividersenabled;
        }
        throw null;
    }

    public Boolean get() {
        int i = values;
        int i2 = i & 111;
        int i3 = -(-((i ^ 111) | i2));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        ThreeDS2Service = i4;
        Boolean bool = this.valueOf;
        int i5 = i4 & 95;
        int i6 = (((i4 ^ 95) | i5) << 1) - ((i4 | 95) & (~i5));
        values = i6 % 128;
        if (i6 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    public String valueOf() {
        int i = ThreeDS2Service;
        String str = this.ThreeDS2ServiceInstance;
        int i2 = i & 25;
        values = ((((i | 25) & (~i2)) - (~(-(-(i2 << 1))))) - 1) % 128;
        return str;
    }
}
