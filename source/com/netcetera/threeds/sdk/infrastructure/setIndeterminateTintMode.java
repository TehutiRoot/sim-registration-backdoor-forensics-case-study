package com.netcetera.threeds.sdk.infrastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
public class setIndeterminateTintMode {
    private static int ConfigParameters = 0;
    private static int createTransaction = 1;
    private final String ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final String cleanup;
    private final String get;
    private final String getSDKInfo;
    private final String getSDKVersion;
    private final String getWarnings;
    private final String initialize;
    private final Map<String, String> onCompleted;
    private final String valueOf;
    private final List<String> values;

    public Map<String, String> ConfigParameters() {
        int i = createTransaction;
        int i2 = ((i ^ 61) | (i & 61)) << 1;
        int i3 = -(((~i) & 61) | (i & (-62)));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ConfigParameters = i4 % 128;
        if (i4 % 2 == 0) {
            return this.onCompleted;
        }
        throw null;
    }

    public String ThreeDS2Service() {
        int i = ConfigParameters;
        String str = this.get;
        int i2 = i + 78;
        createTransaction = ((~i2) + (i2 << 1)) % 128;
        return str;
    }

    public String ThreeDS2ServiceInstance() {
        int i = ConfigParameters;
        int i2 = i & 97;
        int i3 = (i | 97) & (~i2);
        int i4 = i2 << 1;
        int i5 = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        createTransaction = i5;
        String str = this.ThreeDS2Service;
        int i6 = i5 + 104;
        int i7 = (~i6) + (i6 << 1);
        ConfigParameters = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String cleanup() {
        int i = createTransaction;
        int i2 = (i | 75) << 1;
        int i3 = -(i ^ 75);
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        ConfigParameters = i5;
        int i6 = i4 % 2;
        String str = this.initialize;
        if (i6 != 0) {
            int i7 = 3 / 0;
        }
        int i8 = i5 ^ 9;
        int i9 = (i5 & 9) << 1;
        createTransaction = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        if (java.util.Objects.equals(r6.values, r7.values) != true) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
        if (java.util.Objects.equals(r6.values, r7.values) != true) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
        if (java.util.Objects.equals(r6.valueOf, r7.valueOf) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintMode.ConfigParameters;
        r2 = ((r0 | 16) << 1) - (r0 ^ 16);
        com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintMode.createTransaction = ((~r2) + (r2 << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
        if ((!java.util.Objects.equals(r6.initialize, r7.initialize)) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintMode.ConfigParameters;
        com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintMode.createTransaction = (((r0 ^ 32) + ((r0 & 32) << 1)) - 1) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
        if (java.util.Objects.equals(r6.cleanup, r7.cleanup) == true) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d4, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintMode.createTransaction;
        r2 = ((r0 ^ 121) | (r0 & 121)) << 1;
        r0 = -(((~r0) & 121) | (r0 & (-122)));
        r5 = (r2 & r0) + (r0 | r2);
        com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintMode.ConfigParameters = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ed, code lost:
        if ((r5 % 2) == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ef, code lost:
        r2 = 71 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fa, code lost:
        if (java.util.Objects.equals(r6.getSDKVersion, r7.getSDKVersion) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0105, code lost:
        if (java.util.Objects.equals(r6.getSDKVersion, r7.getSDKVersion) == true) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0108, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintMode.createTransaction;
        r5 = r0 & 85;
        r2 = ((r0 ^ 85) | r5) << 1;
        r0 = -((r0 | 85) & (~r5));
        r5 = (r2 & r0) + (r0 | r2);
        com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintMode.ConfigParameters = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011f, code lost:
        if ((r5 % 2) != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0129, code lost:
        if (java.util.Objects.equals(r6.getSDKInfo, r7.getSDKInfo) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012b, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintMode.createTransaction;
        r2 = r0 & 87;
        r0 = -(-(r0 | 87));
        r4 = (r2 ^ r0) + ((r0 & r2) << 1);
        com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintMode.ConfigParameters = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013e, code lost:
        if ((r4 % 2) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0140, code lost:
        r0 = 54 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014b, code lost:
        if (java.util.Objects.equals(r6.getWarnings, r7.getWarnings) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0157, code lost:
        if ((!java.util.Objects.equals(r6.getWarnings, r7.getWarnings)) == true) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0159, code lost:
        r7 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintMode.ConfigParameters;
        r1 = r7 & 23;
        r0 = ((r7 ^ 23) | r1) << 1;
        r7 = -((r7 | 23) & (~r1));
        com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintMode.createTransaction = (((r0 | r7) << 1) - (r7 ^ r0)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0170, code lost:
        java.util.Objects.equals(r6.getSDKInfo, r7.getSDKInfo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0177, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintMode.equals(java.lang.Object):boolean");
    }

    public String get() {
        int i = createTransaction;
        int i2 = i ^ 23;
        int i3 = -(-((i & 23) << 1));
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        ConfigParameters = i4;
        String str = this.valueOf;
        createTransaction = (((i4 & 34) + (i4 | 34)) - 1) % 128;
        return str;
    }

    public String getSDKInfo() {
        int i = createTransaction;
        int i2 = ((i ^ 24) + ((i & 24) << 1)) - 1;
        ConfigParameters = i2 % 128;
        if (i2 % 2 == 0) {
            String str = this.getWarnings;
            ConfigParameters = (((((i ^ 95) | (i & 95)) << 1) - (~(-(((~i) & 95) | (i & (-96)))))) - 1) % 128;
            return str;
        }
        throw null;
    }

    public String getSDKVersion() {
        int i = ConfigParameters;
        int i2 = (-2) - (~(((i | 22) << 1) - (i ^ 22)));
        createTransaction = i2 % 128;
        if (i2 % 2 != 0) {
            String str = this.getSDKInfo;
            int i3 = (-2) - (~((i ^ 78) + ((i & 78) << 1)));
            createTransaction = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 69 / 0;
            }
            return str;
        }
        throw null;
    }

    public String getWarnings() {
        int i = (ConfigParameters + 45) % 128;
        createTransaction = i;
        String str = this.cleanup;
        ConfigParameters = (i + 105) % 128;
        return str;
    }

    public int hashCode() {
        int i = createTransaction;
        ConfigParameters = ((i & 31) + (i | 31)) % 128;
        int hash = Objects.hash(this.ThreeDS2Service, this.get, this.values, this.valueOf, this.initialize, this.cleanup, this.getSDKVersion, this.getSDKInfo, this.getWarnings);
        int i2 = createTransaction;
        int i3 = i2 & 107;
        int i4 = -(-((i2 ^ 107) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        ConfigParameters = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return hash;
    }

    public String initialize() {
        int i = createTransaction;
        String str = this.getSDKVersion;
        int i2 = (-2) - (~(i + 76));
        ConfigParameters = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 39 / 0;
        }
        return str;
    }

    public String valueOf() {
        int i = ConfigParameters;
        int i2 = ((-2) - (~((i & 78) + (i | 78)))) % 128;
        createTransaction = i2;
        String str = this.ThreeDS2ServiceInstance;
        ConfigParameters = ((((i2 | 54) << 1) - (i2 ^ 54)) - 1) % 128;
        return str;
    }

    public List<String> values() {
        int i = ConfigParameters;
        int i2 = ((i | 29) << 1) - (i ^ 29);
        int i3 = i2 % 128;
        createTransaction = i3;
        if (i2 % 2 != 0) {
            List<String> list = this.values;
            ConfigParameters = ((i3 ^ 9) + ((i3 & 9) << 1)) % 128;
            return list;
        }
        throw null;
    }

    private setIndeterminateTintMode(String str, String str2, String str3, List<String> list, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, String> map) {
        this.ThreeDS2Service = str;
        this.ThreeDS2ServiceInstance = str2;
        this.get = str3;
        this.values = list;
        this.valueOf = str4;
        this.initialize = str5;
        this.cleanup = str6;
        this.getSDKVersion = str7;
        this.getSDKInfo = str8;
        this.getWarnings = str9;
        this.onCompleted = map;
    }

    /* loaded from: classes5.dex */
    public static final class ThreeDS2Service {
        private static int ThreeDS2Service$InitializationCallback = 1;
        private static int onError;
        private final String ThreeDS2Service;
        private final Map<String, String> ThreeDS2ServiceInstance = new HashMap();
        private String cleanup;
        private String createTransaction;
        private final String get;
        private String getSDKInfo;
        private String getSDKVersion;
        private String getWarnings;
        private String initialize;
        private String valueOf;
        private List<String> values;

        public ThreeDS2Service(String str, String str2) {
            this.ThreeDS2Service = str;
            this.get = str2;
        }

        public ThreeDS2Service ThreeDS2Service(String str) {
            int i = onError;
            this.valueOf = str;
            int i2 = i ^ 27;
            int i3 = ((i & 27) | i2) << 1;
            int i4 = -i2;
            ThreeDS2Service$InitializationCallback = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
            return this;
        }

        public ThreeDS2Service ThreeDS2ServiceInstance(String str) {
            int i = (onError + 25) % 128;
            ThreeDS2Service$InitializationCallback = i;
            this.getWarnings = str;
            int i2 = (i | 15) << 1;
            int i3 = -(i ^ 15);
            onError = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
            return this;
        }

        public ThreeDS2Service get(String str) {
            int i = ThreeDS2Service$InitializationCallback;
            int i2 = ((i ^ 116) + ((i & 116) << 1)) - 1;
            int i3 = i2 % 128;
            onError = i3;
            if (i2 % 2 == 0) {
                this.cleanup = str;
                int i4 = i3 & 89;
                ThreeDS2Service$InitializationCallback = ((((i3 ^ 89) | i4) << 1) - ((i3 | 89) & (~i4))) % 128;
                return this;
            }
            this.cleanup = str;
            throw null;
        }

        public ThreeDS2Service getSDKInfo(String str) {
            int i = ThreeDS2Service$InitializationCallback;
            int i2 = i & 37;
            int i3 = -(-((i ^ 37) | i2));
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            onError = i4 % 128;
            if (i4 % 2 != 0) {
                this.initialize = str;
                int i5 = 37 / 0;
            } else {
                this.initialize = str;
            }
            return this;
        }

        public ThreeDS2Service getWarnings(String str) {
            int i = ThreeDS2Service$InitializationCallback;
            int i2 = i & 125;
            int i3 = ((i ^ 125) | i2) << 1;
            int i4 = -((i | 125) & (~i2));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            onError = i5 % 128;
            if (i5 % 2 == 0) {
                this.createTransaction = str;
                return this;
            }
            this.createTransaction = str;
            throw null;
        }

        public ThreeDS2Service initialize(String str) {
            int i = ThreeDS2Service$InitializationCallback;
            int i2 = ((i | 96) << 1) - (i ^ 96);
            int i3 = ((~i2) + (i2 << 1)) % 128;
            onError = i3;
            this.getSDKInfo = str;
            int i4 = i3 & 115;
            int i5 = i3 | 115;
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            ThreeDS2Service$InitializationCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 22 / 0;
            }
            return this;
        }

        public ThreeDS2Service valueOf(String str) {
            List<String> list = (List) C9664oh.ThreeDS2Service(this.values, new ArrayList());
            this.values = list;
            list.add(str);
            int i = ThreeDS2Service$InitializationCallback;
            onError = ((((i | 57) << 1) - (~(-(((~i) & 57) | (i & (-58)))))) - 1) % 128;
            return this;
        }

        public ThreeDS2Service values(String str) {
            int i = onError;
            this.getSDKVersion = str;
            int i2 = i + 27;
            ThreeDS2Service$InitializationCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 63 / 0;
            }
            return this;
        }

        public ThreeDS2Service ThreeDS2ServiceInstance(Map<String, String> map) {
            int i = onError;
            ThreeDS2Service$InitializationCallback = ((-2) - (~((i & 70) + (i | 70)))) % 128;
            this.ThreeDS2ServiceInstance.putAll(map);
            int i2 = onError;
            int i3 = ((((i2 ^ 41) | (i2 & 41)) << 1) - (~(-(((~i2) & 41) | (i2 & (-42)))))) - 1;
            ThreeDS2Service$InitializationCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 42 / 0;
            }
            return this;
        }

        public setIndeterminateTintMode ThreeDS2ServiceInstance() {
            setIndeterminateTintMode setindeterminatetintmode = new setIndeterminateTintMode(this.ThreeDS2Service, this.get, this.valueOf, (List) C9664oh.ThreeDS2Service(this.values, new ArrayList()), this.getWarnings, this.getSDKVersion, this.cleanup, this.initialize, this.getSDKInfo, this.createTransaction, this.ThreeDS2ServiceInstance);
            int i = onError;
            int i2 = (-2) - (~((i & 120) + (i | 120)));
            ThreeDS2Service$InitializationCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return setindeterminatetintmode;
            }
            throw null;
        }
    }
}
