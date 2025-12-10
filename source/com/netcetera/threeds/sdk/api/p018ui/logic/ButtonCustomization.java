package com.netcetera.threeds.sdk.api.p018ui.logic;

import com.netcetera.threeds.sdk.api.exceptions.InvalidInputException;
import com.netcetera.threeds.sdk.infrastructure.C9621nj;
import java.io.Serializable;

/* renamed from: com.netcetera.threeds.sdk.api.ui.logic.ButtonCustomization */
/* loaded from: classes5.dex */
public final class ButtonCustomization extends Customization implements Serializable {
    private static int ThreeDS2Service = 0;
    private static int values = 1;
    private String ThreeDS2ServiceInstance;
    private int get;
    private String valueOf;

    public String getBackgroundColor() {
        int i = (ThreeDS2Service + 29) % 128;
        values = i;
        String str = this.ThreeDS2ServiceInstance;
        ThreeDS2Service = (i + 101) % 128;
        return str;
    }

    public int getCornerRadius() {
        int i;
        int i2 = values + 89;
        int i3 = i2 % 128;
        ThreeDS2Service = i3;
        if (i2 % 2 != 0) {
            i = this.get;
            int i4 = 22 / 0;
        } else {
            i = this.get;
        }
        values = (i3 + 125) % 128;
        return i;
    }

    @Deprecated
    public String getDarkBackgroundColor() {
        int i = (ThreeDS2Service + 29) % 128;
        values = i;
        String str = this.valueOf;
        ThreeDS2Service = (i + 31) % 128;
        return str;
    }

    public void setBackgroundColor(String str) throws InvalidInputException {
        int i = values + 29;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            C9621nj.ThreeDS2Service(str, "backgroundColor");
            this.ThreeDS2ServiceInstance = str;
            int i2 = 43 / 0;
        } else {
            C9621nj.ThreeDS2Service(str, "backgroundColor");
            this.ThreeDS2ServiceInstance = str;
        }
        ThreeDS2Service = (values + 119) % 128;
    }

    public void setCornerRadius(int i) throws InvalidInputException {
        int i2 = ThreeDS2Service + 119;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            C9621nj.ThreeDS2ServiceInstance(i, "cornerRadius");
            this.get = i;
            int i3 = 89 / 0;
            return;
        }
        C9621nj.ThreeDS2ServiceInstance(i, "cornerRadius");
        this.get = i;
    }

    @Deprecated
    public void setDarkBackgroundColor(String str) throws InvalidInputException {
        int i = ThreeDS2Service + 67;
        values = i % 128;
        if (i % 2 == 0) {
            C9621nj.ThreeDS2Service(str, "darkBackgroundColor");
            this.valueOf = str;
            int i2 = 86 / 0;
            return;
        }
        C9621nj.ThreeDS2Service(str, "darkBackgroundColor");
        this.valueOf = str;
    }
}
