package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.AbstractC9547kt;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.le */
/* loaded from: classes5.dex */
class C9559le implements AbstractC9547kt.ThreeDS2ServiceInstance {
    public static final C9559le get = new C9559le();

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9547kt.ThreeDS2ServiceInstance
    public Object values(InterfaceC9514jr interfaceC9514jr) {
        return Integer.valueOf(((InterfaceC9513jq) interfaceC9514jr).getWarnings());
    }
}
