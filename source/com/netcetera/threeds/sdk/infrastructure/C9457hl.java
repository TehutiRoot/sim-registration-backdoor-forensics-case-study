package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.hl */
/* loaded from: classes5.dex */
final class C9457hl extends AbstractC9400fx {
    private static int valueOf = 0;
    private static int values = 1;

    private C9457hl(InterfaceC9398fv interfaceC9398fv, InterfaceC9397fu interfaceC9397fu, InterfaceC9395fs interfaceC9395fs, InterfaceC9391fo interfaceC9391fo, InterfaceC9389fm interfaceC9389fm, InterfaceC9385fi interfaceC9385fi, InterfaceC9388fl interfaceC9388fl, InterfaceC9399fw interfaceC9399fw, InterfaceC9402fz interfaceC9402fz, InterfaceC9396ft interfaceC9396ft, InterfaceC9404ga interfaceC9404ga, InterfaceC9390fn interfaceC9390fn, InterfaceC9392fp interfaceC9392fp, InterfaceC9394fr interfaceC9394fr, InterfaceC9387fk interfaceC9387fk, InterfaceC9405gb interfaceC9405gb, InterfaceC9393fq interfaceC9393fq) {
        super(interfaceC9398fv, interfaceC9397fu, interfaceC9395fs, interfaceC9391fo, interfaceC9389fm, interfaceC9385fi, interfaceC9388fl, interfaceC9399fw, interfaceC9402fz, interfaceC9396ft, interfaceC9404ga, interfaceC9390fn, interfaceC9392fp, interfaceC9394fr, interfaceC9387fk, interfaceC9405gb, interfaceC9393fq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ setFastScrollEnabled.valueOf getSDKVersion() {
        values = (valueOf + 75) % 128;
        setFastScrollEnabled.valueOf valueof = setFastScrollEnabled.valueOf.get;
        int i = valueOf;
        int i2 = i & 13;
        int i3 = (i ^ 13) | i2;
        values = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        return valueof;
    }

    public static InterfaceC9401fy valueOf() {
        C9457hl c9457hl = new C9457hl(C9460ho.valueOf, C9461hp.get, C9469hx.valueOf, C9468hw.valueOf, C9471hz.valueOf, C9473ia.values, C9474ib.ThreeDS2Service, C9477ie.values, C9475ic.valueOf, C9476id.valueOf, C9463hr.values, C9464hs.get, C9465ht.get, C9466hu.valueOf, C9462hq.get, C9467hv.get, C9470hy.get);
        int i = valueOf;
        int i2 = i & 1;
        int i3 = (i ^ 1) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        values = i4 % 128;
        if (i4 % 2 != 0) {
            return c9457hl;
        }
        throw null;
    }
}
