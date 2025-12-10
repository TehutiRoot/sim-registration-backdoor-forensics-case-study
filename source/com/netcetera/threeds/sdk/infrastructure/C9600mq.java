package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.mq */
/* loaded from: classes5.dex */
public final class C9600mq {
    private static int ThreeDS2ServiceInstance = 0;
    private static int values = 1;

    public static boolean ThreeDS2Service(String str) {
        int i = values;
        int i2 = ((i ^ 31) | (i & 31)) << 1;
        int i3 = -(((~i) & 31) | (i & (-32)));
        ThreeDS2ServiceInstance = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        try {
            Class.forName(str);
            int i4 = ThreeDS2ServiceInstance;
            int i5 = (i4 & (-8)) | ((~i4) & 7);
            int i6 = (i4 & 7) << 1;
            int i7 = (i5 & i6) + (i6 | i5);
            values = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 81 / 0;
            }
            return true;
        } catch (ClassNotFoundException | LinkageError unused) {
            return false;
        }
    }
}
