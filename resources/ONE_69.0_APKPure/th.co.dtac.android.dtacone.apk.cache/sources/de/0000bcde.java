package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.p018ui.logic.ButtonCustomization;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ln */
/* loaded from: classes5.dex */
public class C9558ln implements InterfaceC9496jk {
    private static int ThreeDS2Service = 0;
    private static int values = 1;
    private final ButtonCustomization valueOf;

    public C9558ln(ButtonCustomization buttonCustomization) {
        this.valueOf = buttonCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9496jk
    public String ThreeDS2Service() {
        int i = ThreeDS2Service;
        int i2 = (i | 81) << 1;
        int i3 = -(((~i) & 81) | (i & (-82)));
        values = ((i2 & i3) + (i3 | i2)) % 128;
        String darkBackgroundColor = this.valueOf.getDarkBackgroundColor();
        int i4 = values;
        int i5 = i4 & 55;
        int i6 = (i4 ^ 55) | i5;
        ThreeDS2Service = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
        return darkBackgroundColor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public int ThreeDS2ServiceInstance() {
        int i = ThreeDS2Service;
        values = (((i & (-42)) | ((~i) & 41)) + ((i & 41) << 1)) % 128;
        int textFontSize = this.valueOf.getTextFontSize();
        int i2 = ThreeDS2Service;
        int i3 = (i2 & (-88)) | ((~i2) & 87);
        int i4 = (i2 & 87) << 1;
        values = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        return textFontSize;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String get() {
        int i = ThreeDS2Service;
        int i2 = (((i | 67) << 1) - (~(-(i ^ 67)))) - 1;
        values = i2 % 128;
        int i3 = i2 % 2;
        String darkTextColor = this.valueOf.getDarkTextColor();
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        int i5 = ThreeDS2Service;
        int i6 = ((i5 ^ 60) + ((i5 & 60) << 1)) - 1;
        values = i6 % 128;
        if (i6 % 2 != 0) {
            return darkTextColor;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String valueOf() {
        int i = values;
        ThreeDS2Service = (((i | 125) << 1) - (((~i) & 125) | (i & (-126)))) % 128;
        String textFontName = this.valueOf.getTextFontName();
        int i2 = values;
        int i3 = ((i2 ^ 26) + ((i2 & 26) << 1)) - 1;
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 68 / 0;
        }
        return textFontName;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9496jk
    public int values() {
        int i = values;
        int i2 = ((i & (-88)) | ((~i) & 87)) + ((i & 87) << 1);
        ThreeDS2Service = i2 % 128;
        int i3 = i2 % 2;
        ButtonCustomization buttonCustomization = this.valueOf;
        if (i3 == 0) {
            return buttonCustomization.getCornerRadius();
        }
        buttonCustomization.getCornerRadius();
        throw null;
    }
}