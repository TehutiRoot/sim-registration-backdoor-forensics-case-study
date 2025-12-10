package com.netcetera.threeds.sdk.api.transaction.challenge;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public class ErrorMessage {
    private static int cleanup = 1;
    private static int getSDKVersion;
    private final String ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final String get;
    private final String getSDKInfo;
    private final String initialize;
    private final String valueOf;
    private final String values;

    public ErrorMessage(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.values = str;
        this.get = str2;
        this.ThreeDS2ServiceInstance = str3;
        this.valueOf = str4;
        this.ThreeDS2Service = str5;
        this.initialize = str6;
        this.getSDKInfo = str7;
    }

    public String getErrorCode() {
        int i = getSDKVersion;
        String str = this.get;
        int i2 = i + 69;
        cleanup = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 89 / 0;
        }
        return str;
    }

    public String getErrorComponent() {
        int i = cleanup;
        String str = this.ThreeDS2Service;
        getSDKVersion = (i + 11) % 128;
        return str;
    }

    public String getErrorDescription() {
        int i = cleanup + 63;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            int i2 = 60 / 0;
            return this.ThreeDS2ServiceInstance;
        }
        return this.ThreeDS2ServiceInstance;
    }

    public String getErrorDetails() {
        int i = cleanup + 87;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            return this.valueOf;
        }
        throw null;
    }

    public String getErrorMessageType() {
        int i = getSDKVersion + 35;
        int i2 = i % 128;
        cleanup = i2;
        if (i % 2 != 0) {
            String str = this.initialize;
            int i3 = i2 + 5;
            getSDKVersion = i3 % 128;
            if (i3 % 2 == 0) {
                return str;
            }
            throw null;
        }
        throw null;
    }

    public String getMessageVersionNumber() {
        int i = cleanup + 113;
        int i2 = i % 128;
        getSDKVersion = i2;
        if (i % 2 == 0) {
            String str = this.getSDKInfo;
            int i3 = i2 + 13;
            cleanup = i3 % 128;
            if (i3 % 2 != 0) {
                return str;
            }
            throw null;
        }
        throw null;
    }

    public String getTransactionID() {
        int i = getSDKVersion;
        String str = this.values;
        cleanup = (i + 11) % 128;
        return str;
    }

    public String toString() {
        String str = "ErrorMessage{transactionID='" + this.values + CoreConstants.SINGLE_QUOTE_CHAR + "\n, errorCode='" + this.get + CoreConstants.SINGLE_QUOTE_CHAR + "\n, errorDescription='" + this.ThreeDS2ServiceInstance + CoreConstants.SINGLE_QUOTE_CHAR + "\n, errorDetail='" + this.valueOf + CoreConstants.SINGLE_QUOTE_CHAR + "\n, errorComponent='" + this.ThreeDS2Service + CoreConstants.SINGLE_QUOTE_CHAR + "\n, errorMessageType='" + this.initialize + CoreConstants.SINGLE_QUOTE_CHAR + "\n, messageVersionNumber='" + this.getSDKInfo + CoreConstants.SINGLE_QUOTE_CHAR + '}';
        cleanup = (getSDKVersion + 81) % 128;
        return str;
    }
}