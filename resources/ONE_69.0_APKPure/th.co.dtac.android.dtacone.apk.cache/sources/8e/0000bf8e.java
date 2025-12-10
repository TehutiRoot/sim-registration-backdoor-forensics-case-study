package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class valueOf {
    public static void ThreeDS2ServiceInstance(int i, int i2, boolean z, int i3, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z) {
            ThreeDS2ServiceInstance(iArr);
        }
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i ^ iArr[i4];
            int values = i2 ^ values(i5, iArr2);
            i4++;
            i2 = i5;
            i = values;
        }
        int i6 = i ^ iArr[iArr.length - 2];
        int i7 = i2 ^ iArr[iArr.length - 1];
        if (!z) {
            ThreeDS2ServiceInstance(iArr);
        }
        iArr3[0] = i7;
        iArr3[1] = i6;
    }

    private static int values(int i, int[][] iArr) {
        return ((iArr[0][i >>> 24] + iArr[1][(i >>> 16) & 255]) ^ iArr[2][(i >>> 8) & 255]) + iArr[3][i & 255];
    }

    private static void ThreeDS2ServiceInstance(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }
}