package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ku */
/* loaded from: classes5.dex */
public final class C9548ku implements InterfaceC9511jo {
    private static int get = 1;
    private static int values;
    private final InterfaceC9511jo ThreeDS2Service;
    private final InterfaceC9511jo valueOf;

    public C9548ku(InterfaceC9511jo interfaceC9511jo, InterfaceC9511jo interfaceC9511jo2) {
        this.valueOf = interfaceC9511jo;
        this.ThreeDS2Service = interfaceC9511jo2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9511jo
    public int ThreeDS2Service() {
        int intValue;
        int i = values;
        int i2 = (((i & (-18)) | ((~i) & 17)) - (~(-(-((i & 17) << 1))))) - 1;
        get = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC9511jo interfaceC9511jo = this.valueOf;
        if (i3 == 0) {
            intValue = AbstractC9547kt.values(interfaceC9511jo, this.ThreeDS2Service, C9555la.values).intValue();
            int i4 = 23 / 0;
        } else {
            intValue = AbstractC9547kt.values(interfaceC9511jo, this.ThreeDS2Service, C9555la.values).intValue();
        }
        int i5 = values;
        int i6 = i5 & 7;
        int i7 = ((i5 | 7) & (~i6)) + (i6 << 1);
        get = i7 % 128;
        if (i7 % 2 != 0) {
            return intValue;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public int ThreeDS2ServiceInstance() {
        int i = get;
        values = ((i ^ 25) + ((i & 25) << 1)) % 128;
        int intValue = AbstractC9547kt.values(this.valueOf, this.ThreeDS2Service, C9549kv.ThreeDS2ServiceInstance).intValue();
        int i2 = values;
        int i3 = i2 & 63;
        int i4 = i2 | 63;
        int i5 = (i3 & i4) + (i4 | i3);
        get = i5 % 128;
        if (i5 % 2 != 0) {
            return intValue;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public String get() {
        int i = values;
        get = ((i & 75) + (i | 75)) % 128;
        String str = (String) AbstractC9547kt.ThreeDS2Service(this.valueOf, this.ThreeDS2Service, C9546ks.valueOf);
        int i2 = get + 54;
        int i3 = (~i2) + (i2 << 1);
        values = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 72 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public String valueOf() {
        int i = get;
        int i2 = i & 31;
        int i3 = (i ^ 31) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        values = i4 % 128;
        int i5 = i4 % 2;
        InterfaceC9511jo interfaceC9511jo = this.valueOf;
        InterfaceC9511jo interfaceC9511jo2 = this.ThreeDS2Service;
        if (i5 == 0) {
            String str = (String) AbstractC9547kt.ThreeDS2Service(interfaceC9511jo, interfaceC9511jo2, C9550kw.valueOf);
            int i6 = get;
            int i7 = i6 & 93;
            values = (i7 + ((i6 ^ 93) | i7)) % 128;
            return str;
        }
        String str2 = (String) AbstractC9547kt.ThreeDS2Service(interfaceC9511jo, interfaceC9511jo2, C9550kw.valueOf);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9511jo
    public String values() {
        int i = get;
        int i2 = i & 7;
        int i3 = (i | 7) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        values = i5 % 128;
        int i6 = i5 % 2;
        InterfaceC9511jo interfaceC9511jo = this.valueOf;
        InterfaceC9511jo interfaceC9511jo2 = this.ThreeDS2Service;
        if (i6 == 0) {
            return (String) AbstractC9547kt.ThreeDS2Service(interfaceC9511jo, interfaceC9511jo2, C9552ky.values);
        }
        String str = (String) AbstractC9547kt.ThreeDS2Service(interfaceC9511jo, interfaceC9511jo2, C9552ky.values);
        throw null;
    }
}
