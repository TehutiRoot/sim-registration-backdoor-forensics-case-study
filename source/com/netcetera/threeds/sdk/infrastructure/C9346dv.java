package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.dv */
/* loaded from: classes5.dex */
public class C9346dv extends AbstractC9328de {
    private static int getSDKInfo = 0;
    private static int initialize = 1;
    private final InterfaceC9397fu getWarnings;

    public C9346dv(Context context, InterfaceC9515js interfaceC9515js, InterfaceC9397fu interfaceC9397fu, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, InterfaceC9394fr interfaceC9394fr) {
        super(context, interfaceC9515js, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
        this.getWarnings = interfaceC9397fu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ThreeDS2Service(isEmpty isempty) {
        int i = initialize + 5;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            values(this.getWarnings.valueOf(isempty));
            int i2 = getSDKInfo;
            int i3 = (-2) - (~(((i2 | 58) << 1) - (i2 ^ 58)));
            initialize = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            throw null;
        }
        values(this.getWarnings.valueOf(isempty));
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9325db
    public void valueOf(Context context) {
        C9274bj c9274bj = new C9274bj(context, get().ThreeDS2Service());
        C9752store valueOf = C9752store.valueOf(context, c9274bj, get());
        valueOf.values(new C9350dz(this));
        contains ThreeDS2Service = propertyNames.ThreeDS2Service(context, valueOf);
        values(c9274bj);
        values(ThreeDS2Service);
        int i = getSDKInfo;
        initialize = ((i ^ 19) + ((i & 19) << 1)) % 128;
    }
}
