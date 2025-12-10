package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.eb */
/* loaded from: classes5.dex */
public class C9355eb extends AbstractC9328de {
    private static int getWarnings = 1;
    private static int initialize;
    private final InterfaceC9397fu getSDKInfo;

    public C9355eb(Context context, InterfaceC9515js interfaceC9515js, InterfaceC9397fu interfaceC9397fu, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, InterfaceC9394fr interfaceC9394fr) {
        super(context, interfaceC9515js, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
        this.getSDKInfo = interfaceC9397fu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ThreeDS2Service(isEmpty isempty) {
        int i = getWarnings + 105;
        initialize = i % 128;
        if (i % 2 == 0) {
            values(this.getSDKInfo.valueOf(isempty));
        } else {
            values(this.getSDKInfo.valueOf(isempty));
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9325db
    public void valueOf(Context context) {
        C9288bv c9288bv = new C9288bv(context, get().ThreeDS2Service());
        C9274bj c9274bj = new C9274bj(context, get().ThreeDS2Service());
        C9752store valueOf = C9752store.valueOf(context, c9274bj, get());
        valueOf.values(new C9356ec(this));
        contains ThreeDS2Service = propertyNames.ThreeDS2Service(context, valueOf);
        ThreeDS2Service(c9288bv);
        values(c9274bj);
        values(ThreeDS2Service);
        values(c9288bv);
        int i = getWarnings;
        int i2 = (i ^ 39) + ((i & 39) << 1);
        initialize = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
