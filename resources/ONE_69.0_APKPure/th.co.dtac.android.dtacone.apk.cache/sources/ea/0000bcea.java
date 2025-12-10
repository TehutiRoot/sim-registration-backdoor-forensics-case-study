package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.p018ui.logic.ButtonCustomization;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.lv */
/* loaded from: classes5.dex */
public class C9567lv implements InterfaceC9496jk {
    private static int ThreeDS2ServiceInstance = 0;
    private static int get = 1;
    private final ButtonCustomization values;

    public C9567lv(ButtonCustomization buttonCustomization) {
        this.values = buttonCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9496jk
    public String ThreeDS2Service() {
        int i = get;
        int i2 = ((i | 34) << 1) - (i ^ 34);
        ThreeDS2ServiceInstance = ((~i2) + (i2 << 1)) % 128;
        String backgroundColor = this.values.getBackgroundColor();
        int i3 = ThreeDS2ServiceInstance;
        int i4 = (((i3 | 124) << 1) - (i3 ^ 124)) - 1;
        get = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return backgroundColor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public int ThreeDS2ServiceInstance() {
        get = (ThreeDS2ServiceInstance + 45) % 128;
        int textFontSize = this.values.getTextFontSize();
        int i = get + 13;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            return textFontSize;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String get() {
        int i = get;
        ThreeDS2ServiceInstance = ((((i | 66) << 1) - (i ^ 66)) - 1) % 128;
        String textColor = this.values.getTextColor();
        int i2 = ThreeDS2ServiceInstance + 99;
        get = i2 % 128;
        if (i2 % 2 != 0) {
            return textColor;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String valueOf() {
        int i = ThreeDS2ServiceInstance;
        get = (((((i ^ 39) | (i & 39)) << 1) - (~(-(((~i) & 39) | (i & (-40)))))) - 1) % 128;
        String textFontName = this.values.getTextFontName();
        ThreeDS2ServiceInstance = ((-2) - (~(get + 106))) % 128;
        return textFontName;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9496jk
    public int values() {
        int i = ThreeDS2ServiceInstance + 125;
        get = i % 128;
        if (i % 2 == 0) {
            int i2 = 87 / 0;
            return this.values.getCornerRadius();
        }
        return this.values.getCornerRadius();
    }
}