package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import com.netcetera.threeds.sdk.infrastructure.C9376eu;
import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.dr */
/* loaded from: classes5.dex */
public class C9342dr extends AbstractC9324da {
    private static int getWarnings = 1;
    private static int initialize;
    private final setLinksClickable getSDKInfo;

    public C9342dr(Context context, InterfaceC9515js interfaceC9515js, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, setLinksClickable setlinksclickable, InterfaceC9394fr interfaceC9394fr) {
        super(context, interfaceC9515js, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
        this.getSDKInfo = setlinksclickable;
    }

    public static getOrDefault ThreeDS2ServiceInstance(Context context, InterfaceC9515js interfaceC9515js, setWidth setwidth, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, setLinksClickable setlinksclickable, InterfaceC9394fr interfaceC9394fr) {
        C9342dr c9342dr = new C9342dr(context, interfaceC9515js, interfaceC9385fi, interfaceC9404ga, setlinksclickable, interfaceC9394fr);
        int i = getWarnings;
        initialize = (((i | 31) << 1) - (i ^ 31)) % 128;
        return c9342dr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void get(Context context, isEmpty isempty) {
        this.getSDKInfo.values(context, new C9340dp(this));
        int i = initialize;
        int i2 = ((i | 119) << 1) - (((~i) & 119) | (i & (-120)));
        getWarnings = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9325db
    public void valueOf(Context context) {
        C9752store c9752store = C9752store.get(context, get());
        c9752store.values(new C9344dt(this));
        C9752store valueOf = C9752store.valueOf(context, get());
        valueOf.values(new C9343ds(this, context));
        C9266bc c9266bc = new C9266bc(new C9341dq(this), context);
        values(context, propertyNames.ThreeDS2Service(context, valueOf, c9752store, cleanup(context)));
        values(c9266bc);
        int i = getWarnings + 101;
        initialize = i % 128;
        if (i % 2 != 0) {
            int i2 = 35 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ThreeDS2Service(isEmpty isempty) {
        int i = initialize;
        int i2 = (i & 87) + (i | 87);
        getWarnings = i2 % 128;
        if (i2 % 2 != 0) {
            get(C9376eu.values.get.get(), C9376eu.ThreeDS2Service.values.valueOf());
            int i3 = getWarnings + 19;
            initialize = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        get(C9376eu.values.get.get(), C9376eu.ThreeDS2Service.values.valueOf());
        throw null;
    }

    private void get(String str, String str2) {
        values(new C9329df(setFastScrollEnabled.valueOf.get, str, str2));
        int i = getWarnings;
        int i2 = i & 29;
        int i3 = -(-((i ^ 29) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        initialize = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void valueOf() {
        int i = getWarnings;
        int i2 = ((i ^ 89) | (i & 89)) << 1;
        int i3 = -(((~i) & 89) | (i & (-90)));
        initialize = ((i2 & i3) + (i3 | i2)) % 128;
        get(C9376eu.values.ThreeDS2Service.get(), C9376eu.ThreeDS2Service.ThreeDS2ServiceInstance.valueOf());
        int i4 = getWarnings;
        int i5 = (i4 ^ 47) + ((i4 & 47) << 1);
        initialize = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void valueOf(getServices getservices) {
        int i = getWarnings;
        initialize = ((((i | 10) << 1) - (i ^ 10)) - 1) % 128;
        get(C9376eu.values.ThreeDS2Service.get(), C9376eu.ThreeDS2Service.values.valueOf());
        int i2 = getWarnings;
        int i3 = (i2 & 13) + (i2 | 13);
        initialize = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
