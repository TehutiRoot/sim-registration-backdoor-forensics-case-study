package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.aj */
/* loaded from: classes5.dex */
public class C9243aj implements isEmpty {
    private static int ThreeDS2ServiceInstance = 0;
    private static int values = 1;
    private final String ThreeDS2Service;
    private final String valueOf;

    public C9243aj(String str, String str2) {
        this.ThreeDS2Service = str;
        this.valueOf = str2;
    }

    public String get() {
        int i = ThreeDS2ServiceInstance;
        int i2 = ((((i ^ 115) | (i & 115)) << 1) - (((~i) & 115) | (i & (-116)))) % 128;
        values = i2;
        String str = this.valueOf;
        int i3 = (i2 & 83) + (i2 | 83);
        ThreeDS2ServiceInstance = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String values() {
        int i = values;
        int i2 = i & 79;
        int i3 = (i | 79) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = ((i3 & i4) + (i3 | i4)) % 128;
        ThreeDS2ServiceInstance = i5;
        String str = this.ThreeDS2Service;
        int i6 = i5 & 53;
        int i7 = ((i5 ^ 53) | i6) << 1;
        int i8 = -((i5 | 53) & (~i6));
        values = ((i7 ^ i8) + ((i7 & i8) << 1)) % 128;
        return str;
    }
}
