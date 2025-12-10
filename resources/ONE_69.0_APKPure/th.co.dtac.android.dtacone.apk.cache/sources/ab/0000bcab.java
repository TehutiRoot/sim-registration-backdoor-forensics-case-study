package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization;
import java.util.Map;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.jx */
/* loaded from: classes5.dex */
public class C9510jx {
    private static int get = 1;
    private static int values;
    private final C9524kj ThreeDS2ServiceInstance;
    private final C9522ki valueOf;

    public C9510jx(C9524kj c9524kj, C9522ki c9522ki) {
        this.ThreeDS2ServiceInstance = c9524kj;
        this.valueOf = c9522ki;
    }

    public static C9510jx get() {
        C9510jx c9510jx = new C9510jx(new C9524kj(), new C9522ki());
        int i = get;
        int i2 = i ^ 85;
        int i3 = ((((i & 85) | i2) << 1) - (~(-i2))) - 1;
        values = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 41 / 0;
        }
        return c9510jx;
    }

    public InterfaceC9504js ThreeDS2Service(com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization uiCustomization, C9571lz c9571lz) {
        C9498jm c9498jm = new C9498jm(this.ThreeDS2ServiceInstance.values(uiCustomization, UiCustomization.UiCustomizationType.DEFAULT), this.valueOf.values(uiCustomization, UiCustomization.UiCustomizationType.DARK), c9571lz);
        int i = values;
        int i2 = i & 109;
        int i3 = i2 + ((i ^ 109) | i2);
        get = i3 % 128;
        if (i3 % 2 != 0) {
            return c9498jm;
        }
        throw null;
    }

    public InterfaceC9504js ThreeDS2ServiceInstance(Map<UiCustomization.UiCustomizationType, com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization> map, C9571lz c9571lz) {
        C9524kj c9524kj = this.ThreeDS2ServiceInstance;
        UiCustomization.UiCustomizationType uiCustomizationType = UiCustomization.UiCustomizationType.DEFAULT;
        InterfaceC9504js values2 = c9524kj.values(map.get(uiCustomizationType), uiCustomizationType);
        C9524kj c9524kj2 = this.ThreeDS2ServiceInstance;
        UiCustomization.UiCustomizationType uiCustomizationType2 = UiCustomization.UiCustomizationType.DARK;
        C9498jm c9498jm = new C9498jm(values2, c9524kj2.values(map.get(uiCustomizationType2), uiCustomizationType2), c9571lz);
        int i = get;
        int i2 = (i & 68) + (i | 68);
        values = ((~i2) + (i2 << 1)) % 128;
        return c9498jm;
    }
}