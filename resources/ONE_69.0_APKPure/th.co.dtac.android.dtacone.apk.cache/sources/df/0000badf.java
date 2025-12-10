package com.netcetera.threeds.sdk.infrastructure;

import java.security.PublicKey;

/* loaded from: classes5.dex */
public class ProgressView {
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInstance = 1;
    private final PublicKey get;
    private final String valueOf;

    public ProgressView(PublicKey publicKey, String str) {
        this.get = publicKey;
        this.valueOf = str;
    }

    public PublicKey ThreeDS2Service() {
        int i = ThreeDS2Service;
        int i2 = i & 93;
        int i3 = -(-((i ^ 93) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        ThreeDS2ServiceInstance = i5;
        if (i4 % 2 != 0) {
            PublicKey publicKey = this.get;
            int i6 = ((i5 | 85) << 1) - (i5 ^ 85);
            ThreeDS2Service = i6 % 128;
            if (i6 % 2 == 0) {
                return publicKey;
            }
            throw null;
        }
        throw null;
    }

    public String valueOf() {
        int i = ThreeDS2Service;
        int i2 = i & 113;
        int i3 = -(-((i ^ 113) | i2));
        int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        ThreeDS2ServiceInstance = i4;
        String str = this.valueOf;
        ThreeDS2Service = (((((i4 ^ 29) | (i4 & 29)) << 1) - (~(-(((~i4) & 29) | (i4 & (-30)))))) - 1) % 128;
        return str;
    }
}