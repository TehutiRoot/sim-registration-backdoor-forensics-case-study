package com.netcetera.threeds.sdk.infrastructure;

import android.os.Build;

/* loaded from: classes5.dex */
public class setHintTextColor {
    private static int valueOf = 1;
    private static int values;

    public static setLinksClickable valueOf(String str) {
        int i = valueOf;
        int i2 = i & 95;
        int i3 = (i | 95) & (~i2);
        int i4 = -(-(i2 << 1));
        values = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        String str2 = (String) C9669om.ThreeDS2Service(str, "");
        if (Build.VERSION.SDK_INT < 30) {
            setPaintFlags setpaintflags = new setPaintFlags(str2);
            valueOf = ((-2) - (~(values + 32))) % 128;
            return setpaintflags;
        }
        setAutoLinkMask setautolinkmask = new setAutoLinkMask(str2);
        int i5 = valueOf;
        int i6 = i5 & 105;
        int i7 = -(-((i5 ^ 105) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        values = i8 % 128;
        if (i8 % 2 == 0) {
            return setautolinkmask;
        }
        throw null;
    }
}
