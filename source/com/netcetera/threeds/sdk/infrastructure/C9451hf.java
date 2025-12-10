package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.hf */
/* loaded from: classes5.dex */
class C9451hf implements InterfaceC9394fr {
    public static final C9451hf valueOf = new C9451hf();

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9394fr
    public AbstractC9238ae ThreeDS2Service(Context context) {
        return new C9268be(context);
    }
}
