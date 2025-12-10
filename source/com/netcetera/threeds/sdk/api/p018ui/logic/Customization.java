package com.netcetera.threeds.sdk.api.p018ui.logic;

import com.netcetera.threeds.sdk.api.exceptions.InvalidInputException;
import com.netcetera.threeds.sdk.infrastructure.C9621nj;
import java.io.Serializable;

/* renamed from: com.netcetera.threeds.sdk.api.ui.logic.Customization */
/* loaded from: classes5.dex */
public abstract class Customization implements Serializable {
    private static int ThreeDS2ServiceInstance = 0;
    private static int cleanup = 1;
    private String ThreeDS2Service;
    private String get;
    private int valueOf;
    private String values;

    @Deprecated
    public String getDarkTextColor() {
        int i = ThreeDS2ServiceInstance + 5;
        int i2 = i % 128;
        cleanup = i2;
        if (i % 2 != 0) {
            String str = this.ThreeDS2Service;
            ThreeDS2ServiceInstance = (i2 + 83) % 128;
            return str;
        }
        throw null;
    }

    public String getTextColor() {
        int i = (cleanup + 45) % 128;
        ThreeDS2ServiceInstance = i;
        String str = this.values;
        cleanup = (i + 17) % 128;
        return str;
    }

    public String getTextFontName() {
        int i = cleanup;
        String str = this.get;
        ThreeDS2ServiceInstance = (i + 37) % 128;
        return str;
    }

    public int getTextFontSize() {
        int i = ThreeDS2ServiceInstance + 15;
        cleanup = i % 128;
        if (i % 2 != 0) {
            return this.valueOf;
        }
        throw null;
    }

    @Deprecated
    public void setDarkTextColor(String str) throws InvalidInputException {
        ThreeDS2ServiceInstance = (cleanup + 97) % 128;
        C9621nj.ThreeDS2Service(str, "darkTextColor");
        this.ThreeDS2Service = str;
        cleanup = (ThreeDS2ServiceInstance + 5) % 128;
    }

    public void setTextColor(String str) throws InvalidInputException {
        ThreeDS2ServiceInstance = (cleanup + 79) % 128;
        C9621nj.ThreeDS2Service(str, "hexColorCode");
        this.values = str;
        cleanup = (ThreeDS2ServiceInstance + 33) % 128;
    }

    public void setTextFontName(String str) throws InvalidInputException {
        int i = ThreeDS2ServiceInstance + 119;
        cleanup = i % 128;
        if (i % 2 != 0) {
            C9621nj.ThreeDS2ServiceInstance(str, "textFontName");
            this.get = str;
            return;
        }
        C9621nj.ThreeDS2ServiceInstance(str, "textFontName");
        this.get = str;
        throw null;
    }

    public void setTextFontSize(int i) throws InvalidInputException {
        int i2 = ThreeDS2ServiceInstance + 97;
        cleanup = i2 % 128;
        if (i2 % 2 != 0) {
            C9621nj.valueOf(i, "textFontSize");
            this.valueOf = i;
            return;
        }
        C9621nj.valueOf(i, "textFontSize");
        this.valueOf = i;
        throw null;
    }
}
