package com.netcetera.threeds.sdk.api.transaction.challenge;

import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class ChallengeParameters {
    private static int getSDKVersion = 1;
    private static int initialize;
    private String ThreeDS2Service;
    private String ThreeDS2ServiceInstance;
    private String get;
    private String valueOf;
    private String values;

    public String get3DSServerTransactionID() {
        int i = getSDKVersion + 11;
        int i2 = i % 128;
        initialize = i2;
        if (i % 2 == 0) {
            String str = this.valueOf;
            getSDKVersion = (i2 + 39) % 128;
            return str;
        }
        throw null;
    }

    public String getAcsRefNumber() {
        int i = (getSDKVersion + 5) % 128;
        initialize = i;
        String str = this.ThreeDS2ServiceInstance;
        getSDKVersion = (i + 79) % 128;
        return str;
    }

    public String getAcsSignedContent() {
        int i = initialize + CameraActivity.REQUEST_CODE;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            return this.get;
        }
        throw null;
    }

    public String getAcsTransactionID() {
        String str;
        int i = initialize + 91;
        int i2 = i % 128;
        getSDKVersion = i2;
        if (i % 2 == 0) {
            str = this.ThreeDS2Service;
            int i3 = 34 / 0;
        } else {
            str = this.ThreeDS2Service;
        }
        initialize = (i2 + 65) % 128;
        return str;
    }

    public String getThreeDSRequestorAppURL() {
        int i = getSDKVersion + 29;
        int i2 = i % 128;
        initialize = i2;
        if (i % 2 == 0) {
            String str = this.values;
            getSDKVersion = (i2 + 15) % 128;
            return str;
        }
        throw null;
    }

    public void set3DSServerTransactionID(String str) {
        int i = (initialize + 95) % 128;
        getSDKVersion = i;
        this.valueOf = str;
        int i2 = i + 51;
        initialize = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        throw null;
    }

    public void setAcsRefNumber(String str) {
        int i = initialize;
        int i2 = i + 55;
        getSDKVersion = i2 % 128;
        int i3 = i2 % 2;
        this.ThreeDS2ServiceInstance = str;
        if (i3 != 0) {
            int i4 = i + 71;
            getSDKVersion = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            throw null;
        }
        throw null;
    }

    public void setAcsSignedContent(String str) {
        int i = initialize + 11;
        getSDKVersion = i % 128;
        int i2 = i % 2;
        this.get = str;
        if (i2 != 0) {
            return;
        }
        throw null;
    }

    public void setAcsTransactionID(String str) {
        int i = (getSDKVersion + 125) % 128;
        initialize = i;
        this.ThreeDS2Service = str;
        getSDKVersion = (i + 101) % 128;
    }

    public void setThreeDSRequestorAppURL(String str) {
        int i = initialize + 73;
        getSDKVersion = i % 128;
        int i2 = i % 2;
        this.values = str;
        if (i2 != 0) {
            return;
        }
        throw null;
    }
}
