package com.netcetera.threeds.sdk.infrastructure;

import androidx.appcompat.app.AppCompatDelegate;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.na */
/* loaded from: classes5.dex */
public class C9600na {
    private static int get = 0;
    private static int values = 1;
    private volatile boolean ThreeDS2ServiceInstance = false;

    public void ThreeDS2Service() {
        int i = get + 29;
        values = i % 128;
        if (i % 2 == 0) {
            this.ThreeDS2ServiceInstance = false;
        } else {
            this.ThreeDS2ServiceInstance = true;
        }
        int i2 = get;
        int i3 = ((((i2 ^ 19) | (i2 & 19)) << 1) - (~(-(((~i2) & 19) | (i2 & (-20)))))) - 1;
        values = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        throw null;
    }

    public void ThreeDS2ServiceInstance() {
        int i = values;
        int i2 = (i ^ AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR) + ((i & AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR) << 1);
        get = ((~i2) + (i2 << 1)) % 128;
        this.ThreeDS2ServiceInstance = false;
        values = (get + 125) % 128;
    }

    public boolean valueOf() {
        int i = get;
        int i2 = i & 75;
        int i3 = i | 75;
        int i4 = (i2 & i3) + (i3 | i2);
        values = i4 % 128;
        int i5 = i4 % 2;
        boolean z = this.ThreeDS2ServiceInstance;
        if (i5 == 0) {
            int i6 = 58 / 0;
        }
        return z;
    }
}