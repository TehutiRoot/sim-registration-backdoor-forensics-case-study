package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.mr */
/* loaded from: classes5.dex */
public class C9601mr {
    private static int ThreeDS2ServiceInstance = 1;
    private static int valueOf;

    public boolean ThreeDS2ServiceInstance() {
        int i = valueOf;
        int i2 = ((i ^ 9) | (i & 9)) << 1;
        int i3 = -(((~i) & 9) | (i & (-10)));
        ThreeDS2ServiceInstance = ((i2 & i3) + (i3 | i2)) % 128;
        return false;
    }
}
