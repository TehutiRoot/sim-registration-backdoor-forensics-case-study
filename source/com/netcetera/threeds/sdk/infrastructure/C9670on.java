package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.on */
/* loaded from: classes5.dex */
public class C9670on {
    public static final Long ThreeDS2Service = -1L;

    public static boolean ThreeDS2ServiceInstance(String str) {
        if (C9669om.values((CharSequence) str) || str.charAt(str.length() - 1) == '.') {
            return false;
        }
        if (str.charAt(0) == '-') {
            if (str.length() == 1) {
                return false;
            }
            return valueOf(str, 1);
        }
        return valueOf(str, 0);
    }

    private static boolean valueOf(String str, int i) {
        boolean z;
        int i2 = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '.') {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i2++;
            }
            if (i2 > 1) {
                return false;
            }
            if (!z && !Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }
}
