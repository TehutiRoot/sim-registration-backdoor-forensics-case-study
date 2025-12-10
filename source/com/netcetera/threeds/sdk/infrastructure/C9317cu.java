package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.cu */
/* loaded from: classes5.dex */
public class C9317cu extends AbstractC9324da {
    private static int getSDKInfo = 1;
    private static int initialize;

    public C9317cu(Context context, InterfaceC9515js interfaceC9515js, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, InterfaceC9394fr interfaceC9394fr) {
        super(context, interfaceC9515js, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void get(isEmpty isempty) {
        values(new C9315cs());
        int i = initialize;
        int i2 = ((i & (-78)) | ((~i) & 77)) + ((i & 77) << 1);
        getSDKInfo = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9325db
    public void valueOf(Context context) {
        C9752store values = C9752store.values(context, get());
        values.values(new C9316ct(this));
        values(context, propertyNames.ThreeDS2Service(context, values, cleanup(context)));
        initialize = (getSDKInfo + 35) % 128;
    }
}
