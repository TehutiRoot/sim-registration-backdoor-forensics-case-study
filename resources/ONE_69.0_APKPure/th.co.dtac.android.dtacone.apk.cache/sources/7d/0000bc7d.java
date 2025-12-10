package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ih */
/* loaded from: classes5.dex */
public class C9468ih {
    private static int ThreeDS2Service = 1;
    private static int ThreeDS2ServiceInstance;
    private boolean valueOf = false;

    public void valueOf() {
        int i = ThreeDS2ServiceInstance;
        int i2 = ((i & (-54)) | ((~i) & 53)) + ((i & 53) << 1);
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            this.valueOf = false;
        } else {
            this.valueOf = true;
        }
        ThreeDS2Service = (i + 55) % 128;
    }

    public boolean values() {
        int i = ThreeDS2Service + 107;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            int i2 = 56 / 0;
            return this.valueOf;
        }
        return this.valueOf;
    }
}