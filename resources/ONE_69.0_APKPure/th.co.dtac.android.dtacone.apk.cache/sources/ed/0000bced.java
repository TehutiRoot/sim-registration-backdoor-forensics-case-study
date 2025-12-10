package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ly */
/* loaded from: classes5.dex */
public class C9570ly implements InterfaceC9502jq {
    private static int ThreeDS2Service = 1;
    private static int values;
    private final com.netcetera.threeds.sdk.api.p018ui.logic.TextBoxCustomization valueOf;

    public C9570ly(com.netcetera.threeds.sdk.api.p018ui.logic.TextBoxCustomization textBoxCustomization) {
        this.valueOf = textBoxCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9502jq
    public String ThreeDS2Service() {
        int i = values;
        int i2 = i & 113;
        ThreeDS2Service = (i2 + ((i ^ 113) | i2)) % 128;
        String borderColor = this.valueOf.getBorderColor();
        int i3 = values + 93;
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 != 0) {
            return borderColor;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public int ThreeDS2ServiceInstance() {
        int i = ThreeDS2Service;
        int i2 = ((i & 98) + (i | 98)) - 1;
        values = i2 % 128;
        int i3 = i2 % 2;
        com.netcetera.threeds.sdk.api.p018ui.logic.TextBoxCustomization textBoxCustomization = this.valueOf;
        if (i3 == 0) {
            return textBoxCustomization.getTextFontSize();
        }
        textBoxCustomization.getTextFontSize();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String get() {
        int i = values;
        int i2 = i & 103;
        int i3 = ((i ^ 103) | i2) << 1;
        int i4 = -((i | 103) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        ThreeDS2Service = i5 % 128;
        int i6 = i5 % 2;
        String textColor = this.valueOf.getTextColor();
        if (i6 == 0) {
            int i7 = 7 / 0;
        }
        values = (ThreeDS2Service + 39) % 128;
        return textColor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9502jq
    public int getWarnings() {
        int i = values;
        ThreeDS2Service = (((((i ^ 17) | (i & 17)) << 1) - (~(-(((~i) & 17) | (i & (-18)))))) - 1) % 128;
        int cornerRadius = this.valueOf.getCornerRadius();
        int i2 = values;
        int i3 = i2 & 9;
        int i4 = -(-((i2 ^ 9) | i3));
        ThreeDS2Service = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        return cornerRadius;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String valueOf() {
        int i = ThreeDS2Service;
        int i2 = (i & 124) + (i | 124);
        int i3 = (~i2) + (i2 << 1);
        values = i3 % 128;
        if (i3 % 2 == 0) {
            String textFontName = this.valueOf.getTextFontName();
            int i4 = ThreeDS2Service;
            int i5 = i4 & 73;
            int i6 = (i4 | 73) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            values = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 27 / 0;
            }
            return textFontName;
        }
        this.valueOf.getTextFontName();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9502jq
    public int values() {
        int i = values;
        int i2 = i & 99;
        int i3 = (i ^ 99) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        ThreeDS2Service = i4 % 128;
        int i5 = i4 % 2;
        com.netcetera.threeds.sdk.api.p018ui.logic.TextBoxCustomization textBoxCustomization = this.valueOf;
        if (i5 != 0) {
            return textBoxCustomization.getBorderWidth();
        }
        textBoxCustomization.getBorderWidth();
        throw null;
    }
}