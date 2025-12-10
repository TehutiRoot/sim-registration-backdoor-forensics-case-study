package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.cv */
/* loaded from: classes5.dex */
public class C9307cv extends AbstractC9313da {
    private static int getSDKInfo = 0;
    private static int initialize = 1;
    private final InterfaceC9386fu getWarnings;

    public C9307cv(Context context, InterfaceC9504js interfaceC9504js, InterfaceC9386fu interfaceC9386fu, InterfaceC9374fi interfaceC9374fi, InterfaceC9393ga interfaceC9393ga, InterfaceC9383fr interfaceC9383fr) {
        super(context, interfaceC9504js, interfaceC9374fi, interfaceC9393ga, interfaceC9383fr);
        this.getWarnings = interfaceC9386fu;
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

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9314db
    public void valueOf(Context context) {
        C9258bf c9258bf = new C9258bf(context, get().ThreeDS2Service());
        C9741store valueOf = C9741store.valueOf(context, c9258bf, get());
        valueOf.values(new C9311cz(this));
        propertyNames ThreeDS2Service = propertyNames.ThreeDS2Service(context, valueOf, cleanup(context));
        values(c9258bf);
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