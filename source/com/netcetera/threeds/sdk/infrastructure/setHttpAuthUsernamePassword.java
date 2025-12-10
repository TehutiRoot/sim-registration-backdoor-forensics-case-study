package com.netcetera.threeds.sdk.infrastructure;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
class setHttpAuthUsernamePassword implements setOnHierarchyChangeListener {
    private static int ThreeDS2ServiceInstance = 0;
    private static int getWarnings = 1;
    private final String ThreeDS2Service;
    private final String get;
    private final String valueOf;
    private final Map<String, String> values;

    @Override // com.netcetera.threeds.sdk.infrastructure.setOnHierarchyChangeListener
    public String ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i ^ 15;
        int i3 = -(-((i & 15) << 1));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        getWarnings = i4;
        String str = this.get;
        ThreeDS2ServiceInstance = ((((i4 & (-90)) | ((~i4) & 89)) - (~((i4 & 89) << 1))) - 1) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setOnHierarchyChangeListener
    public Map<String, String> get() {
        Map<String, String> map;
        int i = ThreeDS2ServiceInstance + 31;
        int i2 = i % 128;
        getWarnings = i2;
        if (i % 2 == 0) {
            map = this.values;
            int i3 = 91 / 0;
        } else {
            map = this.values;
        }
        int i4 = i2 + 63;
        ThreeDS2ServiceInstance = i4 % 128;
        if (i4 % 2 == 0) {
            return map;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setOnHierarchyChangeListener
    public setLayoutAnimation valueOf() {
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation(this.valueOf.getBytes(StandardCharsets.UTF_8));
        int i = ThreeDS2ServiceInstance;
        int i2 = (i & 14) + (i | 14);
        int i3 = (~i2) + (i2 << 1);
        getWarnings = i3 % 128;
        if (i3 % 2 != 0) {
            return setlayoutanimation;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setOnHierarchyChangeListener
    public String values() {
        int i = (getWarnings + 69) % 128;
        ThreeDS2ServiceInstance = i;
        String str = this.ThreeDS2Service;
        int i2 = (((i | 102) << 1) - (i ^ 102)) - 1;
        getWarnings = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private setHttpAuthUsernamePassword(String str, String str2, String str3, Map<String, String> map) {
        this.ThreeDS2Service = str;
        this.valueOf = str2;
        this.get = str3;
        this.values = map;
    }

    /* loaded from: classes5.dex */
    public static class ThreeDS2Service {
        private static int getWarnings = 1;
        private static int values;
        private final String ThreeDS2Service;
        private final String valueOf;
        private String get = "";
        private final Map<String, String> ThreeDS2ServiceInstance = new HashMap();

        public ThreeDS2Service(String str, String str2) {
            this.valueOf = str;
            this.ThreeDS2Service = str2;
        }

        public ThreeDS2Service ThreeDS2ServiceInstance(Map<String, String> map) {
            int i = getWarnings;
            values = (i + 63) % 128;
            if (map != null) {
                int i2 = i ^ 81;
                int i3 = (((i & 81) | i2) << 1) - i2;
                values = i3 % 128;
                if (i3 % 2 == 0) {
                    if (map.size() > 0) {
                        int i4 = values;
                        getWarnings = ((i4 & 111) + (i4 | 111)) % 128;
                        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                        int i5 = values;
                        int i6 = i5 & 3;
                        int i7 = ((i5 ^ 3) | i6) << 1;
                        int i8 = -((i5 | 3) & (~i6));
                        getWarnings = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
                        while (it.hasNext()) {
                            int i9 = values;
                            int i10 = (i9 & 47) + (i9 | 47);
                            getWarnings = i10 % 128;
                            if (i10 % 2 != 0) {
                                Map.Entry<String, String> next = it.next();
                                values(next.getKey(), next.getValue());
                                int i11 = values;
                                getWarnings = ((-2) - (~((i11 & 16) + (i11 | 16)))) % 128;
                            } else {
                                Map.Entry<String, String> next2 = it.next();
                                values(next2.getKey(), next2.getValue());
                                throw null;
                            }
                        }
                    }
                } else {
                    map.size();
                    throw null;
                }
            }
            int i12 = values;
            int i13 = (i12 & 18) + (i12 | 18);
            int i14 = (~i13) + (i13 << 1);
            getWarnings = i14 % 128;
            if (i14 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public ThreeDS2Service valueOf(String str) {
            int i = getWarnings;
            int i2 = (((i | 105) << 1) - (i ^ 105)) % 128;
            values = i2;
            this.get = str;
            int i3 = (i2 & (-80)) | ((~i2) & 79);
            int i4 = -(-((i2 & 79) << 1));
            getWarnings = ((i3 & i4) + (i3 | i4)) % 128;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
            if ((!com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2Service(r2)) != true) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
            if (com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2Service(r5, r6) != false) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
            r4.ThreeDS2ServiceInstance.put(r5, r6);
            r5 = com.netcetera.threeds.sdk.infrastructure.setHttpAuthUsernamePassword.ThreeDS2Service.getWarnings;
            r6 = ((r5 ^ 103) | (r5 & 103)) << 1;
            r5 = -(((~r5) & 103) | (r5 & (-104)));
            com.netcetera.threeds.sdk.infrastructure.setHttpAuthUsernamePassword.ThreeDS2Service.values = ((r6 & r5) + (r5 | r6)) % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.netcetera.threeds.sdk.infrastructure.setHttpAuthUsernamePassword.ThreeDS2Service values(java.lang.String r5, java.lang.String r6) {
            /*
                r4 = this;
                r0 = 0
                int r1 = com.netcetera.threeds.sdk.infrastructure.setHttpAuthUsernamePassword.ThreeDS2Service.getWarnings
                r2 = r1 & 10
                r1 = r1 | 10
                int r2 = r2 + r1
                r1 = 1
                int r2 = r2 - r1
                int r3 = r2 % 128
                com.netcetera.threeds.sdk.infrastructure.setHttpAuthUsernamePassword.ThreeDS2Service.values = r3
                r3 = 2
                int r2 = r2 % r3
                if (r2 == 0) goto L21
                r2 = 4
                java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]
                r2[r0] = r5
                r2[r1] = r6
                boolean r0 = com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2Service(r2)
                r0 = r0 ^ r1
                if (r0 == r1) goto L49
                goto L2d
            L21:
                java.lang.CharSequence[] r2 = new java.lang.CharSequence[r3]
                r2[r0] = r5
                r2[r1] = r6
                boolean r0 = com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2Service(r2)
                if (r0 == 0) goto L49
            L2d:
                java.util.Map<java.lang.String, java.lang.String> r0 = r4.ThreeDS2ServiceInstance
                r0.put(r5, r6)
                int r5 = com.netcetera.threeds.sdk.infrastructure.setHttpAuthUsernamePassword.ThreeDS2Service.getWarnings
                r6 = r5 ^ 103(0x67, float:1.44E-43)
                r0 = r5 & 103(0x67, float:1.44E-43)
                r6 = r6 | r0
                int r6 = r6 << r1
                r0 = r5 & (-104(0xffffffffffffff98, float:NaN))
                int r5 = ~r5
                r5 = r5 & 103(0x67, float:1.44E-43)
                r5 = r5 | r0
                int r5 = -r5
                r0 = r6 & r5
                r5 = r5 | r6
                int r0 = r0 + r5
                int r0 = r0 % 128
                com.netcetera.threeds.sdk.infrastructure.setHttpAuthUsernamePassword.ThreeDS2Service.values = r0
            L49:
                int r5 = com.netcetera.threeds.sdk.infrastructure.setHttpAuthUsernamePassword.ThreeDS2Service.values
                r6 = r5 & 81
                r5 = r5 ^ 81
                r5 = r5 | r6
                r0 = r6 ^ r5
                r5 = r5 & r6
                int r5 = r5 << r1
                int r0 = r0 + r5
                int r0 = r0 % 128
                com.netcetera.threeds.sdk.infrastructure.setHttpAuthUsernamePassword.ThreeDS2Service.getWarnings = r0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setHttpAuthUsernamePassword.ThreeDS2Service.values(java.lang.String, java.lang.String):com.netcetera.threeds.sdk.infrastructure.setHttpAuthUsernamePassword$ThreeDS2Service");
        }

        public setHttpAuthUsernamePassword values() {
            setHttpAuthUsernamePassword sethttpauthusernamepassword = new setHttpAuthUsernamePassword(this.valueOf, this.get, this.ThreeDS2Service, this.ThreeDS2ServiceInstance);
            int i = values;
            int i2 = i & 45;
            int i3 = (i2 - (~(-(-((i ^ 45) | i2))))) - 1;
            getWarnings = i3 % 128;
            if (i3 % 2 != 0) {
                return sethttpauthusernamepassword;
            }
            throw null;
        }
    }
}
