package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import com.netcetera.threeds.sdk.infrastructure.C9376eu;
import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.dg */
/* loaded from: classes5.dex */
public class C9331dg extends AbstractC9328de {
    private static int getSDKInfo = 1;
    private static int getWarnings;

    public C9331dg(Context context, InterfaceC9515js interfaceC9515js, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, InterfaceC9394fr interfaceC9394fr) {
        super(context, interfaceC9515js, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
    }

    public static getOrDefault get(Context context, InterfaceC9515js interfaceC9515js, setWidth setwidth, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, setLinksClickable setlinksclickable, InterfaceC9394fr interfaceC9394fr) {
        C9331dg c9331dg = new C9331dg(context, interfaceC9515js, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
        int i = getSDKInfo;
        int i2 = i & 19;
        int i3 = -(-((i ^ 19) | i2));
        getWarnings = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        return c9331dg;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9325db
    public void valueOf(Context context) {
        C9752store c9752store = C9752store.get(context, get());
        c9752store.values(new C9334dj(this));
        values(propertyNames.ThreeDS2Service(context, c9752store));
        int i = getSDKInfo + 69;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            return;
        }
        throw null;
    }

    private void get(String str) {
        values(new C9329df(setFastScrollEnabled.valueOf.valueOf, str));
        int i = getWarnings;
        int i2 = i | 29;
        int i3 = i2 << 1;
        int i4 = -((~(i & 29)) & i2);
        int i5 = (i3 & i4) + (i4 | i3);
        getSDKInfo = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void values(isEmpty isempty) {
        getWarnings = (getSDKInfo + 51) % 128;
        get(C9376eu.valueOf.values.ThreeDS2ServiceInstance());
        int i = getWarnings;
        getSDKInfo = (((i & 29) - (~(-(-(i | 29))))) - 1) % 128;
    }
}
