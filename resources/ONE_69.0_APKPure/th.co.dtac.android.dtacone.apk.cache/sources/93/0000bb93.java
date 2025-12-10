package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.eb */
/* loaded from: classes5.dex */
public class C9344eb extends AbstractC9317de {
    private static int getWarnings = 1;
    private static int initialize;
    private final InterfaceC9386fu getSDKInfo;

    public C9344eb(Context context, InterfaceC9504js interfaceC9504js, InterfaceC9386fu interfaceC9386fu, InterfaceC9374fi interfaceC9374fi, InterfaceC9393ga interfaceC9393ga, InterfaceC9383fr interfaceC9383fr) {
        super(context, interfaceC9504js, interfaceC9374fi, interfaceC9393ga, interfaceC9383fr);
        this.getSDKInfo = interfaceC9386fu;
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

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9314db
    public void valueOf(Context context) {
        C9277bv c9277bv = new C9277bv(context, get().ThreeDS2Service());
        C9263bj c9263bj = new C9263bj(context, get().ThreeDS2Service());
        C9741store valueOf = C9741store.valueOf(context, c9263bj, get());
        valueOf.values(new C9345ec(this));
        contains ThreeDS2Service = propertyNames.ThreeDS2Service(context, valueOf);
        ThreeDS2Service(c9277bv);
        values(c9263bj);
        values(ThreeDS2Service);
        values(c9277bv);
        int i = getWarnings;
        int i2 = (i ^ 39) + ((i & 39) << 1);
        initialize = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}