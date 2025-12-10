package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.gs */
/* loaded from: classes5.dex */
final class C9437gs extends AbstractC9400fx {
    private static int valueOf = 0;
    private static int values = 1;

    private C9437gs(InterfaceC9398fv interfaceC9398fv, InterfaceC9397fu interfaceC9397fu, InterfaceC9395fs interfaceC9395fs, InterfaceC9391fo interfaceC9391fo, InterfaceC9389fm interfaceC9389fm, InterfaceC9385fi interfaceC9385fi, InterfaceC9388fl interfaceC9388fl, InterfaceC9399fw interfaceC9399fw, InterfaceC9402fz interfaceC9402fz, InterfaceC9396ft interfaceC9396ft, InterfaceC9404ga interfaceC9404ga, InterfaceC9390fn interfaceC9390fn, InterfaceC9392fp interfaceC9392fp, InterfaceC9394fr interfaceC9394fr, InterfaceC9387fk interfaceC9387fk, InterfaceC9405gb interfaceC9405gb, InterfaceC9393fq interfaceC9393fq) {
        super(interfaceC9398fv, interfaceC9397fu, interfaceC9395fs, interfaceC9391fo, interfaceC9389fm, interfaceC9385fi, interfaceC9388fl, interfaceC9399fw, interfaceC9402fz, interfaceC9396ft, interfaceC9404ga, interfaceC9390fn, interfaceC9392fp, interfaceC9394fr, interfaceC9387fk, interfaceC9405gb, interfaceC9393fq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ setFilters ThreeDS2Service(C9582lz c9582lz) {
        setLogo setlogo = new setLogo();
        int i = valueOf;
        int i2 = i & 11;
        int i3 = (i ^ 11) | i2;
        values = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        return setlogo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ setFastScrollEnabled.valueOf getSDKInfo() {
        int i = values;
        int i2 = i & 37;
        valueOf = ((i2 - (~((i ^ 37) | i2))) - 1) % 128;
        setFastScrollEnabled.valueOf valueof = setFastScrollEnabled.valueOf.ThreeDS2ServiceInstance;
        values = (valueOf + 79) % 128;
        return valueof;
    }

    public static InterfaceC9401fy valueOf() {
        C9437gs c9437gs = new C9437gs(C9444gz.ThreeDS2ServiceInstance, C9442gx.values, C9449hd.get, C9454hi.values, C9455hj.values, C9456hk.get, C9452hg.get, C9453hh.ThreeDS2Service, C9459hn.ThreeDS2Service, C9458hm.ThreeDS2Service, C9441gw.valueOf, C9446ha.values, C9443gy.valueOf, C9451hf.valueOf, C9447hb.ThreeDS2Service, C9448hc.values, C9450he.valueOf);
        int i = values + 85;
        valueOf = i % 128;
        if (i % 2 != 0) {
            int i2 = 63 / 0;
        }
        return c9437gs;
    }
}
