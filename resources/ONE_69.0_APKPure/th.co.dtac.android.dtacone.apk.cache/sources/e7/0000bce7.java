package com.netcetera.threeds.sdk.infrastructure;

import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ls */
/* loaded from: classes5.dex */
public class C9564ls implements InterfaceC9502jq {
    private static int ThreeDS2Service = 1;
    private static int values;
    private final com.netcetera.threeds.sdk.api.p018ui.logic.TextBoxCustomization get;

    public C9564ls(com.netcetera.threeds.sdk.api.p018ui.logic.TextBoxCustomization textBoxCustomization) {
        this.get = textBoxCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9502jq
    public String ThreeDS2Service() {
        int i = ThreeDS2Service;
        int i2 = i & 75;
        values = (((i | 75) & (~i2)) + (i2 << 1)) % 128;
        String darkBorderColor = this.get.getDarkBorderColor();
        int i3 = values;
        int i4 = i3 & 79;
        int i5 = (i3 ^ 79) | i4;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        ThreeDS2Service = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 81 / 0;
        }
        return darkBorderColor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public int ThreeDS2ServiceInstance() {
        int i = values;
        int i2 = i & CameraActivity.REQUEST_CODE;
        int i3 = i2 + ((i ^ CameraActivity.REQUEST_CODE) | i2);
        ThreeDS2Service = i3 % 128;
        int i4 = i3 % 2;
        com.netcetera.threeds.sdk.api.p018ui.logic.TextBoxCustomization textBoxCustomization = this.get;
        if (i4 != 0) {
            int textFontSize = textBoxCustomization.getTextFontSize();
            int i5 = values;
            int i6 = i5 & 103;
            int i7 = i5 | 103;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            ThreeDS2Service = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 94 / 0;
            }
            return textFontSize;
        }
        textBoxCustomization.getTextFontSize();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String get() {
        int i = ThreeDS2Service;
        int i2 = i & 1;
        int i3 = (i | 1) & (~i2);
        int i4 = -(-(i2 << 1));
        values = ((i3 & i4) + (i3 | i4)) % 128;
        String darkTextColor = this.get.getDarkTextColor();
        int i5 = ThreeDS2Service;
        values = (((((i5 ^ 55) | (i5 & 55)) << 1) - (~(-(((~i5) & 55) | (i5 & (-56)))))) - 1) % 128;
        return darkTextColor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9502jq
    public int getWarnings() {
        int i = ThreeDS2Service;
        int i2 = (i & (-74)) | ((~i) & 73);
        int i3 = (i & 73) << 1;
        values = ((i2 & i3) + (i3 | i2)) % 128;
        int cornerRadius = this.get.getCornerRadius();
        ThreeDS2Service = (values + 25) % 128;
        return cornerRadius;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String valueOf() {
        int i = ThreeDS2Service;
        int i2 = (((i | 92) << 1) - (i ^ 92)) - 1;
        values = i2 % 128;
        int i3 = i2 % 2;
        com.netcetera.threeds.sdk.api.p018ui.logic.TextBoxCustomization textBoxCustomization = this.get;
        if (i3 == 0) {
            String textFontName = textBoxCustomization.getTextFontName();
            int i4 = values;
            int i5 = i4 & 21;
            int i6 = i4 | 21;
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            ThreeDS2Service = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 58 / 0;
            }
            return textFontName;
        }
        textBoxCustomization.getTextFontName();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9502jq
    public int values() {
        int i = ThreeDS2Service;
        values = (((i & 18) + (i | 18)) - 1) % 128;
        int borderWidth = this.get.getBorderWidth();
        int i2 = values;
        int i3 = (i2 & (-14)) | ((~i2) & 13);
        int i4 = (i2 & 13) << 1;
        ThreeDS2Service = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        return borderWidth;
    }
}