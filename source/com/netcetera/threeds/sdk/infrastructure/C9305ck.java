package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ck */
/* loaded from: classes5.dex */
public final class C9305ck extends AbstractC9294ca {
    private static int cleanup = 1;
    private static int getWarnings;
    private final C9618ng ThreeDS2ServiceInstance;

    public C9305ck(C9296cc c9296cc, C9618ng c9618ng) {
        super(c9296cc);
        this.ThreeDS2ServiceInstance = c9618ng;
    }

    public static C9305ck values(InterfaceC9515js interfaceC9515js, setWidth setwidth, InterfaceC9401fy interfaceC9401fy, com.netcetera.threeds.sdk.api.p018ui.ProgressView progressView) {
        C9305ck c9305ck = new C9305ck(C9296cc.get(C9297cd.get(interfaceC9515js, setwidth, interfaceC9401fy), progressView, interfaceC9515js, interfaceC9401fy), C9618ng.get());
        int i = getWarnings;
        cleanup = ((i & 121) + (i | 121)) % 128;
        return c9305ck;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9599mp, com.netcetera.threeds.sdk.infrastructure.InterfaceC9602ms
    public void ThreeDS2ServiceInstance(boolean z) {
        int i = cleanup;
        getWarnings = (((i | 3) << 1) - (i ^ 3)) % 128;
        super.ThreeDS2ServiceInstance(z);
        if (!z) {
            int i2 = cleanup;
            getWarnings = ((((i2 | 56) << 1) - (i2 ^ 56)) - 1) % 128;
            this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(getSDKInfo().ThreeDS2Service());
            int i3 = cleanup;
            getWarnings = (((i3 | 109) << 1) - (i3 ^ 109)) % 128;
        }
        int i4 = getWarnings;
        int i5 = i4 & 19;
        int i6 = (i4 ^ 19) | i5;
        cleanup = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
    }
}
