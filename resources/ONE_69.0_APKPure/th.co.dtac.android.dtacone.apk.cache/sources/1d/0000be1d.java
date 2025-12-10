package com.netcetera.threeds.sdk.infrastructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public class setDrawingCacheEnabled {
    private static final String ThreeDS2Service;
    private static int ThreeDS2ServiceInstance = 1;
    private static int valueOf;
    public static char[] values;

    static {
        valueOf();
        Object[] objArr = new Object[1];
        ThreeDS2Service("\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001", new int[]{0, 33, 0, 0}, true, objArr);
        ThreeDS2Service = ((String) objArr[0]).intern();
        int i = ThreeDS2ServiceInstance + 21;
        valueOf = i % 128;
        if (i % 2 != 0) {
            int i2 = 26 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2Service(java.lang.String r12, int[] r13, boolean r14, java.lang.Object[] r15) {
        /*
            if (r12 == 0) goto L8
            java.lang.String r0 = "ISO-8859-1"
            byte[] r12 = r12.getBytes(r0)
        L8:
            byte[] r12 = (byte[]) r12
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.values
            monitor-enter(r0)
            r1 = 0
            r2 = r13[r1]     // Catch: java.lang.Throwable -> L38
            r3 = 1
            r4 = r13[r3]     // Catch: java.lang.Throwable -> L38
            r5 = 2
            r6 = r13[r5]     // Catch: java.lang.Throwable -> L38
            r7 = 3
            r7 = r13[r7]     // Catch: java.lang.Throwable -> L38
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.setDrawingCacheEnabled.values     // Catch: java.lang.Throwable -> L38
            char[] r9 = new char[r4]     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r8, r2, r9, r1, r4)     // Catch: java.lang.Throwable -> L38
            if (r12 == 0) goto L49
            char[] r2 = new char[r4]     // Catch: java.lang.Throwable -> L38
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r1     // Catch: java.lang.Throwable -> L38
            r8 = 0
        L27:
            int r10 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
            if (r10 >= r4) goto L48
            r11 = r12[r10]     // Catch: java.lang.Throwable -> L38
            if (r11 != r3) goto L3a
            char r11 = r9[r10]     // Catch: java.lang.Throwable -> L38
            int r11 = r11 << r3
            int r11 = r11 + r3
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch: java.lang.Throwable -> L38
            r2[r10] = r8     // Catch: java.lang.Throwable -> L38
            goto L41
        L38:
            r12 = move-exception
            goto L8d
        L3a:
            char r11 = r9[r10]     // Catch: java.lang.Throwable -> L38
            int r11 = r11 << r3
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch: java.lang.Throwable -> L38
            r2[r10] = r8     // Catch: java.lang.Throwable -> L38
        L41:
            char r8 = r2[r10]     // Catch: java.lang.Throwable -> L38
            int r10 = r10 + 1
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r10     // Catch: java.lang.Throwable -> L38
            goto L27
        L48:
            r9 = r2
        L49:
            if (r7 <= 0) goto L58
            char[] r12 = new char[r4]     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r9, r1, r12, r1, r4)     // Catch: java.lang.Throwable -> L38
            int r2 = r4 - r7
            java.lang.System.arraycopy(r12, r1, r9, r2, r7)     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r12, r7, r9, r1, r2)     // Catch: java.lang.Throwable -> L38
        L58:
            if (r14 == 0) goto L6f
            char[] r12 = new char[r4]     // Catch: java.lang.Throwable -> L38
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r1     // Catch: java.lang.Throwable -> L38
        L5e:
            int r14 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
            if (r14 >= r4) goto L6e
            int r2 = r4 - r14
            int r2 = r2 - r3
            char r2 = r9[r2]     // Catch: java.lang.Throwable -> L38
            r12[r14] = r2     // Catch: java.lang.Throwable -> L38
            int r14 = r14 + 1
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r14     // Catch: java.lang.Throwable -> L38
            goto L5e
        L6e:
            r9 = r12
        L6f:
            if (r6 <= 0) goto L84
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r1     // Catch: java.lang.Throwable -> L38
        L73:
            int r12 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
            if (r12 >= r4) goto L84
            char r14 = r9[r12]     // Catch: java.lang.Throwable -> L38
            r2 = r13[r5]     // Catch: java.lang.Throwable -> L38
            int r14 = r14 - r2
            char r14 = (char) r14     // Catch: java.lang.Throwable -> L38
            r9[r12] = r14     // Catch: java.lang.Throwable -> L38
            int r12 = r12 + 1
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r12     // Catch: java.lang.Throwable -> L38
            goto L73
        L84:
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L38
            r12.<init>(r9)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            r15[r1] = r12
            return
        L8d:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setDrawingCacheEnabled.ThreeDS2Service(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }

    public static void valueOf() {
        values = new char[]{'9', 'r', 'k', 'l', 'l', 'i', 'g', 'i', 'i', 'h', 'g', 'g', 'j', 'j', 'k', 'd', 'b', 'd', 'f', 'o', 'm', 'd', 'a', 'a', 'd', 'l', 'k', 'f', 'm', 's', 's', 'l', 'k', 151};
    }

    public Set<String> get(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters) throws setId {
        Object[] objArr = new Object[1];
        ThreeDS2Service("\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001", new int[]{0, 33, 0, 0}, true, objArr);
        String paramValue = configParameters.getParamValue(null, ((String) objArr[0]).intern());
        HashSet hashSet = new HashSet();
        if (paramValue == null) {
            int i = ThreeDS2ServiceInstance + 81;
            valueOf = i % 128;
            if (i % 2 == 0) {
                return hashSet;
            }
            throw null;
        }
        Object[] objArr2 = new Object[1];
        ThreeDS2Service(null, new int[]{33, 1, 107, 1}, true, objArr2);
        hashSet.addAll(Arrays.asList(paramValue.split(((String) objArr2[0]).intern())));
        HashSet hashSet2 = new HashSet(get());
        Iterator it = hashSet.iterator();
        while (!(!it.hasNext())) {
            valueOf = (ThreeDS2ServiceInstance + 103) % 128;
            String str = (String) it.next();
            if (!hashSet2.contains(str)) {
                throw setForegroundGravity.apiKey.valueOf(str);
            }
        }
        int i2 = ThreeDS2ServiceInstance + 67;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return hashSet;
        }
        throw null;
    }

    private Set<String> get() {
        HashSet hashSet = new HashSet();
        for (LabelCustomization labelCustomization : LabelCustomization.values()) {
            valueOf = (ThreeDS2ServiceInstance + 115) % 128;
            hashSet.add(labelCustomization.ThreeDS2ServiceInstance());
        }
        ThreeDS2ServiceInstance = (valueOf + 3) % 128;
        return hashSet;
    }
}