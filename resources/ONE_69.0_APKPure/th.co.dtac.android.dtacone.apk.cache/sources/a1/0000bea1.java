package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Bitmap;

/* loaded from: classes5.dex */
public class setLogo implements setFilters {
    private static int ThreeDS2ServiceInstance = 1;
    private static int get;
    private Bitmap ThreeDS2Service;
    private String valueOf;

    @Override // com.netcetera.threeds.sdk.infrastructure.setFilters
    public void ThreeDS2Service(String str) {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 105;
        get = (((i | 105) & (~i2)) + (i2 << 1)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFilters
    public void get(String str) {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 79;
        int i3 = (i | 79) & (~i2);
        int i4 = i2 << 1;
        int i5 = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        get = i5;
        this.valueOf = str;
        ThreeDS2ServiceInstance = ((-2) - (~(((i5 | 86) << 1) - (i5 ^ 86)))) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFilters
    public String valueOf() {
        int i = get;
        int i2 = i & 37;
        int i3 = (i ^ 37) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        int i5 = i4 % 128;
        ThreeDS2ServiceInstance = i5;
        if (i4 % 2 != 0) {
            int i6 = i5 & 65;
            int i7 = -(-((i5 ^ 65) | i6));
            get = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
            return null;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFilters
    public void values(Bitmap bitmap) {
        int i = ThreeDS2ServiceInstance;
        int i2 = ((i & 35) - (~(i | 35))) - 1;
        get = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFilters
    public String ThreeDS2Service() {
        int i = ThreeDS2ServiceInstance + 87;
        get = i % 128;
        if (i % 2 == 0) {
            return this.valueOf;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public Bitmap values() {
        int i = get;
        int i2 = ((i ^ 64) + ((i & 64) << 1)) - 1;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ThreeDS2Service;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFilters
    public void ThreeDS2Service(Bitmap bitmap) {
        int i = get;
        this.ThreeDS2Service = bitmap;
        int i2 = i & 25;
        int i3 = (i | 25) & (~i2);
        int i4 = i2 << 1;
        ThreeDS2ServiceInstance = ((i3 & i4) + (i4 | i3)) % 128;
    }
}