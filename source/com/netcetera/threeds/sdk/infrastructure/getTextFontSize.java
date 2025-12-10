package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;
import java.util.List;

/* loaded from: classes5.dex */
public class getTextFontSize {
    private static int ThreeDS2Service = 0;
    private static int get = 1;
    private final getTextColor ThreeDS2ServiceInstance;
    private final List<com.netcetera.threeds.sdk.api.security.Warning> valueOf;
    private final setFastScrollEnabled.ThreeDS2ServiceInstance values;

    public getTextFontSize(getTextColor gettextcolor, List<com.netcetera.threeds.sdk.api.security.Warning> list, setFastScrollEnabled.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        this.ThreeDS2ServiceInstance = gettextcolor;
        this.valueOf = list;
        this.values = threeDS2ServiceInstance;
    }

    public List<com.netcetera.threeds.sdk.api.security.Warning> ThreeDS2ServiceInstance() {
        int i = get;
        int i2 = i & 9;
        int i3 = (i | 9) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        ThreeDS2Service = i5;
        List<com.netcetera.threeds.sdk.api.security.Warning> list = this.valueOf;
        int i6 = i5 & 27;
        int i7 = i5 | 27;
        get = ((i6 ^ i7) + ((i6 & i7) << 1)) % 128;
        return list;
    }

    public setFastScrollEnabled.ThreeDS2ServiceInstance get() {
        int i = ThreeDS2Service;
        int i2 = i + 119;
        get = i2 % 128;
        if (i2 % 2 != 0) {
            setFastScrollEnabled.ThreeDS2ServiceInstance threeDS2ServiceInstance = this.values;
            int i3 = (i & 43) + (i | 43);
            get = i3 % 128;
            if (i3 % 2 != 0) {
                return threeDS2ServiceInstance;
            }
            throw null;
        }
        throw null;
    }

    public getTextColor valueOf() {
        int i = get;
        int i2 = ((i | 89) << 1) - (i ^ 89);
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ThreeDS2ServiceInstance;
        }
        throw null;
    }
}
