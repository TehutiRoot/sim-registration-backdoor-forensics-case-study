package com.netcetera.threeds.sdk.api.p018ui.logic;

import com.netcetera.threeds.sdk.api.exceptions.InvalidInputException;
import com.netcetera.threeds.sdk.infrastructure.C9621nj;
import java.io.Serializable;

/* renamed from: com.netcetera.threeds.sdk.api.ui.logic.TextBoxCustomization */
/* loaded from: classes5.dex */
public final class TextBoxCustomization extends Customization implements Serializable {
    private static int ThreeDS2ServiceInstance = 0;
    private static int cleanup = 1;
    private int ThreeDS2Service;
    private int get;
    private String valueOf;
    private String values;

    public String getBorderColor() {
        int i = ThreeDS2ServiceInstance;
        String str = this.values;
        cleanup = (i + 59) % 128;
        return str;
    }

    public int getBorderWidth() {
        int i = cleanup + 119;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            int i2 = 61 / 0;
            return this.ThreeDS2Service;
        }
        return this.ThreeDS2Service;
    }

    public int getCornerRadius() {
        int i = ThreeDS2ServiceInstance;
        int i2 = this.get;
        cleanup = (i + 85) % 128;
        return i2;
    }

    @Deprecated
    public String getDarkBorderColor() {
        int i = ThreeDS2ServiceInstance;
        String str = this.valueOf;
        int i2 = i + 87;
        cleanup = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setBorderColor(String str) throws InvalidInputException {
        int i = ThreeDS2ServiceInstance + 61;
        cleanup = i % 128;
        if (i % 2 == 0) {
            C9621nj.ThreeDS2Service(str, "borderColor");
            this.values = str;
            int i2 = 66 / 0;
            return;
        }
        C9621nj.ThreeDS2Service(str, "borderColor");
        this.values = str;
    }

    public void setBorderWidth(int i) throws InvalidInputException {
        ThreeDS2ServiceInstance = (cleanup + 73) % 128;
        C9621nj.valueOf(i, "borderWidth");
        this.ThreeDS2Service = i;
        cleanup = (ThreeDS2ServiceInstance + 111) % 128;
    }

    public void setCornerRadius(int i) throws InvalidInputException {
        ThreeDS2ServiceInstance = (cleanup + 63) % 128;
        C9621nj.valueOf(i, "cornerRadius");
        this.get = i;
        int i2 = cleanup + 35;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 74 / 0;
        }
    }

    @Deprecated
    public void setDarkBorderColor(String str) throws InvalidInputException {
        ThreeDS2ServiceInstance = (cleanup + 33) % 128;
        C9621nj.ThreeDS2Service(str, "darkBorderColor");
        this.valueOf = str;
        int i = ThreeDS2ServiceInstance + 57;
        cleanup = i % 128;
        if (i % 2 != 0) {
            return;
        }
        throw null;
    }
}
