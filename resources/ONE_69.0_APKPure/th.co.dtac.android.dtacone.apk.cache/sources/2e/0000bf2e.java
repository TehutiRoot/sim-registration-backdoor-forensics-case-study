package com.netcetera.threeds.sdk.infrastructure;

import java.util.UUID;

/* loaded from: classes5.dex */
public class setStackFromBottom {
    private static int valueOf = 0;
    private static int values = 1;

    public String valueOf() {
        int i = valueOf;
        int i2 = i & 11;
        int i3 = (i | 11) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        values = i5 % 128;
        int i6 = i5 % 2;
        String uuid = UUID.randomUUID().toString();
        if (i6 == 0) {
            int i7 = 22 / 0;
        }
        return uuid;
    }
}