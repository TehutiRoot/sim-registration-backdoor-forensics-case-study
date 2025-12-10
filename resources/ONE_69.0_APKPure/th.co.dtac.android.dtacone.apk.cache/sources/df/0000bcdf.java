package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.lo */
/* loaded from: classes5.dex */
public class C9559lo implements InterfaceC9509jw {
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInstance = 1;
    private final InterfaceC9509jw get;
    private final InterfaceC9509jw values;

    public C9559lo(InterfaceC9509jw interfaceC9509jw, InterfaceC9509jw interfaceC9509jw2) {
        this.values = interfaceC9509jw;
        this.get = interfaceC9509jw2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9509jw
    public String ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 113;
        int i3 = (i2 - (~((i ^ 113) | i2))) - 1;
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 == 0) {
            String str = (String) C9653oh.ThreeDS2Service(((InterfaceC9509jw) C9653oh.ThreeDS2Service(this.values, this.get)).ThreeDS2ServiceInstance(), this.get.ThreeDS2ServiceInstance());
            int i4 = ThreeDS2Service;
            int i5 = i4 & 49;
            int i6 = (i4 | 49) & (~i5);
            int i7 = i5 << 1;
            int i8 = (i6 & i7) + (i6 | i7);
            ThreeDS2ServiceInstance = i8 % 128;
            if (i8 % 2 != 0) {
                return str;
            }
            throw null;
        }
        String str2 = (String) C9653oh.ThreeDS2Service(((InterfaceC9509jw) C9653oh.ThreeDS2Service(this.values, this.get)).ThreeDS2ServiceInstance(), this.get.ThreeDS2ServiceInstance());
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9509jw
    public String values() {
        int i = (-2) - (~(ThreeDS2Service + 52));
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            int i2 = 32 / 0;
            return (String) C9653oh.ThreeDS2Service(((InterfaceC9509jw) C9653oh.ThreeDS2Service(this.values, this.get)).values(), this.get.values());
        }
        return (String) C9653oh.ThreeDS2Service(((InterfaceC9509jw) C9653oh.ThreeDS2Service(this.values, this.get)).values(), this.get.values());
    }
}