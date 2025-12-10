package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class setDownloadListener {
    private static int ThreeDS2Service = 1;
    private static int ThreeDS2ServiceInstance;

    public boolean ThreeDS2ServiceInstance(setId setid) {
        boolean z;
        ThreeDS2Service = (ThreeDS2ServiceInstance + 53) % 128;
        if (setid.ThreeDS2Service() == setForegroundGravity.getWarnings) {
            int i = ThreeDS2Service;
            int i2 = (i & (-50)) | ((~i) & 49);
            int i3 = -(-((i & 49) << 1));
            ThreeDS2ServiceInstance = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
            z = true;
        } else {
            int i4 = ThreeDS2ServiceInstance;
            int i5 = i4 ^ 19;
            ThreeDS2Service = ((((i4 & 19) | i5) << 1) - i5) % 128;
            z = false;
        }
        int i6 = ThreeDS2Service;
        int i7 = i6 & 105;
        int i8 = ((((i6 ^ 105) | i7) << 1) - (~(-((i6 | 105) & (~i7))))) - 1;
        ThreeDS2ServiceInstance = i8 % 128;
        if (i8 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public String get(setLayoutTransition setlayouttransition) throws setId {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 5;
        ThreeDS2Service = (i2 + ((i ^ 5) | i2)) % 128;
        boolean values = setlayouttransition.values();
        String ThreeDS2ServiceInstance2 = setlayouttransition.ThreeDS2Service().ThreeDS2ServiceInstance();
        if (!values) {
            int i3 = ThreeDS2ServiceInstance;
            int i4 = i3 & 23;
            int i5 = i4 + ((i3 ^ 23) | i4);
            ThreeDS2Service = i5 % 128;
            if (i5 % 2 == 0) {
                throw setForegroundGravity.AuthenticationRequestParameters.valueOf(Integer.valueOf(setlayouttransition.valueOf()));
            }
            throw setForegroundGravity.AuthenticationRequestParameters.valueOf(Integer.valueOf(setlayouttransition.valueOf()));
        }
        int i6 = ThreeDS2Service;
        int i7 = (i6 | 113) << 1;
        int i8 = -(((~i6) & 113) | (i6 & (-114)));
        ThreeDS2ServiceInstance = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
        return ThreeDS2ServiceInstance2;
    }

    public boolean valueOf(setId setid) {
        boolean z;
        int i = ThreeDS2ServiceInstance;
        int i2 = i ^ 119;
        int i3 = (i & 119) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        ThreeDS2Service = i4 % 128;
        if (i4 % 2 != 0) {
            if (setid.ThreeDS2Service() == setForegroundGravity.getSDKVersion) {
                int i5 = ThreeDS2Service;
                ThreeDS2ServiceInstance = ((i5 ^ 101) + ((i5 & 101) << 1)) % 128;
                z = true;
            } else {
                int i6 = ThreeDS2ServiceInstance;
                int i7 = i6 & 13;
                ThreeDS2Service = (i7 + ((i6 ^ 13) | i7)) % 128;
                z = false;
            }
            int i8 = ThreeDS2ServiceInstance;
            int i9 = ((i8 ^ 4) + ((i8 & 4) << 1)) - 1;
            ThreeDS2Service = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 76 / 0;
            }
            return z;
        }
        setid.ThreeDS2Service();
        setForegroundGravity setforegroundgravity = setForegroundGravity.get;
        throw null;
    }
}