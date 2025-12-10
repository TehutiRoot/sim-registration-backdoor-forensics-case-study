package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.dv */
/* loaded from: classes5.dex */
public class C9335dv extends AbstractC9317de {
    private static int getSDKInfo = 0;
    private static int initialize = 1;
    private final InterfaceC9386fu getWarnings;

    public C9335dv(Context context, InterfaceC9504js interfaceC9504js, InterfaceC9386fu interfaceC9386fu, InterfaceC9374fi interfaceC9374fi, InterfaceC9393ga interfaceC9393ga, InterfaceC9383fr interfaceC9383fr) {
        super(context, interfaceC9504js, interfaceC9374fi, interfaceC9393ga, interfaceC9383fr);
        this.getWarnings = interfaceC9386fu;
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

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9314db
    public void valueOf(Context context) {
        C9263bj c9263bj = new C9263bj(context, get().ThreeDS2Service());
        C9741store valueOf = C9741store.valueOf(context, c9263bj, get());
        valueOf.values(new C9339dz(this));
        contains ThreeDS2Service = propertyNames.ThreeDS2Service(context, valueOf);
        values(c9263bj);
        values(ThreeDS2Service);
        int i = getSDKInfo;
        initialize = ((i ^ 19) + ((i & 19) << 1)) % 128;
    }
}