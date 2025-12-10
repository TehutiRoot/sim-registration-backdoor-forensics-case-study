package com.netcetera.threeds.sdk.api.p018ui.logic;

import com.netcetera.threeds.sdk.api.exceptions.InvalidInputException;
import com.netcetera.threeds.sdk.infrastructure.C9621nj;
import java.io.Serializable;

/* renamed from: com.netcetera.threeds.sdk.api.ui.logic.LabelCustomization */
/* loaded from: classes5.dex */
public final class LabelCustomization extends Customization implements Serializable {
    private static int ThreeDS2ServiceInstance = 0;
    private static int getWarnings = 1;
    private String ThreeDS2Service;
    private int get;
    private String valueOf;
    private String values;

    @Deprecated
    public String getHeadingDarkTextColor() {
        int i = ThreeDS2ServiceInstance + 45;
        int i2 = i % 128;
        getWarnings = i2;
        if (i % 2 != 0) {
            String str = this.valueOf;
            ThreeDS2ServiceInstance = (i2 + 115) % 128;
            return str;
        }
        throw null;
    }

    public String getHeadingTextColor() {
        int i = ThreeDS2ServiceInstance;
        String str = this.values;
        int i2 = i + 45;
        getWarnings = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String getHeadingTextFontName() {
        String str;
        int i = ThreeDS2ServiceInstance + 23;
        int i2 = i % 128;
        getWarnings = i2;
        if (i % 2 == 0) {
            str = this.ThreeDS2Service;
            int i3 = 28 / 0;
        } else {
            str = this.ThreeDS2Service;
        }
        int i4 = i2 + 53;
        ThreeDS2ServiceInstance = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public int getHeadingTextFontSize() {
        int i = ThreeDS2ServiceInstance;
        int i2 = this.get;
        getWarnings = (i + 99) % 128;
        return i2;
    }

    @Deprecated
    public void setHeadingDarkTextColor(String str) throws InvalidInputException {
        int i = getWarnings + 35;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            C9621nj.ThreeDS2Service(str, "darkHeadingTextColor");
            this.valueOf = str;
            int i2 = ThreeDS2ServiceInstance + 113;
            getWarnings = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 43 / 0;
                return;
            }
            return;
        }
        C9621nj.ThreeDS2Service(str, "darkHeadingTextColor");
        this.valueOf = str;
        throw null;
    }

    public void setHeadingTextColor(String str) throws InvalidInputException {
        ThreeDS2ServiceInstance = (getWarnings + 27) % 128;
        C9621nj.ThreeDS2Service(str, "hexColorCode");
        this.values = str;
        ThreeDS2ServiceInstance = (getWarnings + 109) % 128;
    }

    public void setHeadingTextFontName(String str) throws InvalidInputException {
        getWarnings = (ThreeDS2ServiceInstance + 41) % 128;
        C9621nj.ThreeDS2ServiceInstance(str, "headingTextFontName");
        this.ThreeDS2Service = str;
        int i = ThreeDS2ServiceInstance + 31;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            int i2 = 57 / 0;
        }
    }

    public void setHeadingTextFontSize(int i) throws InvalidInputException {
        int i2 = ThreeDS2ServiceInstance + 29;
        getWarnings = i2 % 128;
        if (i2 % 2 != 0) {
            C9621nj.valueOf(i, "headingTextFontSize");
            this.get = i;
            int i3 = getWarnings + 47;
            ThreeDS2ServiceInstance = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            throw null;
        }
        C9621nj.valueOf(i, "headingTextFontSize");
        this.get = i;
        throw null;
    }
}
