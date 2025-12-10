package com.netcetera.threeds.sdk.infrastructure;

import java.security.PublicKey;

/* loaded from: classes5.dex */
public class setBreakStrategy {
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInstance = 1;
    private final String get;
    private final PublicKey valueOf;
    private final String values;

    public setBreakStrategy(String str, String str2, PublicKey publicKey) {
        this.get = str;
        this.values = str2;
        this.valueOf = publicKey;
    }

    public PublicKey get() {
        int i = ThreeDS2ServiceInstance + 77;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            return this.valueOf;
        }
        throw null;
    }

    public String valueOf() {
        int i = ThreeDS2ServiceInstance + 87;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            return this.get;
        }
        throw null;
    }
}
