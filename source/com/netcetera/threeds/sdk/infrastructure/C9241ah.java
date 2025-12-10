package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ah */
/* loaded from: classes5.dex */
public class C9241ah extends AbstractC9239af {
    private static int initialize = 1;
    private static int values;

    public C9241ah(Context context, InterfaceC9511jo interfaceC9511jo, C9237ad c9237ad, setProperty setproperty) {
        super(context, interfaceC9511jo, c9237ad, setproperty);
    }

    public static AbstractC9239af ThreeDS2ServiceInstance(Context context, InterfaceC9511jo interfaceC9511jo, setProperty setproperty) {
        C9241ah c9241ah = new C9241ah(context, interfaceC9511jo, new C9237ad(), setproperty);
        initialize = (values + 97) % 128;
        return c9241ah;
    }
}
