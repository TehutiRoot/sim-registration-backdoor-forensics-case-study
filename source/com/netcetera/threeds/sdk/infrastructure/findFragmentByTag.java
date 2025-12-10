package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class findFragmentByTag {
    private static int ThreeDS2Service = 0;
    private static int get = 1;
    private final C9613nb ThreeDS2ServiceInstance;
    private final equals valueOf;

    public findFragmentByTag(equals equalsVar, C9613nb c9613nb) {
        this.valueOf = equalsVar;
        this.ThreeDS2ServiceInstance = c9613nb;
    }

    public C9651nr values(C9651nr c9651nr) {
        int i = ThreeDS2Service;
        get = (((i & (-26)) | ((~i) & 25)) + ((i & 25) << 1)) % 128;
        int i2 = get;
        int i3 = i2 & 3;
        int i4 = i2 | 3;
        ThreeDS2Service = ((i3 & i4) + (i4 | i3)) % 128;
        for (setContentInsetEndWithActions setcontentinsetendwithactions : this.valueOf.ThreeDS2Service()) {
            int i5 = ThreeDS2Service;
            get = (((i5 & (-78)) | ((~i5) & 77)) + ((i5 & 77) << 1)) % 128;
            c9651nr = setcontentinsetendwithactions.get(c9651nr, this.ThreeDS2ServiceInstance.get());
            int i6 = get;
            int i7 = i6 & 13;
            int i8 = ((i6 ^ 13) | i7) << 1;
            int i9 = -((i6 | 13) & (~i7));
            ThreeDS2Service = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
        }
        int i10 = get + 120;
        ThreeDS2Service = ((~i10) + (i10 << 1)) % 128;
        return c9651nr;
    }
}
