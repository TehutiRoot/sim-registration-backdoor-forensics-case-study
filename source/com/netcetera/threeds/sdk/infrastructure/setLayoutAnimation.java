package com.netcetera.threeds.sdk.infrastructure;

import java.nio.charset.StandardCharsets;

/* loaded from: classes5.dex */
public final class setLayoutAnimation {
    private static int get = 1;
    private static int values;
    private final byte[] valueOf;

    public setLayoutAnimation(byte[] bArr) {
        this.valueOf = bArr;
    }

    public int ThreeDS2Service() {
        int i = values;
        int i2 = i & 121;
        int i3 = (i | 121) & (~i2);
        int i4 = i2 << 1;
        int i5 = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        get = i5;
        int length = this.valueOf.length;
        values = (i5 + 95) % 128;
        return length;
    }

    public String ThreeDS2ServiceInstance() {
        String str = new String(this.valueOf, StandardCharsets.UTF_8);
        int i = get + 54;
        values = ((~i) + (i << 1)) % 128;
        return str;
    }

    public byte[] get() {
        int i = get;
        int i2 = i & 85;
        int i3 = ((i ^ 85) | i2) << 1;
        int i4 = -((i | 85) & (~i2));
        int i5 = ((i3 & i4) + (i4 | i3)) % 128;
        values = i5;
        byte[] bArr = this.valueOf;
        int i6 = (-2) - (~(i5 + 114));
        get = i6 % 128;
        if (i6 % 2 != 0) {
            return bArr;
        }
        throw null;
    }
}
