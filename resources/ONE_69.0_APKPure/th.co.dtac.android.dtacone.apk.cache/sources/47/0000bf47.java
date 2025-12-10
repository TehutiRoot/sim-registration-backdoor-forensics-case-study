package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class setTextSelectHandleRight {
    private static int get = 0;
    private static int valueOf = 1;

    public com.netcetera.threeds.sdk.api.ThreeDS2Service values() {
        int i = get;
        int i2 = i & 11;
        int i3 = -(-(i | 11));
        int i4 = (i2 & i3) + (i3 | i2);
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return setTextLocales.valueOf();
        }
        setTextLocales.valueOf();
        throw null;
    }
}