package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ee */
/* loaded from: classes5.dex */
public class C9358ee extends AbstractC9328de {
    private static int getWarnings = 1;
    private static int initialize;
    private final InterfaceC9397fu getSDKInfo;

    public C9358ee(Context context, InterfaceC9515js interfaceC9515js, InterfaceC9397fu interfaceC9397fu, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, InterfaceC9394fr interfaceC9394fr) {
        super(context, interfaceC9515js, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
        this.getSDKInfo = interfaceC9397fu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ThreeDS2ServiceInstance(isEmpty isempty) {
        int i = initialize;
        int i2 = ((i ^ 82) + ((i & 82) << 1)) - 1;
        getWarnings = i2 % 128;
        if (i2 % 2 == 0) {
            values(this.getSDKInfo.valueOf(isempty));
            int i3 = 38 / 0;
        } else {
            values(this.getSDKInfo.valueOf(isempty));
        }
        int i4 = initialize + 112;
        getWarnings = ((~i4) + (i4 << 1)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9325db
    public void valueOf(Context context) {
        C9277bl ThreeDS2ServiceInstance = C9277bl.ThreeDS2ServiceInstance(context, get().values());
        C9288bv c9288bv = new C9288bv(context, get().ThreeDS2Service());
        C9752store ThreeDS2ServiceInstance2 = C9752store.ThreeDS2ServiceInstance(context, ThreeDS2ServiceInstance, get());
        ThreeDS2ServiceInstance2.values(new C9361eg(this));
        C9752store ThreeDS2ServiceInstance3 = C9752store.ThreeDS2ServiceInstance(context, get());
        ThreeDS2ServiceInstance3.values(new C9368em(this));
        contains ThreeDS2Service = propertyNames.ThreeDS2Service(context, ThreeDS2ServiceInstance2, ThreeDS2ServiceInstance3);
        ThreeDS2Service(c9288bv);
        values(ThreeDS2ServiceInstance);
        values(ThreeDS2Service);
        values(c9288bv);
        int i = getWarnings;
        int i2 = (i ^ 7) + ((i & 7) << 1);
        initialize = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void get(isEmpty isempty) {
        values(new C9349dy(computeIfAbsent.get));
        int i = initialize;
        int i2 = i & 17;
        int i3 = ((i ^ 17) | i2) << 1;
        int i4 = -((i | 17) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        getWarnings = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
