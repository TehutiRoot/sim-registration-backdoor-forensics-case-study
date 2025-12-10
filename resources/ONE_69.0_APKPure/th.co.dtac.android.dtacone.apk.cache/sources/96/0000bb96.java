package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ee */
/* loaded from: classes5.dex */
public class C9347ee extends AbstractC9317de {
    private static int getWarnings = 1;
    private static int initialize;
    private final InterfaceC9386fu getSDKInfo;

    public C9347ee(Context context, InterfaceC9504js interfaceC9504js, InterfaceC9386fu interfaceC9386fu, InterfaceC9374fi interfaceC9374fi, InterfaceC9393ga interfaceC9393ga, InterfaceC9383fr interfaceC9383fr) {
        super(context, interfaceC9504js, interfaceC9374fi, interfaceC9393ga, interfaceC9383fr);
        this.getSDKInfo = interfaceC9386fu;
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

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9314db
    public void valueOf(Context context) {
        C9266bl ThreeDS2ServiceInstance = C9266bl.ThreeDS2ServiceInstance(context, get().values());
        C9277bv c9277bv = new C9277bv(context, get().ThreeDS2Service());
        C9741store ThreeDS2ServiceInstance2 = C9741store.ThreeDS2ServiceInstance(context, ThreeDS2ServiceInstance, get());
        ThreeDS2ServiceInstance2.values(new C9350eg(this));
        C9741store ThreeDS2ServiceInstance3 = C9741store.ThreeDS2ServiceInstance(context, get());
        ThreeDS2ServiceInstance3.values(new C9357em(this));
        contains ThreeDS2Service = propertyNames.ThreeDS2Service(context, ThreeDS2ServiceInstance2, ThreeDS2ServiceInstance3);
        ThreeDS2Service(c9277bv);
        values(ThreeDS2ServiceInstance);
        values(ThreeDS2Service);
        values(c9277bv);
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
        values(new C9338dy(computeIfAbsent.get));
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