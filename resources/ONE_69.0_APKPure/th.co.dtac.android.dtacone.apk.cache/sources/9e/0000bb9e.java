package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ej */
/* loaded from: classes5.dex */
public class C9353ej extends AbstractC9313da {
    private static int getSDKInfo = 1;
    private static int initialize;
    private final InterfaceC9386fu getWarnings;

    public C9353ej(Context context, InterfaceC9504js interfaceC9504js, InterfaceC9386fu interfaceC9386fu, InterfaceC9374fi interfaceC9374fi, InterfaceC9393ga interfaceC9393ga, InterfaceC9383fr interfaceC9383fr) {
        super(context, interfaceC9504js, interfaceC9374fi, interfaceC9393ga, interfaceC9383fr);
        this.getWarnings = interfaceC9386fu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ThreeDS2Service(isEmpty isempty) {
        values(new C9338dy(computeIfAbsent.get));
        initialize = (getSDKInfo + 117) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9314db
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

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9314db
    public void valueOf(Context context) {
        C9240aq c9240aq = C9240aq.get(context, get().ThreeDS2Service(), get().values());
        C9741store ThreeDS2ServiceInstance = C9741store.ThreeDS2ServiceInstance(context, c9240aq, get());
        ThreeDS2ServiceInstance.values(new C9354ek(this));
        C9741store ThreeDS2ServiceInstance2 = C9741store.ThreeDS2ServiceInstance(context, get());
        ThreeDS2ServiceInstance2.values(new C9355el(this));
        propertyNames ThreeDS2Service = propertyNames.ThreeDS2Service(context, ThreeDS2ServiceInstance, ThreeDS2ServiceInstance2, cleanup(context));
        values(c9240aq);
        values(context, ThreeDS2Service);
        int i = getSDKInfo + 91;
        initialize = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}