package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.gh */
/* loaded from: classes5.dex */
public class C9415gh implements InterfaceC9383fr {
    public static final C9415gh ThreeDS2ServiceInstance = new C9415gh();

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9383fr
    public AbstractC9227ae ThreeDS2Service(Context context) {
        return new C9257be(context);
    }
}