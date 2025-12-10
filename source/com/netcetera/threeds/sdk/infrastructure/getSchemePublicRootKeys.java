package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public final class getSchemePublicRootKeys {
    private static int ThreeDS2Service = 1;
    private static int valueOf;

    public static int get(String str, String[] strArr) {
        int i = valueOf + 55;
        ThreeDS2Service = i % 128;
        int i2 = i % 2;
        int length = strArr.length;
        for (int i3 = 0; i3 < length; i3 = (i3 | 1) + (i3 & 1)) {
            int i4 = ThreeDS2Service + 13;
            valueOf = i4 % 128;
            if (i4 % 2 == 0) {
                if (str.contains(strArr[i3])) {
                    valueOf = (ThreeDS2Service + 125) % 128;
                    return 1;
                }
            } else {
                str.contains(strArr[i3]);
                throw null;
            }
        }
        int i5 = valueOf;
        ThreeDS2Service = (((i5 | 119) << 1) - (i5 ^ 119)) % 128;
        return 0;
    }
}
