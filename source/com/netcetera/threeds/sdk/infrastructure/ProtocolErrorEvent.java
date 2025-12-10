package com.netcetera.threeds.sdk.infrastructure;

import java.security.PublicKey;
import java.util.List;

/* loaded from: classes5.dex */
public class ProtocolErrorEvent {
    private static int ThreeDS2ServiceInstance = 0;
    private static int get = 1;
    private final List<PublicKey> ThreeDS2Service;
    private final ProgressView valueOf;
    private final getErrorMessageType values;

    public ProtocolErrorEvent(ProgressView progressView, List<PublicKey> list, getErrorMessageType geterrormessagetype) {
        this.valueOf = progressView;
        this.values = geterrormessagetype;
        this.ThreeDS2Service = list;
    }

    public getErrorMessageType ThreeDS2Service() {
        int i = ThreeDS2ServiceInstance;
        getErrorMessageType geterrormessagetype = this.values;
        int i2 = i + 64;
        get = ((~i2) + (i2 << 1)) % 128;
        return geterrormessagetype;
    }

    public List<PublicKey> get() {
        int i = get;
        int i2 = i & 109;
        int i3 = i | 109;
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        ThreeDS2ServiceInstance = i4;
        List<PublicKey> list = this.ThreeDS2Service;
        int i5 = (i4 ^ 31) + ((i4 & 31) << 1);
        get = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public PublicKey valueOf() {
        get = (ThreeDS2ServiceInstance + 125) % 128;
        PublicKey ThreeDS2Service = this.valueOf.ThreeDS2Service();
        int i = ThreeDS2ServiceInstance;
        get = ((((i | 68) << 1) - (i ^ 68)) - 1) % 128;
        return ThreeDS2Service;
    }

    public String values() {
        int i = get + 85;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            String valueOf = this.valueOf.valueOf();
            int i2 = ThreeDS2ServiceInstance;
            int i3 = ((i2 ^ 5) | (i2 & 5)) << 1;
            int i4 = -(((~i2) & 5) | (i2 & (-6)));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            get = i5 % 128;
            if (i5 % 2 != 0) {
                return valueOf;
            }
            throw null;
        }
        this.valueOf.valueOf();
        throw null;
    }
}
