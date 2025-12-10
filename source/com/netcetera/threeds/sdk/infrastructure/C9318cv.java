package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.cv */
/* loaded from: classes5.dex */
public class C9318cv extends AbstractC9324da {
    private static int getSDKInfo = 0;
    private static int initialize = 1;
    private final InterfaceC9397fu getWarnings;

    public C9318cv(Context context, InterfaceC9515js interfaceC9515js, InterfaceC9397fu interfaceC9397fu, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, InterfaceC9394fr interfaceC9394fr) {
        super(context, interfaceC9515js, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
        this.getWarnings = interfaceC9397fu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ThreeDS2Service(isEmpty isempty) {
        int i = getSDKInfo;
        int i2 = ((i ^ 53) | (i & 53)) << 1;
        int i3 = -(((~i) & 53) | (i & (-54)));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        initialize = i4 % 128;
        if (i4 % 2 == 0) {
            values(this.getWarnings.valueOf(isempty));
            int i5 = 9 / 0;
        } else {
            values(this.getWarnings.valueOf(isempty));
        }
        int i6 = initialize;
        int i7 = i6 & 97;
        int i8 = -(-((i6 ^ 97) | i7));
        int i9 = (i7 & i8) + (i8 | i7);
        getSDKInfo = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 96 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9325db
    public void valueOf(Context context) {
        C9269bf c9269bf = new C9269bf(context, get().ThreeDS2Service());
        C9752store valueOf = C9752store.valueOf(context, c9269bf, get());
        valueOf.values(new C9322cz(this));
        propertyNames ThreeDS2Service = propertyNames.ThreeDS2Service(context, valueOf, cleanup(context));
        values(c9269bf);
        values(context, ThreeDS2Service);
        int i = getSDKInfo;
        int i2 = (i | 31) << 1;
        int i3 = -(((~i) & 31) | (i & (-32)));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        initialize = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        throw null;
    }
}
