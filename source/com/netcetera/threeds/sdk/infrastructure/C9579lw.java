package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.lw */
/* loaded from: classes5.dex */
public class C9579lw implements InterfaceC9512jp {
    private static int ThreeDS2ServiceInstance = 1;
    private static int values;
    private final com.netcetera.threeds.sdk.api.p018ui.logic.ToolbarCustomization get;

    public C9579lw(com.netcetera.threeds.sdk.api.p018ui.logic.ToolbarCustomization toolbarCustomization) {
        this.get = toolbarCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9512jp
    public String ThreeDS2Service() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 25;
        int i3 = (i | 25) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        values = i5 % 128;
        int i6 = i5 % 2;
        String headerText = this.get.getHeaderText();
        if (i6 != 0) {
            int i7 = 51 / 0;
        }
        return headerText;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public int ThreeDS2ServiceInstance() {
        int i = values;
        int i2 = i & 117;
        ThreeDS2ServiceInstance = ((((i ^ 117) | i2) << 1) - ((i | 117) & (~i2))) % 128;
        int textFontSize = this.get.getTextFontSize();
        int i3 = ThreeDS2ServiceInstance;
        int i4 = i3 & 67;
        int i5 = (i3 | 67) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 & i6) + (i5 | i6);
        values = i7 % 128;
        if (i7 % 2 == 0) {
            return textFontSize;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public String get() {
        values = (ThreeDS2ServiceInstance + 101) % 128;
        String textColor = this.get.getTextColor();
        int i = values;
        int i2 = i & 63;
        int i3 = (i ^ 63) | i2;
        ThreeDS2ServiceInstance = ((i2 & i3) + (i3 | i2)) % 128;
        return textColor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9512jp
    public String getSDKInfo() {
        int i = values;
        int i2 = (((i | 25) << 1) - (~(-(((~i) & 25) | (i & (-26)))))) - 1;
        ThreeDS2ServiceInstance = i2 % 128;
        int i3 = i2 % 2;
        com.netcetera.threeds.sdk.api.p018ui.logic.ToolbarCustomization toolbarCustomization = this.get;
        if (i3 != 0) {
            return toolbarCustomization.getBackgroundColor();
        }
        toolbarCustomization.getBackgroundColor();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public String valueOf() {
        int i = ThreeDS2ServiceInstance;
        int i2 = ((i | 41) << 1) - (i ^ 41);
        values = i2 % 128;
        int i3 = i2 % 2;
        com.netcetera.threeds.sdk.api.p018ui.logic.ToolbarCustomization toolbarCustomization = this.get;
        if (i3 == 0) {
            return toolbarCustomization.getTextFontName();
        }
        toolbarCustomization.getTextFontName();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9512jp
    public String values() {
        values = (ThreeDS2ServiceInstance + 103) % 128;
        String buttonText = this.get.getButtonText();
        int i = values;
        int i2 = i ^ 7;
        int i3 = (i & 7) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ThreeDS2ServiceInstance = i4 % 128;
        if (i4 % 2 != 0) {
            return buttonText;
        }
        throw null;
    }
}
