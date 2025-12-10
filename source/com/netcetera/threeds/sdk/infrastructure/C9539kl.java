package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.kl */
/* loaded from: classes5.dex */
public final class C9539kl implements InterfaceC9507jk {
    private static int ThreeDS2Service = 1;
    private static int get;
    private final InterfaceC9507jk ThreeDS2ServiceInstance;
    private final InterfaceC9507jk values;

    public C9539kl(InterfaceC9507jk interfaceC9507jk, InterfaceC9507jk interfaceC9507jk2) {
        this.ThreeDS2ServiceInstance = interfaceC9507jk;
        this.values = interfaceC9507jk2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9507jk
    public String ThreeDS2Service() {
        int i = get;
        int i2 = (i & (-50)) | ((~i) & 49);
        int i3 = (i & 49) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        ThreeDS2Service = i4 % 128;
        int i5 = i4 % 2;
        InterfaceC9507jk interfaceC9507jk = this.ThreeDS2ServiceInstance;
        InterfaceC9507jk interfaceC9507jk2 = this.values;
        if (i5 != 0) {
            return (String) AbstractC9547kt.ThreeDS2Service(interfaceC9507jk, interfaceC9507jk2, C9545kr.valueOf);
        }
        String str = (String) AbstractC9547kt.ThreeDS2Service(interfaceC9507jk, interfaceC9507jk2, C9545kr.valueOf);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public int ThreeDS2ServiceInstance() {
        int i = ThreeDS2Service + 21;
        get = i % 128;
        if (i % 2 == 0) {
            return AbstractC9547kt.values(this.ThreeDS2ServiceInstance, this.values, C9544kq.valueOf).intValue();
        }
        AbstractC9547kt.values(this.ThreeDS2ServiceInstance, this.values, C9544kq.valueOf).intValue();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public String get() {
        int i = get;
        int i2 = ((i | 87) << 1) - (i ^ 87);
        ThreeDS2Service = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC9507jk interfaceC9507jk = this.ThreeDS2ServiceInstance;
        if (i3 == 0) {
            int i4 = 42 / 0;
            return (String) AbstractC9547kt.ThreeDS2Service(interfaceC9507jk, this.values, C9541kn.get);
        }
        return (String) AbstractC9547kt.ThreeDS2Service(interfaceC9507jk, this.values, C9541kn.get);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public String valueOf() {
        int i = ThreeDS2Service;
        int i2 = i & 29;
        int i3 = (i | 29) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        get = i5 % 128;
        int i6 = i5 % 2;
        InterfaceC9507jk interfaceC9507jk = this.ThreeDS2ServiceInstance;
        InterfaceC9507jk interfaceC9507jk2 = this.values;
        if (i6 == 0) {
            return (String) AbstractC9547kt.ThreeDS2Service(interfaceC9507jk, interfaceC9507jk2, C9543kp.get);
        }
        String str = (String) AbstractC9547kt.ThreeDS2Service(interfaceC9507jk, interfaceC9507jk2, C9543kp.get);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9507jk
    public int values() {
        int i = get;
        int i2 = (i ^ 45) + ((i & 45) << 1);
        ThreeDS2Service = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC9507jk interfaceC9507jk = this.ThreeDS2ServiceInstance;
        if (i3 != 0) {
            return AbstractC9547kt.values(interfaceC9507jk, this.values, C9542ko.values).intValue();
        }
        AbstractC9547kt.values(interfaceC9507jk, this.values, C9542ko.values).intValue();
        throw null;
    }
}
