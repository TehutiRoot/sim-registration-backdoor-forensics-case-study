package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import com.netcetera.threeds.sdk.infrastructure.C9365eu;
import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.dg */
/* loaded from: classes5.dex */
public class C9320dg extends AbstractC9317de {
    private static int getSDKInfo = 1;
    private static int getWarnings;

    public C9320dg(Context context, InterfaceC9504js interfaceC9504js, InterfaceC9374fi interfaceC9374fi, InterfaceC9393ga interfaceC9393ga, InterfaceC9383fr interfaceC9383fr) {
        super(context, interfaceC9504js, interfaceC9374fi, interfaceC9393ga, interfaceC9383fr);
    }

    public static getOrDefault get(Context context, InterfaceC9504js interfaceC9504js, setWidth setwidth, InterfaceC9374fi interfaceC9374fi, InterfaceC9393ga interfaceC9393ga, setLinksClickable setlinksclickable, InterfaceC9383fr interfaceC9383fr) {
        C9320dg c9320dg = new C9320dg(context, interfaceC9504js, interfaceC9374fi, interfaceC9393ga, interfaceC9383fr);
        int i = getSDKInfo;
        int i2 = i & 19;
        int i3 = -(-((i ^ 19) | i2));
        getWarnings = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        return c9320dg;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9314db
    public void valueOf(Context context) {
        C9741store c9741store = C9741store.get(context, get());
        c9741store.values(new C9323dj(this));
        values(propertyNames.ThreeDS2Service(context, c9741store));
        int i = getSDKInfo + 69;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            return;
        }
        throw null;
    }

    private void get(String str) {
        values(new C9318df(setFastScrollEnabled.valueOf.valueOf, str));
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
        get(C9365eu.valueOf.values.ThreeDS2ServiceInstance());
        int i = getWarnings;
        getSDKInfo = (((i & 29) - (~(-(-(i | 29))))) - 1) % 128;
    }
}