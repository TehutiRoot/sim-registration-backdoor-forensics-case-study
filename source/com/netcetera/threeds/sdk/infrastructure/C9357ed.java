package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ed */
/* loaded from: classes5.dex */
public class C9357ed extends AbstractC9324da {
    private static int getSDKInfo = 0;
    private static int initialize = 1;
    private final InterfaceC9397fu getWarnings;

    public C9357ed(Context context, InterfaceC9515js interfaceC9515js, InterfaceC9397fu interfaceC9397fu, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, InterfaceC9394fr interfaceC9394fr) {
        super(context, interfaceC9515js, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
        this.getWarnings = interfaceC9397fu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ThreeDS2ServiceInstance(isEmpty isempty) {
        int i = getSDKInfo;
        int i2 = ((i | 9) << 1) - (i ^ 9);
        initialize = i2 % 128;
        if (i2 % 2 != 0) {
            values(this.getWarnings.valueOf(isempty));
            int i3 = initialize;
            int i4 = i3 & 61;
            int i5 = (i3 | 61) & (~i4);
            int i6 = -(-(i4 << 1));
            getSDKInfo = ((i5 & i6) + (i5 | i6)) % 128;
            return;
        }
        values(this.getWarnings.valueOf(isempty));
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9325db
    public void valueOf(Context context) {
        C9274bj c9274bj = new C9274bj(context, get().ThreeDS2Service());
        C9752store valueOf = C9752store.valueOf(context, c9274bj, get());
        valueOf.values(new C9354ea(this));
        propertyNames ThreeDS2Service = propertyNames.ThreeDS2Service(context, valueOf, cleanup(context));
        values(c9274bj);
        values(context, ThreeDS2Service);
        int i = getSDKInfo + 103;
        initialize = i % 128;
        if (i % 2 != 0) {
            return;
        }
        throw null;
    }
}
