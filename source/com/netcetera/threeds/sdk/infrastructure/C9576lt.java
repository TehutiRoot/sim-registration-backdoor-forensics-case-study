package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.lt */
/* loaded from: classes5.dex */
public class C9576lt implements InterfaceC9511jo {
    private static int valueOf = 1;
    private static int values;
    private final com.netcetera.threeds.sdk.api.p018ui.logic.LabelCustomization ThreeDS2ServiceInstance;

    public C9576lt(com.netcetera.threeds.sdk.api.p018ui.logic.LabelCustomization labelCustomization) {
        this.ThreeDS2ServiceInstance = labelCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9511jo
    public int ThreeDS2Service() {
        int i = values;
        int i2 = ((i ^ 17) | (i & 17)) << 1;
        int i3 = -(((~i) & 17) | (i & (-18)));
        valueOf = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        int headingTextFontSize = this.ThreeDS2ServiceInstance.getHeadingTextFontSize();
        int i4 = values + 117;
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return headingTextFontSize;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public int ThreeDS2ServiceInstance() {
        int i = values;
        valueOf = (((i | 53) << 1) - (i ^ 53)) % 128;
        int textFontSize = this.ThreeDS2ServiceInstance.getTextFontSize();
        int i2 = values;
        int i3 = ((i2 | 31) << 1) - (i2 ^ 31);
        valueOf = i3 % 128;
        if (i3 % 2 != 0) {
            return textFontSize;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public String get() {
        int i = valueOf;
        int i2 = ((i & (-98)) | ((~i) & 97)) + ((i & 97) << 1);
        values = i2 % 128;
        if (i2 % 2 == 0) {
            String textColor = this.ThreeDS2ServiceInstance.getTextColor();
            int i3 = valueOf;
            int i4 = (i3 ^ 121) + ((i3 & 121) << 1);
            values = i4 % 128;
            if (i4 % 2 == 0) {
                return textColor;
            }
            throw null;
        }
        this.ThreeDS2ServiceInstance.getTextColor();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public String valueOf() {
        int i = values;
        int i2 = i & 9;
        valueOf = (i2 + ((i ^ 9) | i2)) % 128;
        String textFontName = this.ThreeDS2ServiceInstance.getTextFontName();
        int i3 = values;
        int i4 = (i3 & (-24)) | ((~i3) & 23);
        int i5 = -(-((i3 & 23) << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        valueOf = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 34 / 0;
        }
        return textFontName;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9511jo
    public String values() {
        int i = valueOf;
        values = (((i | 5) << 1) - (i ^ 5)) % 128;
        String headingTextColor = this.ThreeDS2ServiceInstance.getHeadingTextColor();
        int i2 = values;
        valueOf = (((i2 & 38) + (i2 | 38)) - 1) % 128;
        return headingTextColor;
    }
}
