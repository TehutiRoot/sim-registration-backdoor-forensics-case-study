package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.cy */
/* loaded from: classes5.dex */
public class C9321cy extends AbstractC9328de {
    private static int getSDKInfo = 1;
    private static int initialize;
    private final InterfaceC9397fu getWarnings;

    public C9321cy(Context context, InterfaceC9515js interfaceC9515js, InterfaceC9397fu interfaceC9397fu, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, InterfaceC9394fr interfaceC9394fr) {
        super(context, interfaceC9515js, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
        this.getWarnings = interfaceC9397fu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void get(isEmpty isempty) {
        int i = initialize;
        int i2 = i & 79;
        getSDKInfo = ((((i ^ 79) | i2) << 1) - ((i | 79) & (~i2))) % 128;
        values(this.getWarnings.valueOf(isempty));
        int i3 = initialize;
        int i4 = i3 & 1;
        int i5 = i4 + ((i3 ^ 1) | i4);
        getSDKInfo = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9325db
    public void valueOf(Context context) {
        C9269bf c9269bf = new C9269bf(context, get().ThreeDS2Service());
        C9288bv c9288bv = new C9288bv(context, get().ThreeDS2Service());
        C9752store valueOf = C9752store.valueOf(context, c9269bf, get());
        valueOf.values(new C9319cw(this));
        contains ThreeDS2Service = propertyNames.ThreeDS2Service(context, valueOf);
        ThreeDS2Service(c9288bv);
        values(c9269bf);
        values(ThreeDS2Service);
        values(c9288bv);
        int i = initialize;
        int i2 = i & 111;
        int i3 = (i ^ 111) | i2;
        getSDKInfo = ((i2 & i3) + (i3 | i2)) % 128;
    }
}
