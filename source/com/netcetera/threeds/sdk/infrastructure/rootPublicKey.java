package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public final class rootPublicKey {
    public static final Object ThreeDS2Service = new Object();
    public static int ThreeDS2ServiceInstance;
    public static int valueOf;
    public static int values;

    public static int ThreeDS2Service(int i) {
        int[][] iArr = addParam.values.valueOf;
        return ((iArr[0][(i >>> 24) & 255] + iArr[1][(i >>> 16) & 255]) ^ iArr[2][(i >>> 8) & 255]) + iArr[3][i & 255];
    }

    public static void get(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }
}
