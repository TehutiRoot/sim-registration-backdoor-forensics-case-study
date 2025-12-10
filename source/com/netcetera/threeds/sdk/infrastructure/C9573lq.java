package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.lq */
/* loaded from: classes5.dex */
public final class C9573lq implements InterfaceC9515js {
    private static int ThreeDS2Service = 0;
    private static int get = 1;
    private final InterfaceC9515js ThreeDS2ServiceInstance;
    private final InterfaceC9515js values;

    public C9573lq(InterfaceC9515js interfaceC9515js, InterfaceC9515js interfaceC9515js2) {
        this.values = interfaceC9515js;
        this.ThreeDS2ServiceInstance = interfaceC9515js2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
    public InterfaceC9511jo ThreeDS2Service() {
        C9548ku c9548ku = new C9548ku(this.values.ThreeDS2Service(), this.ThreeDS2ServiceInstance.ThreeDS2Service());
        int i = get;
        int i2 = i ^ 63;
        int i3 = ((i & 63) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        ThreeDS2Service = i5 % 128;
        if (i5 % 2 == 0) {
            return c9548ku;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
    public InterfaceC9512jp ThreeDS2ServiceInstance() {
        C9561lg c9561lg = new C9561lg(this.values.ThreeDS2ServiceInstance(), this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance());
        get = (ThreeDS2Service + 47) % 128;
        return c9561lg;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
    public InterfaceC9520jw get() {
        C9570lo c9570lo = new C9570lo(this.values.get(), this.ThreeDS2ServiceInstance.get());
        int i = ThreeDS2Service;
        int i2 = (i ^ 41) + ((i & 41) << 1);
        get = i2 % 128;
        if (i2 % 2 != 0) {
            return c9570lo;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
    public InterfaceC9513jq values() {
        C9551kx c9551kx = new C9551kx(this.values.values(), this.ThreeDS2ServiceInstance.values());
        int i = ThreeDS2Service;
        get = ((((i | 48) << 1) - (i ^ 48)) - 1) % 128;
        return c9551kx;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
    public InterfaceC9507jk ThreeDS2ServiceInstance(UiCustomization.ButtonType buttonType) {
        C9539kl c9539kl = new C9539kl(this.values.ThreeDS2ServiceInstance(buttonType), this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(buttonType));
        int i = get;
        int i2 = i & 55;
        ThreeDS2Service = (i2 + ((i ^ 55) | i2)) % 128;
        return c9539kl;
    }
}
