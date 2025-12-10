package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.kl */
/* loaded from: classes5.dex */
public final class C9528kl implements InterfaceC9496jk {
    private static int ThreeDS2Service = 1;
    private static int get;
    private final InterfaceC9496jk ThreeDS2ServiceInstance;
    private final InterfaceC9496jk values;

    public C9528kl(InterfaceC9496jk interfaceC9496jk, InterfaceC9496jk interfaceC9496jk2) {
        this.ThreeDS2ServiceInstance = interfaceC9496jk;
        this.values = interfaceC9496jk2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9496jk
    public String ThreeDS2Service() {
        int i = get;
        int i2 = (i & (-50)) | ((~i) & 49);
        int i3 = (i & 49) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        ThreeDS2Service = i4 % 128;
        int i5 = i4 % 2;
        InterfaceC9496jk interfaceC9496jk = this.ThreeDS2ServiceInstance;
        InterfaceC9496jk interfaceC9496jk2 = this.values;
        if (i5 != 0) {
            return (String) AbstractC9536kt.ThreeDS2Service(interfaceC9496jk, interfaceC9496jk2, C9534kr.valueOf);
        }
        String str = (String) AbstractC9536kt.ThreeDS2Service(interfaceC9496jk, interfaceC9496jk2, C9534kr.valueOf);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public int ThreeDS2ServiceInstance() {
        int i = ThreeDS2Service + 21;
        get = i % 128;
        if (i % 2 == 0) {
            return AbstractC9536kt.values(this.ThreeDS2ServiceInstance, this.values, C9533kq.valueOf).intValue();
        }
        AbstractC9536kt.values(this.ThreeDS2ServiceInstance, this.values, C9533kq.valueOf).intValue();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String get() {
        int i = get;
        int i2 = ((i | 87) << 1) - (i ^ 87);
        ThreeDS2Service = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC9496jk interfaceC9496jk = this.ThreeDS2ServiceInstance;
        if (i3 == 0) {
            int i4 = 42 / 0;
            return (String) AbstractC9536kt.ThreeDS2Service(interfaceC9496jk, this.values, C9530kn.get);
        }
        return (String) AbstractC9536kt.ThreeDS2Service(interfaceC9496jk, this.values, C9530kn.get);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String valueOf() {
        int i = ThreeDS2Service;
        int i2 = i & 29;
        int i3 = (i | 29) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        get = i5 % 128;
        int i6 = i5 % 2;
        InterfaceC9496jk interfaceC9496jk = this.ThreeDS2ServiceInstance;
        InterfaceC9496jk interfaceC9496jk2 = this.values;
        if (i6 == 0) {
            return (String) AbstractC9536kt.ThreeDS2Service(interfaceC9496jk, interfaceC9496jk2, C9532kp.get);
        }
        String str = (String) AbstractC9536kt.ThreeDS2Service(interfaceC9496jk, interfaceC9496jk2, C9532kp.get);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9496jk
    public int values() {
        int i = get;
        int i2 = (i ^ 45) + ((i & 45) << 1);
        ThreeDS2Service = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC9496jk interfaceC9496jk = this.ThreeDS2ServiceInstance;
        if (i3 != 0) {
            return AbstractC9536kt.values(interfaceC9496jk, this.values, C9531ko.values).intValue();
        }
        AbstractC9536kt.values(interfaceC9496jk, this.values, C9531ko.values).intValue();
        throw null;
    }
}