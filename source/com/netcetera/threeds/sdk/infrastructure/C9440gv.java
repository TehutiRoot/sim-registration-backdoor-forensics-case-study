package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.gv */
/* loaded from: classes5.dex */
class C9440gv implements InterfaceC9402fz {
    public static final C9440gv ThreeDS2Service = new C9440gv();

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9402fz
    public getOrDefault ThreeDS2ServiceInstance(Context context, InterfaceC9515js interfaceC9515js, InterfaceC9397fu interfaceC9397fu, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, InterfaceC9394fr interfaceC9394fr) {
        return new C9363ei(context, interfaceC9515js, interfaceC9397fu, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
    }
}
