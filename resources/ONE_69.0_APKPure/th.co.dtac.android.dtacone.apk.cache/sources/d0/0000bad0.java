package com.netcetera.threeds.sdk.api.p018ui.logic;

import com.netcetera.threeds.sdk.api.exceptions.InvalidInputException;
import com.netcetera.threeds.sdk.infrastructure.C9610nj;
import java.io.Serializable;

/* renamed from: com.netcetera.threeds.sdk.api.ui.logic.ViewCustomization */
/* loaded from: classes5.dex */
public class ViewCustomization implements Serializable {
    private static int ThreeDS2ServiceInstance = 1;
    private static int get;
    private String ThreeDS2Service;
    private String values;

    public String getChallengeViewBackgroundColor() {
        int i = get + 53;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            int i2 = 45 / 0;
            return this.ThreeDS2Service;
        }
        return this.ThreeDS2Service;
    }

    public String getProgressViewBackgroundColor() {
        String str;
        int i = ThreeDS2ServiceInstance;
        int i2 = i + 111;
        get = i2 % 128;
        if (i2 % 2 != 0) {
            str = this.values;
            int i3 = 47 / 0;
        } else {
            str = this.values;
        }
        int i4 = i + 69;
        get = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return str;
    }

    public void setChallengeViewBackgroundColor(String str) throws InvalidInputException {
        ThreeDS2ServiceInstance = (get + 19) % 128;
        C9610nj.ThreeDS2Service(str, "challengeViewBackgroundColor");
        this.ThreeDS2Service = str;
        get = (ThreeDS2ServiceInstance + 41) % 128;
    }

    public void setProgressViewBackgroundColor(String str) throws InvalidInputException {
        get = (ThreeDS2ServiceInstance + 29) % 128;
        C9610nj.ThreeDS2Service(str, "progressViewBackgroundColor");
        this.values = str;
        int i = ThreeDS2ServiceInstance + 37;
        get = i % 128;
        if (i % 2 != 0) {
            int i2 = 8 / 0;
        }
    }
}