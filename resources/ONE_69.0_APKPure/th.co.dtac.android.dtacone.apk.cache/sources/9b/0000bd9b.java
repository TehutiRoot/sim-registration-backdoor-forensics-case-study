package com.netcetera.threeds.sdk.infrastructure;

import java.security.Key;
import java.security.interfaces.RSAKey;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.qz */
/* loaded from: classes5.dex */
public class C9703qz {
    private static int ThreeDS2Service = 0;
    public static long get = -6581427077085852039L;
    private static int values = 1;

    public static <K extends Key> K ThreeDS2Service(Key key, Class<K> cls) throws C9717rm {
        int i = values + 17;
        ThreeDS2Service = i % 128;
        try {
            if (i % 2 == 0) {
                valueOf(key);
                K cast = cls.cast(key);
                int i2 = values + 9;
                ThreeDS2Service = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 71 / 0;
                }
                return cast;
            }
            valueOf(key);
            cls.cast(key);
            throw null;
        } catch (ClassCastException e) {
            throw new C9717rm("Invalid key " + e);
        }
    }

    public static void get(byte[] bArr, String str) throws C9717rm {
        int i = values + 35;
        int i2 = i % 128;
        ThreeDS2Service = i2;
        if (i % 2 == 0) {
            if (bArr == null) {
                values = (i2 + 63) % 128;
                return;
            }
            throw new C9717rm("An explicit content encryption key cannot be used with " + str);
        }
        throw null;
    }

    public static void valueOf(Key key) throws C9717rm {
        int i = values;
        int i2 = i + 43;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            if (key != null) {
                ThreeDS2Service = (i + 87) % 128;
                return;
            }
            throw new C9717rm("The key must not be null.");
        }
        throw null;
    }

    public static void values(Key key) throws C9717rm {
        int i = (ThreeDS2Service + 121) % 128;
        values = i;
        if (key != null) {
            if (!(!(key instanceof RSAKey))) {
                ThreeDS2Service = (i + 77) % 128;
                int bitLength = ((RSAKey) key).getModulus().bitLength();
                if (bitLength < 2048) {
                    throw new C9717rm("An RSA key of size 2048 bits or larger MUST be used with the all JOSE RSA algorithms (given key was only " + bitLength + " bits).");
                }
            }
            int i2 = ThreeDS2Service + 33;
            values = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            throw null;
        }
        throw new C9717rm("The RSA key must not be null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005b, code lost:
        if (r10.getEncoded() == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
        r10 = r10.getEncoded().length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
        if (r10 != r12) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0096, code lost:
        throw new com.netcetera.threeds.sdk.infrastructure.C9717rm("Invalid key for JWE " + r11 + ", expected a " + com.netcetera.threeds.sdk.infrastructure.C9714rj.get(r12) + " bit key but a " + com.netcetera.threeds.sdk.infrastructure.C9714rj.get(r10) + " bit key was provided.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
        com.netcetera.threeds.sdk.infrastructure.C9703qz.values = (com.netcetera.threeds.sdk.infrastructure.C9703qz.ThreeDS2Service + 83) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
        r12 = new java.lang.StringBuilder();
        r12.append("Invalid key for JWE ");
        r12.append(r11);
        r12.append(", expected an ");
        r1 = new java.lang.Object[1];
        ThreeDS2Service("晋昊謘蔤步調矄", 1 - android.text.TextUtils.indexOf("", ""), r1);
        r12.append(((java.lang.String) r1[0]).intern());
        r12.append(" key but an ");
        r12.append(r0);
        r12.append(" key was provided.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00de, code lost:
        throw new com.netcetera.threeds.sdk.infrastructure.C9717rm(r12.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
        if (((java.lang.String) r5[0]).intern().equals(r0) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0055, code lost:
        if (((java.lang.String) r5[0]).intern().equals(r0) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ThreeDS2Service(java.security.Key r10, java.lang.String r11, int r12) throws com.netcetera.threeds.sdk.infrastructure.C9717rm {
        /*
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9703qz.values
            int r0 = r0 + 5
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9703qz.ThreeDS2Service = r1
            int r0 = r0 % 2
            java.lang.String r1 = "Invalid key for JWE "
            r2 = 0
            java.lang.String r3 = "晋昊謘蔤步調矄"
            r4 = 1
            if (r0 == 0) goto L35
            valueOf(r10)
            java.lang.String r0 = r10.getAlgorithm()
            long r5 = android.os.SystemClock.elapsedRealtimeNanos()
            r7 = 1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            java.lang.Object[] r5 = new java.lang.Object[r4]
            ThreeDS2Service(r3, r9, r5)
            r5 = r5[r2]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.intern()
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto La0
            goto L57
        L35:
            valueOf(r10)
            java.lang.String r0 = r10.getAlgorithm()
            long r5 = android.os.SystemClock.elapsedRealtimeNanos()
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            java.lang.Object[] r5 = new java.lang.Object[r4]
            ThreeDS2Service(r3, r9, r5)
            r5 = r5[r2]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.intern()
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto La0
        L57:
            byte[] r0 = r10.getEncoded()
            if (r0 == 0) goto L97
            byte[] r10 = r10.getEncoded()
            int r10 = r10.length
            if (r10 != r12) goto L65
            goto L97
        L65:
            com.netcetera.threeds.sdk.infrastructure.rm r0 = new com.netcetera.threeds.sdk.infrastructure.rm
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r11)
            java.lang.String r11 = ", expected a "
            r2.append(r11)
            int r11 = com.netcetera.threeds.sdk.infrastructure.C9714rj.get(r12)
            r2.append(r11)
            java.lang.String r11 = " bit key but a "
            r2.append(r11)
            int r10 = com.netcetera.threeds.sdk.infrastructure.C9714rj.get(r10)
            r2.append(r10)
            java.lang.String r10 = " bit key was provided."
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            r0.<init>(r10)
            throw r0
        L97:
            int r10 = com.netcetera.threeds.sdk.infrastructure.C9703qz.ThreeDS2Service
            int r10 = r10 + 83
            int r10 = r10 % 128
            com.netcetera.threeds.sdk.infrastructure.C9703qz.values = r10
            return
        La0:
            com.netcetera.threeds.sdk.infrastructure.rm r10 = new com.netcetera.threeds.sdk.infrastructure.rm
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r1)
            r12.append(r11)
            java.lang.String r11 = ", expected an "
            r12.append(r11)
            java.lang.String r11 = ""
            int r11 = android.text.TextUtils.indexOf(r11, r11)
            int r11 = 1 - r11
            java.lang.Object[] r1 = new java.lang.Object[r4]
            ThreeDS2Service(r3, r11, r1)
            r11 = r1[r2]
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r11 = r11.intern()
            r12.append(r11)
            java.lang.String r11 = " key but an "
            r12.append(r11)
            r12.append(r0)
            java.lang.String r11 = " key was provided."
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9703qz.ThreeDS2Service(java.security.Key, java.lang.String, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2Service(java.lang.String r8, int r9, java.lang.Object[] r10) {
        /*
            if (r8 == 0) goto L6
            char[] r8 = r8.toCharArray()
        L6:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.getWarnings.valueOf
            monitor-enter(r0)
            long r1 = com.netcetera.threeds.sdk.infrastructure.C9703qz.get     // Catch: java.lang.Throwable -> L3a
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.getWarnings.ThreeDS2Service(r1, r8, r9)     // Catch: java.lang.Throwable -> L3a
            r9 = 4
            com.netcetera.threeds.sdk.infrastructure.getWarnings.values = r9     // Catch: java.lang.Throwable -> L3a
        L14:
            int r1 = com.netcetera.threeds.sdk.infrastructure.getWarnings.values     // Catch: java.lang.Throwable -> L3a
            int r2 = r8.length     // Catch: java.lang.Throwable -> L3a
            if (r1 >= r2) goto L3c
            int r1 = r1 + (-4)
            com.netcetera.threeds.sdk.infrastructure.getWarnings.ThreeDS2ServiceInstance = r1     // Catch: java.lang.Throwable -> L3a
            int r1 = com.netcetera.threeds.sdk.infrastructure.getWarnings.values     // Catch: java.lang.Throwable -> L3a
            char r2 = r8[r1]     // Catch: java.lang.Throwable -> L3a
            int r3 = r1 % 4
            char r3 = r8[r3]     // Catch: java.lang.Throwable -> L3a
            r2 = r2 ^ r3
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L3a
            int r4 = com.netcetera.threeds.sdk.infrastructure.getWarnings.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L3a
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L3a
            long r6 = com.netcetera.threeds.sdk.infrastructure.C9703qz.get     // Catch: java.lang.Throwable -> L3a
            long r4 = r4 * r6
            long r2 = r2 ^ r4
            int r3 = (int) r2     // Catch: java.lang.Throwable -> L3a
            char r2 = (char) r3     // Catch: java.lang.Throwable -> L3a
            r8[r1] = r2     // Catch: java.lang.Throwable -> L3a
            int r1 = com.netcetera.threeds.sdk.infrastructure.getWarnings.values     // Catch: java.lang.Throwable -> L3a
            int r1 = r1 + 1
            com.netcetera.threeds.sdk.infrastructure.getWarnings.values = r1     // Catch: java.lang.Throwable -> L3a
            goto L14
        L3a:
            r8 = move-exception
            goto L48
        L3c:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L3a
            int r2 = r8.length     // Catch: java.lang.Throwable -> L3a
            int r2 = r2 - r9
            r1.<init>(r8, r9, r2)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            r8 = 0
            r10[r8] = r1
            return
        L48:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9703qz.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
    }
}