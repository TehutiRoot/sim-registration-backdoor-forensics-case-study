package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.cq */
/* loaded from: classes5.dex */
public class C9313cq implements InterfaceC9311compute {
    private static int valueOf = 1;
    private static int values;
    private InterfaceC9311compute ThreeDS2ServiceInstance;
    private InterfaceC9367elements get;

    public void ThreeDS2Service(InterfaceC9367elements interfaceC9367elements) {
        int i = values;
        int i2 = i + 47;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        this.get = interfaceC9367elements;
        if (i3 == 0) {
            throw null;
        }
        int i4 = ((i ^ 114) + ((i & 114) << 1)) - 1;
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
    }

    public void get(InterfaceC9311compute interfaceC9311compute) {
        int i = valueOf;
        int i2 = ((i & 31) + (i | 31)) % 128;
        values = i2;
        this.ThreeDS2ServiceInstance = interfaceC9311compute;
        valueOf = ((i2 ^ 89) + ((i2 & 89) << 1)) % 128;
    }

    public void values() {
        int i = valueOf;
        this.get = null;
        values = (((i & 17) - (~(i | 17))) - 1) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9311compute
    public void ThreeDS2Service(keys keysVar) {
        int i = values;
        int i2 = ((i ^ 42) + ((i & 42) << 1)) - 1;
        int i3 = i2 % 128;
        valueOf = i3;
        if (i2 % 2 != 0) {
            if (this.ThreeDS2ServiceInstance != null) {
                values = (((i3 | 91) << 1) - (i3 ^ 91)) % 128;
                InterfaceC9367elements interfaceC9367elements = this.get;
                if (interfaceC9367elements != null) {
                    int i4 = ((i3 & (-10)) | ((~i3) & 9)) + ((i3 & 9) << 1);
                    values = i4 % 128;
                    if (i4 % 2 == 0) {
                        keysVar = interfaceC9367elements.get(keysVar);
                    } else {
                        interfaceC9367elements.get(keysVar);
                        throw null;
                    }
                } else {
                    values = ((i3 & 3) + (i3 | 3)) % 128;
                }
                this.ThreeDS2ServiceInstance.ThreeDS2Service(keysVar);
                valueOf = (values + 109) % 128;
            }
            int i5 = valueOf;
            values = ((((i5 | 20) << 1) - (i5 ^ 20)) - 1) % 128;
            return;
        }
        throw null;
    }
}
