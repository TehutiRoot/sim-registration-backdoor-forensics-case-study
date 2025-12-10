package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.jl */
/* loaded from: classes5.dex */
class C9508jl {
    private static int ThreeDS2ServiceInstance = 1;
    private static int values;
    private final getErrorMessageType ThreeDS2Service;
    private final InterfaceC9515js get;

    public C9508jl(getErrorMessageType geterrormessagetype, InterfaceC9515js interfaceC9515js) {
        this.ThreeDS2Service = geterrormessagetype;
        this.get = interfaceC9515js;
    }

    public C9510jn ThreeDS2ServiceInstance() {
        C9510jn c9510jn = new C9510jn();
        c9510jn.values(this.ThreeDS2Service);
        c9510jn.ThreeDS2ServiceInstance(this.get);
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 107;
        values = (((((i ^ 107) | i2) << 1) - (~(-((i | 107) & (~i2))))) - 1) % 128;
        return c9510jn;
    }
}
