package com.netcetera.threeds.sdk.infrastructure;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public class ThreeDS2Service {

    /* loaded from: classes5.dex */
    public class InitializationCallback {
        public static int ThreeDS2Service;
        public static int ThreeDS2ServiceInstance;
        public static final Object values = new Object();
    }

    private static long ThreeDS2Service(long j, long j2, int i, int i2) {
        return (j2 * (j ^ (j >> i))) + i2;
    }

    public static long[] ThreeDS2ServiceInstance(int i, int i2) {
        long[] jArr = new long[4];
        jArr[0] = (i2 & BodyPartID.bodyIdMax) | ((i & BodyPartID.bodyIdMax) << 32);
        for (int i3 = 1; i3 < 4; i3++) {
            jArr[i3] = ThreeDS2ServiceInstance(jArr[i3 - 1], i3);
        }
        return jArr;
    }

    public static void values(long[] jArr, long[] jArr2, int i) {
        long j = jArr2[(i + 2) % 4];
        int i2 = (i + 3) % 4;
        jArr2[i2] = ((jArr[i2] * 2147483085) + j) / 2147483647L;
        jArr[i2] = ((jArr[i % 4] * 2147483085) + j) % 2147483647L;
    }

    private static long ThreeDS2ServiceInstance(long j, int i) {
        return ThreeDS2Service(j, 1812433253L, 30, i);
    }
}
