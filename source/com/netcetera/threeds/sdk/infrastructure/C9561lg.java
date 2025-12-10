package com.netcetera.threeds.sdk.infrastructure;

import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.lg */
/* loaded from: classes5.dex */
public final class C9561lg implements InterfaceC9512jp {
    private static int ThreeDS2Service = 0;
    private static int get = 1;
    private InterfaceC9512jp valueOf;
    private InterfaceC9512jp values;

    public C9561lg(InterfaceC9512jp interfaceC9512jp, InterfaceC9512jp interfaceC9512jp2) {
        this.values = interfaceC9512jp;
        this.valueOf = interfaceC9512jp2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9512jp
    public String ThreeDS2Service() {
        int i = ThreeDS2Service;
        int i2 = ((i ^ 24) + ((i & 24) << 1)) - 1;
        get = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC9512jp interfaceC9512jp = this.values;
        if (i3 != 0) {
            return (String) AbstractC9547kt.ThreeDS2Service(interfaceC9512jp, this.valueOf, C9565lj.ThreeDS2ServiceInstance);
        }
        String str = (String) AbstractC9547kt.ThreeDS2Service(interfaceC9512jp, this.valueOf, C9565lj.ThreeDS2ServiceInstance);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public int ThreeDS2ServiceInstance() {
        int i = get;
        int i2 = i ^ CameraActivity.REQUEST_CODE;
        int i3 = i & CameraActivity.REQUEST_CODE;
        int i4 = (i2 | i3) << 1;
        int i5 = -((i | CameraActivity.REQUEST_CODE) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        ThreeDS2Service = i6 % 128;
        int i7 = i6 % 2;
        InterfaceC9512jp interfaceC9512jp = this.values;
        InterfaceC9512jp interfaceC9512jp2 = this.valueOf;
        if (i7 == 0) {
            return AbstractC9547kt.values(interfaceC9512jp, interfaceC9512jp2, C9562lh.values).intValue();
        }
        AbstractC9547kt.values(interfaceC9512jp, interfaceC9512jp2, C9562lh.values).intValue();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public String get() {
        ThreeDS2Service = (get + 73) % 128;
        String str = (String) AbstractC9547kt.ThreeDS2Service(this.values, this.valueOf, C9567ll.valueOf);
        int i = ThreeDS2Service;
        int i2 = i & 75;
        int i3 = ((i ^ 75) | i2) << 1;
        int i4 = -((i | 75) & (~i2));
        get = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9512jp
    public String getSDKInfo() {
        int i = get;
        ThreeDS2Service = ((-2) - (~((i & 10) + (i | 10)))) % 128;
        String str = (String) AbstractC9547kt.ThreeDS2Service(this.values, this.valueOf, C9572lp.ThreeDS2ServiceInstance);
        int i2 = ThreeDS2Service;
        int i3 = (i2 & 22) + (i2 | 22);
        get = ((~i3) + (i3 << 1)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public String valueOf() {
        int i = get;
        int i2 = i & 35;
        int i3 = -(-((i ^ 35) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        ThreeDS2Service = i4 % 128;
        int i5 = i4 % 2;
        InterfaceC9512jp interfaceC9512jp = this.values;
        InterfaceC9512jp interfaceC9512jp2 = this.valueOf;
        if (i5 == 0) {
            return (String) AbstractC9547kt.ThreeDS2Service(interfaceC9512jp, interfaceC9512jp2, C9563li.valueOf);
        }
        String str = (String) AbstractC9547kt.ThreeDS2Service(interfaceC9512jp, interfaceC9512jp2, C9563li.valueOf);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9512jp
    public String values() {
        int i = get;
        int i2 = (i & 41) + (i | 41);
        ThreeDS2Service = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC9512jp interfaceC9512jp = this.values;
        if (i3 != 0) {
            int i4 = 22 / 0;
            return (String) AbstractC9547kt.ThreeDS2Service(interfaceC9512jp, this.valueOf, C9566lk.ThreeDS2Service);
        }
        return (String) AbstractC9547kt.ThreeDS2Service(interfaceC9512jp, this.valueOf, C9566lk.ThreeDS2Service);
    }
}
