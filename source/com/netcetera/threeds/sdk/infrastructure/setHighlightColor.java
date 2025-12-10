package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;
import java.security.KeyPair;
import java.security.PublicKey;

/* loaded from: classes5.dex */
public class setHighlightColor {
    private static int onCompleted = 1;
    private static int onError;
    private final String ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final String cleanup;
    private final String get;
    private final String getSDKInfo;
    private int getSDKVersion;
    private final PublicKey getWarnings;
    private final KeyPair initialize;
    private final String valueOf;
    private final setFastScrollEnabled.valueOf values;

    public setHighlightColor(com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters challengeParameters, setBreakStrategy setbreakstrategy, setFastScrollEnabled.valueOf valueof, KeyPair keyPair, int i, String str) {
        this.ThreeDS2ServiceInstance = challengeParameters.get3DSServerTransactionID();
        this.ThreeDS2Service = challengeParameters.getAcsTransactionID();
        this.valueOf = challengeParameters.getAcsRefNumber();
        this.get = setbreakstrategy.valueOf();
        this.getWarnings = setbreakstrategy.get();
        this.values = valueof;
        this.initialize = keyPair;
        this.getSDKVersion = i;
        this.getSDKInfo = str;
        this.cleanup = challengeParameters.getThreeDSRequestorAppURL();
    }

    public String ThreeDS2Service() {
        int i = onError;
        int i2 = ((i ^ 71) | (i & 71)) << 1;
        int i3 = -(((~i) & 71) | (i & (-72)));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        onCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return this.ThreeDS2ServiceInstance;
        }
        throw null;
    }

    public PublicKey ThreeDS2ServiceInstance() {
        int i = onCompleted;
        int i2 = i & 67;
        int i3 = ((i | 67) & (~i2)) + (i2 << 1);
        onError = i3 % 128;
        if (i3 % 2 == 0) {
            return this.getWarnings;
        }
        throw null;
    }

    public String cleanup() {
        int i = (onCompleted + 47) % 128;
        onError = i;
        String str = this.getSDKInfo;
        onCompleted = (((i & 16) + (i | 16)) - 1) % 128;
        return str;
    }

    public String get() {
        int i = onError;
        int i2 = i & 67;
        int i3 = (i | 67) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        onCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return this.ThreeDS2Service;
        }
        throw null;
    }

    public setFastScrollEnabled.valueOf getSDKInfo() {
        int i = onCompleted;
        int i2 = i & 95;
        int i3 = i2 + ((i ^ 95) | i2);
        onError = i3 % 128;
        if (i3 % 2 == 0) {
            return this.values;
        }
        throw null;
    }

    public String getSDKVersion() {
        int i = onError;
        int i2 = ~i;
        String str = this.cleanup;
        int i3 = ((i ^ 3) | (i & 3)) << 1;
        int i4 = -((i & (-4)) | (i2 & 3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        onCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public int getWarnings() {
        int i = onCompleted;
        int i2 = i & 93;
        int i3 = -(-(i | 93));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        onError = i4 % 128;
        if (i4 % 2 == 0) {
            return this.getSDKVersion;
        }
        throw null;
    }

    public void initialize() {
        int i = onCompleted;
        int i2 = i & 41;
        int i3 = (((i ^ 41) | i2) << 1) - ((i | 41) & (~i2));
        onError = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.getSDKVersion;
        if (i4 != 0) {
            this.getSDKVersion = i5 >>> 1;
            return;
        }
        int i6 = i5 & 1;
        int i7 = (i5 | 1) & (~i6);
        int i8 = -(-(i6 << 1));
        this.getSDKVersion = (i7 & i8) + (i7 | i8);
    }

    public String valueOf() {
        int i = onError;
        String str = this.get;
        int i2 = i ^ 11;
        onCompleted = ((((i & 11) | i2) << 1) - i2) % 128;
        return str;
    }

    public KeyPair values() {
        int i = onCompleted;
        KeyPair keyPair = this.initialize;
        onError = (((i | 125) << 1) - (i ^ 125)) % 128;
        return keyPair;
    }
}
