package com.netcetera.threeds.sdk.api.p018ui.logic;

import com.netcetera.threeds.sdk.api.exceptions.InvalidInputException;
import com.netcetera.threeds.sdk.infrastructure.C9621nj;
import java.io.Serializable;

/* renamed from: com.netcetera.threeds.sdk.api.ui.logic.ToolbarCustomization */
/* loaded from: classes5.dex */
public final class ToolbarCustomization extends Customization implements Serializable {
    private static int getSDKVersion = 1;
    private static int values;
    private String ThreeDS2Service;
    private String ThreeDS2ServiceInstance;
    private String get;
    private String valueOf;

    public String getBackgroundColor() {
        int i = values + 7;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            return this.get;
        }
        throw null;
    }

    public String getButtonText() {
        int i = values;
        String str = this.ThreeDS2ServiceInstance;
        int i2 = i + 49;
        getSDKVersion = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 73 / 0;
        }
        return str;
    }

    @Deprecated
    public String getDarkBackgroundColor() {
        int i = (values + 37) % 128;
        getSDKVersion = i;
        String str = this.ThreeDS2Service;
        int i2 = i + 9;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String getHeaderText() {
        int i = (getSDKVersion + 37) % 128;
        values = i;
        String str = this.valueOf;
        getSDKVersion = (i + 97) % 128;
        return str;
    }

    public void setBackgroundColor(String str) throws InvalidInputException {
        getSDKVersion = (values + 49) % 128;
        C9621nj.ThreeDS2Service(str, "hexColorCode");
        this.get = str;
        values = (getSDKVersion + 91) % 128;
    }

    public void setButtonText(String str) throws InvalidInputException {
        getSDKVersion = (values + 67) % 128;
        C9621nj.ThreeDS2ServiceInstance(str, "buttonText");
        this.ThreeDS2ServiceInstance = str;
        int i = getSDKVersion + 69;
        values = i % 128;
        if (i % 2 == 0) {
            return;
        }
        throw null;
    }

    @Deprecated
    public void setDarkBackgroundColor(String str) throws InvalidInputException {
        int i = getSDKVersion + 5;
        values = i % 128;
        if (i % 2 != 0) {
            C9621nj.ThreeDS2Service(str, "darkHexColorCode");
            this.ThreeDS2Service = str;
            int i2 = 64 / 0;
            return;
        }
        C9621nj.ThreeDS2Service(str, "darkHexColorCode");
        this.ThreeDS2Service = str;
    }

    public void setHeaderText(String str) throws InvalidInputException {
        int i = values + 49;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            C9621nj.ThreeDS2ServiceInstance(str, "headerText");
            this.valueOf = str;
            return;
        }
        C9621nj.ThreeDS2ServiceInstance(str, "headerText");
        this.valueOf = str;
        throw null;
    }
}
