package com.netcetera.threeds.sdk.infrastructure;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.jl */
/* loaded from: classes5.dex */
public class C9497jl {
    private static int ThreeDS2ServiceInstance = 1;
    private static int values;
    private final getErrorMessageType ThreeDS2Service;
    private final InterfaceC9504js get;

    public C9497jl(getErrorMessageType geterrormessagetype, InterfaceC9504js interfaceC9504js) {
        this.ThreeDS2Service = geterrormessagetype;
        this.get = interfaceC9504js;
    }

    public C9499jn ThreeDS2ServiceInstance() {
        C9499jn c9499jn = new C9499jn();
        c9499jn.values(this.ThreeDS2Service);
        c9499jn.ThreeDS2ServiceInstance(this.get);
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 107;
        values = (((((i ^ 107) | i2) << 1) - (~(-((i | 107) & (~i2))))) - 1) % 128;
        return c9499jn;
    }
}