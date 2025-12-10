package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.lm */
/* loaded from: classes5.dex */
public class C9568lm implements InterfaceC9511jo {
    private static int ThreeDS2Service = 1;
    private static int values;
    private final com.netcetera.threeds.sdk.api.p018ui.logic.LabelCustomization ThreeDS2ServiceInstance;

    public C9568lm(com.netcetera.threeds.sdk.api.p018ui.logic.LabelCustomization labelCustomization) {
        this.ThreeDS2ServiceInstance = labelCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9511jo
    public int ThreeDS2Service() {
        int i = ThreeDS2Service;
        int i2 = (i ^ 70) + ((i & 70) << 1);
        values = ((~i2) + (i2 << 1)) % 128;
        int headingTextFontSize = this.ThreeDS2ServiceInstance.getHeadingTextFontSize();
        int i3 = values + 113;
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 59 / 0;
        }
        return headingTextFontSize;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public int ThreeDS2ServiceInstance() {
        ThreeDS2Service = (values + 3) % 128;
        int textFontSize = this.ThreeDS2ServiceInstance.getTextFontSize();
        int i = ThreeDS2Service;
        int i2 = (i ^ 29) + ((i & 29) << 1);
        values = i2 % 128;
        if (i2 % 2 == 0) {
            return textFontSize;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public String get() {
        int i = values;
        int i2 = i & 21;
        int i3 = i2 + ((i ^ 21) | i2);
        ThreeDS2Service = i3 % 128;
        int i4 = i3 % 2;
        com.netcetera.threeds.sdk.api.p018ui.logic.LabelCustomization labelCustomization = this.ThreeDS2ServiceInstance;
        if (i4 != 0) {
            String darkTextColor = labelCustomization.getDarkTextColor();
            int i5 = values + 3;
            ThreeDS2Service = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 22 / 0;
            }
            return darkTextColor;
        }
        labelCustomization.getDarkTextColor();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public String valueOf() {
        int i = values;
        int i2 = i & 27;
        int i3 = -(-(i | 27));
        ThreeDS2Service = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        String textFontName = this.ThreeDS2ServiceInstance.getTextFontName();
        ThreeDS2Service = (values + 25) % 128;
        return textFontName;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9511jo
    public String values() {
        int i = ThreeDS2Service;
        int i2 = i & 37;
        int i3 = i2 + ((i ^ 37) | i2);
        values = i3 % 128;
        int i4 = i3 % 2;
        com.netcetera.threeds.sdk.api.p018ui.logic.LabelCustomization labelCustomization = this.ThreeDS2ServiceInstance;
        if (i4 == 0) {
            return labelCustomization.getHeadingDarkTextColor();
        }
        labelCustomization.getHeadingDarkTextColor();
        throw null;
    }
}
