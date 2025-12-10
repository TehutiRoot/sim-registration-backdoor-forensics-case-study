package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.hk */
/* loaded from: classes5.dex */
public class C9445hk implements InterfaceC9374fi {
    public static final C9445hk get = new C9445hk();

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9374fi
    public AbstractC9228af ThreeDS2Service(Context context, InterfaceC9500jo interfaceC9500jo, setProperty setproperty) {
        return C9230ah.ThreeDS2ServiceInstance(context, interfaceC9500jo, setproperty);
    }
}