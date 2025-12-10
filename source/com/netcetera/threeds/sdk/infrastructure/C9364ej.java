package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ej */
/* loaded from: classes5.dex */
public class C9364ej extends AbstractC9324da {
    private static int getSDKInfo = 1;
    private static int initialize;
    private final InterfaceC9397fu getWarnings;

    public C9364ej(Context context, InterfaceC9515js interfaceC9515js, InterfaceC9397fu interfaceC9397fu, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, InterfaceC9394fr interfaceC9394fr) {
        super(context, interfaceC9515js, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
        this.getWarnings = interfaceC9397fu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ThreeDS2Service(isEmpty isempty) {
        values(new C9349dy(computeIfAbsent.get));
        initialize = (getSDKInfo + 117) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9325db
    public boolean ThreeDS2ServiceInstance() {
        int i = getSDKInfo;
        initialize = (((i & 114) + (i | 114)) - 1) % 128;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ThreeDS2ServiceInstance(isEmpty isempty) {
        int i = getSDKInfo;
        int i2 = i & 95;
        initialize = ((((i | 95) & (~i2)) - (~(i2 << 1))) - 1) % 128;
        values(this.getWarnings.valueOf(isempty));
        int i3 = getSDKInfo;
        int i4 = i3 & 125;
        initialize = ((((i3 ^ 125) | i4) << 1) - ((i3 | 125) & (~i4))) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9325db
    public void valueOf(Context context) {
        C9251aq c9251aq = C9251aq.get(context, get().ThreeDS2Service(), get().values());
        C9752store ThreeDS2ServiceInstance = C9752store.ThreeDS2ServiceInstance(context, c9251aq, get());
        ThreeDS2ServiceInstance.values(new C9365ek(this));
        C9752store ThreeDS2ServiceInstance2 = C9752store.ThreeDS2ServiceInstance(context, get());
        ThreeDS2ServiceInstance2.values(new C9366el(this));
        propertyNames ThreeDS2Service = propertyNames.ThreeDS2Service(context, ThreeDS2ServiceInstance, ThreeDS2ServiceInstance2, cleanup(context));
        values(c9251aq);
        values(context, ThreeDS2Service);
        int i = getSDKInfo + 91;
        initialize = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
