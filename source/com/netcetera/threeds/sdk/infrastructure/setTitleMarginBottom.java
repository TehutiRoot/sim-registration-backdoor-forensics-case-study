package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class setTitleMarginBottom {
    private static int ThreeDS2Service = 0;
    private static int valueOf = 1;
    private final boolean ThreeDS2ServiceInstance;
    private final C9651nr get;

    public setTitleMarginBottom(C9651nr c9651nr, boolean z) {
        this.get = c9651nr;
        this.ThreeDS2ServiceInstance = z;
    }

    public C9651nr ThreeDS2ServiceInstance() {
        int i = valueOf;
        int i2 = ((i & 101) - (~(-(-(i | 101))))) - 1;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            return this.get;
        }
        throw null;
    }

    public boolean get() {
        int i = ThreeDS2Service;
        boolean z = this.ThreeDS2ServiceInstance;
        int i2 = ((i ^ 101) | (i & 101)) << 1;
        int i3 = -(((~i) & 101) | (i & (-102)));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return z;
    }
}
