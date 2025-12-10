package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.gv */
/* loaded from: classes5.dex */
public class C9429gv implements InterfaceC9391fz {
    public static final C9429gv ThreeDS2Service = new C9429gv();

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9391fz
    public getOrDefault ThreeDS2ServiceInstance(Context context, InterfaceC9504js interfaceC9504js, InterfaceC9386fu interfaceC9386fu, InterfaceC9374fi interfaceC9374fi, InterfaceC9393ga interfaceC9393ga, InterfaceC9383fr interfaceC9383fr) {
        return new C9352ei(context, interfaceC9504js, interfaceC9386fu, interfaceC9374fi, interfaceC9393ga, interfaceC9383fr);
    }
}