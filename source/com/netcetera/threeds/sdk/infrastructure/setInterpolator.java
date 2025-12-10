package com.netcetera.threeds.sdk.infrastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
public class setInterpolator {
    private static int cleanup = 0;
    private static int initialize = 1;
    private final String ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final String get;
    private final Map<String, String> getSDKVersion;
    private final String getWarnings;
    private final String valueOf;
    private final String values;

    public String ThreeDS2Service() {
        int i = initialize;
        String str = this.get;
        cleanup = ((i ^ 45) + ((i & 45) << 1)) % 128;
        return str;
    }

    public String ThreeDS2ServiceInstance() {
        int i = initialize;
        String str = this.values;
        int i2 = i + 67;
        cleanup = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setInterpolator.equals(java.lang.Object):boolean");
    }

    public String get() {
        int i = cleanup;
        String str = this.ThreeDS2ServiceInstance;
        initialize = (i + 11) % 128;
        return str;
    }

    public String getSDKInfo() {
        int i = cleanup;
        int i2 = i & 47;
        int i3 = i2 + ((i ^ 47) | i2);
        initialize = i3 % 128;
        if (i3 % 2 != 0) {
            return this.getWarnings;
        }
        throw null;
    }

    public Map<String, String> getWarnings() {
        int i = cleanup;
        int i2 = (i ^ 51) + ((i & 51) << 1);
        int i3 = i2 % 128;
        initialize = i3;
        if (i2 % 2 != 0) {
            Map<String, String> map = this.getSDKVersion;
            cleanup = (((i3 | 37) << 1) - (i3 ^ 37)) % 128;
            return map;
        }
        throw null;
    }

    public int hashCode() {
        int hash;
        int i = cleanup + 25;
        initialize = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[5];
            objArr[0] = this.values;
            objArr[0] = this.ThreeDS2ServiceInstance;
            objArr[2] = this.ThreeDS2Service;
            objArr[4] = this.valueOf;
            objArr[3] = this.getWarnings;
            hash = Objects.hash(objArr);
        } else {
            hash = Objects.hash(this.values, this.ThreeDS2ServiceInstance, this.ThreeDS2Service, this.valueOf, this.getWarnings);
        }
        int i2 = cleanup;
        int i3 = i2 & 73;
        int i4 = (i2 ^ 73) | i3;
        initialize = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        return hash;
    }

    public String valueOf() {
        int i = (cleanup + 101) % 128;
        initialize = i;
        String str = this.valueOf;
        int i2 = i & 121;
        int i3 = (i ^ 121) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        cleanup = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String values() {
        int i = initialize;
        int i2 = i ^ 109;
        int i3 = -(-((i & 109) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        int i5 = i4 % 128;
        cleanup = i5;
        if (i4 % 2 == 0) {
            String str = this.ThreeDS2Service;
            int i6 = ((i5 | 107) << 1) - (i5 ^ 107);
            initialize = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 11 / 0;
            }
            return str;
        }
        throw null;
    }

    private setInterpolator(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.values = str;
        this.ThreeDS2ServiceInstance = str2;
        this.ThreeDS2Service = str3;
        this.get = str4;
        this.valueOf = str5;
        this.getWarnings = str6;
        this.getSDKVersion = map;
    }

    /* loaded from: classes5.dex */
    public static final class ThreeDS2Service {
        private static int cleanup = 0;
        private static int getSDKVersion = 1;
        private String ThreeDS2Service;
        private String ThreeDS2ServiceInstance;
        private String get;
        private String getWarnings;
        private String initialize;
        private final Map<String, String> valueOf = new HashMap();
        private String values;

        public ThreeDS2Service ThreeDS2Service(String str) {
            int i = getSDKVersion;
            int i2 = i & 29;
            int i3 = (((i | 29) & (~i2)) + (i2 << 1)) % 128;
            cleanup = i3;
            this.ThreeDS2Service = str;
            int i4 = i3 | 49;
            int i5 = i4 << 1;
            int i6 = -(i4 & (~(i3 & 49)));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            getSDKVersion = i7 % 128;
            if (i7 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public ThreeDS2Service ThreeDS2ServiceInstance(String str) {
            int i = getSDKVersion;
            int i2 = i & 105;
            int i3 = -(-((i ^ 105) | i2));
            int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
            cleanup = i4 % 128;
            if (i4 % 2 != 0) {
                this.get = str;
                int i5 = 37 / 0;
            } else {
                this.get = str;
            }
            int i6 = ((i ^ 109) | (i & 109)) << 1;
            int i7 = -(((~i) & 109) | (i & (-110)));
            cleanup = (((i6 | i7) << 1) - (i6 ^ i7)) % 128;
            return this;
        }

        public ThreeDS2Service get(String str) {
            int i = getSDKVersion;
            int i2 = (i & (-20)) | ((~i) & 19);
            int i3 = (i & 19) << 1;
            int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
            cleanup = i4;
            this.getWarnings = str;
            int i5 = (i4 ^ 125) + ((i4 & 125) << 1);
            getSDKVersion = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 97 / 0;
            }
            return this;
        }

        public ThreeDS2Service initialize(String str) {
            int i = cleanup;
            int i2 = (((((i ^ 67) | (i & 67)) << 1) - (~(-(((~i) & 67) | (i & (-68)))))) - 1) % 128;
            getSDKVersion = i2;
            this.initialize = str;
            cleanup = ((i2 ^ 91) + ((i2 & 91) << 1)) % 128;
            return this;
        }

        public ThreeDS2Service valueOf(String str) {
            int i = cleanup;
            this.values = str;
            int i2 = ((((i ^ 99) | (i & 99)) << 1) - (~(-(((~i) & 99) | (i & (-100)))))) - 1;
            getSDKVersion = i2 % 128;
            if (i2 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public ThreeDS2Service values(String str) {
            int i = cleanup;
            int i2 = (i ^ 9) + ((i & 9) << 1);
            getSDKVersion = i2 % 128;
            if (i2 % 2 == 0) {
                this.ThreeDS2ServiceInstance = str;
                int i3 = 90 / 0;
            } else {
                this.ThreeDS2ServiceInstance = str;
            }
            return this;
        }

        public ThreeDS2Service ThreeDS2Service(Map<String, String> map) {
            cleanup = (getSDKVersion + 85) % 128;
            this.valueOf.putAll(map);
            int i = getSDKVersion + 87;
            cleanup = i % 128;
            if (i % 2 == 0) {
                return this;
            }
            throw null;
        }

        public setInterpolator values() {
            setInterpolator setinterpolator = new setInterpolator(this.ThreeDS2Service, this.get, this.ThreeDS2ServiceInstance, this.values, this.getWarnings, this.initialize, this.valueOf);
            int i = getSDKVersion;
            int i2 = (i & (-50)) | ((~i) & 49);
            int i3 = -(-((i & 49) << 1));
            int i4 = (i2 & i3) + (i3 | i2);
            cleanup = i4 % 128;
            if (i4 % 2 == 0) {
                return setinterpolator;
            }
            throw null;
        }
    }
}
