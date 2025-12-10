package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
abstract class visaSchemeConfiguration {
    private static int ThreeDS2ServiceInstance = 0;
    private static int get = 1;

    private static long ThreeDS2Service(long j, char c) {
        int i = get;
        int i2 = (i & 111) + (i | 111);
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            return ((j << 3) - ((j % (-134217728)) >>> 57)) + c;
        }
        return ((j << 5) ^ ((j & (-134217728)) >> 27)) ^ c;
    }

    public static long ThreeDS2ServiceInstance(String str) {
        int i = ThreeDS2ServiceInstance;
        int i2 = (i + 71) % 128;
        get = i2;
        long j = 0;
        if (str == null) {
            get = (i + 13) % 128;
            return 0L;
        }
        ThreeDS2ServiceInstance = (i2 + 21) % 128;
        int i3 = 0;
        while (i3 < str.length()) {
            int i4 = get;
            ThreeDS2ServiceInstance = (((i4 | 57) << 1) - (i4 ^ 57)) % 128;
            char charAt = str.charAt(i3);
            i3 = ((i3 & 1) << 1) + (i3 ^ 1);
            j = ThreeDS2Service(j, charAt);
        }
        return j;
    }

    private static long values(long j, int i, long j2, char c) {
        int i2 = ThreeDS2ServiceInstance;
        int i3 = ((i2 ^ 7) + ((i2 & 7) << 1)) % 128;
        get = i3;
        long j3 = ((j << i) ^ c) & j2;
        ThreeDS2ServiceInstance = (i3 + 101) % 128;
        return j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        return ((r1 | 1) << 1) - (r1 ^ 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int ThreeDS2Service(java.io.BufferedInputStream r8, long[] r9) {
        /*
            int r0 = com.netcetera.threeds.sdk.infrastructure.visaSchemeConfiguration.ThreeDS2ServiceInstance
            r1 = r0 ^ 91
            r0 = r0 & 91
            int r0 = r0 << 1
            int r1 = r1 + r0
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.visaSchemeConfiguration.get = r1
            r0 = 0
            r2 = r0
        L10:
            r0 = 0
            int r1 = r8.read()     // Catch: java.io.IOException -> L6c
            r4 = -1
            if (r1 == r4) goto L6c
            int r4 = com.netcetera.threeds.sdk.infrastructure.visaSchemeConfiguration.get
            int r4 = r4 + 11
            int r5 = r4 % 128
            com.netcetera.threeds.sdk.infrastructure.visaSchemeConfiguration.ThreeDS2ServiceInstance = r5
            int r4 = r4 % 2
            char r1 = (char) r1
            r7 = r1
            r4 = 5
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r2 = values(r2, r4, r5, r7)     // Catch: java.io.IOException -> L6c
            int r1 = com.netcetera.threeds.sdk.infrastructure.visaSchemeConfiguration.get
            r4 = r1 ^ 63
            r1 = r1 & 63
            int r1 = r1 << 1
            int r4 = r4 + r1
            int r4 = r4 % 128
            com.netcetera.threeds.sdk.infrastructure.visaSchemeConfiguration.ThreeDS2ServiceInstance = r4
            r1 = 0
        L3a:
            int r4 = r9.length     // Catch: java.io.IOException -> L6c
            if (r1 >= r4) goto L10
            int r4 = com.netcetera.threeds.sdk.infrastructure.visaSchemeConfiguration.ThreeDS2ServiceInstance
            int r5 = r4 + 117
            int r6 = r5 % 128
            com.netcetera.threeds.sdk.infrastructure.visaSchemeConfiguration.get = r6
            int r5 = r5 % 2
            if (r5 != 0) goto L50
            r5 = r9[r1]     // Catch: java.io.IOException -> L6c
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L5e
            goto L56
        L50:
            r5 = r9[r1]     // Catch: java.io.IOException -> L6c
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L5e
        L56:
            r8 = r1 | 1
            int r8 = r8 << 1
            r9 = r1 ^ 1
            int r8 = r8 - r9
            return r8
        L5e:
            int r1 = r1 + 1
            r5 = r4 ^ 51
            r4 = r4 & 51
            int r4 = r4 << 1
            int r5 = r5 + r4
            int r5 = r5 % 128
            com.netcetera.threeds.sdk.infrastructure.visaSchemeConfiguration.get = r5
            goto L3a
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.visaSchemeConfiguration.ThreeDS2Service(java.io.BufferedInputStream, long[]):int");
    }

    public static int ThreeDS2ServiceInstance(String str, int i, long j, long[] jArr) {
        int i2 = get;
        int i3 = ((i2 | 85) << 1) - (i2 ^ 85);
        ThreeDS2ServiceInstance = i3 % 128;
        if (i3 % 2 == 0) {
            if (str == null) {
                int i4 = (i2 + 107) % 128;
                ThreeDS2ServiceInstance = i4;
                get = ((i4 ^ 107) + ((i4 & 107) << 1)) % 128;
                return 0;
            }
            ThreeDS2ServiceInstance = (i2 + 45) % 128;
            long j2 = 0;
            int i5 = 0;
            while (i5 < str.length()) {
                char charAt = str.charAt(i5);
                int i6 = (i5 ^ (-100)) + ((i5 & (-100)) << 1);
                i5 = (i6 & 101) + (i6 | 101);
                j2 = values(j2, i, j, charAt);
                int i7 = get;
                ThreeDS2ServiceInstance = (((i7 | 57) << 1) - (i7 ^ 57)) % 128;
                int i8 = 0;
                while (i8 < jArr.length) {
                    if (j2 == jArr[i8]) {
                        int i9 = get + 81;
                        int i10 = i9 % 128;
                        ThreeDS2ServiceInstance = i10;
                        if (i9 % 2 == 0) {
                            i8 = (i8 & 1) + (i8 | 1);
                        }
                        get = (i10 + 121) % 128;
                        return i8;
                    }
                    i8++;
                }
            }
            return 0;
        }
        throw null;
    }
}
