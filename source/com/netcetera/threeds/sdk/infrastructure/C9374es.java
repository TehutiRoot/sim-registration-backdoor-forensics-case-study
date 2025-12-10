package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setLineSpacing;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.es */
/* loaded from: classes5.dex */
public class C9374es implements keys {
    private static int ThreeDS2Service = 0;
    private static int values = 1;
    private final computeIfPresent ThreeDS2ServiceInstance;
    private final keys get;

    public C9374es(keys keysVar, computeIfPresent computeifpresent) {
        this.get = keysVar;
        this.ThreeDS2ServiceInstance = computeifpresent;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.keys
    public void valueOf(setLineSpacing.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        int i = values;
        int i2 = i ^ 13;
        int i3 = (((i & 13) | i2) << 1) - i2;
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 != 0) {
            threeDS2ServiceInstance.valueOf(this.ThreeDS2ServiceInstance);
            this.get.valueOf(threeDS2ServiceInstance);
            int i4 = 84 / 0;
        } else {
            threeDS2ServiceInstance.valueOf(this.ThreeDS2ServiceInstance);
            this.get.valueOf(threeDS2ServiceInstance);
        }
        int i5 = ThreeDS2Service;
        int i6 = ((i5 | 67) << 1) - (((~i5) & 67) | (i5 & (-68)));
        values = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 1 / 0;
        }
    }
}
