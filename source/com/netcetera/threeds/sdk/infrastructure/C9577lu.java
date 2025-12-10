package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.lu */
/* loaded from: classes5.dex */
public class C9577lu implements InterfaceC9512jp {
    private static int ThreeDS2Service = 0;
    private static int values = 1;
    private final com.netcetera.threeds.sdk.api.p018ui.logic.ToolbarCustomization valueOf;

    public C9577lu(com.netcetera.threeds.sdk.api.p018ui.logic.ToolbarCustomization toolbarCustomization) {
        this.valueOf = toolbarCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9512jp
    public String ThreeDS2Service() {
        int i = ThreeDS2Service;
        int i2 = i ^ 27;
        values = ((((i & 27) | i2) << 1) - i2) % 128;
        String headerText = this.valueOf.getHeaderText();
        int i3 = values;
        int i4 = i3 & 63;
        int i5 = -(-(i3 | 63));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        ThreeDS2Service = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 5 / 0;
        }
        return headerText;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public int ThreeDS2ServiceInstance() {
        int i = values;
        int i2 = i & 83;
        int i3 = (i ^ 83) | i2;
        ThreeDS2Service = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        int textFontSize = this.valueOf.getTextFontSize();
        int i4 = ThreeDS2Service;
        int i5 = i4 ^ 83;
        values = ((((i4 & 83) | i5) << 1) - i5) % 128;
        return textFontSize;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public String get() {
        ThreeDS2Service = (values + 41) % 128;
        String darkTextColor = this.valueOf.getDarkTextColor();
        int i = values;
        int i2 = ((i & 38) + (i | 38)) - 1;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            return darkTextColor;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9512jp
    public String getSDKInfo() {
        int i = ThreeDS2Service;
        int i2 = i & 33;
        int i3 = -(-(i | 33));
        values = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        String darkBackgroundColor = this.valueOf.getDarkBackgroundColor();
        int i4 = ThreeDS2Service;
        int i5 = i4 & 67;
        int i6 = (((i4 ^ 67) | i5) << 1) - ((i4 | 67) & (~i5));
        values = i6 % 128;
        if (i6 % 2 != 0) {
            return darkBackgroundColor;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public String valueOf() {
        int i = ThreeDS2Service;
        int i2 = ((i | 25) << 1) - (i ^ 25);
        values = i2 % 128;
        int i3 = i2 % 2;
        String textFontName = this.valueOf.getTextFontName();
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        int i5 = ThreeDS2Service;
        int i6 = i5 & 57;
        int i7 = (i5 | 57) & (~i6);
        int i8 = -(-(i6 << 1));
        values = ((i7 & i8) + (i7 | i8)) % 128;
        return textFontName;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9512jp
    public String values() {
        int i = ThreeDS2Service;
        values = (((i & (-60)) | ((~i) & 59)) + ((i & 59) << 1)) % 128;
        String buttonText = this.valueOf.getButtonText();
        int i2 = values;
        int i3 = i2 & 9;
        ThreeDS2Service = (i3 + ((i2 ^ 9) | i3)) % 128;
        return buttonText;
    }
}
