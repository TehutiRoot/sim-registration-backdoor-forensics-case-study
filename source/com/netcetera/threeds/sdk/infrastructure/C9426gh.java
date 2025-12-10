package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.gh */
/* loaded from: classes5.dex */
class C9426gh implements InterfaceC9394fr {
    public static final C9426gh ThreeDS2ServiceInstance = new C9426gh();

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9394fr
    public AbstractC9238ae ThreeDS2Service(Context context) {
        return new C9268be(context);
    }
}
