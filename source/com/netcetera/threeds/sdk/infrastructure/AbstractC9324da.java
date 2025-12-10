package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.da */
/* loaded from: classes5.dex */
public abstract class AbstractC9324da extends AbstractC9325db {
    private static int getWarnings = 1;
    private static int initialize;

    public AbstractC9324da(Context context, InterfaceC9515js interfaceC9515js, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, InterfaceC9394fr interfaceC9394fr) {
        super(context, interfaceC9515js, interfaceC9385fi, interfaceC9404ga, interfaceC9394fr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ThreeDS2Service(isEmpty isempty) {
        values(new C9300cf(initCause.ThreeDS2ServiceInstance));
        int i = initialize;
        int i2 = i & 11;
        getWarnings = (((((i ^ 11) | i2) << 1) - (~(-((i | 11) & (~i2))))) - 1) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9290bx
    public void ThreeDS2ServiceInstance(Context context) {
        int i = getWarnings + 7;
        initialize = i % 128;
        if (i % 2 == 0) {
            ThreeDS2Service(context);
            values(context);
            valueOf(context);
            int i2 = getWarnings;
            int i3 = ((i2 | 43) << 1) - (i2 ^ 43);
            initialize = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            throw null;
        }
        ThreeDS2Service(context);
        values(context);
        valueOf(context);
        throw null;
    }

    public C9752store cleanup(Context context) {
        C9752store ThreeDS2Service = C9752store.ThreeDS2Service(context, get());
        ThreeDS2Service.values(new C9326dc(this));
        int i = getWarnings + 57;
        initialize = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2Service;
        }
        throw null;
    }

    public void values(Context context, propertyNames propertynames) {
        InterfaceC9511jo ThreeDS2Service = get().ThreeDS2Service();
        C9281bp c9281bp = new C9281bp(context, ThreeDS2Service);
        ThreeDS2Service(c9281bp);
        C9245al c9245al = new C9245al(context, ThreeDS2Service);
        ThreeDS2Service(c9245al);
        values(C9280bo.get(context, propertynames, c9281bp, c9245al, C9252ar.ThreeDS2ServiceInstance(context, ((AbstractC9325db) this).cleanup.ThreeDS2Service(), ((AbstractC9325db) this).getSDKVersion), C9252ar.valueOf(context, ((AbstractC9325db) this).cleanup.ThreeDS2Service(), ((AbstractC9325db) this).getSDKVersion)));
        int i = (-2) - (~(initialize + 114));
        getWarnings = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
