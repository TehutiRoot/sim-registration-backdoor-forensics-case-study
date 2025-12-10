package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public /* synthetic */ class setBaseline$19871$5 {
    private static int ThreeDS2Service = 1;
    public static final /* synthetic */ int[] ThreeDS2ServiceInstance;
    private static int valueOf;

    static {
        int[] iArr = new int[setBaselineAlignBottom.values().length];
        ThreeDS2ServiceInstance = iArr;
        try {
            iArr[setBaselineAlignBottom.get.ordinal()] = 1;
            ThreeDS2Service = (valueOf + 89) % 128;
        } catch (NoSuchFieldError unused) {
        }
        try {
            ThreeDS2ServiceInstance[setBaselineAlignBottom.ThreeDS2ServiceInstance.ordinal()] = 2;
            int i = ThreeDS2Service;
            int i2 = i & 49;
            int i3 = (i | 49) & (~i2);
            int i4 = i2 << 1;
            valueOf = ((i3 & i4) + (i3 | i4)) % 128;
        } catch (NoSuchFieldError unused2) {
        }
        int i5 = ThreeDS2Service;
        valueOf = ((i5 ^ 109) + ((i5 & 109) << 1)) % 128;
    }
}