package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.cr */
/* loaded from: classes5.dex */
public class C9303cr extends AbstractC9317de {
    private static int getSDKInfo = 1;
    private static int getWarnings;
    private final InterfaceC9386fu initialize;

    public C9303cr(Context context, InterfaceC9504js interfaceC9504js, InterfaceC9386fu interfaceC9386fu, InterfaceC9374fi interfaceC9374fi, InterfaceC9393ga interfaceC9393ga, InterfaceC9383fr interfaceC9383fr) {
        super(context, interfaceC9504js, interfaceC9374fi, interfaceC9393ga, interfaceC9383fr);
        this.initialize = interfaceC9386fu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ThreeDS2Service(isEmpty isempty) {
        int i = getSDKInfo;
        getWarnings = ((((i | 74) << 1) - (i ^ 74)) - 1) % 128;
        values(this.initialize.valueOf(isempty));
        int i2 = getSDKInfo;
        int i3 = (i2 ^ 55) + ((i2 & 55) << 1);
        getWarnings = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9314db
    public void valueOf(Context context) {
        C9258bf c9258bf = new C9258bf(context, get().ThreeDS2Service());
        C9741store valueOf = C9741store.valueOf(context, c9258bf, get());
        valueOf.values(new C9309cx(this));
        contains ThreeDS2Service = propertyNames.ThreeDS2Service(context, valueOf);
        values(c9258bf);
        values(ThreeDS2Service);
        int i = getWarnings;
        getSDKInfo = ((i ^ 69) + ((i & 69) << 1)) % 128;
    }
}