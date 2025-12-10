package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.gf */
/* loaded from: classes5.dex */
final class C9424gf extends AbstractC9400fx {
    private static int ThreeDS2ServiceInstance = 0;
    private static int valueOf = 1;

    private C9424gf(InterfaceC9398fv interfaceC9398fv, InterfaceC9397fu interfaceC9397fu, InterfaceC9395fs interfaceC9395fs, InterfaceC9391fo interfaceC9391fo, InterfaceC9389fm interfaceC9389fm, InterfaceC9385fi interfaceC9385fi, InterfaceC9388fl interfaceC9388fl, InterfaceC9399fw interfaceC9399fw, InterfaceC9402fz interfaceC9402fz, InterfaceC9396ft interfaceC9396ft, InterfaceC9404ga interfaceC9404ga, InterfaceC9390fn interfaceC9390fn, InterfaceC9392fp interfaceC9392fp, InterfaceC9394fr interfaceC9394fr, InterfaceC9387fk interfaceC9387fk, InterfaceC9405gb interfaceC9405gb, InterfaceC9393fq interfaceC9393fq) {
        super(interfaceC9398fv, interfaceC9397fu, interfaceC9395fs, interfaceC9391fo, interfaceC9389fm, interfaceC9385fi, interfaceC9388fl, interfaceC9399fw, interfaceC9402fz, interfaceC9396ft, interfaceC9404ga, interfaceC9390fn, interfaceC9392fp, interfaceC9394fr, interfaceC9387fk, interfaceC9405gb, interfaceC9393fq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ setFilters ThreeDS2Service(C9582lz c9582lz) {
        setLogo setlogo = new setLogo();
        int i = valueOf;
        ThreeDS2ServiceInstance = (((i & (-124)) | ((~i) & CameraActivity.REQUEST_CODE)) + ((i & CameraActivity.REQUEST_CODE) << 1)) % 128;
        return setlogo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ setFastScrollEnabled.valueOf cleanup() {
        int i = ThreeDS2ServiceInstance;
        int i2 = (i | 23) << 1;
        int i3 = -(i ^ 23);
        valueOf = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        setFastScrollEnabled.valueOf valueof = setFastScrollEnabled.valueOf.valueOf;
        int i4 = ThreeDS2ServiceInstance;
        int i5 = i4 ^ 17;
        valueOf = ((((i4 & 17) | i5) << 1) - i5) % 128;
        return valueof;
    }

    public static InterfaceC9401fy valueOf() {
        C9424gf c9424gf = new C9424gf(C9408gd.ThreeDS2ServiceInstance, C9425gg.ThreeDS2Service, C9431gm.get, C9433go.values, C9434gp.valueOf, C9435gq.valueOf, C9436gr.valueOf, C9438gt.valueOf, C9440gv.ThreeDS2Service, C9439gu.values, C9409ge.ThreeDS2ServiceInstance, C9428gj.ThreeDS2ServiceInstance, C9430gl.values, C9426gh.ThreeDS2ServiceInstance, C9429gk.values, C9427gi.ThreeDS2Service, C9432gn.ThreeDS2ServiceInstance);
        int i = ThreeDS2ServiceInstance;
        int i2 = ((i | 99) << 1) - (i ^ 99);
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 45 / 0;
        }
        return c9424gf;
    }
}
