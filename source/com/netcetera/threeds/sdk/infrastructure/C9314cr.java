package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.cr */
/* loaded from: classes5.dex */
public class C9314cr extends AbstractC9328de {
    private static int getSDKInfo = 1;
    private static int getWarnings;
    private final InterfaceC9397fu initialize;

    public C9314cr(Context context, InterfaceC9515js interfaceC9515js, InterfaceC9397fu interfaceC9397fu, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, InterfaceC9394fr interfaceC9394fr) {
        super(context, interfaceC9515js, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
        this.initialize = interfaceC9397fu;
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

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9325db
    public void valueOf(Context context) {
        C9269bf c9269bf = new C9269bf(context, get().ThreeDS2Service());
        C9752store valueOf = C9752store.valueOf(context, c9269bf, get());
        valueOf.values(new C9320cx(this));
        contains ThreeDS2Service = propertyNames.ThreeDS2Service(context, valueOf);
        values(c9269bf);
        values(ThreeDS2Service);
        int i = getWarnings;
        getSDKInfo = ((i ^ 69) + ((i & 69) << 1)) % 128;
    }
}
