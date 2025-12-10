package com.netcetera.threeds.sdk.infrastructure;

import android.util.Range;
import java.util.Map;

/* loaded from: classes5.dex */
class setCertificate implements setLayoutTransition {
    private static int getSDKVersion = 0;
    private static int initialize = 1;
    private final String ThreeDS2Service;
    private final byte[] ThreeDS2ServiceInstance;
    private final String get;
    private final Map<String, String> getSDKInfo;
    private final int valueOf;
    private final byte[] values;

    public setCertificate(byte[] bArr, byte[] bArr2, int i, String str, String str2, Map<String, String> map) {
        this.values = bArr;
        this.ThreeDS2ServiceInstance = bArr2;
        this.valueOf = i;
        this.get = str;
        this.ThreeDS2Service = str2;
        this.getSDKInfo = map;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setLayoutTransition
    public setLayoutAnimation ThreeDS2Service() {
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation(this.values);
        initialize = (getSDKVersion + 59) % 128;
        return setlayoutanimation;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setLayoutTransition
    public Map<String, String> ThreeDS2ServiceInstance() {
        int i = initialize;
        Map<String, String> map = this.getSDKInfo;
        int i2 = i & 5;
        int i3 = (((i | 5) & (~i2)) - (~(-(-(i2 << 1))))) - 1;
        getSDKVersion = i3 % 128;
        if (i3 % 2 == 0) {
            return map;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setLayoutTransition
    public String get() {
        int i = initialize;
        int i2 = (-2) - (~((i & 38) + (i | 38)));
        getSDKVersion = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 15 / 0;
            return this.get;
        }
        return this.get;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setLayoutTransition
    public String getSDKInfo() {
        int i = getSDKVersion;
        int i2 = (i & 97) + (i | 97);
        initialize = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ThreeDS2Service;
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setLayoutTransition
    public setLayoutAnimation getWarnings() {
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation(this.ThreeDS2ServiceInstance);
        int i = getSDKVersion;
        initialize = ((i ^ 47) + ((i & 47) << 1)) % 128;
        return setlayoutanimation;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setLayoutTransition
    public int valueOf() {
        int i = getSDKVersion;
        int i2 = i & 79;
        int i3 = (((i ^ 79) | i2) << 1) - ((~i2) & (i | 79));
        initialize = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = this.valueOf;
            int i5 = (i ^ 66) + ((i & 66) << 1);
            initialize = ((~i5) + (i5 << 1)) % 128;
            return i4;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setLayoutTransition
    public boolean values() {
        int i = getSDKVersion;
        int i2 = i ^ 111;
        int i3 = -(-((i & 111) << 1));
        initialize = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        boolean contains = setFindListener.values.contains((Range<Integer>) Integer.valueOf(this.valueOf));
        int i4 = getSDKVersion;
        int i5 = i4 & 3;
        int i6 = ((i4 ^ 3) | i5) << 1;
        int i7 = -((i4 | 3) & (~i5));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        initialize = i8 % 128;
        if (i8 % 2 != 0) {
            return contains;
        }
        throw null;
    }
}