package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.kx */
/* loaded from: classes5.dex */
public final class C9540kx implements InterfaceC9502jq {
    private static int ThreeDS2Service = 0;
    private static int get = 1;
    private final InterfaceC9502jq valueOf;
    private final InterfaceC9502jq values;

    public C9540kx(InterfaceC9502jq interfaceC9502jq, InterfaceC9502jq interfaceC9502jq2) {
        this.valueOf = interfaceC9502jq;
        this.values = interfaceC9502jq2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9502jq
    public String ThreeDS2Service() {
        int i = ThreeDS2Service;
        int i2 = i & 7;
        int i3 = (i | 7) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        get = i5 % 128;
        int i6 = i5 % 2;
        InterfaceC9502jq interfaceC9502jq = this.valueOf;
        InterfaceC9502jq interfaceC9502jq2 = this.values;
        if (i6 != 0) {
            return (String) AbstractC9536kt.ThreeDS2Service(interfaceC9502jq, interfaceC9502jq2, C9547ld.ThreeDS2ServiceInstance);
        }
        String str = (String) AbstractC9536kt.ThreeDS2Service(interfaceC9502jq, interfaceC9502jq2, C9547ld.ThreeDS2ServiceInstance);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public int ThreeDS2ServiceInstance() {
        int intValue;
        int i = get;
        int i2 = (i ^ 119) + ((i & 119) << 1);
        ThreeDS2Service = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC9502jq interfaceC9502jq = this.valueOf;
        if (i3 != 0) {
            intValue = AbstractC9536kt.values(interfaceC9502jq, this.values, C9542kz.values).intValue();
            int i4 = 31 / 0;
        } else {
            intValue = AbstractC9536kt.values(interfaceC9502jq, this.values, C9542kz.values).intValue();
        }
        int i5 = ThreeDS2Service;
        int i6 = i5 & 53;
        int i7 = -(-(i5 | 53));
        get = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
        return intValue;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String get() {
        int i = ThreeDS2Service;
        get = ((i & 85) + (i | 85)) % 128;
        String str = (String) AbstractC9536kt.ThreeDS2Service(this.valueOf, this.values, C9545lb.valueOf);
        int i2 = ThreeDS2Service;
        int i3 = i2 & 11;
        int i4 = i3 + ((i2 ^ 11) | i3);
        get = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9502jq
    public int getWarnings() {
        int i = get;
        int i2 = (i & 111) + (i | 111);
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            int intValue = AbstractC9536kt.values(this.valueOf, this.values, C9548le.get).intValue();
            int i3 = get;
            int i4 = (((i3 | 104) << 1) - (i3 ^ 104)) - 1;
            ThreeDS2Service = i4 % 128;
            if (i4 % 2 == 0) {
                return intValue;
            }
            throw null;
        }
        AbstractC9536kt.values(this.valueOf, this.values, C9548le.get).intValue();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String valueOf() {
        int i = get;
        int i2 = (i ^ 29) + ((i & 29) << 1);
        ThreeDS2Service = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC9502jq interfaceC9502jq = this.valueOf;
        if (i3 == 0) {
            String str = (String) AbstractC9536kt.ThreeDS2Service(interfaceC9502jq, this.values, C9549lf.ThreeDS2Service);
            int i4 = get;
            int i5 = (i4 | 1) << 1;
            int i6 = -(((~i4) & 1) | (i4 & (-2)));
            ThreeDS2Service = ((i5 & i6) + (i6 | i5)) % 128;
            return str;
        }
        String str2 = (String) AbstractC9536kt.ThreeDS2Service(interfaceC9502jq, this.values, C9549lf.ThreeDS2Service);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9502jq
    public int values() {
        int i = ThreeDS2Service;
        int i2 = ((i ^ 117) | (i & 117)) << 1;
        int i3 = -(((~i) & 117) | (i & (-118)));
        get = ((i2 & i3) + (i3 | i2)) % 128;
        int intValue = AbstractC9536kt.values(this.valueOf, this.values, C9546lc.values).intValue();
        int i4 = ThreeDS2Service + 106;
        int i5 = (~i4) + (i4 << 1);
        get = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return intValue;
    }
}