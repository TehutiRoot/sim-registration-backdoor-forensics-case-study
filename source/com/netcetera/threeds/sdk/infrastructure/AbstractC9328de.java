package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.de */
/* loaded from: classes5.dex */
public abstract class AbstractC9328de extends AbstractC9325db {
    private static int getSDKInfo = 1;
    private static int initialize;

    public AbstractC9328de(Context context, InterfaceC9515js interfaceC9515js, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, InterfaceC9394fr interfaceC9394fr) {
        super(context, interfaceC9515js, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
    }

    private void initialize(Context context) {
        values(new C9244ak(context));
        values(C9252ar.ThreeDS2ServiceInstance(context, ((AbstractC9325db) this).cleanup.ThreeDS2Service(), ((AbstractC9325db) this).getSDKVersion));
        values(C9252ar.valueOf(context, ((AbstractC9325db) this).cleanup.ThreeDS2Service(), ((AbstractC9325db) this).getSDKVersion));
        int i = initialize;
        int i2 = i & 59;
        getSDKInfo = ((i2 - (~(-(-((i ^ 59) | i2))))) - 1) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9290bx
    public void ThreeDS2ServiceInstance(Context context) {
        int i;
        int i2 = initialize & 3;
        getSDKInfo = ((i2 - (~(-(-((i ^ 3) | i2))))) - 1) % 128;
        ThreeDS2Service(context);
        values(context);
        valueOf(context);
        initialize(context);
        int i3 = getSDKInfo;
        int i4 = ((i3 & 96) + (i3 | 96)) - 1;
        initialize = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        throw null;
    }
}
