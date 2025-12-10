package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.id */
/* loaded from: classes5.dex */
public class C9465id implements InterfaceC9385ft {
    public static final C9465id valueOf = new C9465id();

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9385ft
    public getOrDefault ThreeDS2Service(Context context, InterfaceC9504js interfaceC9504js, InterfaceC9386fu interfaceC9386fu, InterfaceC9374fi interfaceC9374fi, InterfaceC9393ga interfaceC9393ga, InterfaceC9383fr interfaceC9383fr) {
        return new C9346ed(context, interfaceC9504js, interfaceC9386fu, interfaceC9374fi, interfaceC9393ga, interfaceC9383fr);
    }
}