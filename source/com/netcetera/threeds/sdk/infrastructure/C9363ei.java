package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ei */
/* loaded from: classes5.dex */
public class C9363ei extends AbstractC9328de {
    private static int getWarnings = 1;
    private static int initialize;
    private final InterfaceC9397fu getSDKInfo;

    public C9363ei(Context context, InterfaceC9515js interfaceC9515js, InterfaceC9397fu interfaceC9397fu, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, InterfaceC9394fr interfaceC9394fr) {
        super(context, interfaceC9515js, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
        this.getSDKInfo = interfaceC9397fu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void values(isEmpty isempty) {
        initialize = (getWarnings + 17) % 128;
        values(this.getSDKInfo.valueOf(isempty));
        int i = initialize;
        getWarnings = ((i & 99) + (i | 99)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9325db
    public void valueOf(Context context) {
        C9277bl ThreeDS2ServiceInstance = C9277bl.ThreeDS2ServiceInstance(context, get().values());
        C9752store ThreeDS2ServiceInstance2 = C9752store.ThreeDS2ServiceInstance(context, ThreeDS2ServiceInstance, get());
        ThreeDS2ServiceInstance2.values(new C9359ef(this));
        C9752store ThreeDS2ServiceInstance3 = C9752store.ThreeDS2ServiceInstance(context, get());
        ThreeDS2ServiceInstance3.values(new C9362eh(this));
        contains ThreeDS2Service = propertyNames.ThreeDS2Service(context, ThreeDS2ServiceInstance2, ThreeDS2ServiceInstance3);
        values(ThreeDS2ServiceInstance);
        values(ThreeDS2Service);
        initialize = (getWarnings + 21) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void valueOf(isEmpty isempty) {
        values(new C9349dy(computeIfAbsent.get));
        int i = initialize;
        int i2 = i & 13;
        int i3 = i2 + ((i ^ 13) | i2);
        getWarnings = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
