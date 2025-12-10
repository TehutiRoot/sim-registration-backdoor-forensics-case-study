package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization;
import java.util.Map;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.jx */
/* loaded from: classes5.dex */
public class C9521jx {
    private static int get = 1;
    private static int values;
    private final C9535kj ThreeDS2ServiceInstance;
    private final C9533ki valueOf;

    public C9521jx(C9535kj c9535kj, C9533ki c9533ki) {
        this.ThreeDS2ServiceInstance = c9535kj;
        this.valueOf = c9533ki;
    }

    public static C9521jx get() {
        C9521jx c9521jx = new C9521jx(new C9535kj(), new C9533ki());
        int i = get;
        int i2 = i ^ 85;
        int i3 = ((((i & 85) | i2) << 1) - (~(-i2))) - 1;
        values = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 41 / 0;
        }
        return c9521jx;
    }

    public InterfaceC9515js ThreeDS2Service(com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization uiCustomization, C9582lz c9582lz) {
        C9509jm c9509jm = new C9509jm(this.ThreeDS2ServiceInstance.values(uiCustomization, UiCustomization.UiCustomizationType.DEFAULT), this.valueOf.values(uiCustomization, UiCustomization.UiCustomizationType.DARK), c9582lz);
        int i = values;
        int i2 = i & 109;
        int i3 = i2 + ((i ^ 109) | i2);
        get = i3 % 128;
        if (i3 % 2 != 0) {
            return c9509jm;
        }
        throw null;
    }

    public InterfaceC9515js ThreeDS2ServiceInstance(Map<UiCustomization.UiCustomizationType, com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization> map, C9582lz c9582lz) {
        C9535kj c9535kj = this.ThreeDS2ServiceInstance;
        UiCustomization.UiCustomizationType uiCustomizationType = UiCustomization.UiCustomizationType.DEFAULT;
        InterfaceC9515js values2 = c9535kj.values(map.get(uiCustomizationType), uiCustomizationType);
        C9535kj c9535kj2 = this.ThreeDS2ServiceInstance;
        UiCustomization.UiCustomizationType uiCustomizationType2 = UiCustomization.UiCustomizationType.DARK;
        C9509jm c9509jm = new C9509jm(values2, c9535kj2.values(map.get(uiCustomizationType2), uiCustomizationType2), c9582lz);
        int i = get;
        int i2 = (i & 68) + (i | 68);
        values = ((~i2) + (i2 << 1)) % 128;
        return c9509jm;
    }
}
