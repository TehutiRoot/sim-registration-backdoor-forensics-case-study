package com.netcetera.threeds.sdk.infrastructure;

import okhttp3.internal.p026ws.WebSocketProtocol;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class setItemsCanFocus {
    private static int getSDKInfo = 1;
    private static int initialize;
    private final setHorizontalGravity ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final String get;
    private final String getWarnings;
    private final String valueOf;
    private final String values;

    public String ThreeDS2Service() {
        int i = getSDKInfo;
        String str = this.get;
        int i2 = i + 11;
        initialize = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public setHorizontalGravity ThreeDS2ServiceInstance() {
        int i = initialize;
        int i2 = i & 79;
        int i3 = -(-((i ^ 79) | i2));
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        getSDKInfo = i4;
        setHorizontalGravity sethorizontalgravity = this.ThreeDS2Service;
        int i5 = i4 & 107;
        int i6 = i4 | 107;
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        initialize = i7 % 128;
        if (i7 % 2 == 0) {
            return sethorizontalgravity;
        }
        throw null;
    }

    public String get() {
        String str;
        int i = initialize;
        int i2 = (i ^ 27) + ((i & 27) << 1);
        int i3 = i2 % 128;
        getSDKInfo = i3;
        if (i2 % 2 == 0) {
            str = this.values;
            int i4 = 56 / 0;
        } else {
            str = this.values;
        }
        int i5 = i3 ^ 97;
        int i6 = -(-((i3 & 97) << 1));
        initialize = ((i5 & i6) + (i6 | i5)) % 128;
        return str;
    }

    public String initialize() {
        int i = getSDKInfo;
        int i2 = ((i ^ 109) | (i & 109)) << 1;
        int i3 = -(((~i) & 109) | (i & (-110)));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        initialize = i4;
        String str = this.getWarnings;
        getSDKInfo = (i4 + 91) % 128;
        return str;
    }

    public String valueOf() {
        String str;
        int i = initialize + 83;
        int i2 = i % 128;
        getSDKInfo = i2;
        if (i % 2 == 0) {
            str = this.valueOf;
            int i3 = 13 / 0;
        } else {
            str = this.valueOf;
        }
        int i4 = ((i2 ^ 45) | (i2 & 45)) << 1;
        int i5 = -(((~i2) & 45) | (i2 & (-46)));
        initialize = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
        return str;
    }

    public String values() {
        int i = initialize;
        int i2 = i & 63;
        int i3 = (i ^ 63) | i2;
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        getSDKInfo = i4;
        String str = this.ThreeDS2ServiceInstance;
        int i5 = (i4 ^ WebSocketProtocol.PAYLOAD_SHORT) + ((i4 & WebSocketProtocol.PAYLOAD_SHORT) << 1);
        int i6 = (~i5) + (i5 << 1);
        initialize = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 89 / 0;
        }
        return str;
    }

    private setItemsCanFocus(String str, String str2, String str3, String str4, setHorizontalGravity sethorizontalgravity, String str5) {
        this.ThreeDS2ServiceInstance = str;
        this.valueOf = str2;
        this.values = str3;
        this.get = str4;
        this.ThreeDS2Service = sethorizontalgravity;
        this.getWarnings = str5;
    }

    /* loaded from: classes5.dex */
    public static final class values {
        private static int getSDKInfo = 0;
        private static int initialize = 1;
        private String ThreeDS2Service;
        private String ThreeDS2ServiceInstance;
        private String cleanup;
        private String get;
        private String valueOf;
        private setHorizontalGravity values;

        public values ThreeDS2Service(String str) {
            int i = getSDKInfo;
            int i2 = i & 47;
            int i3 = (i2 + ((i ^ 47) | i2)) % 128;
            initialize = i3;
            this.ThreeDS2Service = str;
            int i4 = (((i3 ^ CameraActivity.REQUEST_CODE) | (i3 & CameraActivity.REQUEST_CODE)) << 1) - ((i3 & (-124)) | ((~i3) & CameraActivity.REQUEST_CODE));
            getSDKInfo = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public values ThreeDS2ServiceInstance(String str) {
            int i = getSDKInfo;
            int i2 = (((i | 81) << 1) - (i ^ 81)) % 128;
            initialize = i2;
            this.valueOf = str;
            getSDKInfo = ((((i2 | 28) << 1) - (i2 ^ 28)) - 1) % 128;
            return this;
        }

        public values get(String str) {
            int i = getSDKInfo + 116;
            int i2 = ((~i) + (i << 1)) % 128;
            initialize = i2;
            this.get = str;
            getSDKInfo = (((i2 & 70) + (i2 | 70)) - 1) % 128;
            return this;
        }

        public values valueOf(String str) {
            int i = initialize + 63;
            getSDKInfo = i % 128;
            if (i % 2 != 0) {
                this.ThreeDS2ServiceInstance = str;
                int i2 = 21 / 0;
            } else {
                this.ThreeDS2ServiceInstance = str;
            }
            return this;
        }

        public values values(String str) {
            int i = getSDKInfo;
            int i2 = i & 31;
            int i3 = (i2 - (~((i ^ 31) | i2))) - 1;
            int i4 = i3 % 128;
            initialize = i4;
            if (i3 % 2 != 0) {
                this.cleanup = str;
                int i5 = i4 & 3;
                int i6 = ((((i4 ^ 3) | i5) << 1) - (~(-((i4 | 3) & (~i5))))) - 1;
                getSDKInfo = i6 % 128;
                if (i6 % 2 == 0) {
                    return this;
                }
                throw null;
            }
            this.cleanup = str;
            throw null;
        }

        public values ThreeDS2ServiceInstance(setHorizontalGravity sethorizontalgravity) {
            int i = initialize;
            int i2 = i & 75;
            int i3 = ((i ^ 75) | i2) << 1;
            int i4 = -((i | 75) & (~i2));
            int i5 = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
            getSDKInfo = i5;
            this.values = sethorizontalgravity;
            int i6 = ((i5 ^ 65) | (i5 & 65)) << 1;
            int i7 = -((i5 & (-66)) | ((~i5) & 65));
            initialize = ((i6 ^ i7) + ((i6 & i7) << 1)) % 128;
            return this;
        }

        public setItemsCanFocus ThreeDS2ServiceInstance() {
            setItemsCanFocus setitemscanfocus = new setItemsCanFocus(this.ThreeDS2Service, this.get, this.valueOf, this.ThreeDS2ServiceInstance, this.values, this.cleanup);
            int i = getSDKInfo + 83;
            initialize = i % 128;
            if (i % 2 != 0) {
                return setitemscanfocus;
            }
            throw null;
        }
    }
}
