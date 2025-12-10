package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class setLines {
    private static int ThreeDS2ServiceInstance = 1;
    private static int get;
    private boolean valueOf = false;

    public void ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInstance;
        int i2 = (i & 115) + (i | 115);
        get = i2 % 128;
        if (i2 % 2 != 0) {
            this.valueOf = false;
        } else {
            this.valueOf = true;
        }
        int i3 = i & 39;
        int i4 = ((i ^ 39) | i3) << 1;
        int i5 = -((i | 39) & (~i3));
        get = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
    }

    public void get() {
        boolean z;
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 21;
        int i3 = i2 + ((i ^ 21) | i2);
        get = i3 % 128;
        if (i3 % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        this.valueOf = z;
    }

    public boolean valueOf() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 95;
        int i3 = (i | 95) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        get = i5 % 128;
        if (i5 % 2 == 0) {
            return this.valueOf;
        }
        throw null;
    }
}
