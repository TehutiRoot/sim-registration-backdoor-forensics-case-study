package com.netcetera.threeds.sdk.infrastructure;

import android.content.res.Resources;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.nm */
/* loaded from: classes5.dex */
public final class C9613nm {
    private static int ThreeDS2ServiceInstance = 1;
    private static int values;

    public static int get() {
        int i = values;
        int i2 = i ^ 111;
        ThreeDS2ServiceInstance = (((((i & 111) | i2) << 1) - (~(-i2))) - 1) % 128;
        int i3 = Resources.getSystem().getDisplayMetrics().densityDpi;
        int i4 = values;
        int i5 = i4 & 81;
        int i6 = ((i4 ^ 81) | i5) << 1;
        int i7 = -((i4 | 81) & (~i5));
        ThreeDS2ServiceInstance = ((i6 & i7) + (i7 | i6)) % 128;
        return i3;
    }

    public static int valueOf(int i) {
        float f;
        int i2 = values + 45;
        ThreeDS2ServiceInstance = i2 % 128;
        float f2 = i;
        if (i2 % 2 == 0) {
            f = f2 + Resources.getSystem().getDisplayMetrics().density;
        } else {
            f = f2 * Resources.getSystem().getDisplayMetrics().density;
        }
        int i3 = (int) f;
        int i4 = ThreeDS2ServiceInstance;
        int i5 = (i4 & (-78)) | ((~i4) & 77);
        int i6 = -(-((i4 & 77) << 1));
        values = ((i5 & i6) + (i6 | i5)) % 128;
        return i3;
    }
}