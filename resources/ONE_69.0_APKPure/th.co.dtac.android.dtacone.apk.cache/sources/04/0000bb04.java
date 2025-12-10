package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ah */
/* loaded from: classes5.dex */
public class C9230ah extends AbstractC9228af {
    private static int initialize = 1;
    private static int values;

    public C9230ah(Context context, InterfaceC9500jo interfaceC9500jo, C9226ad c9226ad, setProperty setproperty) {
        super(context, interfaceC9500jo, c9226ad, setproperty);
    }

    public static AbstractC9228af ThreeDS2ServiceInstance(Context context, InterfaceC9500jo interfaceC9500jo, setProperty setproperty) {
        C9230ah c9230ah = new C9230ah(context, interfaceC9500jo, new C9226ad(), setproperty);
        initialize = (values + 97) % 128;
        return c9230ah;
    }
}